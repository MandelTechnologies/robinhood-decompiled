package com.robinhood.store.base;

import android.annotation.SuppressLint;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.IdlDecimal2;
import com.robinhood.models.p320db.Portfolio;
import com.robinhood.models.p320db.Portfolio2;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import io.reactivex.Observable;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Job6;
import p479j$.time.Instant;
import rosetta.portfolio.p541v1.GetAccountValueResponseDto;

/* compiled from: PortfolioStore.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00070\u0003H&J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u0003H&J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u001a\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H&J\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\nH¦@¢\u0006\u0002\u0010\u0014¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/store/base/PortfolioStore;", "", "getIndividualAccountPortfolio", "Lio/reactivex/Observable;", "Lcom/robinhood/models/db/Portfolio;", "getIndividualAccountPortfolioForced", "getIndividualAccountPortfolioOptional", "Lcom/robinhood/utils/Optional;", "getPortfolio", "accountNumber", "", "pollAccountPortfolio", "Lrosetta/portfolio/v1/GetAccountValueResponseDto;", "pollIndividualAccountPortfolio", "refreshIndividualAccountPortfolio", "Lkotlinx/coroutines/Job;", "force", "", "refreshPortfolio", "getPortfolioForcedOrNull", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Stub", "lib-store-base_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public interface PortfolioStore {

    /* renamed from: Stub, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    Observable<Portfolio> getIndividualAccountPortfolio();

    Observable<Portfolio> getIndividualAccountPortfolioForced();

    Observable<Optional<Portfolio>> getIndividualAccountPortfolioOptional();

    Observable<Portfolio> getPortfolio(String accountNumber);

    Object getPortfolioForcedOrNull(String str, Continuation<? super Portfolio> continuation);

    Observable<GetAccountValueResponseDto> pollAccountPortfolio(String accountNumber);

    Observable<Optional<GetAccountValueResponseDto>> pollIndividualAccountPortfolio();

    Job refreshIndividualAccountPortfolio(boolean force);

    Job refreshPortfolio(String accountNumber, boolean force);

    /* compiled from: PortfolioStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes12.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Job refreshPortfolio$default(PortfolioStore portfolioStore, String str, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshPortfolio");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return portfolioStore.refreshPortfolio(str, z);
        }
    }

    /* compiled from: PortfolioStore.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00070\u00070\tH\u0016J\u0016\u0010\u000b\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00070\u00070\tH\u0016J\"\u0010\f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \n*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\r0\r0\tH\u0016J\u001e\u0010\u000e\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00070\u00070\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0016\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0012J\u001e\u0010\u0013\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00050\u00050\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\"\u0010\u0014\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \n*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r0\r0\tH\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/store/base/PortfolioStore$Stub;", "Lcom/robinhood/store/base/PortfolioStore;", "<init>", "()V", "getAccountValueResponseDto", "Lrosetta/portfolio/v1/GetAccountValueResponseDto;", AnalyticsStrings.TAB_NAV_TAB_BAR_PORTFOLIO, "Lcom/robinhood/models/db/Portfolio;", "getIndividualAccountPortfolio", "Lio/reactivex/Observable;", "kotlin.jvm.PlatformType", "getIndividualAccountPortfolioForced", "getIndividualAccountPortfolioOptional", "Lcom/robinhood/utils/Optional;", "getPortfolio", "accountNumber", "", "getPortfolioForcedOrNull", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pollAccountPortfolio", "pollIndividualAccountPortfolio", "refreshIndividualAccountPortfolio", "Lkotlinx/coroutines/CompletableJob;", "force", "", "refreshPortfolio", "lib-store-base_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.store.base.PortfolioStore$Stub, reason: from kotlin metadata */
    /* loaded from: classes12.dex */
    public static final class Companion implements PortfolioStore {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final GetAccountValueResponseDto getAccountValueResponseDto;

        @SuppressLint({"NowWithoutClock"})
        private static final Portfolio portfolio;

        private Companion() {
        }

        static {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            IdlDecimal idlDecimal = IdlDecimal2.toIdlDecimal(ZERO);
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            IdlDecimal idlDecimal2 = IdlDecimal2.toIdlDecimal(ZERO);
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            IdlDecimal idlDecimal3 = IdlDecimal2.toIdlDecimal(ZERO);
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            IdlDecimal idlDecimal4 = IdlDecimal2.toIdlDecimal(ZERO);
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            IdlDecimal idlDecimal5 = IdlDecimal2.toIdlDecimal(ZERO);
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            GetAccountValueResponseDto getAccountValueResponseDto2 = new GetAccountValueResponseDto(null, "https://www.robinhood.com/rhc", null, idlDecimal3, idlDecimal, null, null, null, null, null, null, null, null, null, null, null, null, idlDecimal2, null, IdlDecimal2.toIdlDecimal(ZERO), idlDecimal4, idlDecimal5, null, null, 12957573, null);
            getAccountValueResponseDto = getAccountValueResponseDto2;
            Instant instantNow = Instant.now();
            Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
            portfolio = Portfolio2.toDbModel(getAccountValueResponseDto2, instantNow);
        }

        @Override // com.robinhood.store.base.PortfolioStore
        public Observable<Portfolio> getIndividualAccountPortfolio() {
            Observable<Portfolio> observableJust = Observable.just(portfolio);
            Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
            return observableJust;
        }

        @Override // com.robinhood.store.base.PortfolioStore
        public Observable<Portfolio> getIndividualAccountPortfolioForced() {
            Observable<Portfolio> observableJust = Observable.just(portfolio);
            Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
            return observableJust;
        }

        @Override // com.robinhood.store.base.PortfolioStore
        public Observable<Optional<Portfolio>> getIndividualAccountPortfolioOptional() {
            Observable<Optional<Portfolio>> observableJust = Observable.just(Optional3.asOptional(portfolio));
            Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
            return observableJust;
        }

        @Override // com.robinhood.store.base.PortfolioStore
        public Observable<Portfolio> getPortfolio(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Observable<Portfolio> observableJust = Observable.just(portfolio);
            Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
            return observableJust;
        }

        @Override // com.robinhood.store.base.PortfolioStore
        public Object getPortfolioForcedOrNull(String str, Continuation<? super Portfolio> continuation) {
            return portfolio;
        }

        @Override // com.robinhood.store.base.PortfolioStore
        public Observable<GetAccountValueResponseDto> pollAccountPortfolio(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Observable<GetAccountValueResponseDto> observableJust = Observable.just(getAccountValueResponseDto);
            Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
            return observableJust;
        }

        @Override // com.robinhood.store.base.PortfolioStore
        public Observable<Optional<GetAccountValueResponseDto>> pollIndividualAccountPortfolio() {
            Observable<Optional<GetAccountValueResponseDto>> observableJust = Observable.just(Optional3.asOptional(getAccountValueResponseDto));
            Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
            return observableJust;
        }

        @Override // com.robinhood.store.base.PortfolioStore
        public CompletableJob refreshIndividualAccountPortfolio(boolean force) {
            return Job6.Job$default(null, 1, null);
        }

        @Override // com.robinhood.store.base.PortfolioStore
        public CompletableJob refreshPortfolio(String accountNumber, boolean force) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return Job6.Job$default(null, 1, null);
        }
    }
}
