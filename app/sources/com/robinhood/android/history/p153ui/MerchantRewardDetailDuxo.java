package com.robinhood.android.history.p153ui;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter;
import com.robinhood.android.history.p153ui.MerchantRewardDetailDuxo;
import com.robinhood.android.history.p153ui.MerchantRewardDetailFragment;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.MerchantOfferStore;
import com.robinhood.librobinhood.data.store.RhyRewardStore;
import com.robinhood.models.p320db.MerchantReward;
import com.robinhood.models.p320db.mcduckling.MerchantOfferBanner;
import com.robinhood.models.p320db.mcduckling.MerchantOfferV2;
import com.robinhood.shared.history.formatters.legacy.MerchantRewardFormatter;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MerchantRewardDetailDuxo.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0012B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/history/ui/MerchantRewardDetailDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/history/ui/MerchantDetailViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "rhyRewardStore", "Lcom/robinhood/librobinhood/data/store/RhyRewardStore;", "merchantOfferStore", "Lcom/robinhood/librobinhood/data/store/MerchantOfferStore;", "merchantRewardFormatter", "Lcom/robinhood/shared/history/formatters/legacy/MerchantRewardFormatter;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/RhyRewardStore;Lcom/robinhood/librobinhood/data/store/MerchantOfferStore;Lcom/robinhood/shared/history/formatters/legacy/MerchantRewardFormatter;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class MerchantRewardDetailDuxo extends OldBaseDuxo<MerchantDetailViewState> implements HasSavedState {
    private final MerchantOfferStore merchantOfferStore;
    private final MerchantRewardFormatter merchantRewardFormatter;
    private final RhyRewardStore rhyRewardStore;
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
    public MerchantRewardDetailDuxo(RhyRewardStore rhyRewardStore, MerchantOfferStore merchantOfferStore, MerchantRewardFormatter merchantRewardFormatter, SavedStateHandle savedStateHandle) {
        super(new MerchantDetailViewState(null, null, null, null, null, 31, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(rhyRewardStore, "rhyRewardStore");
        Intrinsics.checkNotNullParameter(merchantOfferStore, "merchantOfferStore");
        Intrinsics.checkNotNullParameter(merchantRewardFormatter, "merchantRewardFormatter");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.rhyRewardStore = rhyRewardStore;
        this.merchantOfferStore = merchantOfferStore;
        this.merchantRewardFormatter = merchantRewardFormatter;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        this.rhyRewardStore.refresh(true);
        Observable observableDistinctUntilChanged = this.rhyRewardStore.streamMerchantReward(((MerchantRewardDetailFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getMerchantRewardId()).switchMap(new Function() { // from class: com.robinhood.android.history.ui.MerchantRewardDetailDuxo.onStart.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Tuples2<MerchantReward, Optional<MerchantOfferV2>>> apply(final MerchantReward merchantReward) {
                Intrinsics.checkNotNullParameter(merchantReward, "merchantReward");
                MerchantRewardDetailDuxo.this.merchantOfferStore.refresh(merchantReward.getOfferId(), true);
                return MerchantRewardDetailDuxo.this.merchantOfferStore.stream(merchantReward.getOfferId()).map(new Function() { // from class: com.robinhood.android.history.ui.MerchantRewardDetailDuxo.onStart.1.1
                    @Override // io.reactivex.functions.Function
                    public final Optional<MerchantOfferV2> apply(MerchantOfferV2 it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Optional3.asOptional(it);
                    }
                }).startWith((Observable<R>) Optional2.INSTANCE).map(new Function() { // from class: com.robinhood.android.history.ui.MerchantRewardDetailDuxo.onStart.1.2
                    @Override // io.reactivex.functions.Function
                    public final Tuples2<MerchantReward, Optional<MerchantOfferV2>> apply(Optional<MerchantOfferV2> merchantOffer) {
                        Intrinsics.checkNotNullParameter(merchantOffer, "merchantOffer");
                        return Tuples4.m3642to(merchantReward, merchantOffer);
                    }
                });
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.history.ui.MerchantRewardDetailDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MerchantRewardDetailDuxo.onStart$lambda$1(this.f$0, (Tuples2) obj);
            }
        });
        getLifecycleScope().launchWhenStarted(new C183963(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(final MerchantRewardDetailDuxo merchantRewardDetailDuxo, Tuples2 tuples2) {
        Object objComponent1 = tuples2.component1();
        Intrinsics.checkNotNullExpressionValue(objComponent1, "component1(...)");
        final MerchantReward merchantReward = (MerchantReward) objComponent1;
        Object objComponent2 = tuples2.component2();
        Intrinsics.checkNotNullExpressionValue(objComponent2, "component2(...)");
        final Optional optional = (Optional) objComponent2;
        merchantRewardDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.history.ui.MerchantRewardDetailDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MerchantRewardDetailDuxo.onStart$lambda$1$lambda$0(this.f$0, merchantReward, optional, (MerchantDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MerchantDetailViewState onStart$lambda$1$lambda$0(MerchantRewardDetailDuxo merchantRewardDetailDuxo, MerchantReward merchantReward, Optional optional, MerchantDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return MerchantDetailViewState.copy$default(applyMutation, HistoryTransactionFormatter.DefaultImpls.getAmountText$default(merchantRewardDetailDuxo.merchantRewardFormatter, merchantReward, false, false, 6, null), merchantReward, (MerchantOfferV2) optional.getOrNull(), null, null, 24, null);
    }

    /* compiled from: MerchantRewardDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.history.ui.MerchantRewardDetailDuxo$onStart$3", m3645f = "MerchantRewardDetailDuxo.kt", m3646l = {52}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.history.ui.MerchantRewardDetailDuxo$onStart$3 */
    static final class C183963 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C183963(Continuation<? super C183963> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MerchantRewardDetailDuxo.this.new C183963(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C183963) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RhyRewardStore rhyRewardStore = MerchantRewardDetailDuxo.this.rhyRewardStore;
                UUID merchantRewardId = ((MerchantRewardDetailFragment.Args) MerchantRewardDetailDuxo.INSTANCE.getArgs((HasSavedState) MerchantRewardDetailDuxo.this)).getMerchantRewardId();
                this.label = 1;
                obj = rhyRewardStore.streamBanner(merchantRewardId, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            final MerchantOfferBanner merchantOfferBanner = (MerchantOfferBanner) obj;
            MerchantRewardDetailDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.history.ui.MerchantRewardDetailDuxo$onStart$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return MerchantRewardDetailDuxo.C183963.invokeSuspend$lambda$0(merchantOfferBanner, (MerchantDetailViewState) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MerchantDetailViewState invokeSuspend$lambda$0(MerchantOfferBanner merchantOfferBanner, MerchantDetailViewState merchantDetailViewState) {
            return MerchantDetailViewState.copy$default(merchantDetailViewState, null, null, null, merchantOfferBanner, null, 23, null);
        }
    }

    /* compiled from: MerchantRewardDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/history/ui/MerchantRewardDetailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/history/ui/MerchantRewardDetailDuxo;", "Lcom/robinhood/android/history/ui/MerchantRewardDetailFragment$Args;", "<init>", "()V", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<MerchantRewardDetailDuxo, MerchantRewardDetailFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MerchantRewardDetailFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (MerchantRewardDetailFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MerchantRewardDetailFragment.Args getArgs(MerchantRewardDetailDuxo merchantRewardDetailDuxo) {
            return (MerchantRewardDetailFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, merchantRewardDetailDuxo);
        }
    }
}
