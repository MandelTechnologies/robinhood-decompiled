package com.robinhood.android.trade.recommendations.p262ui.disclosures;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.trade.recommendations.p262ui.disclosures.RecommendationsDisclosuresFragment;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsDisclosuresStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsDisclosures;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RecommendationsDisclosuresDuxo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0016B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/trade/recommendations/ui/disclosures/RecommendationsDisclosuresDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/trade/recommendations/ui/disclosures/RecommendationsDisclosuresViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "recsDisclosuresStore", "Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsDisclosuresStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsDisclosuresStore;Lcom/robinhood/android/lib/account/AccountProvider;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "setReviewed", "reviewed", "", "signDisclosure", "disclosureVersion", "", "Companion", "feature-trade-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class RecommendationsDisclosuresDuxo extends OldBaseDuxo<RecommendationsDisclosuresViewState> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final RecommendationsDisclosuresStore recsDisclosuresStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RecommendationsDisclosuresDuxo(RecommendationsDisclosuresStore recsDisclosuresStore, AccountProvider accountProvider, SavedStateHandle savedStateHandle) {
        super(new RecommendationsDisclosuresViewState(false, null, false, false, null, null, 63, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(recsDisclosuresStore, "recsDisclosuresStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.recsDisclosuresStore = recsDisclosuresStore;
        this.accountProvider = accountProvider;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        Observable<Account> observableStreamIndividualAccount;
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, this.recsDisclosuresStore.fetchRecommendationDisclosures(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.recommendations.ui.disclosures.RecommendationsDisclosuresDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsDisclosuresDuxo.onStart$lambda$1(this.f$0, (UiRecommendationsDisclosures) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.trade.recommendations.ui.disclosures.RecommendationsDisclosuresDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsDisclosuresDuxo.onStart$lambda$3(this.f$0, (Throwable) obj);
            }
        });
        String accountNumber = ((RecommendationsDisclosuresFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getAccountNumber();
        if (accountNumber == null || (observableStreamIndividualAccount = this.accountProvider.streamAccount(accountNumber)) == null) {
            observableStreamIndividualAccount = this.accountProvider.streamIndividualAccount();
        }
        final C298964 c298964 = new PropertyReference1Impl() { // from class: com.robinhood.android.trade.recommendations.ui.disclosures.RecommendationsDisclosuresDuxo.onStart.4
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((Account) obj).getBrokerageAccountType();
            }
        };
        Observable<R> map = observableStreamIndividualAccount.map(new Function(c298964) { // from class: com.robinhood.android.trade.recommendations.ui.disclosures.RecommendationsDisclosuresDuxo$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(c298964, "function");
                this.function = c298964;
            }

            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.recommendations.ui.disclosures.RecommendationsDisclosuresDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsDisclosuresDuxo.onStart$lambda$5(this.f$0, (BrokerageAccountType) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(RecommendationsDisclosuresDuxo recommendationsDisclosuresDuxo, final UiRecommendationsDisclosures disclosures) {
        Intrinsics.checkNotNullParameter(disclosures, "disclosures");
        recommendationsDisclosuresDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.recommendations.ui.disclosures.RecommendationsDisclosuresDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsDisclosuresDuxo.onStart$lambda$1$lambda$0(disclosures, (RecommendationsDisclosuresViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecommendationsDisclosuresViewState onStart$lambda$1$lambda$0(UiRecommendationsDisclosures uiRecommendationsDisclosures, RecommendationsDisclosuresViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecommendationsDisclosuresViewState.copy$default(applyMutation, false, uiRecommendationsDisclosures, false, false, null, null, 60, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(RecommendationsDisclosuresDuxo recommendationsDisclosuresDuxo, final Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        recommendationsDisclosuresDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.recommendations.ui.disclosures.RecommendationsDisclosuresDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsDisclosuresDuxo.onStart$lambda$3$lambda$2(error, (RecommendationsDisclosuresViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecommendationsDisclosuresViewState onStart$lambda$3$lambda$2(Throwable th, RecommendationsDisclosuresViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecommendationsDisclosuresViewState.copy$default(applyMutation, false, null, false, false, null, new UiEvent(th), 31, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5(RecommendationsDisclosuresDuxo recommendationsDisclosuresDuxo, final BrokerageAccountType brokerageAccountType) {
        recommendationsDisclosuresDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.recommendations.ui.disclosures.RecommendationsDisclosuresDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsDisclosuresDuxo.onStart$lambda$5$lambda$4(brokerageAccountType, (RecommendationsDisclosuresViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecommendationsDisclosuresViewState onStart$lambda$5$lambda$4(BrokerageAccountType brokerageAccountType, RecommendationsDisclosuresViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecommendationsDisclosuresViewState.copy$default(applyMutation, false, null, false, false, brokerageAccountType, null, 47, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecommendationsDisclosuresViewState setReviewed$lambda$6(boolean z, RecommendationsDisclosuresViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecommendationsDisclosuresViewState.copy$default(applyMutation, false, null, z, false, null, null, 59, null);
    }

    public final void setReviewed(final boolean reviewed) {
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.recommendations.ui.disclosures.RecommendationsDisclosuresDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsDisclosuresDuxo.setReviewed$lambda$6(reviewed, (RecommendationsDisclosuresViewState) obj);
            }
        });
    }

    public final void signDisclosure(int disclosureVersion) {
        LifecycleHost.DefaultImpls.bind$default(this, this.recsDisclosuresStore.signDisclosures(((RecommendationsDisclosuresFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getRecommendationId(), disclosureVersion), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.recommendations.ui.disclosures.RecommendationsDisclosuresDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsDisclosuresDuxo.signDisclosure$lambda$8(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit signDisclosure$lambda$8(RecommendationsDisclosuresDuxo recommendationsDisclosuresDuxo, Optional it) {
        Intrinsics.checkNotNullParameter(it, "it");
        recommendationsDisclosuresDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.recommendations.ui.disclosures.RecommendationsDisclosuresDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsDisclosuresDuxo.signDisclosure$lambda$8$lambda$7((RecommendationsDisclosuresViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecommendationsDisclosuresViewState signDisclosure$lambda$8$lambda$7(RecommendationsDisclosuresViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecommendationsDisclosuresViewState.copy$default(applyMutation, false, null, false, true, null, null, 55, null);
    }

    /* compiled from: RecommendationsDisclosuresDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trade/recommendations/ui/disclosures/RecommendationsDisclosuresDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/trade/recommendations/ui/disclosures/RecommendationsDisclosuresDuxo;", "Lcom/robinhood/android/trade/recommendations/ui/disclosures/RecommendationsDisclosuresFragment$Args;", "<init>", "()V", "feature-trade-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RecommendationsDisclosuresDuxo, RecommendationsDisclosuresFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RecommendationsDisclosuresFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (RecommendationsDisclosuresFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RecommendationsDisclosuresFragment.Args getArgs(RecommendationsDisclosuresDuxo recommendationsDisclosuresDuxo) {
            return (RecommendationsDisclosuresFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, recommendationsDisclosuresDuxo);
        }
    }
}
