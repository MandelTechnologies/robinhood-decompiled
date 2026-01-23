package com.robinhood.android.crypto.p094ui.upgrade;

import com.robinhood.android.common.contracts.CuratedListKey;
import com.robinhood.android.crypto.util.ApiCryptoActivationExtensions;
import com.robinhood.android.crypto.util.ApiResidencyDocumentExtensions;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.librobinhood.data.store.CryptoUpgradeStore;
import com.robinhood.models.api.ApiCryptoActivation;
import com.robinhood.models.api.ApiResidencyDocument;
import com.robinhood.models.crypto.p314db.CryptoAccount;
import com.robinhood.udf.UiEvent;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoUpgradeState.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001*Be\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÂ\u0003J\t\u0010\u001e\u001a\u00020\bHÂ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nHÂ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003HÂ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003Jk\u0010#\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00032\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\bHÆ\u0001J\u0013\u0010$\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0016\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0010\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0015R\u0012\u0010\u0016\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/upgrade/CryptoUpgradeState;", "", "activations", "", "Lcom/robinhood/models/api/ApiCryptoActivation;", "eligibility", "Lcom/robinhood/librobinhood/data/store/CryptoUpgradeStore$CryptoUpgradeEligibility;", "isFromDeepLink", "", "optionalCryptoAccount", "Lcom/robinhood/models/crypto/db/CryptoAccount;", "residencyDocuments", "Lcom/robinhood/models/api/ApiResidencyDocument;", "errorEvent", "Lcom/robinhood/udf/UiEvent;", "", "isLoading", "<init>", "(Ljava/util/List;Lcom/robinhood/librobinhood/data/store/CryptoUpgradeStore$CryptoUpgradeEligibility;ZLcom/robinhood/models/crypto/db/CryptoAccount;Ljava/util/List;Lcom/robinhood/udf/UiEvent;Z)V", "getErrorEvent", "()Lcom/robinhood/udf/UiEvent;", "()Z", "hasAccessToCrypto", "Ljava/lang/Boolean;", "upgradeState", "Lcom/robinhood/android/crypto/ui/upgrade/CryptoUpgradeState$UpgradeState;", "getUpgradeState", "()Lcom/robinhood/android/crypto/ui/upgrade/CryptoUpgradeState$UpgradeState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "UpgradeState", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoUpgradeState {
    public static final int $stable = 8;
    private final List<ApiCryptoActivation> activations;
    private final CryptoUpgradeStore.CryptoUpgradeEligibility eligibility;
    private final UiEvent<Throwable> errorEvent;
    private final Boolean hasAccessToCrypto;
    private final boolean isFromDeepLink;
    private final boolean isLoading;
    private final CryptoAccount optionalCryptoAccount;
    private final List<ApiResidencyDocument> residencyDocuments;

    private final List<ApiCryptoActivation> component1() {
        return this.activations;
    }

    /* renamed from: component2, reason: from getter */
    private final CryptoUpgradeStore.CryptoUpgradeEligibility getEligibility() {
        return this.eligibility;
    }

    /* renamed from: component3, reason: from getter */
    private final boolean getIsFromDeepLink() {
        return this.isFromDeepLink;
    }

    /* renamed from: component4, reason: from getter */
    private final CryptoAccount getOptionalCryptoAccount() {
        return this.optionalCryptoAccount;
    }

    private final List<ApiResidencyDocument> component5() {
        return this.residencyDocuments;
    }

    public static /* synthetic */ CryptoUpgradeState copy$default(CryptoUpgradeState cryptoUpgradeState, List list, CryptoUpgradeStore.CryptoUpgradeEligibility cryptoUpgradeEligibility, boolean z, CryptoAccount cryptoAccount, List list2, UiEvent uiEvent, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cryptoUpgradeState.activations;
        }
        if ((i & 2) != 0) {
            cryptoUpgradeEligibility = cryptoUpgradeState.eligibility;
        }
        if ((i & 4) != 0) {
            z = cryptoUpgradeState.isFromDeepLink;
        }
        if ((i & 8) != 0) {
            cryptoAccount = cryptoUpgradeState.optionalCryptoAccount;
        }
        if ((i & 16) != 0) {
            list2 = cryptoUpgradeState.residencyDocuments;
        }
        if ((i & 32) != 0) {
            uiEvent = cryptoUpgradeState.errorEvent;
        }
        if ((i & 64) != 0) {
            z2 = cryptoUpgradeState.isLoading;
        }
        UiEvent uiEvent2 = uiEvent;
        boolean z3 = z2;
        List list3 = list2;
        boolean z4 = z;
        return cryptoUpgradeState.copy(list, cryptoUpgradeEligibility, z4, cryptoAccount, list3, uiEvent2, z3);
    }

    public final UiEvent<Throwable> component6() {
        return this.errorEvent;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final CryptoUpgradeState copy(List<ApiCryptoActivation> activations, CryptoUpgradeStore.CryptoUpgradeEligibility eligibility, boolean isFromDeepLink, CryptoAccount optionalCryptoAccount, List<ApiResidencyDocument> residencyDocuments, UiEvent<Throwable> errorEvent, boolean isLoading) {
        return new CryptoUpgradeState(activations, eligibility, isFromDeepLink, optionalCryptoAccount, residencyDocuments, errorEvent, isLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoUpgradeState)) {
            return false;
        }
        CryptoUpgradeState cryptoUpgradeState = (CryptoUpgradeState) other;
        return Intrinsics.areEqual(this.activations, cryptoUpgradeState.activations) && Intrinsics.areEqual(this.eligibility, cryptoUpgradeState.eligibility) && this.isFromDeepLink == cryptoUpgradeState.isFromDeepLink && Intrinsics.areEqual(this.optionalCryptoAccount, cryptoUpgradeState.optionalCryptoAccount) && Intrinsics.areEqual(this.residencyDocuments, cryptoUpgradeState.residencyDocuments) && Intrinsics.areEqual(this.errorEvent, cryptoUpgradeState.errorEvent) && this.isLoading == cryptoUpgradeState.isLoading;
    }

    public int hashCode() {
        List<ApiCryptoActivation> list = this.activations;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        CryptoUpgradeStore.CryptoUpgradeEligibility cryptoUpgradeEligibility = this.eligibility;
        int iHashCode2 = (((iHashCode + (cryptoUpgradeEligibility == null ? 0 : cryptoUpgradeEligibility.hashCode())) * 31) + Boolean.hashCode(this.isFromDeepLink)) * 31;
        CryptoAccount cryptoAccount = this.optionalCryptoAccount;
        int iHashCode3 = (iHashCode2 + (cryptoAccount == null ? 0 : cryptoAccount.hashCode())) * 31;
        List<ApiResidencyDocument> list2 = this.residencyDocuments;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        UiEvent<Throwable> uiEvent = this.errorEvent;
        return ((iHashCode4 + (uiEvent != null ? uiEvent.hashCode() : 0)) * 31) + Boolean.hashCode(this.isLoading);
    }

    public String toString() {
        return "CryptoUpgradeState(activations=" + this.activations + ", eligibility=" + this.eligibility + ", isFromDeepLink=" + this.isFromDeepLink + ", optionalCryptoAccount=" + this.optionalCryptoAccount + ", residencyDocuments=" + this.residencyDocuments + ", errorEvent=" + this.errorEvent + ", isLoading=" + this.isLoading + ")";
    }

    public CryptoUpgradeState(List<ApiCryptoActivation> list, CryptoUpgradeStore.CryptoUpgradeEligibility cryptoUpgradeEligibility, boolean z, CryptoAccount cryptoAccount, List<ApiResidencyDocument> list2, UiEvent<Throwable> uiEvent, boolean z2) {
        this.activations = list;
        this.eligibility = cryptoUpgradeEligibility;
        this.isFromDeepLink = z;
        this.optionalCryptoAccount = cryptoAccount;
        this.residencyDocuments = list2;
        this.errorEvent = uiEvent;
        this.isLoading = z2;
        this.hasAccessToCrypto = cryptoAccount != null ? Boolean.valueOf(cryptoAccount.getHasAccessToCrypto()) : null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CryptoUpgradeState(List list, CryptoUpgradeStore.CryptoUpgradeEligibility cryptoUpgradeEligibility, boolean z, CryptoAccount cryptoAccount, List list2, UiEvent uiEvent, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z3;
        UiEvent uiEvent2;
        list = (i & 1) != 0 ? null : list;
        cryptoUpgradeEligibility = (i & 2) != 0 ? null : cryptoUpgradeEligibility;
        cryptoAccount = (i & 8) != 0 ? null : cryptoAccount;
        list2 = (i & 16) != 0 ? null : list2;
        if ((i & 32) != 0) {
            z3 = z2;
            uiEvent2 = null;
        } else {
            z3 = z2;
            uiEvent2 = uiEvent;
        }
        this(list, cryptoUpgradeEligibility, z, cryptoAccount, list2, uiEvent2, z3);
    }

    public final UiEvent<Throwable> getErrorEvent() {
        return this.errorEvent;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final UpgradeState getUpgradeState() {
        Boolean bool = this.hasAccessToCrypto;
        Boolean bool2 = Boolean.TRUE;
        int i = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (Intrinsics.areEqual(bool, bool2) && this.isFromDeepLink) {
            return new UpgradeState.ShowCryptoCuratedList(objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0);
        }
        if (Intrinsics.areEqual(this.hasAccessToCrypto, bool2) && !this.isFromDeepLink) {
            return UpgradeState.AlreadyUpgraded.INSTANCE;
        }
        if (this.eligibility instanceof CryptoUpgradeStore.CryptoUpgradeEligibility.Eligible) {
            return UpgradeState.Eligible.INSTANCE;
        }
        List<ApiCryptoActivation> list = this.activations;
        if (list != null && ApiCryptoActivationExtensions.hasIneligibleJurisdiction2or3(list)) {
            List<ApiResidencyDocument> list2 = this.residencyDocuments;
            if ((list2 != null ? ApiResidencyDocumentExtensions.getPendingDocument(list2) : null) != null) {
                ApiResidencyDocument pendingDocument = ApiResidencyDocumentExtensions.getPendingDocument(this.residencyDocuments);
                Intrinsics.checkNotNull(pendingDocument);
                return new UpgradeState.ResidencyDocumentRequired(pendingDocument.getId());
            }
        }
        List<ApiCryptoActivation> list3 = this.activations;
        if (list3 != null && ApiCryptoActivationExtensions.hasInReviewActivation(list3)) {
            return UpgradeState.AccountUnderReview.INSTANCE;
        }
        CryptoUpgradeStore.CryptoUpgradeEligibility cryptoUpgradeEligibility = this.eligibility;
        CryptoUpgradeStore.CryptoUpgradeEligibility.NotEligible.HasExternalStatusCode hasExternalStatusCode = cryptoUpgradeEligibility instanceof CryptoUpgradeStore.CryptoUpgradeEligibility.NotEligible.HasExternalStatusCode ? (CryptoUpgradeStore.CryptoUpgradeEligibility.NotEligible.HasExternalStatusCode) cryptoUpgradeEligibility : null;
        return new UpgradeState.Ineligible(hasExternalStatusCode != null ? hasExternalStatusCode.getExternalStatusCode() : null);
    }

    /* compiled from: CryptoUpgradeState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/upgrade/CryptoUpgradeState$UpgradeState;", "", "<init>", "()V", "AccountUnderReview", "AlreadyUpgraded", "Eligible", "Ineligible", "ResidencyDocumentRequired", "ShowCryptoCuratedList", "Lcom/robinhood/android/crypto/ui/upgrade/CryptoUpgradeState$UpgradeState$AccountUnderReview;", "Lcom/robinhood/android/crypto/ui/upgrade/CryptoUpgradeState$UpgradeState$AlreadyUpgraded;", "Lcom/robinhood/android/crypto/ui/upgrade/CryptoUpgradeState$UpgradeState$Eligible;", "Lcom/robinhood/android/crypto/ui/upgrade/CryptoUpgradeState$UpgradeState$Ineligible;", "Lcom/robinhood/android/crypto/ui/upgrade/CryptoUpgradeState$UpgradeState$ResidencyDocumentRequired;", "Lcom/robinhood/android/crypto/ui/upgrade/CryptoUpgradeState$UpgradeState$ShowCryptoCuratedList;", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class UpgradeState {
        public static final int $stable = 0;

        public /* synthetic */ UpgradeState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: CryptoUpgradeState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/upgrade/CryptoUpgradeState$UpgradeState$AccountUnderReview;", "Lcom/robinhood/android/crypto/ui/upgrade/CryptoUpgradeState$UpgradeState;", "<init>", "()V", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class AccountUnderReview extends UpgradeState {
            public static final int $stable = 0;
            public static final AccountUnderReview INSTANCE = new AccountUnderReview();

            private AccountUnderReview() {
                super(null);
            }
        }

        private UpgradeState() {
        }

        /* compiled from: CryptoUpgradeState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/upgrade/CryptoUpgradeState$UpgradeState$AlreadyUpgraded;", "Lcom/robinhood/android/crypto/ui/upgrade/CryptoUpgradeState$UpgradeState;", "<init>", "()V", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class AlreadyUpgraded extends UpgradeState {
            public static final int $stable = 0;
            public static final AlreadyUpgraded INSTANCE = new AlreadyUpgraded();

            private AlreadyUpgraded() {
                super(null);
            }
        }

        /* compiled from: CryptoUpgradeState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/upgrade/CryptoUpgradeState$UpgradeState$Eligible;", "Lcom/robinhood/android/crypto/ui/upgrade/CryptoUpgradeState$UpgradeState;", "<init>", "()V", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Eligible extends UpgradeState {
            public static final int $stable = 0;
            public static final Eligible INSTANCE = new Eligible();

            private Eligible() {
                super(null);
            }
        }

        /* compiled from: CryptoUpgradeState.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/upgrade/CryptoUpgradeState$UpgradeState$Ineligible;", "Lcom/robinhood/android/crypto/ui/upgrade/CryptoUpgradeState$UpgradeState;", "externalStatusCode", "", "<init>", "(Ljava/lang/String;)V", "getExternalStatusCode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Ineligible extends UpgradeState {
            public static final int $stable = 0;
            private final String externalStatusCode;

            public static /* synthetic */ Ineligible copy$default(Ineligible ineligible, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = ineligible.externalStatusCode;
                }
                return ineligible.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getExternalStatusCode() {
                return this.externalStatusCode;
            }

            public final Ineligible copy(String externalStatusCode) {
                return new Ineligible(externalStatusCode);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Ineligible) && Intrinsics.areEqual(this.externalStatusCode, ((Ineligible) other).externalStatusCode);
            }

            public int hashCode() {
                String str = this.externalStatusCode;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "Ineligible(externalStatusCode=" + this.externalStatusCode + ")";
            }

            public Ineligible(String str) {
                super(null);
                this.externalStatusCode = str;
            }

            public final String getExternalStatusCode() {
                return this.externalStatusCode;
            }
        }

        /* compiled from: CryptoUpgradeState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/upgrade/CryptoUpgradeState$UpgradeState$ResidencyDocumentRequired;", "Lcom/robinhood/android/crypto/ui/upgrade/CryptoUpgradeState$UpgradeState;", "pendingResidencyDocumentId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getPendingResidencyDocumentId", "()Ljava/util/UUID;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ResidencyDocumentRequired extends UpgradeState {
            public static final int $stable = 8;
            private final UUID pendingResidencyDocumentId;

            public static /* synthetic */ ResidencyDocumentRequired copy$default(ResidencyDocumentRequired residencyDocumentRequired, UUID uuid, int i, Object obj) {
                if ((i & 1) != 0) {
                    uuid = residencyDocumentRequired.pendingResidencyDocumentId;
                }
                return residencyDocumentRequired.copy(uuid);
            }

            /* renamed from: component1, reason: from getter */
            public final UUID getPendingResidencyDocumentId() {
                return this.pendingResidencyDocumentId;
            }

            public final ResidencyDocumentRequired copy(UUID pendingResidencyDocumentId) {
                Intrinsics.checkNotNullParameter(pendingResidencyDocumentId, "pendingResidencyDocumentId");
                return new ResidencyDocumentRequired(pendingResidencyDocumentId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ResidencyDocumentRequired) && Intrinsics.areEqual(this.pendingResidencyDocumentId, ((ResidencyDocumentRequired) other).pendingResidencyDocumentId);
            }

            public int hashCode() {
                return this.pendingResidencyDocumentId.hashCode();
            }

            public String toString() {
                return "ResidencyDocumentRequired(pendingResidencyDocumentId=" + this.pendingResidencyDocumentId + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ResidencyDocumentRequired(UUID pendingResidencyDocumentId) {
                super(null);
                Intrinsics.checkNotNullParameter(pendingResidencyDocumentId, "pendingResidencyDocumentId");
                this.pendingResidencyDocumentId = pendingResidencyDocumentId;
            }

            public final UUID getPendingResidencyDocumentId() {
                return this.pendingResidencyDocumentId;
            }
        }

        /* compiled from: CryptoUpgradeState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/upgrade/CryptoUpgradeState$UpgradeState$ShowCryptoCuratedList;", "Lcom/robinhood/android/crypto/ui/upgrade/CryptoUpgradeState$UpgradeState;", "fragmentKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/FragmentKey;)V", "getFragmentKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ShowCryptoCuratedList extends UpgradeState {
            public static final int $stable = 8;
            private final FragmentKey fragmentKey;

            /* JADX WARN: Multi-variable type inference failed */
            public ShowCryptoCuratedList() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ ShowCryptoCuratedList copy$default(ShowCryptoCuratedList showCryptoCuratedList, FragmentKey fragmentKey, int i, Object obj) {
                if ((i & 1) != 0) {
                    fragmentKey = showCryptoCuratedList.fragmentKey;
                }
                return showCryptoCuratedList.copy(fragmentKey);
            }

            /* renamed from: component1, reason: from getter */
            public final FragmentKey getFragmentKey() {
                return this.fragmentKey;
            }

            public final ShowCryptoCuratedList copy(FragmentKey fragmentKey) {
                Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
                return new ShowCryptoCuratedList(fragmentKey);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowCryptoCuratedList) && Intrinsics.areEqual(this.fragmentKey, ((ShowCryptoCuratedList) other).fragmentKey);
            }

            public int hashCode() {
                return this.fragmentKey.hashCode();
            }

            public String toString() {
                return "ShowCryptoCuratedList(fragmentKey=" + this.fragmentKey + ")";
            }

            public /* synthetic */ ShowCryptoCuratedList(FragmentKey fragmentKey, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? CuratedListKey.INSTANCE.getCryptoListKey() : fragmentKey);
            }

            public final FragmentKey getFragmentKey() {
                return this.fragmentKey;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowCryptoCuratedList(FragmentKey fragmentKey) {
                super(null);
                Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
                this.fragmentKey = fragmentKey;
            }
        }
    }
}
