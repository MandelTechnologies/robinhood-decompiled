package com.robinhood.rhy.referral;

import com.robinhood.android.deeplink.DeepLinkPath;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.rhyonboarding.contracts.RhyUpgradeKey;
import com.robinhood.shared.education.order.OrderTypeEducationLearnMoreFragment;
import com.robinhood.shared.home.contracts.TabLinkIntentKey;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyReferralOnboardingStore.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rhy/referral/RhyReferralOutAction;", "", "Direct", "Dialog", "Lcom/robinhood/rhy/referral/RhyReferralOutAction$Dialog;", "Lcom/robinhood/rhy/referral/RhyReferralOutAction$Direct;", "lib-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.rhy.referral.RhyReferralOutAction, reason: use source file name */
/* loaded from: classes26.dex */
public interface RhyReferralOnboardingStore4 {

    /* compiled from: RhyReferralOnboardingStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0001\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/rhy/referral/RhyReferralOutAction$Direct;", "Lcom/robinhood/rhy/referral/RhyReferralOutAction;", "intentKey", "Lcom/robinhood/android/navigation/keys/IntentKey;", "getIntentKey", "()Lcom/robinhood/android/navigation/keys/IntentKey;", "RhyEligibleUser", "Lcom/robinhood/rhy/referral/RhyReferralOutAction$Direct$RhyEligibleUser;", "lib-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.rhy.referral.RhyReferralOutAction$Direct */
    public interface Direct extends RhyReferralOnboardingStore4 {
        IntentKey getIntentKey();

        /* compiled from: RhyReferralOnboardingStore.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/rhy/referral/RhyReferralOutAction$Direct$RhyEligibleUser;", "Lcom/robinhood/rhy/referral/RhyReferralOutAction$Direct;", "referralCode", "", "<init>", "(Ljava/lang/String;)V", "getReferralCode", "()Ljava/lang/String;", "intentKey", "Lcom/robinhood/android/navigation/keys/IntentKey;", "getIntentKey", "()Lcom/robinhood/android/navigation/keys/IntentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rhy.referral.RhyReferralOutAction$Direct$RhyEligibleUser, reason: from toString */
        public static final /* data */ class RhyEligibleUser implements Direct {
            private final String referralCode;

            public static /* synthetic */ RhyEligibleUser copy$default(RhyEligibleUser rhyEligibleUser, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = rhyEligibleUser.referralCode;
                }
                return rhyEligibleUser.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getReferralCode() {
                return this.referralCode;
            }

            public final RhyEligibleUser copy(String referralCode) {
                return new RhyEligibleUser(referralCode);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RhyEligibleUser) && Intrinsics.areEqual(this.referralCode, ((RhyEligibleUser) other).referralCode);
            }

            public int hashCode() {
                String str = this.referralCode;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "RhyEligibleUser(referralCode=" + this.referralCode + ")";
            }

            public RhyEligibleUser(String str) {
                this.referralCode = str;
            }

            public final String getReferralCode() {
                return this.referralCode;
            }

            @Override // com.robinhood.rhy.referral.RhyReferralOnboardingStore4.Direct
            public IntentKey getIntentKey() {
                Map mapMapOf;
                String str = this.referralCode;
                if (str == null) {
                    mapMapOf = MapsKt.emptyMap();
                } else {
                    mapMapOf = MapsKt.mapOf(Tuples4.m3642to("referral_code", str));
                }
                return new RhyUpgradeKey(DeepLinkPath.RHY_REFERRAL_FUND.buildUri(MapsKt.emptyMap()), mapMapOf);
            }
        }
    }

    /* compiled from: RhyReferralOnboardingStore.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rhy/referral/RhyReferralOutAction$Dialog;", "Lcom/robinhood/rhy/referral/RhyReferralOutAction;", "intentKey", "Lcom/robinhood/android/navigation/keys/IntentKey;", "getIntentKey", "()Lcom/robinhood/android/navigation/keys/IntentKey;", "dialogContent", "Lcom/robinhood/rhy/referral/RhyReferralOutAction$Dialog$DialogContent;", "getDialogContent", "()Lcom/robinhood/rhy/referral/RhyReferralOutAction$Dialog$DialogContent;", "DialogContent", "ExistingCmUser", "RhyIneligible", "ExistingRhyUser", "Lcom/robinhood/rhy/referral/RhyReferralOutAction$Dialog$ExistingCmUser;", "Lcom/robinhood/rhy/referral/RhyReferralOutAction$Dialog$ExistingRhyUser;", "Lcom/robinhood/rhy/referral/RhyReferralOutAction$Dialog$RhyIneligible;", "lib-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.rhy.referral.RhyReferralOutAction$Dialog */
    public interface Dialog extends RhyReferralOnboardingStore4 {
        DialogContent getDialogContent();

        IntentKey getIntentKey();

        /* compiled from: RhyReferralOnboardingStore.kt */
        @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u0018\u001a\u00020\bHÆ\u0003JB\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/rhy/referral/RhyReferralOutAction$Dialog$DialogContent;", "", OrderTypeEducationLearnMoreFragment.ARG_TITLE_RES, "", "bodyRes", "primaryCtaRes", "secondaryCtaRes", "showWarningPictogram", "", "<init>", "(IIILjava/lang/Integer;Z)V", "getTitleRes", "()I", "getBodyRes", "getPrimaryCtaRes", "getSecondaryCtaRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getShowWarningPictogram", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "(IIILjava/lang/Integer;Z)Lcom/robinhood/rhy/referral/RhyReferralOutAction$Dialog$DialogContent;", "equals", "other", "hashCode", "toString", "", "lib-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rhy.referral.RhyReferralOutAction$Dialog$DialogContent, reason: from toString */
        public static final /* data */ class DialogContent {
            private final int bodyRes;
            private final int primaryCtaRes;
            private final Integer secondaryCtaRes;
            private final boolean showWarningPictogram;
            private final int titleRes;

            public static /* synthetic */ DialogContent copy$default(DialogContent dialogContent, int i, int i2, int i3, Integer num, boolean z, int i4, Object obj) {
                if ((i4 & 1) != 0) {
                    i = dialogContent.titleRes;
                }
                if ((i4 & 2) != 0) {
                    i2 = dialogContent.bodyRes;
                }
                if ((i4 & 4) != 0) {
                    i3 = dialogContent.primaryCtaRes;
                }
                if ((i4 & 8) != 0) {
                    num = dialogContent.secondaryCtaRes;
                }
                if ((i4 & 16) != 0) {
                    z = dialogContent.showWarningPictogram;
                }
                boolean z2 = z;
                int i5 = i3;
                return dialogContent.copy(i, i2, i5, num, z2);
            }

            /* renamed from: component1, reason: from getter */
            public final int getTitleRes() {
                return this.titleRes;
            }

            /* renamed from: component2, reason: from getter */
            public final int getBodyRes() {
                return this.bodyRes;
            }

            /* renamed from: component3, reason: from getter */
            public final int getPrimaryCtaRes() {
                return this.primaryCtaRes;
            }

            /* renamed from: component4, reason: from getter */
            public final Integer getSecondaryCtaRes() {
                return this.secondaryCtaRes;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getShowWarningPictogram() {
                return this.showWarningPictogram;
            }

            public final DialogContent copy(int titleRes, int bodyRes, int primaryCtaRes, Integer secondaryCtaRes, boolean showWarningPictogram) {
                return new DialogContent(titleRes, bodyRes, primaryCtaRes, secondaryCtaRes, showWarningPictogram);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DialogContent)) {
                    return false;
                }
                DialogContent dialogContent = (DialogContent) other;
                return this.titleRes == dialogContent.titleRes && this.bodyRes == dialogContent.bodyRes && this.primaryCtaRes == dialogContent.primaryCtaRes && Intrinsics.areEqual(this.secondaryCtaRes, dialogContent.secondaryCtaRes) && this.showWarningPictogram == dialogContent.showWarningPictogram;
            }

            public int hashCode() {
                int iHashCode = ((((Integer.hashCode(this.titleRes) * 31) + Integer.hashCode(this.bodyRes)) * 31) + Integer.hashCode(this.primaryCtaRes)) * 31;
                Integer num = this.secondaryCtaRes;
                return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.showWarningPictogram);
            }

            public String toString() {
                return "DialogContent(titleRes=" + this.titleRes + ", bodyRes=" + this.bodyRes + ", primaryCtaRes=" + this.primaryCtaRes + ", secondaryCtaRes=" + this.secondaryCtaRes + ", showWarningPictogram=" + this.showWarningPictogram + ")";
            }

            public DialogContent(int i, int i2, int i3, Integer num, boolean z) {
                this.titleRes = i;
                this.bodyRes = i2;
                this.primaryCtaRes = i3;
                this.secondaryCtaRes = num;
                this.showWarningPictogram = z;
            }

            public /* synthetic */ DialogContent(int i, int i2, int i3, Integer num, boolean z, int i4, DefaultConstructorMarker defaultConstructorMarker) {
                this(i, i2, i3, (i4 & 8) != 0 ? null : num, (i4 & 16) != 0 ? true : z);
            }

            public final int getTitleRes() {
                return this.titleRes;
            }

            public final int getBodyRes() {
                return this.bodyRes;
            }

            public final int getPrimaryCtaRes() {
                return this.primaryCtaRes;
            }

            public final Integer getSecondaryCtaRes() {
                return this.secondaryCtaRes;
            }

            public final boolean getShowWarningPictogram() {
                return this.showWarningPictogram;
            }
        }

        /* compiled from: RhyReferralOnboardingStore.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/rhy/referral/RhyReferralOutAction$Dialog$ExistingCmUser;", "Lcom/robinhood/rhy/referral/RhyReferralOutAction$Dialog;", "<init>", "()V", "intentKey", "Lcom/robinhood/android/navigation/keys/IntentKey;", "getIntentKey", "()Lcom/robinhood/android/navigation/keys/IntentKey;", "dialogContent", "Lcom/robinhood/rhy/referral/RhyReferralOutAction$Dialog$DialogContent;", "getDialogContent", "()Lcom/robinhood/rhy/referral/RhyReferralOutAction$Dialog$DialogContent;", "lib-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rhy.referral.RhyReferralOutAction$Dialog$ExistingCmUser */
        public static final class ExistingCmUser implements Dialog {
            public static final ExistingCmUser INSTANCE = new ExistingCmUser();

            private ExistingCmUser() {
            }

            @Override // com.robinhood.rhy.referral.RhyReferralOnboardingStore4.Dialog
            public IntentKey getIntentKey() {
                return new LegacyIntentKey.RhyMigrationOnboarding(null, false, true, null, 1, null);
            }

            @Override // com.robinhood.rhy.referral.RhyReferralOnboardingStore4.Dialog
            public DialogContent getDialogContent() {
                return new DialogContent(C36205R.string.rhy_referral_onboarding_cm_dialog_title, C36205R.string.rhy_referral_onboarding_cm_dialog_message, C36205R.string.rhy_referral_onboarding_cm_dialog_primary_cta, Integer.valueOf(C36205R.string.rhy_referral_onboarding_cm_dialog_secondary_cta), false);
            }
        }

        /* compiled from: RhyReferralOnboardingStore.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/rhy/referral/RhyReferralOutAction$Dialog$RhyIneligible;", "Lcom/robinhood/rhy/referral/RhyReferralOutAction$Dialog;", "<init>", "()V", "intentKey", "Lcom/robinhood/android/navigation/keys/IntentKey;", "getIntentKey", "()Lcom/robinhood/android/navigation/keys/IntentKey;", "dialogContent", "Lcom/robinhood/rhy/referral/RhyReferralOutAction$Dialog$DialogContent;", "getDialogContent", "()Lcom/robinhood/rhy/referral/RhyReferralOutAction$Dialog$DialogContent;", "lib-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rhy.referral.RhyReferralOutAction$Dialog$RhyIneligible */
        public static final class RhyIneligible implements Dialog {
            public static final RhyIneligible INSTANCE = new RhyIneligible();
            private static final IntentKey intentKey = new TabLinkIntentKey.McDuckling(null, false, null, 7, null);

            private RhyIneligible() {
            }

            @Override // com.robinhood.rhy.referral.RhyReferralOnboardingStore4.Dialog
            public IntentKey getIntentKey() {
                return intentKey;
            }

            @Override // com.robinhood.rhy.referral.RhyReferralOnboardingStore4.Dialog
            public DialogContent getDialogContent() {
                return new DialogContent(C36205R.string.rhy_referral_onboarding_rhy_not_eligible_title, C36205R.string.rhy_referral_onboarding_rhy_not_eligible_message, C36205R.string.rhy_referral_onboarding_rhy_not_eligible_primary_cta, null, false, 24, null);
            }
        }

        /* compiled from: RhyReferralOnboardingStore.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/rhy/referral/RhyReferralOutAction$Dialog$ExistingRhyUser;", "Lcom/robinhood/rhy/referral/RhyReferralOutAction$Dialog;", "<init>", "()V", "intentKey", "Lcom/robinhood/android/navigation/keys/IntentKey;", "getIntentKey", "()Lcom/robinhood/android/navigation/keys/IntentKey;", "dialogContent", "Lcom/robinhood/rhy/referral/RhyReferralOutAction$Dialog$DialogContent;", "getDialogContent", "()Lcom/robinhood/rhy/referral/RhyReferralOutAction$Dialog$DialogContent;", "lib-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rhy.referral.RhyReferralOutAction$Dialog$ExistingRhyUser */
        public static final class ExistingRhyUser implements Dialog {
            public static final ExistingRhyUser INSTANCE = new ExistingRhyUser();
            private static final IntentKey intentKey = new TabLinkIntentKey.McDuckling(null, false, null, 7, null);

            private ExistingRhyUser() {
            }

            @Override // com.robinhood.rhy.referral.RhyReferralOnboardingStore4.Dialog
            public IntentKey getIntentKey() {
                return intentKey;
            }

            @Override // com.robinhood.rhy.referral.RhyReferralOnboardingStore4.Dialog
            public DialogContent getDialogContent() {
                return new DialogContent(C36205R.string.rhy_referral_onboarding_rhy_dialog_title, C36205R.string.rhy_referral_onboarding_rhy_dialog_message, C36205R.string.rhy_referral_onboarding_rhy_dialog_primary_cta, null, false, 24, null);
            }
        }
    }
}
