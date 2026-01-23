package com.robinhood.android.microgram.cache;

import cache.p044v1.CacheClientService;
import cache.p044v1.CacheTypeDto;
import cache.p044v1.RefreshRequestDto;
import cache.p044v1.RefreshResponseDto;
import com.robinhood.android.common.util.CardManager;
import com.robinhood.android.data.store.portfolio.TraderPortfolioStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.store.margin.MarginSubscriptionStore;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.lib.sweep.enrollment.SweepEnrollmentStore;
import com.robinhood.librobinhood.data.store.SweepsInterestStore;
import com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RealCacheClientService.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/microgram/cache/RealCacheClientService;", "Lcache/v1/CacheClientService;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "cardManager", "Lcom/robinhood/android/common/util/CardManager;", "marginSubscriptionStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "portfolioStore", "Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "sweepEnrollmentStore", "Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;", "sweepsInterestStore", "Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/common/util/CardManager;Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;)V", "Refresh", "Lcache/v1/RefreshResponseDto;", "request", "Lcache/v1/RefreshRequestDto;", "(Lcache/v1/RefreshRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-microgram-cache_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class RealCacheClientService implements CacheClientService {
    private final AccountProvider accountProvider;
    private final CardManager cardManager;
    private final MarginSubscriptionStore marginSubscriptionStore;
    private final TraderPortfolioStore portfolioStore;
    private final BaseSortingHatStore sortingHatStore;
    private final SweepEnrollmentStore sweepEnrollmentStore;
    private final SweepsInterestStore sweepsInterestStore;

    /* compiled from: RealCacheClientService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CacheTypeDto.values().length];
            try {
                iArr[CacheTypeDto.CACHE_TYPE_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CacheTypeDto.ACCOUNTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CacheTypeDto.PORTFOLIO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CacheTypeDto.GOLD_SUBSCRIPTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CacheTypeDto.HOME_CARDS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CacheTypeDto.HOME_SWEEP_SECTION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CacheTypeDto.SWEEP_INTEREST.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CacheTypeDto.SORTING_HAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Object Refresh(Request<RefreshRequestDto> request, Continuation<? super Response<RefreshResponseDto>> continuation) {
        return CacheClientService.DefaultImpls.Refresh(this, request, continuation);
    }

    public RealCacheClientService(AccountProvider accountProvider, CardManager cardManager, MarginSubscriptionStore marginSubscriptionStore, TraderPortfolioStore portfolioStore, BaseSortingHatStore sortingHatStore, SweepEnrollmentStore sweepEnrollmentStore, SweepsInterestStore sweepsInterestStore) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(cardManager, "cardManager");
        Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
        Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
        Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
        Intrinsics.checkNotNullParameter(sweepEnrollmentStore, "sweepEnrollmentStore");
        Intrinsics.checkNotNullParameter(sweepsInterestStore, "sweepsInterestStore");
        this.accountProvider = accountProvider;
        this.cardManager = cardManager;
        this.marginSubscriptionStore = marginSubscriptionStore;
        this.portfolioStore = portfolioStore;
        this.sortingHatStore = sortingHatStore;
        this.sweepEnrollmentStore = sweepEnrollmentStore;
        this.sweepsInterestStore = sweepsInterestStore;
    }

    @Override // cache.p044v1.CacheClientService
    public Object Refresh(RefreshRequestDto refreshRequestDto, Continuation<? super RefreshResponseDto> continuation) {
        boolean zAreEqual = Intrinsics.areEqual(refreshRequestDto.getForce(), boxing.boxBoolean(true));
        try {
            switch (WhenMappings.$EnumSwitchMapping$0[refreshRequestDto.getCache_type().ordinal()]) {
                case 1:
                    break;
                case 2:
                    this.accountProvider.refresh(zAreEqual);
                    break;
                case 3:
                    this.portfolioStore.refreshIndividualAccountPortfolio(zAreEqual);
                    break;
                case 4:
                    this.marginSubscriptionStore.refreshCurrentMarginSubscription(zAreEqual);
                    break;
                case 5:
                    this.cardManager.invalidateCardsBestEffort();
                    break;
                case 6:
                    SweepEnrollmentStore.refreshSweepSplash$default(this.sweepEnrollmentStore, null, zAreEqual, 1, null);
                    break;
                case 7:
                    this.sweepsInterestStore.refreshNoAccountNumber(zAreEqual);
                    break;
                case 8:
                    this.sortingHatStore.invalidateSortingHatCacheIfNeeded();
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            return new RefreshResponseDto(true);
        } catch (Exception unused) {
            return new RefreshResponseDto(false);
        }
    }
}
