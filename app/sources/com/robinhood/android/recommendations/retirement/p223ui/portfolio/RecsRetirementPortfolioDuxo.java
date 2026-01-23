package com.robinhood.android.recommendations.retirement.p223ui.portfolio;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.data.store.recommendations.retirement.RecsRetirementPortfolioStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.recommendations.retirement.p223ui.portfolio.RecsRetirementPortfolioFragment;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p320db.Account;
import com.robinhood.recommendations.retirement.models.api.ApiRecsRetirementPortfolio;
import com.robinhood.udf.UiEvent;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: RecsRetirementPortfolioDuxo.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0013B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/recommendations/retirement/ui/portfolio/RecsRetirementPortfolioDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/recommendations/retirement/ui/portfolio/RecsRetirementPortfolioViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "recsRetirementPortfolioStore", "Lcom/robinhood/android/data/store/recommendations/retirement/RecsRetirementPortfolioStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/data/store/recommendations/retirement/RecsRetirementPortfolioStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "onSelectRow", "id", "Ljava/util/UUID;", "Companion", "feature-recommendations-for-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class RecsRetirementPortfolioDuxo extends OldBaseDuxo<RecsRetirementPortfolioViewState> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final RecsRetirementPortfolioStore recsRetirementPortfolioStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public RecsRetirementPortfolioDuxo(AccountProvider accountProvider, RecsRetirementPortfolioStore recsRetirementPortfolioStore, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(recsRetirementPortfolioStore, "recsRetirementPortfolioStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(new RecsRetirementPortfolioViewState(((RecsRetirementPortfolioFragment.Args) companion.getArgs(savedStateHandle)).getAccountType(), ((RecsRetirementPortfolioFragment.Args) companion.getArgs(savedStateHandle)).getSource(), null, null, null, 28, null), null, 2, 0 == true ? 1 : 0);
        this.accountProvider = accountProvider;
        this.recsRetirementPortfolioStore = recsRetirementPortfolioStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        Observable map;
        super.onStart();
        RecsRetirementPortfolioStore recsRetirementPortfolioStore = this.recsRetirementPortfolioStore;
        Companion companion = INSTANCE;
        LifecycleHost.DefaultImpls.bind$default(this, recsRetirementPortfolioStore.getPortfolio(((RecsRetirementPortfolioFragment.Args) companion.getArgs((HasSavedState) this)).getRecommendationId(), ((RecsRetirementPortfolioFragment.Args) companion.getArgs((HasSavedState) this)).isReorder()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.recommendations.retirement.ui.portfolio.RecsRetirementPortfolioDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecsRetirementPortfolioDuxo.onStart$lambda$1(this.f$0, (ApiRecsRetirementPortfolio) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.recommendations.retirement.ui.portfolio.RecsRetirementPortfolioDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecsRetirementPortfolioDuxo.onStart$lambda$3(this.f$0, (Throwable) obj);
            }
        });
        if (!StringsKt.isBlank(((RecsRetirementPortfolioFragment.Args) companion.getArgs((HasSavedState) this)).getAccountType())) {
            map = Observable.just(((RecsRetirementPortfolioFragment.Args) companion.getArgs((HasSavedState) this)).getAccountType());
        } else {
            map = this.accountProvider.streamAccount(((RecsRetirementPortfolioFragment.Args) companion.getArgs((HasSavedState) this)).getAccountNumber()).map(new Function() { // from class: com.robinhood.android.recommendations.retirement.ui.portfolio.RecsRetirementPortfolioDuxo$onStart$accountTypeStream$1
                @Override // io.reactivex.functions.Function
                public final String apply(Account it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return it.getBrokerageAccountType().getServerValue();
                }
            });
        }
        Intrinsics.checkNotNull(map);
        LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.recommendations.retirement.ui.portfolio.RecsRetirementPortfolioDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecsRetirementPortfolioDuxo.onStart$lambda$5(this.f$0, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(RecsRetirementPortfolioDuxo recsRetirementPortfolioDuxo, final ApiRecsRetirementPortfolio portfolio) {
        Intrinsics.checkNotNullParameter(portfolio, "portfolio");
        recsRetirementPortfolioDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.recommendations.retirement.ui.portfolio.RecsRetirementPortfolioDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecsRetirementPortfolioDuxo.onStart$lambda$1$lambda$0(portfolio, (RecsRetirementPortfolioViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecsRetirementPortfolioViewState onStart$lambda$1$lambda$0(ApiRecsRetirementPortfolio apiRecsRetirementPortfolio, RecsRetirementPortfolioViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecsRetirementPortfolioViewState.copy$default(applyMutation, null, null, apiRecsRetirementPortfolio, null, null, 27, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(RecsRetirementPortfolioDuxo recsRetirementPortfolioDuxo, final Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        recsRetirementPortfolioDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.recommendations.retirement.ui.portfolio.RecsRetirementPortfolioDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecsRetirementPortfolioDuxo.onStart$lambda$3$lambda$2(t, (RecsRetirementPortfolioViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecsRetirementPortfolioViewState onStart$lambda$3$lambda$2(Throwable th, RecsRetirementPortfolioViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecsRetirementPortfolioViewState.copy$default(applyMutation, null, null, null, null, new UiEvent(th), 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5(RecsRetirementPortfolioDuxo recsRetirementPortfolioDuxo, final String str) {
        recsRetirementPortfolioDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.recommendations.retirement.ui.portfolio.RecsRetirementPortfolioDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecsRetirementPortfolioDuxo.onStart$lambda$5$lambda$4(str, (RecsRetirementPortfolioViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecsRetirementPortfolioViewState onStart$lambda$5$lambda$4(String str, RecsRetirementPortfolioViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(str);
        return RecsRetirementPortfolioViewState.copy$default(applyMutation, str, null, null, null, null, 30, null);
    }

    public final void onSelectRow(final UUID id) {
        applyMutation(new Function1() { // from class: com.robinhood.android.recommendations.retirement.ui.portfolio.RecsRetirementPortfolioDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecsRetirementPortfolioDuxo.onSelectRow$lambda$6(id, (RecsRetirementPortfolioViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecsRetirementPortfolioViewState onSelectRow$lambda$6(UUID uuid, RecsRetirementPortfolioViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecsRetirementPortfolioViewState.copy$default(applyMutation, null, null, null, uuid, null, 23, null);
    }

    /* compiled from: RecsRetirementPortfolioDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/recommendations/retirement/ui/portfolio/RecsRetirementPortfolioDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/recommendations/retirement/ui/portfolio/RecsRetirementPortfolioDuxo;", "Lcom/robinhood/android/recommendations/retirement/ui/portfolio/RecsRetirementPortfolioFragment$Args;", "<init>", "()V", "feature-recommendations-for-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RecsRetirementPortfolioDuxo, RecsRetirementPortfolioFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RecsRetirementPortfolioFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (RecsRetirementPortfolioFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RecsRetirementPortfolioFragment.Args getArgs(RecsRetirementPortfolioDuxo recsRetirementPortfolioDuxo) {
            return (RecsRetirementPortfolioFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, recsRetirementPortfolioDuxo);
        }
    }
}
