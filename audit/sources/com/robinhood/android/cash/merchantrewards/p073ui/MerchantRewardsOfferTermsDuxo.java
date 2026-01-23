package com.robinhood.android.cash.merchantrewards.p073ui;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.MerchantOfferTermsStore;
import com.robinhood.models.p320db.mcduckling.MerchantOfferTerms;
import io.reactivex.Observable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MerchantRewardsOfferTermsDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0010B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsOfferTermsDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsOfferTermsViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "merchantOfferTermsStore", "Lcom/robinhood/librobinhood/data/store/MerchantOfferTermsStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/MerchantOfferTermsStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "offerId", "Ljava/util/UUID;", "onStart", "", "Companion", "feature-cash-merchant-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class MerchantRewardsOfferTermsDuxo extends OldBaseDuxo<MerchantRewardsOfferTermsViewState> implements HasSavedState {
    private final MerchantOfferTermsStore merchantOfferTermsStore;
    private final UUID offerId;
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
    public MerchantRewardsOfferTermsDuxo(MerchantOfferTermsStore merchantOfferTermsStore, SavedStateHandle savedStateHandle) {
        super(new MerchantRewardsOfferTermsViewState(null, 1, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(merchantOfferTermsStore, "merchantOfferTermsStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.merchantOfferTermsStore = merchantOfferTermsStore;
        this.savedStateHandle = savedStateHandle;
        this.offerId = ((LegacyFragmentKey.RhyMerchantRewardsOfferTerms) INSTANCE.getArgs(getSavedStateHandle())).getId();
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        this.merchantOfferTermsStore.refresh(this.offerId, true);
        Observable<MerchantOfferTerms> observableDistinctUntilChanged = this.merchantOfferTermsStore.stream(this.offerId).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOfferTermsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MerchantRewardsOfferTermsDuxo.onStart$lambda$1(this.f$0, (MerchantOfferTerms) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(MerchantRewardsOfferTermsDuxo merchantRewardsOfferTermsDuxo, final MerchantOfferTerms merchantOfferTerms) {
        merchantRewardsOfferTermsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOfferTermsDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MerchantRewardsOfferTermsDuxo.onStart$lambda$1$lambda$0(merchantOfferTerms, (MerchantRewardsOfferTermsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MerchantRewardsOfferTermsViewState onStart$lambda$1$lambda$0(MerchantOfferTerms merchantOfferTerms, MerchantRewardsOfferTermsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(merchantOfferTerms);
    }

    /* compiled from: MerchantRewardsOfferTermsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsOfferTermsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsOfferTermsDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyMerchantRewardsOfferTerms;", "<init>", "()V", "feature-cash-merchant-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<MerchantRewardsOfferTermsDuxo, LegacyFragmentKey.RhyMerchantRewardsOfferTerms> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.RhyMerchantRewardsOfferTerms getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyFragmentKey.RhyMerchantRewardsOfferTerms) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.RhyMerchantRewardsOfferTerms getArgs(MerchantRewardsOfferTermsDuxo merchantRewardsOfferTermsDuxo) {
            return (LegacyFragmentKey.RhyMerchantRewardsOfferTerms) DuxoCompanion.DefaultImpls.getArgs(this, merchantRewardsOfferTermsDuxo);
        }
    }
}
