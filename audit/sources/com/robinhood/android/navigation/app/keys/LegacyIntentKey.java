package com.robinhood.android.navigation.app.keys;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.models.matcha.api.MatchaTransactionType;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.app.keys.data.ChooseAddressSource;
import com.robinhood.android.navigation.app.keys.data.DebitCardLinkingConfiguration;
import com.robinhood.android.navigation.app.keys.data.ExerciseOptionInstrumentId;
import com.robinhood.android.navigation.app.keys.data.GoldReferenceManualPage;
import com.robinhood.android.navigation.app.keys.data.OptionNuxPage;
import com.robinhood.android.navigation.app.keys.data.OptionPage;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.navigation.keys.InternalOnly;
import com.robinhood.android.recurring.contracts.RecurringOrderConfiguration;
import com.robinhood.directipo.models.DirectIpoOrderSource;
import com.robinhood.education.CryptoLearnAndEarnLoggingData;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p355ui.DirectDepositAmount;
import com.robinhood.models.p355ui.DocumentRequest;
import com.robinhood.models.p355ui.identi.PartialAddress;
import com.robinhood.rosetta.eventlogging.OptionWatchlistAboutContext;
import com.robinhood.shared.crypto.perpetuals.contracts.PerpetualsReferenceManualPage;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LegacyIntentKey.kt */
@Metadata(m3635d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:8\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789\u0082\u00018:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopq¨\u0006r"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "MatchaTransferFromDeepLink", "RhyRequestPhysicalCard", "AnalystReportDeepLinkShim", "AtmFinder", "CardHelp", "ChooseAddress", "ConfirmTransfer", "CryptoLearnAndEarnOnboarding", "DayTradeInfo", "DirectDepositSetup", "DirectDepositEditAmount", "DirectDepositSwitcher", "DirectDepositForm", "DirectIpoNotificationDisclosure", "DirectIpoOnboardingShim", "DirectIpoOnboarding", "DirectIpoAllocation", "DirectIpoIndicationOfInterest", "DirectIpoSummary", "DirectIpoLimitTypeExplanation", "DisputeCreation", "EarlyPayEnrollment", "EducationOverview", "EquityOrderWithSymbol", "InstantUpgrade", "MarginWithdrawal", "OptionExercise", "OptionsExperience", "OptionsProfessionalTrader", "OptionsWatchlistOnboarding", "OptionRolling", "ReferenceManual", "RhyMigrationOnboarding", "RhyWaitlist", "RewardsOnboarding", "RoundupRewardsFirstTransaction", "RoundupRewardsShimActivity", "RoundupRewardsAccountCreated", "RhsConversion", "ScreenerFilters", "SelectCardShippingAddress", "SlipHub", "SlipUpdateAgreement", "ThreadDeeplink", "DebitCardLinking", "CashManagementDeepLink", "UploadResidencyDoc", "VerifyMicrodeposits", "ActivateCard", "ChangeCardPin", "EmailValueProp", "NewHireOnboarding", "PostDepositInstantInfo", "RhyMerchantRewards", "RecurringBrokerageCashTransfer", "CashCushionDetails", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ActivateCard;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$AnalystReportDeepLinkShim;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$AtmFinder;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$CardHelp;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$CashCushionDetails;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$CashManagementDeepLink;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ChangeCardPin;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ChooseAddress;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ConfirmTransfer;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$CryptoLearnAndEarnOnboarding;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DayTradeInfo;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DebitCardLinking;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DirectDepositEditAmount;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DirectDepositForm;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DirectDepositSetup;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DirectDepositSwitcher;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DirectIpoAllocation;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DirectIpoIndicationOfInterest;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DirectIpoLimitTypeExplanation;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DirectIpoNotificationDisclosure;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DirectIpoOnboarding;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DirectIpoOnboardingShim;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DirectIpoSummary;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DisputeCreation;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$EarlyPayEnrollment;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$EducationOverview;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$EmailValueProp;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$EquityOrderWithSymbol;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$InstantUpgrade;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$MarginWithdrawal;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$MatchaTransferFromDeepLink;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$NewHireOnboarding;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$OptionExercise;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$OptionRolling;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$OptionsExperience;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$OptionsProfessionalTrader;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$OptionsWatchlistOnboarding;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$PostDepositInstantInfo;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RecurringBrokerageCashTransfer;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ReferenceManual;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RewardsOnboarding;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RhsConversion;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RhyMerchantRewards;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RhyMigrationOnboarding;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RhyRequestPhysicalCard;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RhyWaitlist;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RoundupRewardsAccountCreated;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RoundupRewardsFirstTransaction;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RoundupRewardsShimActivity;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ScreenerFilters;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$SelectCardShippingAddress;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$SlipHub;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$SlipUpdateAgreement;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ThreadDeeplink;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$UploadResidencyDoc;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$VerifyMicrodeposits;", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface LegacyIntentKey extends IntentKey {

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes8.dex */
    public static final class DefaultImpls {
        public static NavigationType getNavigationType(LegacyIntentKey legacyIntentKey) {
            return IntentKey.DefaultImpls.getNavigationType(legacyIntentKey);
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0012R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$MatchaTransferFromDeepLink;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "Landroid/os/Parcelable;", "userId", "", "amount", "Ljava/math/BigDecimal;", "type", "Lcom/robinhood/android/models/matcha/api/MatchaTransactionType;", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Lcom/robinhood/android/models/matcha/api/MatchaTransactionType;)V", "getUserId", "()Ljava/lang/String;", "getAmount", "()Ljava/math/BigDecimal;", "getType", "()Lcom/robinhood/android/models/matcha/api/MatchaTransactionType;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MatchaTransferFromDeepLink implements LegacyIntentKey, Parcelable {
        public static final Parcelable.Creator<MatchaTransferFromDeepLink> CREATOR = new Creator();
        private final BigDecimal amount;
        private final MatchaTransactionType type;
        private final String userId;

        /* compiled from: LegacyIntentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<MatchaTransferFromDeepLink> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MatchaTransferFromDeepLink createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MatchaTransferFromDeepLink(parcel.readString(), (BigDecimal) parcel.readSerializable(), MatchaTransactionType.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MatchaTransferFromDeepLink[] newArray(int i) {
                return new MatchaTransferFromDeepLink[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.userId);
            dest.writeSerializable(this.amount);
            dest.writeString(this.type.name());
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public MatchaTransferFromDeepLink(String userId, BigDecimal bigDecimal, MatchaTransactionType type2) {
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(type2, "type");
            this.userId = userId;
            this.amount = bigDecimal;
            this.type = type2;
        }

        public final String getUserId() {
            return this.userId;
        }

        public final BigDecimal getAmount() {
            return this.amount;
        }

        public final MatchaTransactionType getType() {
            return this.type;
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RhyRequestPhysicalCard;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "Landroid/os/Parcelable;", "cardId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getCardId", "()Ljava/util/UUID;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RhyRequestPhysicalCard implements LegacyIntentKey, Parcelable {
        public static final Parcelable.Creator<RhyRequestPhysicalCard> CREATOR = new Creator();
        private final UUID cardId;

        /* compiled from: LegacyIntentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<RhyRequestPhysicalCard> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyRequestPhysicalCard createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RhyRequestPhysicalCard((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyRequestPhysicalCard[] newArray(int i) {
                return new RhyRequestPhysicalCard[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.cardId);
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public RhyRequestPhysicalCard(UUID cardId) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            this.cardId = cardId;
        }

        public final UUID getCardId() {
            return this.cardId;
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$AnalystReportDeepLinkShim;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "instrumentId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getInstrumentId", "()Ljava/util/UUID;", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AnalystReportDeepLinkShim implements LegacyIntentKey {
        private final UUID instrumentId;

        public AnalystReportDeepLinkShim(UUID instrumentId) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            this.instrumentId = instrumentId;
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$AtmFinder;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "<init>", "()V", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AtmFinder implements LegacyIntentKey {
        public static final AtmFinder INSTANCE = new AtmFinder();

        private AtmFinder() {
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u0010B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$CardHelp;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "cardId", "Ljava/util/UUID;", "launchMode", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$CardHelp$LaunchMode;", "genericTopicId", "", "<init>", "(Ljava/util/UUID;Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$CardHelp$LaunchMode;Ljava/lang/String;)V", "getCardId", "()Ljava/util/UUID;", "getLaunchMode", "()Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$CardHelp$LaunchMode;", "getGenericTopicId", "()Ljava/lang/String;", "LaunchMode", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CardHelp implements LegacyIntentKey {
        private final UUID cardId;
        private final String genericTopicId;
        private final LaunchMode launchMode;

        public CardHelp(UUID cardId, LaunchMode launchMode, String genericTopicId) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            Intrinsics.checkNotNullParameter(genericTopicId, "genericTopicId");
            this.cardId = cardId;
            this.launchMode = launchMode;
            this.genericTopicId = genericTopicId;
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public final UUID getCardId() {
            return this.cardId;
        }

        public final LaunchMode getLaunchMode() {
            return this.launchMode;
        }

        public /* synthetic */ CardHelp(UUID uuid, LaunchMode launchMode, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, launchMode, (i & 4) != 0 ? "78" : str);
        }

        public final String getGenericTopicId() {
            return this.genericTopicId;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: LegacyIntentKey.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$CardHelp$LaunchMode;", "", "<init>", "(Ljava/lang/String;I)V", "REPORT_DAMAGED", "REPORT_LOST", "REPORT_STOLEN", "UNAUTHORIZED_TRANSACTION", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class LaunchMode {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ LaunchMode[] $VALUES;
            public static final LaunchMode REPORT_DAMAGED = new LaunchMode("REPORT_DAMAGED", 0);
            public static final LaunchMode REPORT_LOST = new LaunchMode("REPORT_LOST", 1);
            public static final LaunchMode REPORT_STOLEN = new LaunchMode("REPORT_STOLEN", 2);
            public static final LaunchMode UNAUTHORIZED_TRANSACTION = new LaunchMode("UNAUTHORIZED_TRANSACTION", 3);

            private static final /* synthetic */ LaunchMode[] $values() {
                return new LaunchMode[]{REPORT_DAMAGED, REPORT_LOST, REPORT_STOLEN, UNAUTHORIZED_TRANSACTION};
            }

            public static EnumEntries<LaunchMode> getEntries() {
                return $ENTRIES;
            }

            private LaunchMode(String str, int i) {
            }

            static {
                LaunchMode[] launchModeArr$values = $values();
                $VALUES = launchModeArr$values;
                $ENTRIES = EnumEntries2.enumEntries(launchModeArr$values);
            }

            public static LaunchMode valueOf(String str) {
                return (LaunchMode) Enum.valueOf(LaunchMode.class, str);
            }

            public static LaunchMode[] values() {
                return (LaunchMode[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ChooseAddress;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "source", "Lcom/robinhood/android/navigation/app/keys/data/ChooseAddressSource;", "countryCode", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "partialAddress", "Lcom/robinhood/models/ui/identi/PartialAddress;", "forceManualEntry", "", "useMonochrome", "<init>", "(Lcom/robinhood/android/navigation/app/keys/data/ChooseAddressSource;Lcom/robinhood/iso/countrycode/CountryCode$Supported;Lcom/robinhood/models/ui/identi/PartialAddress;Ljava/lang/Boolean;Z)V", "getSource", "()Lcom/robinhood/android/navigation/app/keys/data/ChooseAddressSource;", "getCountryCode", "()Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "getPartialAddress", "()Lcom/robinhood/models/ui/identi/PartialAddress;", "getForceManualEntry", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getUseMonochrome", "()Z", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ChooseAddress implements LegacyIntentKey {
        private final CountryCode.Supported countryCode;
        private final Boolean forceManualEntry;
        private final PartialAddress partialAddress;
        private final ChooseAddressSource source;
        private final boolean useMonochrome;

        public ChooseAddress(ChooseAddressSource source, CountryCode.Supported countryCode, PartialAddress partialAddress, Boolean bool, boolean z) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.source = source;
            this.countryCode = countryCode;
            this.partialAddress = partialAddress;
            this.forceManualEntry = bool;
            this.useMonochrome = z;
        }

        public /* synthetic */ ChooseAddress(ChooseAddressSource chooseAddressSource, CountryCode.Supported supported, PartialAddress partialAddress, Boolean bool, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(chooseAddressSource, supported, (i & 4) != 0 ? null : partialAddress, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? false : z);
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public final ChooseAddressSource getSource() {
            return this.source;
        }

        public final CountryCode.Supported getCountryCode() {
            return this.countryCode;
        }

        public final PartialAddress getPartialAddress() {
            return this.partialAddress;
        }

        public final Boolean getForceManualEntry() {
            return this.forceManualEntry;
        }

        public final boolean getUseMonochrome() {
            return this.useMonochrome;
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ConfirmTransfer;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "transferId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getTransferId", "()Ljava/util/UUID;", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ConfirmTransfer implements LegacyIntentKey {
        private final UUID transferId;

        public ConfirmTransfer(UUID transferId) {
            Intrinsics.checkNotNullParameter(transferId, "transferId");
            this.transferId = transferId;
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public final UUID getTransferId() {
            return this.transferId;
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$CryptoLearnAndEarnOnboarding;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "loggingData", "Lcom/robinhood/education/CryptoLearnAndEarnLoggingData;", "<init>", "(Lcom/robinhood/education/CryptoLearnAndEarnLoggingData;)V", "getLoggingData", "()Lcom/robinhood/education/CryptoLearnAndEarnLoggingData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CryptoLearnAndEarnOnboarding implements LegacyIntentKey {
        private final CryptoLearnAndEarnLoggingData loggingData;

        public static /* synthetic */ CryptoLearnAndEarnOnboarding copy$default(CryptoLearnAndEarnOnboarding cryptoLearnAndEarnOnboarding, CryptoLearnAndEarnLoggingData cryptoLearnAndEarnLoggingData, int i, Object obj) {
            if ((i & 1) != 0) {
                cryptoLearnAndEarnLoggingData = cryptoLearnAndEarnOnboarding.loggingData;
            }
            return cryptoLearnAndEarnOnboarding.copy(cryptoLearnAndEarnLoggingData);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoLearnAndEarnLoggingData getLoggingData() {
            return this.loggingData;
        }

        public final CryptoLearnAndEarnOnboarding copy(CryptoLearnAndEarnLoggingData loggingData) {
            Intrinsics.checkNotNullParameter(loggingData, "loggingData");
            return new CryptoLearnAndEarnOnboarding(loggingData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CryptoLearnAndEarnOnboarding) && Intrinsics.areEqual(this.loggingData, ((CryptoLearnAndEarnOnboarding) other).loggingData);
        }

        public int hashCode() {
            return this.loggingData.hashCode();
        }

        public String toString() {
            return "CryptoLearnAndEarnOnboarding(loggingData=" + this.loggingData + ")";
        }

        public CryptoLearnAndEarnOnboarding(CryptoLearnAndEarnLoggingData loggingData) {
            Intrinsics.checkNotNullParameter(loggingData, "loggingData");
            this.loggingData = loggingData;
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public final CryptoLearnAndEarnLoggingData getLoggingData() {
            return this.loggingData;
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DayTradeInfo;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "forced", "", "accountNumber", "", "<init>", "(ZLjava/lang/String;)V", "getForced", "()Z", "getAccountNumber", "()Ljava/lang/String;", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DayTradeInfo implements LegacyIntentKey {
        private final String accountNumber;
        private final boolean forced;

        /* JADX WARN: Multi-variable type inference failed */
        public DayTradeInfo() {
            this(false, null, 3, 0 == true ? 1 : 0);
        }

        public DayTradeInfo(boolean z, String str) {
            this.forced = z;
            this.accountNumber = str;
        }

        public /* synthetic */ DayTradeInfo(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str);
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public final boolean getForced() {
            return this.forced;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DirectDepositSetup;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "Landroid/os/Parcelable;", "showSplash", "", "showEarlyPayHook", "fromRhyMigration", "fromDDOnboardingFlow", "showBranchV2", "<init>", "(ZZZZZ)V", "getShowSplash", "()Z", "getShowEarlyPayHook", "getFromRhyMigration", "getFromDDOnboardingFlow", "getShowBranchV2", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DirectDepositSetup implements LegacyIntentKey, Parcelable {
        public static final Parcelable.Creator<DirectDepositSetup> CREATOR = new Creator();
        private final boolean fromDDOnboardingFlow;
        private final boolean fromRhyMigration;
        private final boolean showBranchV2;
        private final boolean showEarlyPayHook;
        private final boolean showSplash;

        /* compiled from: LegacyIntentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<DirectDepositSetup> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DirectDepositSetup createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z5 = false;
                boolean z6 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z5 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z6 = z;
                }
                if (parcel.readInt() != 0) {
                    z3 = z2;
                } else {
                    z3 = z2;
                    z2 = z;
                }
                if (parcel.readInt() != 0) {
                    z4 = z3;
                } else {
                    z4 = z3;
                    z3 = z;
                }
                if (parcel.readInt() == 0) {
                    z4 = z;
                }
                return new DirectDepositSetup(z5, z6, z2, z3, z4);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DirectDepositSetup[] newArray(int i) {
                return new DirectDepositSetup[i];
            }
        }

        public DirectDepositSetup() {
            this(false, false, false, false, false, 31, null);
        }

        public static /* synthetic */ DirectDepositSetup copy$default(DirectDepositSetup directDepositSetup, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
            if ((i & 1) != 0) {
                z = directDepositSetup.showSplash;
            }
            if ((i & 2) != 0) {
                z2 = directDepositSetup.showEarlyPayHook;
            }
            if ((i & 4) != 0) {
                z3 = directDepositSetup.fromRhyMigration;
            }
            if ((i & 8) != 0) {
                z4 = directDepositSetup.fromDDOnboardingFlow;
            }
            if ((i & 16) != 0) {
                z5 = directDepositSetup.showBranchV2;
            }
            boolean z6 = z5;
            boolean z7 = z3;
            return directDepositSetup.copy(z, z2, z7, z4, z6);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShowSplash() {
            return this.showSplash;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShowEarlyPayHook() {
            return this.showEarlyPayHook;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getFromRhyMigration() {
            return this.fromRhyMigration;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getFromDDOnboardingFlow() {
            return this.fromDDOnboardingFlow;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getShowBranchV2() {
            return this.showBranchV2;
        }

        public final DirectDepositSetup copy(boolean showSplash, boolean showEarlyPayHook, boolean fromRhyMigration, boolean fromDDOnboardingFlow, boolean showBranchV2) {
            return new DirectDepositSetup(showSplash, showEarlyPayHook, fromRhyMigration, fromDDOnboardingFlow, showBranchV2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DirectDepositSetup)) {
                return false;
            }
            DirectDepositSetup directDepositSetup = (DirectDepositSetup) other;
            return this.showSplash == directDepositSetup.showSplash && this.showEarlyPayHook == directDepositSetup.showEarlyPayHook && this.fromRhyMigration == directDepositSetup.fromRhyMigration && this.fromDDOnboardingFlow == directDepositSetup.fromDDOnboardingFlow && this.showBranchV2 == directDepositSetup.showBranchV2;
        }

        public int hashCode() {
            return (((((((Boolean.hashCode(this.showSplash) * 31) + Boolean.hashCode(this.showEarlyPayHook)) * 31) + Boolean.hashCode(this.fromRhyMigration)) * 31) + Boolean.hashCode(this.fromDDOnboardingFlow)) * 31) + Boolean.hashCode(this.showBranchV2);
        }

        public String toString() {
            return "DirectDepositSetup(showSplash=" + this.showSplash + ", showEarlyPayHook=" + this.showEarlyPayHook + ", fromRhyMigration=" + this.fromRhyMigration + ", fromDDOnboardingFlow=" + this.fromDDOnboardingFlow + ", showBranchV2=" + this.showBranchV2 + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.showSplash ? 1 : 0);
            dest.writeInt(this.showEarlyPayHook ? 1 : 0);
            dest.writeInt(this.fromRhyMigration ? 1 : 0);
            dest.writeInt(this.fromDDOnboardingFlow ? 1 : 0);
            dest.writeInt(this.showBranchV2 ? 1 : 0);
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public DirectDepositSetup(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            this.showSplash = z;
            this.showEarlyPayHook = z2;
            this.fromRhyMigration = z3;
            this.fromDDOnboardingFlow = z4;
            this.showBranchV2 = z5;
        }

        public /* synthetic */ DirectDepositSetup(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5);
        }

        public final boolean getShowSplash() {
            return this.showSplash;
        }

        public final boolean getShowEarlyPayHook() {
            return this.showEarlyPayHook;
        }

        public final boolean getFromRhyMigration() {
            return this.fromRhyMigration;
        }

        public final boolean getFromDDOnboardingFlow() {
            return this.fromDDOnboardingFlow;
        }

        public final boolean getShowBranchV2() {
            return this.showBranchV2;
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DirectDepositEditAmount;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "Landroid/os/Parcelable;", "amount", "Lcom/robinhood/models/ui/DirectDepositAmount;", "<init>", "(Lcom/robinhood/models/ui/DirectDepositAmount;)V", "getAmount", "()Lcom/robinhood/models/ui/DirectDepositAmount;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DirectDepositEditAmount implements LegacyIntentKey, Parcelable {
        public static final Parcelable.Creator<DirectDepositEditAmount> CREATOR = new Creator();
        private final DirectDepositAmount amount;

        /* compiled from: LegacyIntentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<DirectDepositEditAmount> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DirectDepositEditAmount createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DirectDepositEditAmount((DirectDepositAmount) parcel.readParcelable(DirectDepositEditAmount.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DirectDepositEditAmount[] newArray(int i) {
                return new DirectDepositEditAmount[i];
            }
        }

        public static /* synthetic */ DirectDepositEditAmount copy$default(DirectDepositEditAmount directDepositEditAmount, DirectDepositAmount directDepositAmount, int i, Object obj) {
            if ((i & 1) != 0) {
                directDepositAmount = directDepositEditAmount.amount;
            }
            return directDepositEditAmount.copy(directDepositAmount);
        }

        /* renamed from: component1, reason: from getter */
        public final DirectDepositAmount getAmount() {
            return this.amount;
        }

        public final DirectDepositEditAmount copy(DirectDepositAmount amount) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            return new DirectDepositEditAmount(amount);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DirectDepositEditAmount) && Intrinsics.areEqual(this.amount, ((DirectDepositEditAmount) other).amount);
        }

        public int hashCode() {
            return this.amount.hashCode();
        }

        public String toString() {
            return "DirectDepositEditAmount(amount=" + this.amount + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.amount, flags);
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public DirectDepositEditAmount(DirectDepositAmount amount) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            this.amount = amount;
        }

        public final DirectDepositAmount getAmount() {
            return this.amount;
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0004HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001bHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DirectDepositSwitcher;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "Landroid/os/Parcelable;", "showSplash", "", "fromRhyMigration", "fromDDOnboardingFlow", "showEarlyPayHook", "showExitConfirmation", "showConfirmationScreen", "<init>", "(ZZZZZZ)V", "getShowSplash", "()Z", "getFromRhyMigration", "getFromDDOnboardingFlow", "getShowEarlyPayHook", "getShowExitConfirmation", "getShowConfirmationScreen", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DirectDepositSwitcher implements LegacyIntentKey, Parcelable {
        public static final Parcelable.Creator<DirectDepositSwitcher> CREATOR = new Creator();
        private final boolean fromDDOnboardingFlow;
        private final boolean fromRhyMigration;
        private final boolean showConfirmationScreen;
        private final boolean showEarlyPayHook;
        private final boolean showExitConfirmation;
        private final boolean showSplash;

        /* compiled from: LegacyIntentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<DirectDepositSwitcher> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DirectDepositSwitcher createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                boolean z5;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z6 = false;
                boolean z7 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z6 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z7 = z;
                }
                if (parcel.readInt() != 0) {
                    z3 = z2;
                } else {
                    z3 = z2;
                    z2 = z;
                }
                if (parcel.readInt() != 0) {
                    z4 = z3;
                } else {
                    z4 = z3;
                    z3 = z;
                }
                if (parcel.readInt() != 0) {
                    z5 = z4;
                } else {
                    z5 = z4;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z5 = z;
                }
                return new DirectDepositSwitcher(z6, z7, z2, z3, z4, z5);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DirectDepositSwitcher[] newArray(int i) {
                return new DirectDepositSwitcher[i];
            }
        }

        public DirectDepositSwitcher() {
            this(false, false, false, false, false, false, 63, null);
        }

        public static /* synthetic */ DirectDepositSwitcher copy$default(DirectDepositSwitcher directDepositSwitcher, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, Object obj) {
            if ((i & 1) != 0) {
                z = directDepositSwitcher.showSplash;
            }
            if ((i & 2) != 0) {
                z2 = directDepositSwitcher.fromRhyMigration;
            }
            if ((i & 4) != 0) {
                z3 = directDepositSwitcher.fromDDOnboardingFlow;
            }
            if ((i & 8) != 0) {
                z4 = directDepositSwitcher.showEarlyPayHook;
            }
            if ((i & 16) != 0) {
                z5 = directDepositSwitcher.showExitConfirmation;
            }
            if ((i & 32) != 0) {
                z6 = directDepositSwitcher.showConfirmationScreen;
            }
            boolean z7 = z5;
            boolean z8 = z6;
            return directDepositSwitcher.copy(z, z2, z3, z4, z7, z8);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShowSplash() {
            return this.showSplash;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getFromRhyMigration() {
            return this.fromRhyMigration;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getFromDDOnboardingFlow() {
            return this.fromDDOnboardingFlow;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShowEarlyPayHook() {
            return this.showEarlyPayHook;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getShowExitConfirmation() {
            return this.showExitConfirmation;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getShowConfirmationScreen() {
            return this.showConfirmationScreen;
        }

        public final DirectDepositSwitcher copy(boolean showSplash, boolean fromRhyMigration, boolean fromDDOnboardingFlow, boolean showEarlyPayHook, boolean showExitConfirmation, boolean showConfirmationScreen) {
            return new DirectDepositSwitcher(showSplash, fromRhyMigration, fromDDOnboardingFlow, showEarlyPayHook, showExitConfirmation, showConfirmationScreen);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DirectDepositSwitcher)) {
                return false;
            }
            DirectDepositSwitcher directDepositSwitcher = (DirectDepositSwitcher) other;
            return this.showSplash == directDepositSwitcher.showSplash && this.fromRhyMigration == directDepositSwitcher.fromRhyMigration && this.fromDDOnboardingFlow == directDepositSwitcher.fromDDOnboardingFlow && this.showEarlyPayHook == directDepositSwitcher.showEarlyPayHook && this.showExitConfirmation == directDepositSwitcher.showExitConfirmation && this.showConfirmationScreen == directDepositSwitcher.showConfirmationScreen;
        }

        public int hashCode() {
            return (((((((((Boolean.hashCode(this.showSplash) * 31) + Boolean.hashCode(this.fromRhyMigration)) * 31) + Boolean.hashCode(this.fromDDOnboardingFlow)) * 31) + Boolean.hashCode(this.showEarlyPayHook)) * 31) + Boolean.hashCode(this.showExitConfirmation)) * 31) + Boolean.hashCode(this.showConfirmationScreen);
        }

        public String toString() {
            return "DirectDepositSwitcher(showSplash=" + this.showSplash + ", fromRhyMigration=" + this.fromRhyMigration + ", fromDDOnboardingFlow=" + this.fromDDOnboardingFlow + ", showEarlyPayHook=" + this.showEarlyPayHook + ", showExitConfirmation=" + this.showExitConfirmation + ", showConfirmationScreen=" + this.showConfirmationScreen + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.showSplash ? 1 : 0);
            dest.writeInt(this.fromRhyMigration ? 1 : 0);
            dest.writeInt(this.fromDDOnboardingFlow ? 1 : 0);
            dest.writeInt(this.showEarlyPayHook ? 1 : 0);
            dest.writeInt(this.showExitConfirmation ? 1 : 0);
            dest.writeInt(this.showConfirmationScreen ? 1 : 0);
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public DirectDepositSwitcher(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
            this.showSplash = z;
            this.fromRhyMigration = z2;
            this.fromDDOnboardingFlow = z3;
            this.showEarlyPayHook = z4;
            this.showExitConfirmation = z5;
            this.showConfirmationScreen = z6;
        }

        public /* synthetic */ DirectDepositSwitcher(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? true : z4, (i & 16) != 0 ? true : z5, (i & 32) != 0 ? true : z6);
        }

        public final boolean getShowSplash() {
            return this.showSplash;
        }

        public final boolean getFromRhyMigration() {
            return this.fromRhyMigration;
        }

        public final boolean getFromDDOnboardingFlow() {
            return this.fromDDOnboardingFlow;
        }

        public final boolean getShowEarlyPayHook() {
            return this.showEarlyPayHook;
        }

        public final boolean getShowExitConfirmation() {
            return this.showExitConfirmation;
        }

        public final boolean getShowConfirmationScreen() {
            return this.showConfirmationScreen;
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DirectDepositForm;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "Landroid/os/Parcelable;", "documentId", "Ljava/util/UUID;", "spending", "", "<init>", "(Ljava/util/UUID;Z)V", "getDocumentId", "()Ljava/util/UUID;", "getSpending", "()Z", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DirectDepositForm implements LegacyIntentKey, Parcelable {
        public static final Parcelable.Creator<DirectDepositForm> CREATOR = new Creator();
        private final UUID documentId;
        private final boolean spending;

        /* compiled from: LegacyIntentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<DirectDepositForm> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DirectDepositForm createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DirectDepositForm((UUID) parcel.readSerializable(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DirectDepositForm[] newArray(int i) {
                return new DirectDepositForm[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.documentId);
            dest.writeInt(this.spending ? 1 : 0);
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public DirectDepositForm(UUID documentId, boolean z) {
            Intrinsics.checkNotNullParameter(documentId, "documentId");
            this.documentId = documentId;
            this.spending = z;
        }

        public final UUID getDocumentId() {
            return this.documentId;
        }

        public final boolean getSpending() {
            return this.spending;
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DirectIpoNotificationDisclosure;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "instrumentId", "Ljava/util/UUID;", "destination", "", "source", "Lcom/robinhood/directipo/models/DirectIpoOrderSource;", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/directipo/models/DirectIpoOrderSource;)V", "getInstrumentId", "()Ljava/util/UUID;", "getDestination", "()Ljava/lang/String;", "getSource", "()Lcom/robinhood/directipo/models/DirectIpoOrderSource;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DirectIpoNotificationDisclosure implements LegacyIntentKey {
        private final String destination;
        private final UUID instrumentId;
        private final DirectIpoOrderSource source;

        public static /* synthetic */ DirectIpoNotificationDisclosure copy$default(DirectIpoNotificationDisclosure directIpoNotificationDisclosure, UUID uuid, String str, DirectIpoOrderSource directIpoOrderSource, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = directIpoNotificationDisclosure.instrumentId;
            }
            if ((i & 2) != 0) {
                str = directIpoNotificationDisclosure.destination;
            }
            if ((i & 4) != 0) {
                directIpoOrderSource = directIpoNotificationDisclosure.source;
            }
            return directIpoNotificationDisclosure.copy(uuid, str, directIpoOrderSource);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDestination() {
            return this.destination;
        }

        /* renamed from: component3, reason: from getter */
        public final DirectIpoOrderSource getSource() {
            return this.source;
        }

        public final DirectIpoNotificationDisclosure copy(UUID instrumentId, String destination, DirectIpoOrderSource source) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            return new DirectIpoNotificationDisclosure(instrumentId, destination, source);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DirectIpoNotificationDisclosure)) {
                return false;
            }
            DirectIpoNotificationDisclosure directIpoNotificationDisclosure = (DirectIpoNotificationDisclosure) other;
            return Intrinsics.areEqual(this.instrumentId, directIpoNotificationDisclosure.instrumentId) && Intrinsics.areEqual(this.destination, directIpoNotificationDisclosure.destination) && this.source == directIpoNotificationDisclosure.source;
        }

        public int hashCode() {
            int iHashCode = this.instrumentId.hashCode() * 31;
            String str = this.destination;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            DirectIpoOrderSource directIpoOrderSource = this.source;
            return iHashCode2 + (directIpoOrderSource != null ? directIpoOrderSource.hashCode() : 0);
        }

        public String toString() {
            return "DirectIpoNotificationDisclosure(instrumentId=" + this.instrumentId + ", destination=" + this.destination + ", source=" + this.source + ")";
        }

        public DirectIpoNotificationDisclosure(UUID instrumentId, String str, DirectIpoOrderSource directIpoOrderSource) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            this.instrumentId = instrumentId;
            this.destination = str;
            this.source = directIpoOrderSource;
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final String getDestination() {
            return this.destination;
        }

        public final DirectIpoOrderSource getSource() {
            return this.source;
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DirectIpoOnboardingShim;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "<init>", "()V", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DirectIpoOnboardingShim implements LegacyIntentKey {
        public static final DirectIpoOnboardingShim INSTANCE = new DirectIpoOnboardingShim();

        private DirectIpoOnboardingShim() {
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DirectIpoOnboarding;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "<init>", "()V", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DirectIpoOnboarding implements LegacyIntentKey {
        public static final DirectIpoOnboarding INSTANCE = new DirectIpoOnboarding();

        private DirectIpoOnboarding() {
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DirectIpoAllocation;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "Landroid/os/Parcelable;", "<init>", "()V", "Instrument", "SharedOrder", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DirectIpoAllocation$Instrument;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DirectIpoAllocation$SharedOrder;", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class DirectIpoAllocation implements LegacyIntentKey, Parcelable {
        public /* synthetic */ DirectIpoAllocation(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private DirectIpoAllocation() {
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        /* compiled from: LegacyIntentKey.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DirectIpoAllocation$Instrument;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DirectIpoAllocation;", "instrumentId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getInstrumentId", "()Ljava/util/UUID;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Instrument extends DirectIpoAllocation {
            public static final Parcelable.Creator<Instrument> CREATOR = new Creator();
            private final UUID instrumentId;

            /* compiled from: LegacyIntentKey.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes8.dex */
            public static final class Creator implements Parcelable.Creator<Instrument> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Instrument createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Instrument((UUID) parcel.readSerializable());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Instrument[] newArray(int i) {
                    return new Instrument[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.instrumentId);
            }

            public final UUID getInstrumentId() {
                return this.instrumentId;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Instrument(UUID instrumentId) {
                super(null);
                Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
                this.instrumentId = instrumentId;
            }
        }

        /* compiled from: LegacyIntentKey.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DirectIpoAllocation$SharedOrder;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DirectIpoAllocation;", "orderId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getOrderId", "()Ljava/util/UUID;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class SharedOrder extends DirectIpoAllocation {
            public static final Parcelable.Creator<SharedOrder> CREATOR = new Creator();
            private final UUID orderId;

            /* compiled from: LegacyIntentKey.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes8.dex */
            public static final class Creator implements Parcelable.Creator<SharedOrder> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SharedOrder createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new SharedOrder((UUID) parcel.readSerializable());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SharedOrder[] newArray(int i) {
                    return new SharedOrder[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.orderId);
            }

            public final UUID getOrderId() {
                return this.orderId;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SharedOrder(UUID orderId) {
                super(null);
                Intrinsics.checkNotNullParameter(orderId, "orderId");
                this.orderId = orderId;
            }
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DirectIpoIndicationOfInterest;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "instrumentId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getInstrumentId", "()Ljava/util/UUID;", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DirectIpoIndicationOfInterest implements LegacyIntentKey {
        private final UUID instrumentId;

        public DirectIpoIndicationOfInterest(UUID instrumentId) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            this.instrumentId = instrumentId;
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DirectIpoSummary;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "Landroid/os/Parcelable;", "instrumentId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getInstrumentId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DirectIpoSummary implements LegacyIntentKey, Parcelable {
        public static final Parcelable.Creator<DirectIpoSummary> CREATOR = new Creator();
        private final UUID instrumentId;

        /* compiled from: LegacyIntentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<DirectIpoSummary> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DirectIpoSummary createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DirectIpoSummary((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DirectIpoSummary[] newArray(int i) {
                return new DirectIpoSummary[i];
            }
        }

        public static /* synthetic */ DirectIpoSummary copy$default(DirectIpoSummary directIpoSummary, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = directIpoSummary.instrumentId;
            }
            return directIpoSummary.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final DirectIpoSummary copy(UUID instrumentId) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            return new DirectIpoSummary(instrumentId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DirectIpoSummary) && Intrinsics.areEqual(this.instrumentId, ((DirectIpoSummary) other).instrumentId);
        }

        public int hashCode() {
            return this.instrumentId.hashCode();
        }

        public String toString() {
            return "DirectIpoSummary(instrumentId=" + this.instrumentId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.instrumentId);
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public DirectIpoSummary(UUID instrumentId) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            this.instrumentId = instrumentId;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DirectIpoLimitTypeExplanation;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "instrumentId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getInstrumentId", "()Ljava/util/UUID;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DirectIpoLimitTypeExplanation implements LegacyIntentKey {
        private final UUID instrumentId;

        public static /* synthetic */ DirectIpoLimitTypeExplanation copy$default(DirectIpoLimitTypeExplanation directIpoLimitTypeExplanation, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = directIpoLimitTypeExplanation.instrumentId;
            }
            return directIpoLimitTypeExplanation.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final DirectIpoLimitTypeExplanation copy(UUID instrumentId) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            return new DirectIpoLimitTypeExplanation(instrumentId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DirectIpoLimitTypeExplanation) && Intrinsics.areEqual(this.instrumentId, ((DirectIpoLimitTypeExplanation) other).instrumentId);
        }

        public int hashCode() {
            return this.instrumentId.hashCode();
        }

        public String toString() {
            return "DirectIpoLimitTypeExplanation(instrumentId=" + this.instrumentId + ")";
        }

        public DirectIpoLimitTypeExplanation(UUID instrumentId) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            this.instrumentId = instrumentId;
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DisputeCreation;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "settledCardTransactionId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getSettledCardTransactionId", "()Ljava/util/UUID;", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DisputeCreation implements LegacyIntentKey {
        private final UUID settledCardTransactionId;

        /* JADX WARN: Multi-variable type inference failed */
        public DisputeCreation() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public DisputeCreation(UUID uuid) {
            this.settledCardTransactionId = uuid;
        }

        public /* synthetic */ DisputeCreation(UUID uuid, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uuid);
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public final UUID getSettledCardTransactionId() {
            return this.settledCardTransactionId;
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$EarlyPayEnrollment;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "hideActions", "", "<init>", "(Z)V", "getHideActions", "()Z", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EarlyPayEnrollment implements LegacyIntentKey {
        private final boolean hideActions;

        public EarlyPayEnrollment() {
            this(false, 1, null);
        }

        public EarlyPayEnrollment(boolean z) {
            this.hideActions = z;
        }

        public /* synthetic */ EarlyPayEnrollment(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public final boolean getHideActions() {
            return this.hideActions;
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$EducationOverview;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "Landroid/os/Parcelable;", "contentfulResourceId", "", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getContentfulResourceId", "()Ljava/lang/String;", "getSource", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EducationOverview implements LegacyIntentKey, Parcelable {
        public static final Parcelable.Creator<EducationOverview> CREATOR = new Creator();
        private final String contentfulResourceId;
        private final String source;

        /* compiled from: LegacyIntentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<EducationOverview> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EducationOverview createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EducationOverview(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EducationOverview[] newArray(int i) {
                return new EducationOverview[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.contentfulResourceId);
            dest.writeString(this.source);
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public EducationOverview(String contentfulResourceId, String source) {
            Intrinsics.checkNotNullParameter(contentfulResourceId, "contentfulResourceId");
            Intrinsics.checkNotNullParameter(source, "source");
            this.contentfulResourceId = contentfulResourceId;
            this.source = source;
        }

        public final String getContentfulResourceId() {
            return this.contentfulResourceId;
        }

        public final String getSource() {
            return this.source;
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$EquityOrderWithSymbol;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "symbol", "", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "completionUrl", "isPreIpo", "", "accountNumber", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/db/EquityOrderSide;Ljava/lang/String;ZLjava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "getSide", "()Lcom/robinhood/models/db/EquityOrderSide;", "getCompletionUrl", "()Z", "getAccountNumber", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EquityOrderWithSymbol implements LegacyIntentKey {
        private final String accountNumber;
        private final String completionUrl;
        private final boolean isPreIpo;
        private final EquityOrderSide side;
        private final String symbol;

        public EquityOrderWithSymbol(String symbol, EquityOrderSide side, String str, boolean z, String str2) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(side, "side");
            this.symbol = symbol;
            this.side = side;
            this.completionUrl = str;
            this.isPreIpo = z;
            this.accountNumber = str2;
        }

        public /* synthetic */ EquityOrderWithSymbol(String str, EquityOrderSide equityOrderSide, String str2, boolean z, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, equityOrderSide, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : str3);
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final EquityOrderSide getSide() {
            return this.side;
        }

        public final String getCompletionUrl() {
            return this.completionUrl;
        }

        /* renamed from: isPreIpo, reason: from getter */
        public final boolean getIsPreIpo() {
            return this.isPreIpo;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$InstantUpgrade;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "Landroid/os/Parcelable;", "accountNumber", "", "<init>", "(Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InstantUpgrade implements LegacyIntentKey, Parcelable {
        public static final Parcelable.Creator<InstantUpgrade> CREATOR = new Creator();
        private final String accountNumber;

        /* compiled from: LegacyIntentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<InstantUpgrade> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InstantUpgrade createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InstantUpgrade(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InstantUpgrade[] newArray(int i) {
                return new InstantUpgrade[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public InstantUpgrade() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ InstantUpgrade copy$default(InstantUpgrade instantUpgrade, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = instantUpgrade.accountNumber;
            }
            return instantUpgrade.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final InstantUpgrade copy(String accountNumber) {
            return new InstantUpgrade(accountNumber);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InstantUpgrade) && Intrinsics.areEqual(this.accountNumber, ((InstantUpgrade) other).accountNumber);
        }

        public int hashCode() {
            String str = this.accountNumber;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "InstantUpgrade(accountNumber=" + this.accountNumber + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public InstantUpgrade(String str) {
            this.accountNumber = str;
        }

        public /* synthetic */ InstantUpgrade(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$MarginWithdrawal;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "Landroid/os/Parcelable;", "<init>", "()V", "EnableMarginWithdrawal", "DisableMarginWithdrawal", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$MarginWithdrawal$DisableMarginWithdrawal;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$MarginWithdrawal$EnableMarginWithdrawal;", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class MarginWithdrawal implements LegacyIntentKey, Parcelable {
        public /* synthetic */ MarginWithdrawal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private MarginWithdrawal() {
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        /* compiled from: LegacyIntentKey.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$MarginWithdrawal$EnableMarginWithdrawal;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$MarginWithdrawal;", "accountNumber", "", "<init>", "(Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class EnableMarginWithdrawal extends MarginWithdrawal {
            public static final Parcelable.Creator<EnableMarginWithdrawal> CREATOR = new Creator();
            private final String accountNumber;

            /* compiled from: LegacyIntentKey.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes8.dex */
            public static final class Creator implements Parcelable.Creator<EnableMarginWithdrawal> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final EnableMarginWithdrawal createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new EnableMarginWithdrawal(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final EnableMarginWithdrawal[] newArray(int i) {
                    return new EnableMarginWithdrawal[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public EnableMarginWithdrawal() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ EnableMarginWithdrawal copy$default(EnableMarginWithdrawal enableMarginWithdrawal, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = enableMarginWithdrawal.accountNumber;
                }
                return enableMarginWithdrawal.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getAccountNumber() {
                return this.accountNumber;
            }

            public final EnableMarginWithdrawal copy(String accountNumber) {
                return new EnableMarginWithdrawal(accountNumber);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof EnableMarginWithdrawal) && Intrinsics.areEqual(this.accountNumber, ((EnableMarginWithdrawal) other).accountNumber);
            }

            public int hashCode() {
                String str = this.accountNumber;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "EnableMarginWithdrawal(accountNumber=" + this.accountNumber + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.accountNumber);
            }

            public /* synthetic */ EnableMarginWithdrawal(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }

            public final String getAccountNumber() {
                return this.accountNumber;
            }

            public EnableMarginWithdrawal(String str) {
                super(null);
                this.accountNumber = str;
            }
        }

        /* compiled from: LegacyIntentKey.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$MarginWithdrawal$DisableMarginWithdrawal;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$MarginWithdrawal;", "accountNumber", "", "<init>", "(Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class DisableMarginWithdrawal extends MarginWithdrawal {
            public static final Parcelable.Creator<DisableMarginWithdrawal> CREATOR = new Creator();
            private final String accountNumber;

            /* compiled from: LegacyIntentKey.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes8.dex */
            public static final class Creator implements Parcelable.Creator<DisableMarginWithdrawal> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DisableMarginWithdrawal createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new DisableMarginWithdrawal(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DisableMarginWithdrawal[] newArray(int i) {
                    return new DisableMarginWithdrawal[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public DisableMarginWithdrawal() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ DisableMarginWithdrawal copy$default(DisableMarginWithdrawal disableMarginWithdrawal, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = disableMarginWithdrawal.accountNumber;
                }
                return disableMarginWithdrawal.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getAccountNumber() {
                return this.accountNumber;
            }

            public final DisableMarginWithdrawal copy(String accountNumber) {
                return new DisableMarginWithdrawal(accountNumber);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DisableMarginWithdrawal) && Intrinsics.areEqual(this.accountNumber, ((DisableMarginWithdrawal) other).accountNumber);
            }

            public int hashCode() {
                String str = this.accountNumber;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "DisableMarginWithdrawal(accountNumber=" + this.accountNumber + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.accountNumber);
            }

            public /* synthetic */ DisableMarginWithdrawal(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }

            public final String getAccountNumber() {
                return this.accountNumber;
            }

            public DisableMarginWithdrawal(String str) {
                super(null);
                this.accountNumber = str;
            }
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$OptionExercise;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "Landroid/os/Parcelable;", "accountNumber", "", "exerciseOptionInstrumentId", "Lcom/robinhood/android/navigation/app/keys/data/ExerciseOptionInstrumentId;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/navigation/app/keys/data/ExerciseOptionInstrumentId;)V", "getAccountNumber", "()Ljava/lang/String;", "getExerciseOptionInstrumentId", "()Lcom/robinhood/android/navigation/app/keys/data/ExerciseOptionInstrumentId;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionExercise implements LegacyIntentKey, Parcelable {
        public static final Parcelable.Creator<OptionExercise> CREATOR = new Creator();
        private final String accountNumber;
        private final ExerciseOptionInstrumentId exerciseOptionInstrumentId;

        /* compiled from: LegacyIntentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<OptionExercise> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OptionExercise createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OptionExercise(parcel.readString(), (ExerciseOptionInstrumentId) parcel.readParcelable(OptionExercise.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OptionExercise[] newArray(int i) {
                return new OptionExercise[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeParcelable(this.exerciseOptionInstrumentId, flags);
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public OptionExercise(String str, ExerciseOptionInstrumentId exerciseOptionInstrumentId) {
            Intrinsics.checkNotNullParameter(exerciseOptionInstrumentId, "exerciseOptionInstrumentId");
            this.accountNumber = str;
            this.exerciseOptionInstrumentId = exerciseOptionInstrumentId;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final ExerciseOptionInstrumentId getExerciseOptionInstrumentId() {
            return this.exerciseOptionInstrumentId;
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$OptionsExperience;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "<init>", "()V", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionsExperience implements LegacyIntentKey {
        public static final OptionsExperience INSTANCE = new OptionsExperience();

        private OptionsExperience() {
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$OptionsProfessionalTrader;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "Landroid/os/Parcelable;", "source", "", "<init>", "(Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OptionsProfessionalTrader implements LegacyIntentKey, Parcelable {
        public static final Parcelable.Creator<OptionsProfessionalTrader> CREATOR = new Creator();
        private final String source;

        /* compiled from: LegacyIntentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<OptionsProfessionalTrader> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OptionsProfessionalTrader createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OptionsProfessionalTrader(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OptionsProfessionalTrader[] newArray(int i) {
                return new OptionsProfessionalTrader[i];
            }
        }

        public static /* synthetic */ OptionsProfessionalTrader copy$default(OptionsProfessionalTrader optionsProfessionalTrader, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = optionsProfessionalTrader.source;
            }
            return optionsProfessionalTrader.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public final OptionsProfessionalTrader copy(String source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new OptionsProfessionalTrader(source);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OptionsProfessionalTrader) && Intrinsics.areEqual(this.source, ((OptionsProfessionalTrader) other).source);
        }

        public int hashCode() {
            return this.source.hashCode();
        }

        public String toString() {
            return "OptionsProfessionalTrader(source=" + this.source + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.source);
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public OptionsProfessionalTrader(String source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.source = source;
        }

        public final String getSource() {
            return this.source;
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$OptionsWatchlistOnboarding;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "eventSourceType", "Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContext$SourceType;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContext$SourceType;)V", "getEventSourceType", "()Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContext$SourceType;", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionsWatchlistOnboarding implements LegacyIntentKey {
        private final OptionWatchlistAboutContext.SourceType eventSourceType;

        public OptionsWatchlistOnboarding(OptionWatchlistAboutContext.SourceType eventSourceType) {
            Intrinsics.checkNotNullParameter(eventSourceType, "eventSourceType");
            this.eventSourceType = eventSourceType;
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public final OptionWatchlistAboutContext.SourceType getEventSourceType() {
            return this.eventSourceType;
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$OptionRolling;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "Landroid/os/Parcelable;", "accountNumber", "", "strategyCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "getStrategyCode", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OptionRolling implements LegacyIntentKey, Parcelable {
        public static final Parcelable.Creator<OptionRolling> CREATOR = new Creator();
        private final String accountNumber;
        private final String strategyCode;

        /* compiled from: LegacyIntentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<OptionRolling> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OptionRolling createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OptionRolling(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OptionRolling[] newArray(int i) {
                return new OptionRolling[i];
            }
        }

        public static /* synthetic */ OptionRolling copy$default(OptionRolling optionRolling, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = optionRolling.accountNumber;
            }
            if ((i & 2) != 0) {
                str2 = optionRolling.strategyCode;
            }
            return optionRolling.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final String getStrategyCode() {
            return this.strategyCode;
        }

        public final OptionRolling copy(String accountNumber, String strategyCode) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
            return new OptionRolling(accountNumber, strategyCode);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OptionRolling)) {
                return false;
            }
            OptionRolling optionRolling = (OptionRolling) other;
            return Intrinsics.areEqual(this.accountNumber, optionRolling.accountNumber) && Intrinsics.areEqual(this.strategyCode, optionRolling.strategyCode);
        }

        public int hashCode() {
            return (this.accountNumber.hashCode() * 31) + this.strategyCode.hashCode();
        }

        public String toString() {
            return "OptionRolling(accountNumber=" + this.accountNumber + ", strategyCode=" + this.strategyCode + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeString(this.strategyCode);
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public OptionRolling(String accountNumber, String strategyCode) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
            this.accountNumber = accountNumber;
            this.strategyCode = strategyCode;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final String getStrategyCode() {
            return this.strategyCode;
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\b\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u0082\u0001\u0007\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ReferenceManual;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "Landroid/os/Parcelable;", "<init>", "()V", "contentfulId", "", "getContentfulId", "()Ljava/lang/String;", "sectionIdentifier", "getSectionIdentifier", "Anonymous", "Gold", "OptionNux", "Options", "Perpetuals", "NewOptionTypes", "Topics", "PerformanceChartSettings", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ReferenceManual$Anonymous;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ReferenceManual$Gold;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ReferenceManual$NewOptionTypes;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ReferenceManual$OptionNux;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ReferenceManual$Options;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ReferenceManual$PerformanceChartSettings;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ReferenceManual$Perpetuals;", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class ReferenceManual implements LegacyIntentKey, Parcelable {
        private final String sectionIdentifier;

        public /* synthetic */ ReferenceManual(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract String getContentfulId();

        private ReferenceManual() {
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public String getSectionIdentifier() {
            return this.sectionIdentifier;
        }

        /* compiled from: LegacyIntentKey.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ReferenceManual$Anonymous;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ReferenceManual;", "contentfulId", "", "sectionIdentifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getContentfulId", "()Ljava/lang/String;", "getSectionIdentifier", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Anonymous extends ReferenceManual {
            public static final Parcelable.Creator<Anonymous> CREATOR = new Creator();
            private final String contentfulId;
            private final String sectionIdentifier;

            /* compiled from: LegacyIntentKey.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes8.dex */
            public static final class Creator implements Parcelable.Creator<Anonymous> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Anonymous createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Anonymous(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Anonymous[] newArray(int i) {
                    return new Anonymous[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.contentfulId);
                dest.writeString(this.sectionIdentifier);
            }

            public /* synthetic */ Anonymous(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : str2);
            }

            @Override // com.robinhood.android.navigation.app.keys.LegacyIntentKey.ReferenceManual
            public String getContentfulId() {
                return this.contentfulId;
            }

            @Override // com.robinhood.android.navigation.app.keys.LegacyIntentKey.ReferenceManual
            public String getSectionIdentifier() {
                return this.sectionIdentifier;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Anonymous(String contentfulId, String str) {
                super(null);
                Intrinsics.checkNotNullParameter(contentfulId, "contentfulId");
                this.contentfulId = contentfulId;
                this.sectionIdentifier = str;
            }
        }

        /* compiled from: LegacyIntentKey.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ReferenceManual$Gold;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ReferenceManual;", "page", "Lcom/robinhood/android/navigation/app/keys/data/GoldReferenceManualPage;", "<init>", "(Lcom/robinhood/android/navigation/app/keys/data/GoldReferenceManualPage;)V", "getPage", "()Lcom/robinhood/android/navigation/app/keys/data/GoldReferenceManualPage;", "contentfulId", "", "getContentfulId", "()Ljava/lang/String;", "sectionIdentifier", "getSectionIdentifier", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Gold extends ReferenceManual {
            public static final Parcelable.Creator<Gold> CREATOR = new Creator();
            private final GoldReferenceManualPage page;

            /* compiled from: LegacyIntentKey.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes8.dex */
            public static final class Creator implements Parcelable.Creator<Gold> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Gold createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Gold(GoldReferenceManualPage.valueOf(parcel.readString()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Gold[] newArray(int i) {
                    return new Gold[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Gold() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.page.name());
            }

            public /* synthetic */ Gold(GoldReferenceManualPage goldReferenceManualPage, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? GoldReferenceManualPage.OVERVIEW : goldReferenceManualPage);
            }

            public final GoldReferenceManualPage getPage() {
                return this.page;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Gold(GoldReferenceManualPage page) {
                super(null);
                Intrinsics.checkNotNullParameter(page, "page");
                this.page = page;
            }

            @Override // com.robinhood.android.navigation.app.keys.LegacyIntentKey.ReferenceManual
            public String getContentfulId() {
                return Topics.GOLD;
            }

            @Override // com.robinhood.android.navigation.app.keys.LegacyIntentKey.ReferenceManual
            public String getSectionIdentifier() {
                return this.page.getServerValue();
            }
        }

        /* compiled from: LegacyIntentKey.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ReferenceManual$OptionNux;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ReferenceManual;", "page", "Lcom/robinhood/android/navigation/app/keys/data/OptionNuxPage;", "<init>", "(Lcom/robinhood/android/navigation/app/keys/data/OptionNuxPage;)V", "getPage", "()Lcom/robinhood/android/navigation/app/keys/data/OptionNuxPage;", "contentfulId", "", "getContentfulId", "()Ljava/lang/String;", "sectionIdentifier", "getSectionIdentifier", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class OptionNux extends ReferenceManual {
            public static final Parcelable.Creator<OptionNux> CREATOR = new Creator();
            private final OptionNuxPage page;

            /* compiled from: LegacyIntentKey.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes8.dex */
            public static final class Creator implements Parcelable.Creator<OptionNux> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final OptionNux createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new OptionNux(OptionNuxPage.valueOf(parcel.readString()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final OptionNux[] newArray(int i) {
                    return new OptionNux[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public OptionNux() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.page.name());
            }

            public /* synthetic */ OptionNux(OptionNuxPage optionNuxPage, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? OptionNuxPage.FIRST_TRADE : optionNuxPage);
            }

            public final OptionNuxPage getPage() {
                return this.page;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OptionNux(OptionNuxPage page) {
                super(null);
                Intrinsics.checkNotNullParameter(page, "page");
                this.page = page;
            }

            @Override // com.robinhood.android.navigation.app.keys.LegacyIntentKey.ReferenceManual
            public String getContentfulId() {
                return Topics.OPTION_NUX;
            }

            @Override // com.robinhood.android.navigation.app.keys.LegacyIntentKey.ReferenceManual
            public String getSectionIdentifier() {
                return this.page.getContentfulIdentifier();
            }
        }

        /* compiled from: LegacyIntentKey.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ReferenceManual$Options;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ReferenceManual;", "page", "Lcom/robinhood/android/navigation/app/keys/data/OptionPage;", "<init>", "(Lcom/robinhood/android/navigation/app/keys/data/OptionPage;)V", "getPage", "()Lcom/robinhood/android/navigation/app/keys/data/OptionPage;", "contentfulId", "", "getContentfulId", "()Ljava/lang/String;", "sectionIdentifier", "getSectionIdentifier", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Options extends ReferenceManual {
            public static final Parcelable.Creator<Options> CREATOR = new Creator();
            private final OptionPage page;

            /* compiled from: LegacyIntentKey.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes8.dex */
            public static final class Creator implements Parcelable.Creator<Options> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Options createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Options(OptionPage.valueOf(parcel.readString()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Options[] newArray(int i) {
                    return new Options[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Options() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.page.name());
            }

            public /* synthetic */ Options(OptionPage optionPage, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? OptionPage.FREE_OPTIONS_TRADING : optionPage);
            }

            public final OptionPage getPage() {
                return this.page;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Options(OptionPage page) {
                super(null);
                Intrinsics.checkNotNullParameter(page, "page");
                this.page = page;
            }

            @Override // com.robinhood.android.navigation.app.keys.LegacyIntentKey.ReferenceManual
            public String getContentfulId() {
                return Topics.OPTIONS;
            }

            @Override // com.robinhood.android.navigation.app.keys.LegacyIntentKey.ReferenceManual
            public String getSectionIdentifier() {
                return this.page.getContentfulIdentifier();
            }
        }

        /* compiled from: LegacyIntentKey.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ReferenceManual$Perpetuals;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ReferenceManual;", "page", "Lcom/robinhood/shared/crypto/perpetuals/contracts/PerpetualsReferenceManualPage;", "<init>", "(Lcom/robinhood/shared/crypto/perpetuals/contracts/PerpetualsReferenceManualPage;)V", "getPage", "()Lcom/robinhood/shared/crypto/perpetuals/contracts/PerpetualsReferenceManualPage;", "contentfulId", "", "getContentfulId", "()Ljava/lang/String;", "sectionIdentifier", "getSectionIdentifier", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Perpetuals extends ReferenceManual {
            public static final Parcelable.Creator<Perpetuals> CREATOR = new Creator();
            private final PerpetualsReferenceManualPage page;

            /* compiled from: LegacyIntentKey.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Perpetuals> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Perpetuals createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Perpetuals(PerpetualsReferenceManualPage.valueOf(parcel.readString()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Perpetuals[] newArray(int i) {
                    return new Perpetuals[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Perpetuals() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.page.name());
            }

            public /* synthetic */ Perpetuals(PerpetualsReferenceManualPage perpetualsReferenceManualPage, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? PerpetualsReferenceManualPage.OVERVIEW : perpetualsReferenceManualPage);
            }

            public final PerpetualsReferenceManualPage getPage() {
                return this.page;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Perpetuals(PerpetualsReferenceManualPage page) {
                super(null);
                Intrinsics.checkNotNullParameter(page, "page");
                this.page = page;
            }

            @Override // com.robinhood.android.navigation.app.keys.LegacyIntentKey.ReferenceManual
            public String getContentfulId() {
                return Topics.PERPETUALS;
            }

            @Override // com.robinhood.android.navigation.app.keys.LegacyIntentKey.ReferenceManual
            public String getSectionIdentifier() {
                return this.page.getContentfulIdentifier();
            }
        }

        /* compiled from: LegacyIntentKey.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ReferenceManual$NewOptionTypes;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ReferenceManual;", "contentfulId", "", "<init>", "(Ljava/lang/String;)V", "getContentfulId", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class NewOptionTypes extends ReferenceManual {
            public static final Parcelable.Creator<NewOptionTypes> CREATOR = new Creator();
            private final String contentfulId;

            /* compiled from: LegacyIntentKey.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes8.dex */
            public static final class Creator implements Parcelable.Creator<NewOptionTypes> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final NewOptionTypes createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NewOptionTypes(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final NewOptionTypes[] newArray(int i) {
                    return new NewOptionTypes[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.contentfulId);
            }

            @Override // com.robinhood.android.navigation.app.keys.LegacyIntentKey.ReferenceManual
            public String getContentfulId() {
                return this.contentfulId;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NewOptionTypes(String contentfulId) {
                super(null);
                Intrinsics.checkNotNullParameter(contentfulId, "contentfulId");
                this.contentfulId = contentfulId;
            }
        }

        /* compiled from: LegacyIntentKey.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ReferenceManual$Topics;", "", "<init>", "()V", "GOLD", "", "OPTIONS", "OPTION_NUX", "PERPETUALS", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Topics {
            public static final String GOLD = "kpuJrYSsLeYGZ2VbqcLAO";
            public static final Topics INSTANCE = new Topics();
            public static final String OPTIONS = "2Op4iZs3tzdvY0w5C3mIfX";
            public static final String OPTION_NUX = "30ZZ5mllp6J5TAHEk3uzut";
            public static final String PERPETUALS = "52j6Bqm0uLpMML7oErXIyz";

            private Topics() {
            }
        }

        /* compiled from: LegacyIntentKey.kt */
        @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ReferenceManual$PerformanceChartSettings;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ReferenceManual;", "<init>", "()V", "contentfulId", "", "getContentfulId", "()Ljava/lang/String;", "sectionIdentifier", "getSectionIdentifier", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class PerformanceChartSettings extends ReferenceManual {
            public static final PerformanceChartSettings INSTANCE = new PerformanceChartSettings();
            public static final Parcelable.Creator<PerformanceChartSettings> CREATOR = new Creator();

            /* compiled from: LegacyIntentKey.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes8.dex */
            public static final class Creator implements Parcelable.Creator<PerformanceChartSettings> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PerformanceChartSettings createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return PerformanceChartSettings.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PerformanceChartSettings[] newArray(int i) {
                    return new PerformanceChartSettings[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private PerformanceChartSettings() {
                super(null);
            }

            @Override // com.robinhood.android.navigation.app.keys.LegacyIntentKey.ReferenceManual
            public String getContentfulId() {
                return "5ttAwlcmrngpcww8IaWTes";
            }

            @Override // com.robinhood.android.navigation.app.keys.LegacyIntentKey.ReferenceManual
            public String getSectionIdentifier() {
                return "portfolio-chart-settings-desc";
            }
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001e\u001a\u00020\tHÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0019R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RhyMigrationOnboarding;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "Landroid/os/Parcelable;", "exitDeeplinkOverride", "Landroid/net/Uri;", "startDirectDepositSetupAfterMigration", "", "forceUseOrganicMigration", "source", "", "<init>", "(Landroid/net/Uri;ZZLjava/lang/String;)V", "getExitDeeplinkOverride", "()Landroid/net/Uri;", "getStartDirectDepositSetupAfterMigration", "()Z", "getForceUseOrganicMigration", "getSource", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RhyMigrationOnboarding implements LegacyIntentKey, Parcelable {
        public static final Parcelable.Creator<RhyMigrationOnboarding> CREATOR = new Creator();
        private final Uri exitDeeplinkOverride;
        private final boolean forceUseOrganicMigration;
        private final String source;
        private final boolean startDirectDepositSetupAfterMigration;

        /* compiled from: LegacyIntentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<RhyMigrationOnboarding> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyMigrationOnboarding createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RhyMigrationOnboarding((Uri) parcel.readParcelable(RhyMigrationOnboarding.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyMigrationOnboarding[] newArray(int i) {
                return new RhyMigrationOnboarding[i];
            }
        }

        public RhyMigrationOnboarding() {
            this(null, false, false, null, 15, null);
        }

        public static /* synthetic */ RhyMigrationOnboarding copy$default(RhyMigrationOnboarding rhyMigrationOnboarding, Uri uri, boolean z, boolean z2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = rhyMigrationOnboarding.exitDeeplinkOverride;
            }
            if ((i & 2) != 0) {
                z = rhyMigrationOnboarding.startDirectDepositSetupAfterMigration;
            }
            if ((i & 4) != 0) {
                z2 = rhyMigrationOnboarding.forceUseOrganicMigration;
            }
            if ((i & 8) != 0) {
                str = rhyMigrationOnboarding.source;
            }
            return rhyMigrationOnboarding.copy(uri, z, z2, str);
        }

        /* renamed from: component1, reason: from getter */
        public final Uri getExitDeeplinkOverride() {
            return this.exitDeeplinkOverride;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getStartDirectDepositSetupAfterMigration() {
            return this.startDirectDepositSetupAfterMigration;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getForceUseOrganicMigration() {
            return this.forceUseOrganicMigration;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public final RhyMigrationOnboarding copy(Uri exitDeeplinkOverride, boolean startDirectDepositSetupAfterMigration, boolean forceUseOrganicMigration, String source) {
            return new RhyMigrationOnboarding(exitDeeplinkOverride, startDirectDepositSetupAfterMigration, forceUseOrganicMigration, source);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RhyMigrationOnboarding)) {
                return false;
            }
            RhyMigrationOnboarding rhyMigrationOnboarding = (RhyMigrationOnboarding) other;
            return Intrinsics.areEqual(this.exitDeeplinkOverride, rhyMigrationOnboarding.exitDeeplinkOverride) && this.startDirectDepositSetupAfterMigration == rhyMigrationOnboarding.startDirectDepositSetupAfterMigration && this.forceUseOrganicMigration == rhyMigrationOnboarding.forceUseOrganicMigration && Intrinsics.areEqual(this.source, rhyMigrationOnboarding.source);
        }

        public int hashCode() {
            Uri uri = this.exitDeeplinkOverride;
            int iHashCode = (((((uri == null ? 0 : uri.hashCode()) * 31) + Boolean.hashCode(this.startDirectDepositSetupAfterMigration)) * 31) + Boolean.hashCode(this.forceUseOrganicMigration)) * 31;
            String str = this.source;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "RhyMigrationOnboarding(exitDeeplinkOverride=" + this.exitDeeplinkOverride + ", startDirectDepositSetupAfterMigration=" + this.startDirectDepositSetupAfterMigration + ", forceUseOrganicMigration=" + this.forceUseOrganicMigration + ", source=" + this.source + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.exitDeeplinkOverride, flags);
            dest.writeInt(this.startDirectDepositSetupAfterMigration ? 1 : 0);
            dest.writeInt(this.forceUseOrganicMigration ? 1 : 0);
            dest.writeString(this.source);
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public RhyMigrationOnboarding(Uri uri, boolean z, boolean z2, String str) {
            this.exitDeeplinkOverride = uri;
            this.startDirectDepositSetupAfterMigration = z;
            this.forceUseOrganicMigration = z2;
            this.source = str;
        }

        public /* synthetic */ RhyMigrationOnboarding(Uri uri, boolean z, boolean z2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uri, (i & 2) != 0 ? true : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : str);
        }

        public final Uri getExitDeeplinkOverride() {
            return this.exitDeeplinkOverride;
        }

        public final boolean getStartDirectDepositSetupAfterMigration() {
            return this.startDirectDepositSetupAfterMigration;
        }

        public final boolean getForceUseOrganicMigration() {
            return this.forceUseOrganicMigration;
        }

        public final String getSource() {
            return this.source;
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RhyWaitlist;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "<init>", "()V", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RhyWaitlist implements LegacyIntentKey {
        public static final RhyWaitlist INSTANCE = new RhyWaitlist();

        private RhyWaitlist() {
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RewardsOnboarding;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "Landroid/os/Parcelable;", "action", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RewardsOnboarding$Action;", "<init>", "(Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RewardsOnboarding$Action;)V", "getAction", "()Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RewardsOnboarding$Action;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Action", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RewardsOnboarding implements LegacyIntentKey, Parcelable {
        public static final Parcelable.Creator<RewardsOnboarding> CREATOR = new Creator();
        private final Action action;

        /* compiled from: LegacyIntentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<RewardsOnboarding> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RewardsOnboarding createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RewardsOnboarding(Action.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RewardsOnboarding[] newArray(int i) {
                return new RewardsOnboarding[i];
            }
        }

        public static /* synthetic */ RewardsOnboarding copy$default(RewardsOnboarding rewardsOnboarding, Action action, int i, Object obj) {
            if ((i & 1) != 0) {
                action = rewardsOnboarding.action;
            }
            return rewardsOnboarding.copy(action);
        }

        /* renamed from: component1, reason: from getter */
        public final Action getAction() {
            return this.action;
        }

        public final RewardsOnboarding copy(Action action) {
            Intrinsics.checkNotNullParameter(action, "action");
            return new RewardsOnboarding(action);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RewardsOnboarding) && this.action == ((RewardsOnboarding) other).action;
        }

        public int hashCode() {
            return this.action.hashCode();
        }

        public String toString() {
            return "RewardsOnboarding(action=" + this.action + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.action.name());
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public RewardsOnboarding(Action action) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.action = action;
        }

        public final Action getAction() {
            return this.action;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: LegacyIntentKey.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RewardsOnboarding$Action;", "", "<init>", "(Ljava/lang/String;I)V", "CREATE_ENROLLMENT", "RESUME_ENROLLMENT", "CHANGE_INVESTMENT", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Action {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Action[] $VALUES;
            public static final Action CREATE_ENROLLMENT = new Action("CREATE_ENROLLMENT", 0);
            public static final Action RESUME_ENROLLMENT = new Action("RESUME_ENROLLMENT", 1);
            public static final Action CHANGE_INVESTMENT = new Action("CHANGE_INVESTMENT", 2);

            private static final /* synthetic */ Action[] $values() {
                return new Action[]{CREATE_ENROLLMENT, RESUME_ENROLLMENT, CHANGE_INVESTMENT};
            }

            public static EnumEntries<Action> getEntries() {
                return $ENTRIES;
            }

            private Action(String str, int i) {
            }

            static {
                Action[] actionArr$values = $values();
                $VALUES = actionArr$values;
                $ENTRIES = EnumEntries2.enumEntries(actionArr$values);
            }

            public static Action valueOf(String str) {
                return (Action) Enum.valueOf(Action.class, str);
            }

            public static Action[] values() {
                return (Action[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RoundupRewardsFirstTransaction;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "transactionId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getTransactionId", "()Ljava/util/UUID;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RoundupRewardsFirstTransaction implements LegacyIntentKey {
        private final UUID transactionId;

        public static /* synthetic */ RoundupRewardsFirstTransaction copy$default(RoundupRewardsFirstTransaction roundupRewardsFirstTransaction, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = roundupRewardsFirstTransaction.transactionId;
            }
            return roundupRewardsFirstTransaction.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getTransactionId() {
            return this.transactionId;
        }

        public final RoundupRewardsFirstTransaction copy(UUID transactionId) {
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            return new RoundupRewardsFirstTransaction(transactionId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RoundupRewardsFirstTransaction) && Intrinsics.areEqual(this.transactionId, ((RoundupRewardsFirstTransaction) other).transactionId);
        }

        public int hashCode() {
            return this.transactionId.hashCode();
        }

        public String toString() {
            return "RoundupRewardsFirstTransaction(transactionId=" + this.transactionId + ")";
        }

        public RoundupRewardsFirstTransaction(UUID transactionId) {
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            this.transactionId = transactionId;
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public final UUID getTransactionId() {
            return this.transactionId;
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RoundupRewardsShimActivity;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "<init>", "()V", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RoundupRewardsShimActivity implements LegacyIntentKey {
        public static final RoundupRewardsShimActivity INSTANCE = new RoundupRewardsShimActivity();

        private RoundupRewardsShimActivity() {
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RoundupRewardsAccountCreated;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "Landroid/os/Parcelable;", "type", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RoundupRewardsAccountCreated$Type;", "<init>", "(Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RoundupRewardsAccountCreated$Type;)V", "getType", "()Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RoundupRewardsAccountCreated$Type;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Type", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RoundupRewardsAccountCreated implements LegacyIntentKey, Parcelable {
        public static final Parcelable.Creator<RoundupRewardsAccountCreated> CREATOR = new Creator();
        private final Type type;

        /* compiled from: LegacyIntentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<RoundupRewardsAccountCreated> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RoundupRewardsAccountCreated createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RoundupRewardsAccountCreated(Type.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RoundupRewardsAccountCreated[] newArray(int i) {
                return new RoundupRewardsAccountCreated[i];
            }
        }

        public static /* synthetic */ RoundupRewardsAccountCreated copy$default(RoundupRewardsAccountCreated roundupRewardsAccountCreated, Type type2, int i, Object obj) {
            if ((i & 1) != 0) {
                type2 = roundupRewardsAccountCreated.type;
            }
            return roundupRewardsAccountCreated.copy(type2);
        }

        /* renamed from: component1, reason: from getter */
        public final Type getType() {
            return this.type;
        }

        public final RoundupRewardsAccountCreated copy(Type type2) {
            Intrinsics.checkNotNullParameter(type2, "type");
            return new RoundupRewardsAccountCreated(type2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RoundupRewardsAccountCreated) && this.type == ((RoundupRewardsAccountCreated) other).type;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        public String toString() {
            return "RoundupRewardsAccountCreated(type=" + this.type + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.type.name());
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public RoundupRewardsAccountCreated(Type type2) {
            Intrinsics.checkNotNullParameter(type2, "type");
            this.type = type2;
        }

        public final Type getType() {
            return this.type;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: LegacyIntentKey.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RoundupRewardsAccountCreated$Type;", "", "<init>", "(Ljava/lang/String;I)V", "BROKERAGE_ACCOUNT", "SPENDING_ACCOUNT", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Type {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            public static final Type BROKERAGE_ACCOUNT = new Type("BROKERAGE_ACCOUNT", 0);
            public static final Type SPENDING_ACCOUNT = new Type("SPENDING_ACCOUNT", 1);

            private static final /* synthetic */ Type[] $values() {
                return new Type[]{BROKERAGE_ACCOUNT, SPENDING_ACCOUNT};
            }

            public static EnumEntries<Type> getEntries() {
                return $ENTRIES;
            }

            private Type(String str, int i) {
            }

            static {
                Type[] typeArr$values = $values();
                $VALUES = typeArr$values;
                $ENTRIES = EnumEntries2.enumEntries(typeArr$values);
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RhsConversion;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "skipSplashScreen", "", "<init>", "(Z)V", "getSkipSplashScreen", "()Z", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RhsConversion implements LegacyIntentKey {
        private final boolean skipSplashScreen;

        public RhsConversion() {
            this(false, 1, null);
        }

        public RhsConversion(boolean z) {
            this.skipSplashScreen = z;
        }

        public /* synthetic */ RhsConversion(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public final boolean getSkipSplashScreen() {
            return this.skipSplashScreen;
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ScreenerFilters;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "Landroid/os/Parcelable;", "screenerId", "", "filterKey", "accountNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getScreenerId", "()Ljava/lang/String;", "getFilterKey", "getAccountNumber", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ScreenerFilters implements LegacyIntentKey, Parcelable {
        public static final Parcelable.Creator<ScreenerFilters> CREATOR = new Creator();
        private final String accountNumber;
        private final String filterKey;
        private final String screenerId;

        /* compiled from: LegacyIntentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<ScreenerFilters> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ScreenerFilters createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ScreenerFilters(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ScreenerFilters[] newArray(int i) {
                return new ScreenerFilters[i];
            }
        }

        public static /* synthetic */ ScreenerFilters copy$default(ScreenerFilters screenerFilters, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = screenerFilters.screenerId;
            }
            if ((i & 2) != 0) {
                str2 = screenerFilters.filterKey;
            }
            if ((i & 4) != 0) {
                str3 = screenerFilters.accountNumber;
            }
            return screenerFilters.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getScreenerId() {
            return this.screenerId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getFilterKey() {
            return this.filterKey;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final ScreenerFilters copy(String screenerId, String filterKey, String accountNumber) {
            return new ScreenerFilters(screenerId, filterKey, accountNumber);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ScreenerFilters)) {
                return false;
            }
            ScreenerFilters screenerFilters = (ScreenerFilters) other;
            return Intrinsics.areEqual(this.screenerId, screenerFilters.screenerId) && Intrinsics.areEqual(this.filterKey, screenerFilters.filterKey) && Intrinsics.areEqual(this.accountNumber, screenerFilters.accountNumber);
        }

        public int hashCode() {
            String str = this.screenerId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.filterKey;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.accountNumber;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "ScreenerFilters(screenerId=" + this.screenerId + ", filterKey=" + this.filterKey + ", accountNumber=" + this.accountNumber + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.screenerId);
            dest.writeString(this.filterKey);
            dest.writeString(this.accountNumber);
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public ScreenerFilters(String str, String str2, String str3) {
            this.screenerId = str;
            this.filterKey = str2;
            this.accountNumber = str3;
        }

        public /* synthetic */ ScreenerFilters(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }

        public final String getScreenerId() {
            return this.screenerId;
        }

        public final String getFilterKey() {
            return this.filterKey;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$SelectCardShippingAddress;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "<init>", "()V", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SelectCardShippingAddress implements LegacyIntentKey {
        public static final SelectCardShippingAddress INSTANCE = new SelectCardShippingAddress();

        private SelectCardShippingAddress() {
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$SlipHub;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "Landroid/os/Parcelable;", "accountNumber", "", "<init>", "(Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SlipHub implements LegacyIntentKey, Parcelable {
        public static final Parcelable.Creator<SlipHub> CREATOR = new Creator();
        private final String accountNumber;

        /* compiled from: LegacyIntentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<SlipHub> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SlipHub createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SlipHub(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SlipHub[] newArray(int i) {
                return new SlipHub[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SlipHub() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ SlipHub copy$default(SlipHub slipHub, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = slipHub.accountNumber;
            }
            return slipHub.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final SlipHub copy(String accountNumber) {
            return new SlipHub(accountNumber);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SlipHub) && Intrinsics.areEqual(this.accountNumber, ((SlipHub) other).accountNumber);
        }

        public int hashCode() {
            String str = this.accountNumber;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "SlipHub(accountNumber=" + this.accountNumber + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public SlipHub(String str) {
            this.accountNumber = str;
        }

        public /* synthetic */ SlipHub(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$SlipUpdateAgreement;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "Landroid/os/Parcelable;", "source", "", "<init>", "(Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SlipUpdateAgreement implements LegacyIntentKey, Parcelable {
        public static final Parcelable.Creator<SlipUpdateAgreement> CREATOR = new Creator();
        private final String source;

        /* compiled from: LegacyIntentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<SlipUpdateAgreement> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SlipUpdateAgreement createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SlipUpdateAgreement(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SlipUpdateAgreement[] newArray(int i) {
                return new SlipUpdateAgreement[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.source);
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public SlipUpdateAgreement(String source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.source = source;
        }

        public final String getSource() {
            return this.source;
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ThreadDeeplink;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "threadId", "", "<init>", "(Ljava/lang/String;)V", "getThreadId", "()Ljava/lang/String;", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ThreadDeeplink implements LegacyIntentKey {
        private final String threadId;

        /* JADX WARN: Multi-variable type inference failed */
        public ThreadDeeplink() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public ThreadDeeplink(String str) {
            this.threadId = str;
        }

        public /* synthetic */ ThreadDeeplink(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public final String getThreadId() {
            return this.threadId;
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DebitCardLinking;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "Landroid/os/Parcelable;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/android/navigation/app/keys/data/DebitCardLinkingConfiguration;", "<init>", "(Lcom/robinhood/android/navigation/app/keys/data/DebitCardLinkingConfiguration;)V", "getConfiguration", "()Lcom/robinhood/android/navigation/app/keys/data/DebitCardLinkingConfiguration;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DebitCardLinking implements LegacyIntentKey, Parcelable {
        public static final int RESULT_ALTERNATIVE_ACTION = 123;
        public static final String RESULT_INSTRUMENT_ID = "instrumentId";
        private final DebitCardLinkingConfiguration configuration;
        public static final Parcelable.Creator<DebitCardLinking> CREATOR = new Creator();

        /* compiled from: LegacyIntentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<DebitCardLinking> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DebitCardLinking createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DebitCardLinking((DebitCardLinkingConfiguration) parcel.readParcelable(DebitCardLinking.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DebitCardLinking[] newArray(int i) {
                return new DebitCardLinking[i];
            }
        }

        public static /* synthetic */ DebitCardLinking copy$default(DebitCardLinking debitCardLinking, DebitCardLinkingConfiguration debitCardLinkingConfiguration, int i, Object obj) {
            if ((i & 1) != 0) {
                debitCardLinkingConfiguration = debitCardLinking.configuration;
            }
            return debitCardLinking.copy(debitCardLinkingConfiguration);
        }

        /* renamed from: component1, reason: from getter */
        public final DebitCardLinkingConfiguration getConfiguration() {
            return this.configuration;
        }

        public final DebitCardLinking copy(DebitCardLinkingConfiguration configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            return new DebitCardLinking(configuration);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DebitCardLinking) && Intrinsics.areEqual(this.configuration, ((DebitCardLinking) other).configuration);
        }

        public int hashCode() {
            return this.configuration.hashCode();
        }

        public String toString() {
            return "DebitCardLinking(configuration=" + this.configuration + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.configuration, flags);
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public DebitCardLinking(DebitCardLinkingConfiguration configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.configuration = configuration;
        }

        public final DebitCardLinkingConfiguration getConfiguration() {
            return this.configuration;
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$CashManagementDeepLink;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "action", "Landroid/os/Parcelable;", "<init>", "(Landroid/os/Parcelable;)V", "getAction", "()Landroid/os/Parcelable;", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CashManagementDeepLink implements LegacyIntentKey {
        private final Parcelable action;

        public CashManagementDeepLink(Parcelable action) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.action = action;
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public final Parcelable getAction() {
            return this.action;
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$UploadResidencyDoc;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "documentRequest", "Lcom/robinhood/models/ui/DocumentRequest;", "<init>", "(Lcom/robinhood/models/ui/DocumentRequest;)V", "getDocumentRequest", "()Lcom/robinhood/models/ui/DocumentRequest;", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class UploadResidencyDoc implements LegacyIntentKey {
        private final DocumentRequest documentRequest;

        public UploadResidencyDoc(DocumentRequest documentRequest) {
            Intrinsics.checkNotNullParameter(documentRequest, "documentRequest");
            this.documentRequest = documentRequest;
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public final DocumentRequest getDocumentRequest() {
            return this.documentRequest;
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$VerifyMicrodeposits;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "achRelationshipId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "achRelationship", "Lcom/robinhood/models/db/AchRelationship;", "(Lcom/robinhood/models/db/AchRelationship;)V", "getAchRelationshipId", "()Ljava/util/UUID;", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class VerifyMicrodeposits implements LegacyIntentKey {
        private final UUID achRelationshipId;

        public VerifyMicrodeposits(UUID achRelationshipId) {
            Intrinsics.checkNotNullParameter(achRelationshipId, "achRelationshipId");
            this.achRelationshipId = achRelationshipId;
        }

        public final UUID getAchRelationshipId() {
            return this.achRelationshipId;
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public VerifyMicrodeposits(AchRelationship achRelationship) {
            this(achRelationship.getId());
            Intrinsics.checkNotNullParameter(achRelationship, "achRelationship");
            if (!achRelationship.getNeedToVerifyMicroDeposits()) {
                throw new IllegalStateException("Check failed.");
            }
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ActivateCard;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "cardId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getCardId", "()Ljava/util/UUID;", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ActivateCard implements LegacyIntentKey {
        private final UUID cardId;

        public ActivateCard(UUID uuid) {
            this.cardId = uuid;
        }

        public final UUID getCardId() {
            return this.cardId;
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u000fB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ChangeCardPin;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "cardId", "Ljava/util/UUID;", "isVirtual", "", "action", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ChangeCardPin$Action;", "<init>", "(Ljava/util/UUID;ZLcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ChangeCardPin$Action;)V", "getCardId", "()Ljava/util/UUID;", "()Z", "getAction", "()Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ChangeCardPin$Action;", "Action", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ChangeCardPin implements LegacyIntentKey {
        private final Action action;
        private final UUID cardId;
        private final boolean isVirtual;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: LegacyIntentKey.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ChangeCardPin$Action;", "", "<init>", "(Ljava/lang/String;I)V", "CHANGE_PIN", "SET_PIN", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Action {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Action[] $VALUES;
            public static final Action CHANGE_PIN = new Action("CHANGE_PIN", 0);
            public static final Action SET_PIN = new Action("SET_PIN", 1);

            private static final /* synthetic */ Action[] $values() {
                return new Action[]{CHANGE_PIN, SET_PIN};
            }

            public static EnumEntries<Action> getEntries() {
                return $ENTRIES;
            }

            private Action(String str, int i) {
            }

            static {
                Action[] actionArr$values = $values();
                $VALUES = actionArr$values;
                $ENTRIES = EnumEntries2.enumEntries(actionArr$values);
            }

            public static Action valueOf(String str) {
                return (Action) Enum.valueOf(Action.class, str);
            }

            public static Action[] values() {
                return (Action[]) $VALUES.clone();
            }
        }

        public ChangeCardPin(UUID cardId, boolean z, Action action) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            Intrinsics.checkNotNullParameter(action, "action");
            this.cardId = cardId;
            this.isVirtual = z;
            this.action = action;
        }

        public final Action getAction() {
            return this.action;
        }

        public final UUID getCardId() {
            return this.cardId;
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        /* renamed from: isVirtual, reason: from getter */
        public final boolean getIsVirtual() {
            return this.isVirtual;
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$EmailValueProp;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "<init>", "()V", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EmailValueProp implements LegacyIntentKey {
        public static final EmailValueProp INSTANCE = new EmailValueProp();

        private EmailValueProp() {
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$NewHireOnboarding;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "<init>", "()V", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @InternalOnly
    /* loaded from: classes8.dex */
    public static final class NewHireOnboarding implements LegacyIntentKey {
        public static final NewHireOnboarding INSTANCE = new NewHireOnboarding();

        private NewHireOnboarding() {
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$PostDepositInstantInfo;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "Landroid/os/Parcelable;", "transferId", "", "<init>", "(Ljava/lang/String;)V", "getTransferId", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PostDepositInstantInfo implements LegacyIntentKey, Parcelable {
        public static final Parcelable.Creator<PostDepositInstantInfo> CREATOR = new Creator();
        private final String transferId;

        /* compiled from: LegacyIntentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<PostDepositInstantInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PostDepositInstantInfo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PostDepositInstantInfo(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PostDepositInstantInfo[] newArray(int i) {
                return new PostDepositInstantInfo[i];
            }
        }

        public static /* synthetic */ PostDepositInstantInfo copy$default(PostDepositInstantInfo postDepositInstantInfo, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = postDepositInstantInfo.transferId;
            }
            return postDepositInstantInfo.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTransferId() {
            return this.transferId;
        }

        public final PostDepositInstantInfo copy(String transferId) {
            Intrinsics.checkNotNullParameter(transferId, "transferId");
            return new PostDepositInstantInfo(transferId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PostDepositInstantInfo) && Intrinsics.areEqual(this.transferId, ((PostDepositInstantInfo) other).transferId);
        }

        public int hashCode() {
            return this.transferId.hashCode();
        }

        public String toString() {
            return "PostDepositInstantInfo(transferId=" + this.transferId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.transferId);
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public PostDepositInstantInfo(String transferId) {
            Intrinsics.checkNotNullParameter(transferId, "transferId");
            this.transferId = transferId;
        }

        public final String getTransferId() {
            return this.transferId;
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RhyMerchantRewards;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "Landroid/os/Parcelable;", "offerId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getOfferId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RhyMerchantRewards implements LegacyIntentKey, Parcelable {
        public static final Parcelable.Creator<RhyMerchantRewards> CREATOR = new Creator();
        private final UUID offerId;

        /* compiled from: LegacyIntentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<RhyMerchantRewards> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyMerchantRewards createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RhyMerchantRewards((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyMerchantRewards[] newArray(int i) {
                return new RhyMerchantRewards[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public RhyMerchantRewards() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ RhyMerchantRewards copy$default(RhyMerchantRewards rhyMerchantRewards, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = rhyMerchantRewards.offerId;
            }
            return rhyMerchantRewards.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getOfferId() {
            return this.offerId;
        }

        public final RhyMerchantRewards copy(UUID offerId) {
            return new RhyMerchantRewards(offerId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RhyMerchantRewards) && Intrinsics.areEqual(this.offerId, ((RhyMerchantRewards) other).offerId);
        }

        public int hashCode() {
            UUID uuid = this.offerId;
            if (uuid == null) {
                return 0;
            }
            return uuid.hashCode();
        }

        public String toString() {
            return "RhyMerchantRewards(offerId=" + this.offerId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.offerId);
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public RhyMerchantRewards(UUID uuid) {
            this.offerId = uuid;
        }

        public /* synthetic */ RhyMerchantRewards(UUID uuid, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uuid);
        }

        public final UUID getOfferId() {
            return this.offerId;
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RecurringBrokerageCashTransfer;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "Landroid/os/Parcelable;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/android/recurring/contracts/RecurringOrderConfiguration;", "<init>", "(Lcom/robinhood/android/recurring/contracts/RecurringOrderConfiguration;)V", "getConfiguration", "()Lcom/robinhood/android/recurring/contracts/RecurringOrderConfiguration;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RecurringBrokerageCashTransfer implements LegacyIntentKey, Parcelable {
        public static final Parcelable.Creator<RecurringBrokerageCashTransfer> CREATOR = new Creator();
        private final RecurringOrderConfiguration configuration;

        /* compiled from: LegacyIntentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<RecurringBrokerageCashTransfer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RecurringBrokerageCashTransfer createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RecurringBrokerageCashTransfer((RecurringOrderConfiguration) parcel.readParcelable(RecurringBrokerageCashTransfer.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RecurringBrokerageCashTransfer[] newArray(int i) {
                return new RecurringBrokerageCashTransfer[i];
            }
        }

        public static /* synthetic */ RecurringBrokerageCashTransfer copy$default(RecurringBrokerageCashTransfer recurringBrokerageCashTransfer, RecurringOrderConfiguration recurringOrderConfiguration, int i, Object obj) {
            if ((i & 1) != 0) {
                recurringOrderConfiguration = recurringBrokerageCashTransfer.configuration;
            }
            return recurringBrokerageCashTransfer.copy(recurringOrderConfiguration);
        }

        /* renamed from: component1, reason: from getter */
        public final RecurringOrderConfiguration getConfiguration() {
            return this.configuration;
        }

        public final RecurringBrokerageCashTransfer copy(RecurringOrderConfiguration configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            return new RecurringBrokerageCashTransfer(configuration);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RecurringBrokerageCashTransfer) && Intrinsics.areEqual(this.configuration, ((RecurringBrokerageCashTransfer) other).configuration);
        }

        public int hashCode() {
            return this.configuration.hashCode();
        }

        public String toString() {
            return "RecurringBrokerageCashTransfer(configuration=" + this.configuration + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.configuration, flags);
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public RecurringBrokerageCashTransfer(RecurringOrderConfiguration configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.configuration = configuration;
        }

        public final RecurringOrderConfiguration getConfiguration() {
            return this.configuration;
        }
    }

    /* compiled from: LegacyIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0011R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$CashCushionDetails;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "Landroid/os/Parcelable;", "entryPoint", "", "showManageSettingButtonWhenEnabled", "", "<init>", "(Ljava/lang/String;Z)V", "getEntryPoint", "()Ljava/lang/String;", "getShowManageSettingButtonWhenEnabled", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CashCushionDetails implements LegacyIntentKey, Parcelable {
        public static final Parcelable.Creator<CashCushionDetails> CREATOR = new Creator();
        private final String entryPoint;
        private final boolean showManageSettingButtonWhenEnabled;

        /* compiled from: LegacyIntentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes8.dex */
        public static final class Creator implements Parcelable.Creator<CashCushionDetails> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CashCushionDetails createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CashCushionDetails(parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CashCushionDetails[] newArray(int i) {
                return new CashCushionDetails[i];
            }
        }

        public static /* synthetic */ CashCushionDetails copy$default(CashCushionDetails cashCushionDetails, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cashCushionDetails.entryPoint;
            }
            if ((i & 2) != 0) {
                z = cashCushionDetails.showManageSettingButtonWhenEnabled;
            }
            return cashCushionDetails.copy(str, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getEntryPoint() {
            return this.entryPoint;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShowManageSettingButtonWhenEnabled() {
            return this.showManageSettingButtonWhenEnabled;
        }

        public final CashCushionDetails copy(String entryPoint, boolean showManageSettingButtonWhenEnabled) {
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            return new CashCushionDetails(entryPoint, showManageSettingButtonWhenEnabled);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CashCushionDetails)) {
                return false;
            }
            CashCushionDetails cashCushionDetails = (CashCushionDetails) other;
            return Intrinsics.areEqual(this.entryPoint, cashCushionDetails.entryPoint) && this.showManageSettingButtonWhenEnabled == cashCushionDetails.showManageSettingButtonWhenEnabled;
        }

        public int hashCode() {
            return (this.entryPoint.hashCode() * 31) + Boolean.hashCode(this.showManageSettingButtonWhenEnabled);
        }

        public String toString() {
            return "CashCushionDetails(entryPoint=" + this.entryPoint + ", showManageSettingButtonWhenEnabled=" + this.showManageSettingButtonWhenEnabled + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.entryPoint);
            dest.writeInt(this.showManageSettingButtonWhenEnabled ? 1 : 0);
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public CashCushionDetails(String entryPoint, boolean z) {
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            this.entryPoint = entryPoint;
            this.showManageSettingButtonWhenEnabled = z;
        }

        public /* synthetic */ CashCushionDetails(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? true : z);
        }

        public final String getEntryPoint() {
            return this.entryPoint;
        }

        public final boolean getShowManageSettingButtonWhenEnabled() {
            return this.showManageSettingButtonWhenEnabled;
        }
    }
}
