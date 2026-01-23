package com.robinhood.android.referral.rewardoffers.offersList;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.referral.contracts.RewardOfferIntentKey;
import com.robinhood.android.referral.lib.rewardOfferDetail.RewardOfferDetails;
import com.robinhood.android.referral.rewardoffers.offersList.RewardOffersLoadingFragment;
import com.robinhood.android.referral.rewardoffers.offersList.RewardOffersViewState3;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.utils.Either;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: RewardOffersLoadingFragment.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\r\u0010\u0016\u001a\u00020\u0011H\u0017¢\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersLoadingFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersDuxo;", "getDuxo", "()Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersLoadingFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersLoadingFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "handleEvent", "event", "Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersEvent;", "onDialogDismissed", "id", "", "Callbacks", "Companion", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RewardOffersLoadingFragment extends GenericComposeFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RewardOffersLoadingFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersLoadingFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, RewardOffersDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.referral.rewardoffers.offersList.RewardOffersLoadingFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof RewardOffersLoadingFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* compiled from: RewardOffersLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u001a\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J$\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\bH&J\b\u0010\u0010\u001a\u00020\u0003H&¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersLoadingFragment$Callbacks;", "", "onRewardOffersLoaded", "", "rewardOffers", "", "Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOfferViewType;", "initialSource", "", "onRewardOfferDetailsLoaded", "rewardOfferDetails", "Lcom/robinhood/android/referral/lib/rewardOfferDetail/RewardOfferDetails;", "showReferralV2Offer", "offerId", "Ljava/util/UUID;", "source", "onAccessDenied", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAccessDenied();

        void onRewardOfferDetailsLoaded(RewardOfferDetails rewardOfferDetails, String initialSource);

        void onRewardOffersLoaded(List<? extends RewardOfferViewType> rewardOffers, String initialSource);

        void showReferralV2Offer(UUID offerId, String initialSource, String source);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(RewardOffersLoadingFragment rewardOffersLoadingFragment, int i, Composer composer, int i2) {
        rewardOffersLoadingFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RewardOffersDuxo getDuxo() {
        return (RewardOffersDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C268071(null), 1, null);
        BaseFragment.collectDuxoState$default(this, null, new C268082(null), 1, null);
    }

    /* compiled from: RewardOffersLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.referral.rewardoffers.offersList.RewardOffersLoadingFragment$onViewCreated$1", m3645f = "RewardOffersLoadingFragment.kt", m3646l = {39}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.referral.rewardoffers.offersList.RewardOffersLoadingFragment$onViewCreated$1 */
    static final class C268071 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C268071(Continuation<? super C268071> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RewardOffersLoadingFragment.this.new C268071(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C268071) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(RewardOffersLoadingFragment.this.getDuxo().getEventFlow());
                final RewardOffersLoadingFragment rewardOffersLoadingFragment = RewardOffersLoadingFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.referral.rewardoffers.offersList.RewardOffersLoadingFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<RewardOffersViewState3>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<RewardOffersViewState3> event, Continuation<? super Unit> continuation) {
                        EventConsumer<RewardOffersViewState3> eventConsumerInvoke;
                        final RewardOffersLoadingFragment rewardOffersLoadingFragment2 = rewardOffersLoadingFragment;
                        if ((event.getData() instanceof RewardOffersViewState3) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.referral.rewardoffers.offersList.RewardOffersLoadingFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) throws Throwable {
                                    m18062invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m18062invoke(Object it) throws Throwable {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    rewardOffersLoadingFragment2.handleEvent((RewardOffersViewState3) event.getData());
                                }
                            });
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFilterNotNull.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: RewardOffersLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.referral.rewardoffers.offersList.RewardOffersLoadingFragment$onViewCreated$2", m3645f = "RewardOffersLoadingFragment.kt", m3646l = {44}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.referral.rewardoffers.offersList.RewardOffersLoadingFragment$onViewCreated$2 */
    static final class C268082 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C268082(Continuation<? super C268082> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RewardOffersLoadingFragment.this.new C268082(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C268082) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<RewardOffersViewState> stateFlow = RewardOffersLoadingFragment.this.getDuxo().getStateFlow();
                final RewardOffersLoadingFragment rewardOffersLoadingFragment = RewardOffersLoadingFragment.this;
                FlowCollector<? super RewardOffersViewState> flowCollector = new FlowCollector() { // from class: com.robinhood.android.referral.rewardoffers.offersList.RewardOffersLoadingFragment.onViewCreated.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((RewardOffersViewState) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(RewardOffersViewState rewardOffersViewState, Continuation<? super Unit> continuation) {
                        Either<List<RewardOfferViewType>, RewardOfferDetails> rewardOffersData = rewardOffersViewState.getRewardOffersData();
                        if (rewardOffersData instanceof Either.Left) {
                            rewardOffersLoadingFragment.getCallbacks().onRewardOffersLoaded((List) ((Either.Left) rewardOffersData).getValue(), rewardOffersViewState.getInitialSource());
                        } else if (rewardOffersData instanceof Either.Right) {
                            rewardOffersLoadingFragment.getCallbacks().onRewardOfferDetailsLoaded((RewardOfferDetails) ((Either.Right) rewardOffersData).getValue(), rewardOffersViewState.getInitialSource());
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlow.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(8634631);
        if ((i & 1) != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(8634631, i, -1, "com.robinhood.android.referral.rewardoffers.offersList.RewardOffersLoadingFragment.ComposeContent (RewardOffersLoadingFragment.kt:54)");
            }
            LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(null, null, true, false, composerStartRestartGroup, 384, 11);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.rewardoffers.offersList.RewardOffersLoadingFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RewardOffersLoadingFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(RewardOffersViewState3 event) throws Throwable {
        if (event instanceof RewardOffersViewState3.ShowReferralOffer) {
            RewardOffersViewState3.ShowReferralOffer showReferralOffer = (RewardOffersViewState3.ShowReferralOffer) event;
            getCallbacks().showReferralV2Offer(showReferralOffer.getOfferId(), showReferralOffer.getInitialSource(), showReferralOffer.getSource());
        } else {
            if (event instanceof RewardOffersViewState3.LoadingError) {
                ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
                FragmentActivity fragmentActivityRequireActivity = requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, ((RewardOffersViewState3.LoadingError) event).getError(), true, false, 0, null, 56, null);
                return;
            }
            if (!(event instanceof RewardOffersViewState3.FinishFlow)) {
                throw new NoWhenBranchMatchedException();
            }
            getCallbacks().onAccessDenied();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_generic_error) {
            getCallbacks().onAccessDenied();
        } else {
            super.onDialogDismissed(id);
        }
    }

    /* compiled from: RewardOffersLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersLoadingFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersLoadingFragment;", "Lcom/robinhood/android/referral/contracts/RewardOfferIntentKey$Platform;", "<init>", "()V", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RewardOffersLoadingFragment, RewardOfferIntentKey.Platform> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public RewardOfferIntentKey.Platform getArgs(RewardOffersLoadingFragment rewardOffersLoadingFragment) {
            return (RewardOfferIntentKey.Platform) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, rewardOffersLoadingFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RewardOffersLoadingFragment newInstance(RewardOfferIntentKey.Platform platform) {
            return (RewardOffersLoadingFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, platform);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RewardOffersLoadingFragment rewardOffersLoadingFragment, RewardOfferIntentKey.Platform platform) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, rewardOffersLoadingFragment, platform);
        }
    }
}
