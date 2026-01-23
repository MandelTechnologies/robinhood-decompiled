package com.robinhood.android.referral.rewardoffers.referralOffer.loading;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.growth.model.ErrorData;
import com.robinhood.android.growth.util.ErrorHandlingExtensions;
import com.robinhood.android.referral.C26659R;
import com.robinhood.android.referral.rewardoffers.referralOffer.loading.ReferralOfferLoadingFragment;
import com.robinhood.android.serverclientcomponents.alert.ClientComponentAlertFragment;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.StandardPageTemplate;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.Metadata;
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

/* compiled from: ReferralOfferLoadingFragment.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 #2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003!\"#B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\r\u0010\u0018\u001a\u00020\u0013H\u0017¢\u0006\u0002\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020 H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/loading/ReferralOfferLoadingFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "Lcom/robinhood/android/serverclientcomponents/alert/ClientComponentAlertFragment$Callbacks;", "<init>", "()V", "duxo", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/loading/ReferralOfferLoadingDuxo;", "getDuxo", "()Lcom/robinhood/android/referral/rewardoffers/referralOffer/loading/ReferralOfferLoadingDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/loading/ReferralOfferLoadingFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/referral/rewardoffers/referralOffer/loading/ReferralOfferLoadingFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onActionClicked", "", "button", "Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;", "onDialogDismissed", "id", "", "Callbacks", "Args", "Companion", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class ReferralOfferLoadingFragment extends GenericComposeFragment implements RhDialogFragment.OnDismissListener, ClientComponentAlertFragment.Callbacks {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ReferralOfferLoadingFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/referral/rewardoffers/referralOffer/loading/ReferralOfferLoadingFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, ReferralOfferLoadingDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.loading.ReferralOfferLoadingFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof ReferralOfferLoadingFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* compiled from: ReferralOfferLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001e\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/loading/ReferralOfferLoadingFragment$Callbacks;", "", "onOfferDetailsLoaded", "", "result", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/loading/ReferralOfferLoadingResult;", "onSduiDetailsLoaded", "offerId", "Ljava/util/UUID;", "content", "Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onOfferDetailsLoaded(ReferralOfferLoadingResult result);

        void onSduiDetailsLoaded(UUID offerId, StandardPageTemplate<? extends GenericAction> content);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(ReferralOfferLoadingFragment referralOfferLoadingFragment, int i, Composer composer, int i2) {
        referralOfferLoadingFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReferralOfferLoadingDuxo getDuxo() {
        return (ReferralOfferLoadingDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* compiled from: ReferralOfferLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.referral.rewardoffers.referralOffer.loading.ReferralOfferLoadingFragment$onViewCreated$1", m3645f = "ReferralOfferLoadingFragment.kt", m3646l = {47}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.referral.rewardoffers.referralOffer.loading.ReferralOfferLoadingFragment$onViewCreated$1 */
    static final class C268971 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C268971(Continuation<? super C268971> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ReferralOfferLoadingFragment.this.new C268971(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C268971) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(ReferralOfferLoadingFragment.this.getDuxo().getEventFlow());
                final ReferralOfferLoadingFragment referralOfferLoadingFragment = ReferralOfferLoadingFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.loading.ReferralOfferLoadingFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<ErrorData>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<ErrorData> event, Continuation<? super Unit> continuation) {
                        EventConsumer<ErrorData> eventConsumerInvoke;
                        final ReferralOfferLoadingFragment referralOfferLoadingFragment2 = referralOfferLoadingFragment;
                        if ((event.getData() instanceof ErrorData) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.loading.ReferralOfferLoadingFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m18087invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m18087invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    ErrorHandlingExtensions.handleError(referralOfferLoadingFragment2, (ErrorData) event.getData(), C26659R.id.dialog_id_referral_offer_details_loading_error, "referral-offer-details-loading-dialog");
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

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C268971(null), 1, null);
        BaseFragment.collectDuxoState$default(this, null, new C268982(null), 1, null);
    }

    /* compiled from: ReferralOfferLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.referral.rewardoffers.referralOffer.loading.ReferralOfferLoadingFragment$onViewCreated$2", m3645f = "ReferralOfferLoadingFragment.kt", m3646l = {58}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.referral.rewardoffers.referralOffer.loading.ReferralOfferLoadingFragment$onViewCreated$2 */
    static final class C268982 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C268982(Continuation<? super C268982> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ReferralOfferLoadingFragment.this.new C268982(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C268982) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<ReferralOfferLoadingState> stateFlow = ReferralOfferLoadingFragment.this.getDuxo().getStateFlow();
                final ReferralOfferLoadingFragment referralOfferLoadingFragment = ReferralOfferLoadingFragment.this;
                FlowCollector<? super ReferralOfferLoadingState> flowCollector = new FlowCollector() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.loading.ReferralOfferLoadingFragment.onViewCreated.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((ReferralOfferLoadingState) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(ReferralOfferLoadingState referralOfferLoadingState, Continuation<? super Unit> continuation) {
                        ReferralOfferLoadingResult result = referralOfferLoadingState.getResult();
                        if (result != null) {
                            ReferralOfferLoadingFragment referralOfferLoadingFragment2 = referralOfferLoadingFragment;
                            StandardPageTemplate<GenericAction> sduiContent = result.getDetails().getSduiContent();
                            if (sduiContent == null) {
                                referralOfferLoadingFragment2.getCallbacks().onOfferDetailsLoaded(result);
                            } else {
                                referralOfferLoadingFragment2.getCallbacks().onSduiDetailsLoaded(result.getDetails().getId(), sduiContent);
                            }
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
        Composer composerStartRestartGroup = composer.startRestartGroup(-1523720289);
        if ((i & 1) != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1523720289, i, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.loading.ReferralOfferLoadingFragment.ComposeContent (ReferralOfferLoadingFragment.kt:71)");
            }
            LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(WindowInsetsPadding_androidKt.systemBarsPadding(Modifier.INSTANCE), null, false, true, composerStartRestartGroup, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.loading.ReferralOfferLoadingFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ReferralOfferLoadingFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView.Callbacks
    public boolean onActionClicked(ServerDrivenButton button) {
        Intrinsics.checkNotNullParameter(button, "button");
        if (!(button.getTypedAction() instanceof GenericAction.DismissAction)) {
            return false;
        }
        requireActivity().finish();
        return true;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C26659R.id.dialog_id_referral_offer_details_loading_error) {
            requireActivity().finish();
        } else {
            super.onDialogDismissed(id);
        }
    }

    /* compiled from: ReferralOfferLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003JA\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/loading/ReferralOfferLoadingFragment$Args;", "Landroid/os/Parcelable;", "offerId", "Ljava/util/UUID;", "instrumentId", "initialSource", "", "source", "isFromOnboarding", "", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Z)V", "getOfferId", "()Ljava/util/UUID;", "getInstrumentId", "getInitialSource", "()Ljava/lang/String;", "getSource", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String initialSource;
        private final UUID instrumentId;
        private final boolean isFromOnboarding;
        private final UUID offerId;
        private final String source;

        /* compiled from: ReferralOfferLoadingFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UUID) parcel.readSerializable(), (UUID) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, UUID uuid, UUID uuid2, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = args.offerId;
            }
            if ((i & 2) != 0) {
                uuid2 = args.instrumentId;
            }
            if ((i & 4) != 0) {
                str = args.initialSource;
            }
            if ((i & 8) != 0) {
                str2 = args.source;
            }
            if ((i & 16) != 0) {
                z = args.isFromOnboarding;
            }
            boolean z2 = z;
            String str3 = str;
            return args.copy(uuid, uuid2, str3, str2, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getOfferId() {
            return this.offerId;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getInitialSource() {
            return this.initialSource;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsFromOnboarding() {
            return this.isFromOnboarding;
        }

        public final Args copy(UUID offerId, UUID instrumentId, String initialSource, String source, boolean isFromOnboarding) {
            Intrinsics.checkNotNullParameter(offerId, "offerId");
            return new Args(offerId, instrumentId, initialSource, source, isFromOnboarding);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.offerId, args.offerId) && Intrinsics.areEqual(this.instrumentId, args.instrumentId) && Intrinsics.areEqual(this.initialSource, args.initialSource) && Intrinsics.areEqual(this.source, args.source) && this.isFromOnboarding == args.isFromOnboarding;
        }

        public int hashCode() {
            int iHashCode = this.offerId.hashCode() * 31;
            UUID uuid = this.instrumentId;
            int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
            String str = this.initialSource;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.source;
            return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isFromOnboarding);
        }

        public String toString() {
            return "Args(offerId=" + this.offerId + ", instrumentId=" + this.instrumentId + ", initialSource=" + this.initialSource + ", source=" + this.source + ", isFromOnboarding=" + this.isFromOnboarding + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.offerId);
            dest.writeSerializable(this.instrumentId);
            dest.writeString(this.initialSource);
            dest.writeString(this.source);
            dest.writeInt(this.isFromOnboarding ? 1 : 0);
        }

        public Args(UUID offerId, UUID uuid, String str, String str2, boolean z) {
            Intrinsics.checkNotNullParameter(offerId, "offerId");
            this.offerId = offerId;
            this.instrumentId = uuid;
            this.initialSource = str;
            this.source = str2;
            this.isFromOnboarding = z;
        }

        public final UUID getOfferId() {
            return this.offerId;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final String getInitialSource() {
            return this.initialSource;
        }

        public final String getSource() {
            return this.source;
        }

        public final boolean isFromOnboarding() {
            return this.isFromOnboarding;
        }
    }

    /* compiled from: ReferralOfferLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/loading/ReferralOfferLoadingFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/loading/ReferralOfferLoadingFragment;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/loading/ReferralOfferLoadingFragment$Args;", "<init>", "()V", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<ReferralOfferLoadingFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(ReferralOfferLoadingFragment referralOfferLoadingFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, referralOfferLoadingFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ReferralOfferLoadingFragment newInstance(Args args) {
            return (ReferralOfferLoadingFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ReferralOfferLoadingFragment referralOfferLoadingFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, referralOfferLoadingFragment, args);
        }
    }
}
