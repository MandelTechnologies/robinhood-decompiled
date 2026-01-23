package com.robinhood.android.futures.onboarding.p145ui.result;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.futures.onboarding.C17293R;
import com.robinhood.shared.education.order.OrderTypeEducationLearnMoreFragment;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesAccountResultDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/result/FuturesAccountResultViewState;", "", "Ineligible", "ManualReview", "Approved", "Lcom/robinhood/android/futures/onboarding/ui/result/FuturesAccountResultViewState$Approved;", "Lcom/robinhood/android/futures/onboarding/ui/result/FuturesAccountResultViewState$Ineligible;", "Lcom/robinhood/android/futures/onboarding/ui/result/FuturesAccountResultViewState$ManualReview;", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.onboarding.ui.result.FuturesAccountResultViewState, reason: use source file name */
/* loaded from: classes3.dex */
public interface FuturesAccountResultDuxo4 {

    /* compiled from: FuturesAccountResultDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/result/FuturesAccountResultViewState$Ineligible;", "Lcom/robinhood/android/futures/onboarding/ui/result/FuturesAccountResultViewState;", "isEventsContracts", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.onboarding.ui.result.FuturesAccountResultViewState$Ineligible, reason: from toString */
    public static final /* data */ class Ineligible implements FuturesAccountResultDuxo4 {
        public static final int $stable = 0;
        private final boolean isEventsContracts;

        public static /* synthetic */ Ineligible copy$default(Ineligible ineligible, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = ineligible.isEventsContracts;
            }
            return ineligible.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsEventsContracts() {
            return this.isEventsContracts;
        }

        public final Ineligible copy(boolean isEventsContracts) {
            return new Ineligible(isEventsContracts);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Ineligible) && this.isEventsContracts == ((Ineligible) other).isEventsContracts;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isEventsContracts);
        }

        public String toString() {
            return "Ineligible(isEventsContracts=" + this.isEventsContracts + ")";
        }

        public Ineligible(boolean z) {
            this.isEventsContracts = z;
        }

        public final boolean isEventsContracts() {
            return this.isEventsContracts;
        }
    }

    /* compiled from: FuturesAccountResultDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/result/FuturesAccountResultViewState$ManualReview;", "Lcom/robinhood/android/futures/onboarding/ui/result/FuturesAccountResultViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.onboarding.ui.result.FuturesAccountResultViewState$ManualReview */
    public static final /* data */ class ManualReview implements FuturesAccountResultDuxo4 {
        public static final int $stable = 0;
        public static final ManualReview INSTANCE = new ManualReview();

        public boolean equals(Object other) {
            return this == other || (other instanceof ManualReview);
        }

        public int hashCode() {
            return -885833038;
        }

        public String toString() {
            return "ManualReview";
        }

        private ManualReview() {
        }
    }

    /* compiled from: FuturesAccountResultDuxo.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003Jg\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010)\u001a\u00020\u00032\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020\u001aHÖ\u0001J\t\u0010-\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0010R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\u0019\u001a\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0017¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/result/FuturesAccountResultViewState$Approved;", "Lcom/robinhood/android/futures/onboarding/ui/result/FuturesAccountResultViewState;", "isEventsContracts", "", "futuresReady", "swapsReady", "rhdAccountNumber", "", "isInMibFuturesExp", "hasMultipleBrokerageAccounts", "futuresRhsAccountDisplayNameInSentence", "Lcom/robinhood/utils/resource/StringResource;", "isInAcqStreamlinedTradeFlowExperiment", "streamlineToTradeFlow", "<init>", "(ZZZLjava/lang/String;ZZLcom/robinhood/utils/resource/StringResource;ZZ)V", "()Z", "getFuturesReady", "getSwapsReady", "getRhdAccountNumber", "()Ljava/lang/String;", "getHasMultipleBrokerageAccounts", "getFuturesRhsAccountDisplayNameInSentence", "()Lcom/robinhood/utils/resource/StringResource;", "getStreamlineToTradeFlow", OrderTypeEducationLearnMoreFragment.ARG_TITLE_RES, "", "getTitleRes", "()I", CarResultComposable2.BODY, "getBody", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.onboarding.ui.result.FuturesAccountResultViewState$Approved, reason: from toString */
    public static final /* data */ class Approved implements FuturesAccountResultDuxo4 {
        public static final int $stable = StringResource.$stable;
        private final boolean futuresReady;
        private final StringResource futuresRhsAccountDisplayNameInSentence;
        private final boolean hasMultipleBrokerageAccounts;
        private final boolean isEventsContracts;
        private final boolean isInAcqStreamlinedTradeFlowExperiment;
        private final boolean isInMibFuturesExp;
        private final String rhdAccountNumber;
        private final boolean streamlineToTradeFlow;
        private final boolean swapsReady;

        public static /* synthetic */ Approved copy$default(Approved approved, boolean z, boolean z2, boolean z3, String str, boolean z4, boolean z5, StringResource stringResource, boolean z6, boolean z7, int i, Object obj) {
            if ((i & 1) != 0) {
                z = approved.isEventsContracts;
            }
            if ((i & 2) != 0) {
                z2 = approved.futuresReady;
            }
            if ((i & 4) != 0) {
                z3 = approved.swapsReady;
            }
            if ((i & 8) != 0) {
                str = approved.rhdAccountNumber;
            }
            if ((i & 16) != 0) {
                z4 = approved.isInMibFuturesExp;
            }
            if ((i & 32) != 0) {
                z5 = approved.hasMultipleBrokerageAccounts;
            }
            if ((i & 64) != 0) {
                stringResource = approved.futuresRhsAccountDisplayNameInSentence;
            }
            if ((i & 128) != 0) {
                z6 = approved.isInAcqStreamlinedTradeFlowExperiment;
            }
            if ((i & 256) != 0) {
                z7 = approved.streamlineToTradeFlow;
            }
            boolean z8 = z6;
            boolean z9 = z7;
            boolean z10 = z5;
            StringResource stringResource2 = stringResource;
            boolean z11 = z4;
            boolean z12 = z3;
            return approved.copy(z, z2, z12, str, z11, z10, stringResource2, z8, z9);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsEventsContracts() {
            return this.isEventsContracts;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getFuturesReady() {
            return this.futuresReady;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getSwapsReady() {
            return this.swapsReady;
        }

        /* renamed from: component4, reason: from getter */
        public final String getRhdAccountNumber() {
            return this.rhdAccountNumber;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsInMibFuturesExp() {
            return this.isInMibFuturesExp;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getHasMultipleBrokerageAccounts() {
            return this.hasMultipleBrokerageAccounts;
        }

        /* renamed from: component7, reason: from getter */
        public final StringResource getFuturesRhsAccountDisplayNameInSentence() {
            return this.futuresRhsAccountDisplayNameInSentence;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getIsInAcqStreamlinedTradeFlowExperiment() {
            return this.isInAcqStreamlinedTradeFlowExperiment;
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getStreamlineToTradeFlow() {
            return this.streamlineToTradeFlow;
        }

        public final Approved copy(boolean isEventsContracts, boolean futuresReady, boolean swapsReady, String rhdAccountNumber, boolean isInMibFuturesExp, boolean hasMultipleBrokerageAccounts, StringResource futuresRhsAccountDisplayNameInSentence, boolean isInAcqStreamlinedTradeFlowExperiment, boolean streamlineToTradeFlow) {
            return new Approved(isEventsContracts, futuresReady, swapsReady, rhdAccountNumber, isInMibFuturesExp, hasMultipleBrokerageAccounts, futuresRhsAccountDisplayNameInSentence, isInAcqStreamlinedTradeFlowExperiment, streamlineToTradeFlow);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Approved)) {
                return false;
            }
            Approved approved = (Approved) other;
            return this.isEventsContracts == approved.isEventsContracts && this.futuresReady == approved.futuresReady && this.swapsReady == approved.swapsReady && Intrinsics.areEqual(this.rhdAccountNumber, approved.rhdAccountNumber) && this.isInMibFuturesExp == approved.isInMibFuturesExp && this.hasMultipleBrokerageAccounts == approved.hasMultipleBrokerageAccounts && Intrinsics.areEqual(this.futuresRhsAccountDisplayNameInSentence, approved.futuresRhsAccountDisplayNameInSentence) && this.isInAcqStreamlinedTradeFlowExperiment == approved.isInAcqStreamlinedTradeFlowExperiment && this.streamlineToTradeFlow == approved.streamlineToTradeFlow;
        }

        public int hashCode() {
            int iHashCode = ((((Boolean.hashCode(this.isEventsContracts) * 31) + Boolean.hashCode(this.futuresReady)) * 31) + Boolean.hashCode(this.swapsReady)) * 31;
            String str = this.rhdAccountNumber;
            int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isInMibFuturesExp)) * 31) + Boolean.hashCode(this.hasMultipleBrokerageAccounts)) * 31;
            StringResource stringResource = this.futuresRhsAccountDisplayNameInSentence;
            return ((((iHashCode2 + (stringResource != null ? stringResource.hashCode() : 0)) * 31) + Boolean.hashCode(this.isInAcqStreamlinedTradeFlowExperiment)) * 31) + Boolean.hashCode(this.streamlineToTradeFlow);
        }

        public String toString() {
            return "Approved(isEventsContracts=" + this.isEventsContracts + ", futuresReady=" + this.futuresReady + ", swapsReady=" + this.swapsReady + ", rhdAccountNumber=" + this.rhdAccountNumber + ", isInMibFuturesExp=" + this.isInMibFuturesExp + ", hasMultipleBrokerageAccounts=" + this.hasMultipleBrokerageAccounts + ", futuresRhsAccountDisplayNameInSentence=" + this.futuresRhsAccountDisplayNameInSentence + ", isInAcqStreamlinedTradeFlowExperiment=" + this.isInAcqStreamlinedTradeFlowExperiment + ", streamlineToTradeFlow=" + this.streamlineToTradeFlow + ")";
        }

        public Approved(boolean z, boolean z2, boolean z3, String str, boolean z4, boolean z5, StringResource stringResource, boolean z6, boolean z7) {
            this.isEventsContracts = z;
            this.futuresReady = z2;
            this.swapsReady = z3;
            this.rhdAccountNumber = str;
            this.isInMibFuturesExp = z4;
            this.hasMultipleBrokerageAccounts = z5;
            this.futuresRhsAccountDisplayNameInSentence = stringResource;
            this.isInAcqStreamlinedTradeFlowExperiment = z6;
            this.streamlineToTradeFlow = z7;
        }

        public final boolean isEventsContracts() {
            return this.isEventsContracts;
        }

        public final boolean getFuturesReady() {
            return this.futuresReady;
        }

        public final boolean getSwapsReady() {
            return this.swapsReady;
        }

        public final String getRhdAccountNumber() {
            return this.rhdAccountNumber;
        }

        public final boolean isInMibFuturesExp() {
            return this.isInMibFuturesExp;
        }

        public final boolean getHasMultipleBrokerageAccounts() {
            return this.hasMultipleBrokerageAccounts;
        }

        public final StringResource getFuturesRhsAccountDisplayNameInSentence() {
            return this.futuresRhsAccountDisplayNameInSentence;
        }

        public final boolean isInAcqStreamlinedTradeFlowExperiment() {
            return this.isInAcqStreamlinedTradeFlowExperiment;
        }

        public final boolean getStreamlineToTradeFlow() {
            return this.streamlineToTradeFlow;
        }

        public final int getTitleRes() {
            return this.isInMibFuturesExp ? C17293R.string.futures_account_approved_title_mib : this.isEventsContracts ? C17293R.string.futures_account_approved_title_events : C17293R.string.futures_account_approved_title;
        }

        public final StringResource getBody() {
            if (this.isInAcqStreamlinedTradeFlowExperiment && this.streamlineToTradeFlow && this.isEventsContracts) {
                return StringResource.INSTANCE.invoke(C17293R.string.event_contracts_account_approved_streamlined_body, new Object[0]);
            }
            boolean z = this.futuresReady;
            if (z && this.swapsReady) {
                if (this.isInMibFuturesExp) {
                    if (this.hasMultipleBrokerageAccounts) {
                        StringResource.Companion companion = StringResource.INSTANCE;
                        int i = C17293R.string.futures_account_approved_body_mib_multi_accounts;
                        Object obj = this.futuresRhsAccountDisplayNameInSentence;
                        return companion.invoke(i, obj != null ? obj : "-");
                    }
                    return StringResource.INSTANCE.invoke(C17293R.string.futures_account_approved_body_mib_primary_account, new Object[0]);
                }
                if (this.isEventsContracts) {
                    return StringResource.INSTANCE.invoke(C17293R.string.event_contracts_account_approved_body, new Object[0]);
                }
                return StringResource.INSTANCE.invoke(C17293R.string.futures_account_approved_body, new Object[0]);
            }
            if (z) {
                if (this.isInMibFuturesExp) {
                    if (this.hasMultipleBrokerageAccounts) {
                        StringResource.Companion companion2 = StringResource.INSTANCE;
                        int i2 = C17293R.string.futures_account_approved_body_mib_multi_accounts_futures_only;
                        Object obj2 = this.futuresRhsAccountDisplayNameInSentence;
                        return companion2.invoke(i2, obj2 != null ? obj2 : "-");
                    }
                    return StringResource.INSTANCE.invoke(C17293R.string.futures_account_approved_body_mib_primary_account_futures_only, new Object[0]);
                }
                return StringResource.INSTANCE.invoke(C17293R.string.futures_account_approved_futures_only_body, new Object[0]);
            }
            if (this.swapsReady) {
                if (this.isInMibFuturesExp) {
                    if (this.hasMultipleBrokerageAccounts) {
                        StringResource.Companion companion3 = StringResource.INSTANCE;
                        int i3 = C17293R.string.futures_account_approved_body_mib_multi_accounts_ec_only;
                        Object obj3 = this.futuresRhsAccountDisplayNameInSentence;
                        return companion3.invoke(i3, obj3 != null ? obj3 : "-");
                    }
                    return StringResource.INSTANCE.invoke(C17293R.string.futures_account_approved_body_mib_primary_account_ec_only, new Object[0]);
                }
                return StringResource.INSTANCE.invoke("");
            }
            return StringResource.INSTANCE.invoke("");
        }
    }
}
