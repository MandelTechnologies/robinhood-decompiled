package com.robinhood.android.crypto.tab.p093ui.interest;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoHomeInterestViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/interest/CryptoHomeInterestViewState;", "", "Loading", "Enrolled", "PreEnrollment", "Lcom/robinhood/android/crypto/tab/ui/interest/CryptoHomeInterestViewState$Enrolled;", "Lcom/robinhood/android/crypto/tab/ui/interest/CryptoHomeInterestViewState$Loading;", "Lcom/robinhood/android/crypto/tab/ui/interest/CryptoHomeInterestViewState$PreEnrollment;", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public interface CryptoHomeInterestViewState {

    /* compiled from: CryptoHomeInterestViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/interest/CryptoHomeInterestViewState$Loading;", "Lcom/robinhood/android/crypto/tab/ui/interest/CryptoHomeInterestViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements CryptoHomeInterestViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -168431308;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: CryptoHomeInterestViewState.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jc\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/interest/CryptoHomeInterestViewState$Enrolled;", "Lcom/robinhood/android/crypto/tab/ui/interest/CryptoHomeInterestViewState;", "title", "Lcom/robinhood/utils/resource/StringResource;", "dataRows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/crypto/tab/ui/interest/DataRowWithInfoDialogContent;", "apyBadge", "ctaText", "", "ctaDeeplink", "protectedAmountValue", "settingsDeeplink", "feeDisclaimer", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getDataRows", "()Lkotlinx/collections/immutable/ImmutableList;", "getApyBadge", "getCtaText", "()Ljava/lang/String;", "getCtaDeeplink", "getProtectedAmountValue", "getSettingsDeeplink", "getFeeDisclaimer", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Enrolled implements CryptoHomeInterestViewState {
        public static final int $stable = StringResource.$stable;
        private final StringResource apyBadge;
        private final String ctaDeeplink;
        private final String ctaText;
        private final ImmutableList<DataRowWithInfoDialogContent> dataRows;
        private final StringResource feeDisclaimer;
        private final String protectedAmountValue;
        private final String settingsDeeplink;
        private final StringResource title;

        public static /* synthetic */ Enrolled copy$default(Enrolled enrolled, StringResource stringResource, ImmutableList immutableList, StringResource stringResource2, String str, String str2, String str3, String str4, StringResource stringResource3, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = enrolled.title;
            }
            if ((i & 2) != 0) {
                immutableList = enrolled.dataRows;
            }
            if ((i & 4) != 0) {
                stringResource2 = enrolled.apyBadge;
            }
            if ((i & 8) != 0) {
                str = enrolled.ctaText;
            }
            if ((i & 16) != 0) {
                str2 = enrolled.ctaDeeplink;
            }
            if ((i & 32) != 0) {
                str3 = enrolled.protectedAmountValue;
            }
            if ((i & 64) != 0) {
                str4 = enrolled.settingsDeeplink;
            }
            if ((i & 128) != 0) {
                stringResource3 = enrolled.feeDisclaimer;
            }
            String str5 = str4;
            StringResource stringResource4 = stringResource3;
            String str6 = str2;
            String str7 = str3;
            return enrolled.copy(stringResource, immutableList, stringResource2, str, str6, str7, str5, stringResource4);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getTitle() {
            return this.title;
        }

        public final ImmutableList<DataRowWithInfoDialogContent> component2() {
            return this.dataRows;
        }

        /* renamed from: component3, reason: from getter */
        public final StringResource getApyBadge() {
            return this.apyBadge;
        }

        /* renamed from: component4, reason: from getter */
        public final String getCtaText() {
            return this.ctaText;
        }

        /* renamed from: component5, reason: from getter */
        public final String getCtaDeeplink() {
            return this.ctaDeeplink;
        }

        /* renamed from: component6, reason: from getter */
        public final String getProtectedAmountValue() {
            return this.protectedAmountValue;
        }

        /* renamed from: component7, reason: from getter */
        public final String getSettingsDeeplink() {
            return this.settingsDeeplink;
        }

        /* renamed from: component8, reason: from getter */
        public final StringResource getFeeDisclaimer() {
            return this.feeDisclaimer;
        }

        public final Enrolled copy(StringResource title, ImmutableList<DataRowWithInfoDialogContent> dataRows, StringResource apyBadge, String ctaText, String ctaDeeplink, String protectedAmountValue, String settingsDeeplink, StringResource feeDisclaimer) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(dataRows, "dataRows");
            Intrinsics.checkNotNullParameter(ctaText, "ctaText");
            Intrinsics.checkNotNullParameter(ctaDeeplink, "ctaDeeplink");
            Intrinsics.checkNotNullParameter(protectedAmountValue, "protectedAmountValue");
            Intrinsics.checkNotNullParameter(settingsDeeplink, "settingsDeeplink");
            return new Enrolled(title, dataRows, apyBadge, ctaText, ctaDeeplink, protectedAmountValue, settingsDeeplink, feeDisclaimer);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Enrolled)) {
                return false;
            }
            Enrolled enrolled = (Enrolled) other;
            return Intrinsics.areEqual(this.title, enrolled.title) && Intrinsics.areEqual(this.dataRows, enrolled.dataRows) && Intrinsics.areEqual(this.apyBadge, enrolled.apyBadge) && Intrinsics.areEqual(this.ctaText, enrolled.ctaText) && Intrinsics.areEqual(this.ctaDeeplink, enrolled.ctaDeeplink) && Intrinsics.areEqual(this.protectedAmountValue, enrolled.protectedAmountValue) && Intrinsics.areEqual(this.settingsDeeplink, enrolled.settingsDeeplink) && Intrinsics.areEqual(this.feeDisclaimer, enrolled.feeDisclaimer);
        }

        public int hashCode() {
            int iHashCode = ((this.title.hashCode() * 31) + this.dataRows.hashCode()) * 31;
            StringResource stringResource = this.apyBadge;
            int iHashCode2 = (((((((((iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31) + this.ctaText.hashCode()) * 31) + this.ctaDeeplink.hashCode()) * 31) + this.protectedAmountValue.hashCode()) * 31) + this.settingsDeeplink.hashCode()) * 31;
            StringResource stringResource2 = this.feeDisclaimer;
            return iHashCode2 + (stringResource2 != null ? stringResource2.hashCode() : 0);
        }

        public String toString() {
            return "Enrolled(title=" + this.title + ", dataRows=" + this.dataRows + ", apyBadge=" + this.apyBadge + ", ctaText=" + this.ctaText + ", ctaDeeplink=" + this.ctaDeeplink + ", protectedAmountValue=" + this.protectedAmountValue + ", settingsDeeplink=" + this.settingsDeeplink + ", feeDisclaimer=" + this.feeDisclaimer + ")";
        }

        public Enrolled(StringResource title, ImmutableList<DataRowWithInfoDialogContent> dataRows, StringResource stringResource, String ctaText, String ctaDeeplink, String protectedAmountValue, String settingsDeeplink, StringResource stringResource2) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(dataRows, "dataRows");
            Intrinsics.checkNotNullParameter(ctaText, "ctaText");
            Intrinsics.checkNotNullParameter(ctaDeeplink, "ctaDeeplink");
            Intrinsics.checkNotNullParameter(protectedAmountValue, "protectedAmountValue");
            Intrinsics.checkNotNullParameter(settingsDeeplink, "settingsDeeplink");
            this.title = title;
            this.dataRows = dataRows;
            this.apyBadge = stringResource;
            this.ctaText = ctaText;
            this.ctaDeeplink = ctaDeeplink;
            this.protectedAmountValue = protectedAmountValue;
            this.settingsDeeplink = settingsDeeplink;
            this.feeDisclaimer = stringResource2;
        }

        public final StringResource getTitle() {
            return this.title;
        }

        public final ImmutableList<DataRowWithInfoDialogContent> getDataRows() {
            return this.dataRows;
        }

        public final StringResource getApyBadge() {
            return this.apyBadge;
        }

        public final String getCtaText() {
            return this.ctaText;
        }

        public final String getCtaDeeplink() {
            return this.ctaDeeplink;
        }

        public final String getProtectedAmountValue() {
            return this.protectedAmountValue;
        }

        public final String getSettingsDeeplink() {
            return this.settingsDeeplink;
        }

        public final StringResource getFeeDisclaimer() {
            return this.feeDisclaimer;
        }
    }

    /* compiled from: CryptoHomeInterestViewState.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003JI\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/interest/CryptoHomeInterestViewState$PreEnrollment;", "Lcom/robinhood/android/crypto/tab/ui/interest/CryptoHomeInterestViewState;", "title", "Lcom/robinhood/utils/resource/StringResource;", "subtitle", "Lcom/robinhood/android/crypto/tab/ui/interest/TextWithPartialHighlight;", "ctaText", "", "ctaDeeplink", "settingsDeeplink", "feeDisclaimer", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/crypto/tab/ui/interest/TextWithPartialHighlight;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getSubtitle", "()Lcom/robinhood/android/crypto/tab/ui/interest/TextWithPartialHighlight;", "getCtaText", "()Ljava/lang/String;", "getCtaDeeplink", "getSettingsDeeplink", "getFeeDisclaimer", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PreEnrollment implements CryptoHomeInterestViewState {
        public static final int $stable = StringResource.$stable;
        private final String ctaDeeplink;
        private final String ctaText;
        private final StringResource feeDisclaimer;
        private final String settingsDeeplink;
        private final TextWithPartialHighlight subtitle;
        private final StringResource title;

        public static /* synthetic */ PreEnrollment copy$default(PreEnrollment preEnrollment, StringResource stringResource, TextWithPartialHighlight textWithPartialHighlight, String str, String str2, String str3, StringResource stringResource2, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = preEnrollment.title;
            }
            if ((i & 2) != 0) {
                textWithPartialHighlight = preEnrollment.subtitle;
            }
            if ((i & 4) != 0) {
                str = preEnrollment.ctaText;
            }
            if ((i & 8) != 0) {
                str2 = preEnrollment.ctaDeeplink;
            }
            if ((i & 16) != 0) {
                str3 = preEnrollment.settingsDeeplink;
            }
            if ((i & 32) != 0) {
                stringResource2 = preEnrollment.feeDisclaimer;
            }
            String str4 = str3;
            StringResource stringResource3 = stringResource2;
            return preEnrollment.copy(stringResource, textWithPartialHighlight, str, str2, str4, stringResource3);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final TextWithPartialHighlight getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCtaText() {
            return this.ctaText;
        }

        /* renamed from: component4, reason: from getter */
        public final String getCtaDeeplink() {
            return this.ctaDeeplink;
        }

        /* renamed from: component5, reason: from getter */
        public final String getSettingsDeeplink() {
            return this.settingsDeeplink;
        }

        /* renamed from: component6, reason: from getter */
        public final StringResource getFeeDisclaimer() {
            return this.feeDisclaimer;
        }

        public final PreEnrollment copy(StringResource title, TextWithPartialHighlight subtitle, String ctaText, String ctaDeeplink, String settingsDeeplink, StringResource feeDisclaimer) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(ctaText, "ctaText");
            Intrinsics.checkNotNullParameter(ctaDeeplink, "ctaDeeplink");
            Intrinsics.checkNotNullParameter(settingsDeeplink, "settingsDeeplink");
            return new PreEnrollment(title, subtitle, ctaText, ctaDeeplink, settingsDeeplink, feeDisclaimer);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PreEnrollment)) {
                return false;
            }
            PreEnrollment preEnrollment = (PreEnrollment) other;
            return Intrinsics.areEqual(this.title, preEnrollment.title) && Intrinsics.areEqual(this.subtitle, preEnrollment.subtitle) && Intrinsics.areEqual(this.ctaText, preEnrollment.ctaText) && Intrinsics.areEqual(this.ctaDeeplink, preEnrollment.ctaDeeplink) && Intrinsics.areEqual(this.settingsDeeplink, preEnrollment.settingsDeeplink) && Intrinsics.areEqual(this.feeDisclaimer, preEnrollment.feeDisclaimer);
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            TextWithPartialHighlight textWithPartialHighlight = this.subtitle;
            int iHashCode2 = (((((((iHashCode + (textWithPartialHighlight == null ? 0 : textWithPartialHighlight.hashCode())) * 31) + this.ctaText.hashCode()) * 31) + this.ctaDeeplink.hashCode()) * 31) + this.settingsDeeplink.hashCode()) * 31;
            StringResource stringResource = this.feeDisclaimer;
            return iHashCode2 + (stringResource != null ? stringResource.hashCode() : 0);
        }

        public String toString() {
            return "PreEnrollment(title=" + this.title + ", subtitle=" + this.subtitle + ", ctaText=" + this.ctaText + ", ctaDeeplink=" + this.ctaDeeplink + ", settingsDeeplink=" + this.settingsDeeplink + ", feeDisclaimer=" + this.feeDisclaimer + ")";
        }

        public PreEnrollment(StringResource title, TextWithPartialHighlight textWithPartialHighlight, String ctaText, String ctaDeeplink, String settingsDeeplink, StringResource stringResource) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(ctaText, "ctaText");
            Intrinsics.checkNotNullParameter(ctaDeeplink, "ctaDeeplink");
            Intrinsics.checkNotNullParameter(settingsDeeplink, "settingsDeeplink");
            this.title = title;
            this.subtitle = textWithPartialHighlight;
            this.ctaText = ctaText;
            this.ctaDeeplink = ctaDeeplink;
            this.settingsDeeplink = settingsDeeplink;
            this.feeDisclaimer = stringResource;
        }

        public final StringResource getTitle() {
            return this.title;
        }

        public final TextWithPartialHighlight getSubtitle() {
            return this.subtitle;
        }

        public final String getCtaText() {
            return this.ctaText;
        }

        public final String getCtaDeeplink() {
            return this.ctaDeeplink;
        }

        public final String getSettingsDeeplink() {
            return this.settingsDeeplink;
        }

        public final StringResource getFeeDisclaimer() {
            return this.feeDisclaimer;
        }
    }
}
