package com.robinhood.android.directdeposit.p101ui.intro;

import com.robinhood.android.common.mcduckling.C11257R;
import com.robinhood.android.directdeposit.C14044R;
import com.robinhood.android.directdeposit.p101ui.intro.DirectDepositSplashViewState2;
import com.robinhood.models.p320db.mcduckling.SweepsInterest;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectDepositSplashViewState.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003#$%BI\b\u0004\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0015R\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u001cX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u0004\u0018\u00010 X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0001\u0003&'(¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewState;", "", "titleResId", "", "disclosureLabelRes", "disclosureContentfulId", "", "disclosureContentfulParams", "", "isLoading", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Z)V", "getTitleResId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDisclosureLabelRes", "getDisclosureContentfulId", "()Ljava/lang/String;", "getDisclosureContentfulParams", "()Ljava/util/Map;", "()Z", "bullets", "", "Lcom/robinhood/android/directdeposit/ui/intro/Bullet;", "getBullets", "()Ljava/util/List;", "primaryButtonState", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewPrimaryButtonState;", "getPrimaryButtonState", "()Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewPrimaryButtonState;", "secondaryButtonState", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewSecondaryButtonState;", "getSecondaryButtonState", "()Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewSecondaryButtonState;", "Loading", "Rhy", "CashManagement", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewState$CashManagement;", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewState$Loading;", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewState$Rhy;", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public abstract class DirectDepositSplashViewState {
    public static final int $stable = 8;
    private final String disclosureContentfulId;
    private final Map<String, String> disclosureContentfulParams;
    private final Integer disclosureLabelRes;
    private final boolean isLoading;
    private final Integer titleResId;

    public /* synthetic */ DirectDepositSplashViewState(Integer num, Integer num2, String str, Map map, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, num2, str, map, z);
    }

    public abstract List<DirectDepositSplashViewState2> getBullets();

    public abstract DirectDepositSplashViewState3 getPrimaryButtonState();

    public abstract DirectDepositSplashViewState4 getSecondaryButtonState();

    private DirectDepositSplashViewState(Integer num, Integer num2, String str, Map<String, String> map, boolean z) {
        this.titleResId = num;
        this.disclosureLabelRes = num2;
        this.disclosureContentfulId = str;
        this.disclosureContentfulParams = map;
        this.isLoading = z;
    }

    public final Integer getTitleResId() {
        return this.titleResId;
    }

    public final Integer getDisclosureLabelRes() {
        return this.disclosureLabelRes;
    }

    public final String getDisclosureContentfulId() {
        return this.disclosureContentfulId;
    }

    public final Map<String, String> getDisclosureContentfulParams() {
        return this.disclosureContentfulParams;
    }

    /* renamed from: isLoading, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* compiled from: DirectDepositSplashViewState.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewState$Loading;", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewState;", "<init>", "()V", "bullets", "", "Lcom/robinhood/android/directdeposit/ui/intro/Bullet;", "getBullets", "()Ljava/util/List;", "primaryButtonState", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewPrimaryButtonState;", "getPrimaryButtonState", "()Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewPrimaryButtonState;", "secondaryButtonState", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewSecondaryButtonState;", "getSecondaryButtonState", "()Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewSecondaryButtonState;", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading extends DirectDepositSplashViewState {
        private static final DirectDepositSplashViewState3 primaryButtonState = null;
        private static final DirectDepositSplashViewState4 secondaryButtonState = null;
        public static final Loading INSTANCE = new Loading();
        private static final List<DirectDepositSplashViewState2> bullets = CollectionsKt.emptyList();
        public static final int $stable = 8;

        private Loading() {
            super(null, null, null, null, true, null);
        }

        @Override // com.robinhood.android.directdeposit.p101ui.intro.DirectDepositSplashViewState
        public List<DirectDepositSplashViewState2> getBullets() {
            return bullets;
        }

        @Override // com.robinhood.android.directdeposit.p101ui.intro.DirectDepositSplashViewState
        public DirectDepositSplashViewState3 getPrimaryButtonState() {
            return primaryButtonState;
        }

        @Override // com.robinhood.android.directdeposit.p101ui.intro.DirectDepositSplashViewState
        public DirectDepositSplashViewState4 getSecondaryButtonState() {
            return secondaryButtonState;
        }
    }

    /* compiled from: DirectDepositSplashViewState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewState$Rhy;", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewState;", "hasSetUpAnyDirectDepositFeatures", "", "sweepsInterest", "Lcom/robinhood/models/db/mcduckling/SweepsInterest;", "<init>", "(ZLcom/robinhood/models/db/mcduckling/SweepsInterest;)V", "bullets", "", "Lcom/robinhood/android/directdeposit/ui/intro/Bullet;", "getBullets", "()Ljava/util/List;", "primaryButtonState", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewPrimaryButtonState;", "getPrimaryButtonState", "()Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewPrimaryButtonState;", "secondaryButtonState", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewSecondaryButtonState;", "getSecondaryButtonState", "()Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewSecondaryButtonState;", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Rhy extends DirectDepositSplashViewState {
        public static final int $stable = 8;
        private final List<DirectDepositSplashViewState2> bullets;
        private final DirectDepositSplashViewState3 primaryButtonState;
        private final DirectDepositSplashViewState4 secondaryButtonState;

        public Rhy(boolean z, SweepsInterest sweepsInterest) {
            DirectDepositSplashViewState3 directDepositSplashViewState3;
            super(Integer.valueOf(C14044R.string.direct_deposit_splash_title), Integer.valueOf(C14044R.string.direct_deposit_rhy_splash_disclosure_label), "FBVfII6YKpIec4uid4Iui", null, false, null);
            this.bullets = CollectionsKt.listOf((Object[]) new DirectDepositSplashViewState2[]{DirectDepositSplashViewState2.EarlyPay.INSTANCE, new DirectDepositSplashViewState2.SplitYourPaycheck(sweepsInterest), new DirectDepositSplashViewState2.PartialPaycheck(false)});
            if (!z) {
                directDepositSplashViewState3 = DirectDepositSplashViewState3.SET_UP_DIRECT_DEPOSIT;
            } else {
                directDepositSplashViewState3 = DirectDepositSplashViewState3.CONTINUE;
            }
            this.primaryButtonState = directDepositSplashViewState3;
            this.secondaryButtonState = !z ? DirectDepositSplashViewState4.ALREADY_SET_UP_DIRECT_DEPOSIT : null;
        }

        @Override // com.robinhood.android.directdeposit.p101ui.intro.DirectDepositSplashViewState
        public List<DirectDepositSplashViewState2> getBullets() {
            return this.bullets;
        }

        @Override // com.robinhood.android.directdeposit.p101ui.intro.DirectDepositSplashViewState
        public DirectDepositSplashViewState3 getPrimaryButtonState() {
            return this.primaryButtonState;
        }

        @Override // com.robinhood.android.directdeposit.p101ui.intro.DirectDepositSplashViewState
        public DirectDepositSplashViewState4 getSecondaryButtonState() {
            return this.secondaryButtonState;
        }
    }

    /* compiled from: DirectDepositSplashViewState.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\n\u000bB1\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewState$CashManagement;", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewState;", "disclosureLabelRes", "", "disclosureContentfulId", "", "disclosureContentfulParams", "", "<init>", "(ILjava/lang/String;Ljava/util/Map;)V", "WithInterest", "WithoutInterest", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewState$CashManagement$WithInterest;", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewState$CashManagement$WithoutInterest;", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class CashManagement extends DirectDepositSplashViewState {
        public static final int $stable = 8;

        public /* synthetic */ CashManagement(int i, String str, Map map, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, map);
        }

        private CashManagement(int i, String str, Map<String, String> map) {
            super(Integer.valueOf(C14044R.string.direct_deposit_splash_title), Integer.valueOf(i), str, map, false, null);
        }

        /* compiled from: DirectDepositSplashViewState.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewState$CashManagement$WithInterest;", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewState$CashManagement;", "interestRate", "Ljava/math/BigDecimal;", "contentfulId", "", "params", "", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/util/Map;)V", "getInterestRate", "()Ljava/math/BigDecimal;", "getContentfulId", "()Ljava/lang/String;", "getParams", "()Ljava/util/Map;", "bullets", "", "Lcom/robinhood/android/directdeposit/ui/intro/Bullet;", "getBullets", "()Ljava/util/List;", "primaryButtonState", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewPrimaryButtonState;", "getPrimaryButtonState", "()Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewPrimaryButtonState;", "secondaryButtonState", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewSecondaryButtonState;", "getSecondaryButtonState", "()Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewSecondaryButtonState;", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class WithInterest extends CashManagement {
            public static final int $stable = 8;
            private final List<DirectDepositSplashViewState2> bullets;
            private final String contentfulId;
            private final BigDecimal interestRate;
            private final Map<String, String> params;
            private final DirectDepositSplashViewState3 primaryButtonState;
            private final DirectDepositSplashViewState4 secondaryButtonState;

            public final BigDecimal getInterestRate() {
                return this.interestRate;
            }

            public final String getContentfulId() {
                return this.contentfulId;
            }

            public final Map<String, String> getParams() {
                return this.params;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WithInterest(BigDecimal interestRate, String contentfulId, Map<String, String> map) {
                super(C11257R.string.cash_management_variable_apy_disclosure_asterisk, contentfulId, map, null);
                Intrinsics.checkNotNullParameter(interestRate, "interestRate");
                Intrinsics.checkNotNullParameter(contentfulId, "contentfulId");
                this.interestRate = interestRate;
                this.contentfulId = contentfulId;
                this.params = map;
                this.bullets = CollectionsKt.listOf((Object[]) new DirectDepositSplashViewState2[]{DirectDepositSplashViewState2.Security.INSTANCE, new DirectDepositSplashViewState2.Earn(interestRate), new DirectDepositSplashViewState2.PartialPaycheck(false, 1, null)});
                this.primaryButtonState = DirectDepositSplashViewState3.CONTINUE;
            }

            @Override // com.robinhood.android.directdeposit.p101ui.intro.DirectDepositSplashViewState
            public List<DirectDepositSplashViewState2> getBullets() {
                return this.bullets;
            }

            @Override // com.robinhood.android.directdeposit.p101ui.intro.DirectDepositSplashViewState
            public DirectDepositSplashViewState3 getPrimaryButtonState() {
                return this.primaryButtonState;
            }

            @Override // com.robinhood.android.directdeposit.p101ui.intro.DirectDepositSplashViewState
            public DirectDepositSplashViewState4 getSecondaryButtonState() {
                return this.secondaryButtonState;
            }
        }

        /* compiled from: DirectDepositSplashViewState.kt */
        @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewState$CashManagement$WithoutInterest;", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewState$CashManagement;", "<init>", "()V", "bullets", "", "Lcom/robinhood/android/directdeposit/ui/intro/Bullet;", "getBullets", "()Ljava/util/List;", "primaryButtonState", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewPrimaryButtonState;", "getPrimaryButtonState", "()Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewPrimaryButtonState;", "secondaryButtonState", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewSecondaryButtonState;", "getSecondaryButtonState", "()Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewSecondaryButtonState;", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class WithoutInterest extends CashManagement {
            private static final DirectDepositSplashViewState4 secondaryButtonState = null;
            public static final WithoutInterest INSTANCE = new WithoutInterest();
            private static final List<DirectDepositSplashViewState2> bullets = CollectionsKt.listOf((Object[]) new DirectDepositSplashViewState2[]{DirectDepositSplashViewState2.Security.INSTANCE, new DirectDepositSplashViewState2.PartialPaycheck(false, 1, null)});
            private static final DirectDepositSplashViewState3 primaryButtonState = DirectDepositSplashViewState3.CONTINUE;
            public static final int $stable = 8;

            /* JADX WARN: Multi-variable type inference failed */
            private WithoutInterest() {
                super(C11257R.string.cash_management_limited_interest_disclosure, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
            }

            @Override // com.robinhood.android.directdeposit.p101ui.intro.DirectDepositSplashViewState
            public List<DirectDepositSplashViewState2> getBullets() {
                return bullets;
            }

            @Override // com.robinhood.android.directdeposit.p101ui.intro.DirectDepositSplashViewState
            public DirectDepositSplashViewState3 getPrimaryButtonState() {
                return primaryButtonState;
            }

            @Override // com.robinhood.android.directdeposit.p101ui.intro.DirectDepositSplashViewState
            public DirectDepositSplashViewState4 getSecondaryButtonState() {
                return secondaryButtonState;
            }
        }
    }
}
