package com.robinhood.android.transfers.international.p266ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import bff_money_movement.service.p019v1.StandardScreenDataDto;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.transfers.contracts.InternationalTransfer;
import com.robinhood.android.transfers.contracts.TransferSuccessCallbacks;
import com.robinhood.android.transfers.international.p266ui.InternationalTransferEvent;
import com.robinhood.android.transfers.international.p266ui.accountselection.AccountSelectionFragment;
import com.robinhood.android.transfers.international.p266ui.actions.InternationalTransferFlowAction;
import com.robinhood.android.transfers.international.p266ui.actions.InternationalTransferFlowAction2;
import com.robinhood.android.transfers.international.p266ui.amountinput.AmountInputFragment;
import com.robinhood.android.transfers.international.p266ui.confirmation.DepositConfirmationFragment;
import com.robinhood.android.transfers.international.p266ui.memo.MemoInputFragment;
import com.robinhood.android.transfers.international.p266ui.methodselection.TransferMethodFragment;
import com.robinhood.android.transfers.international.p266ui.review.ReviewTransferFragment;
import com.robinhood.android.transfers.international.p266ui.util.ErrorDialog2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoFragment;
import com.robinhood.models.p355ui.bonfire.PostTransferFlow;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.singular.sdk.internal.SLRemoteConfiguration;
import kotlin.Function;
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
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: InternationalTransferActivity.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 #2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001#B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u000fH\u0016J\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0016\u0010\u001c\u001a\u00020\u000f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002J\u0010\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\"H\u0016R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/InternationalTransferActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/transfers/international/ui/actions/InternationalTransferFlowActionResolver;", "Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoFragment$Callbacks;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "Lcom/robinhood/android/transfers/contracts/TransferSuccessCallbacks;", "<init>", "()V", "duxo", "Lcom/robinhood/android/transfers/international/ui/InternationalTransferDuxo;", "getDuxo", "()Lcom/robinhood/android/transfers/international/ui/InternationalTransferDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", SLRemoteConfiguration.Constants.RESOLVE_JSON_KEY, "action", "Lcom/robinhood/android/transfers/international/ui/actions/InternationalTransferFlowAction;", "showConfirmation", "screenData", "Lbff_money_movement/service/v1/StandardScreenDataDto;", "exitNonOriginatedAccountInfo", "onTransferConfirmationComplete", "postTransferFlow", "Lcom/robinhood/models/ui/bonfire/PostTransferFlow;", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/transfers/international/ui/InternationalTransferEvent;", "onDialogDismissed", "id", "", "Companion", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class InternationalTransferActivity extends BaseActivity implements InternationalTransferFlowAction2, NonOriginatedAccountInfoFragment.Callbacks, RhDialogFragment.OnDismissListener, TransferSuccessCallbacks {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public InternationalTransferActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.duxo = DuxosKt.duxo(this, InternationalTransferDuxo.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(final Event<InternationalTransferEvent> event) {
        EventConsumer<InternationalTransferEvent> eventConsumerInvoke;
        EventConsumer<InternationalTransferEvent> eventConsumerInvoke2;
        EventConsumer<InternationalTransferEvent> eventConsumerInvoke3;
        EventConsumer<InternationalTransferEvent> eventConsumerInvoke4;
        EventConsumer<InternationalTransferEvent> eventConsumerInvoke5;
        EventConsumer<InternationalTransferEvent> eventConsumerInvoke6;
        EventConsumer<InternationalTransferEvent> eventConsumerInvoke7;
        EventConsumer<InternationalTransferEvent> eventConsumerInvoke8;
        EventConsumer<InternationalTransferEvent> eventConsumerInvoke9;
        EventConsumer<InternationalTransferEvent> eventConsumerInvoke10;
        if ((event.getData() instanceof InternationalTransferEvent.ShowNonOriginatedAccountInfo) && (eventConsumerInvoke10 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke10.consume(event, new Function1() { // from class: com.robinhood.android.transfers.international.ui.InternationalTransferActivity$handleEvent$$inlined$consumeIfType$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m19637invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m19637invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.replaceFragment(NonOriginatedAccountInfoFragment.INSTANCE.newInstance((Parcelable) ((InternationalTransferEvent.ShowNonOriginatedAccountInfo) event.getData()).getArgs()));
                }
            });
        }
        if ((event.getData() instanceof InternationalTransferEvent.ShowTransferMethodSelection) && (eventConsumerInvoke9 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke9.consume(event, new Function1() { // from class: com.robinhood.android.transfers.international.ui.InternationalTransferActivity$handleEvent$$inlined$consumeIfType$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m19639invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m19639invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.replaceFragment(TransferMethodFragment.INSTANCE.newInstance((Parcelable) ((InternationalTransferEvent.ShowTransferMethodSelection) event.getData()).getArgs()));
                }
            });
        }
        if ((event.getData() instanceof InternationalTransferEvent.ShowAccountSelection) && (eventConsumerInvoke8 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke8.consume(event, new Function1() { // from class: com.robinhood.android.transfers.international.ui.InternationalTransferActivity$handleEvent$$inlined$consumeIfType$3
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m19640invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m19640invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.replaceFragment(AccountSelectionFragment.INSTANCE.newInstance((Parcelable) ((InternationalTransferEvent.ShowAccountSelection) event.getData()).getArgs()));
                }
            });
        }
        if ((event.getData() instanceof InternationalTransferEvent.ShowAmountInput) && (eventConsumerInvoke7 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke7.consume(event, new Function1() { // from class: com.robinhood.android.transfers.international.ui.InternationalTransferActivity$handleEvent$$inlined$consumeIfType$4
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m19641invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m19641invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.replaceFragment(AmountInputFragment.Companion.newInstance((Parcelable) ((InternationalTransferEvent.ShowAmountInput) event.getData()).getArgs()));
                }
            });
        }
        if ((event.getData() instanceof InternationalTransferEvent.ShowMemoInput) && (eventConsumerInvoke6 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke6.consume(event, new Function1() { // from class: com.robinhood.android.transfers.international.ui.InternationalTransferActivity$handleEvent$$inlined$consumeIfType$5
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m19642invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m19642invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.replaceFragment(MemoInputFragment.Companion.newInstance());
                }
            });
        }
        if ((event.getData() instanceof InternationalTransferEvent.ShowTransferReview) && (eventConsumerInvoke5 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke5.consume(event, new Function1() { // from class: com.robinhood.android.transfers.international.ui.InternationalTransferActivity$handleEvent$$inlined$consumeIfType$6
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m19643invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m19643invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.replaceFragment(ReviewTransferFragment.Companion.newInstance((Parcelable) ((InternationalTransferEvent.ShowTransferReview) event.getData()).getArgs()));
                }
            });
        }
        if ((event.getData() instanceof InternationalTransferEvent.ReplaceFragment) && (eventConsumerInvoke4 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke4.consume(event, new Function1() { // from class: com.robinhood.android.transfers.international.ui.InternationalTransferActivity$handleEvent$$inlined$consumeIfType$7
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m19644invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m19644invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    InternationalTransferEvent.ReplaceFragment replaceFragment = (InternationalTransferEvent.ReplaceFragment) event.getData();
                    InternationalTransferActivity internationalTransferActivity = this;
                    internationalTransferActivity.replaceFragment(Navigator.DefaultImpls.createFragment$default(internationalTransferActivity.getNavigator(), replaceFragment.getFragmentKey(), null, 2, null));
                }
            });
        }
        if ((event.getData() instanceof InternationalTransferEvent.SetFragmentWithArgs) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.android.transfers.international.ui.InternationalTransferActivity$handleEvent$$inlined$consumeIfType$8
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m19645invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m19645invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    InternationalTransferEvent.SetFragmentWithArgs setFragmentWithArgs = (InternationalTransferEvent.SetFragmentWithArgs) event.getData();
                    this.setFragment(C11048R.id.fragment_container, setFragmentWithArgs.component1().newInstance(setFragmentWithArgs.component2()));
                }
            });
        }
        if ((event.getData() instanceof InternationalTransferEvent.SetFragmentWithoutArgs) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.transfers.international.ui.InternationalTransferActivity$handleEvent$$inlined$consumeIfType$9
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m19646invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m19646invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.setFragment(C11048R.id.fragment_container, ((InternationalTransferEvent.SetFragmentWithoutArgs) event.getData()).getFragmentCreator().newInstance());
                }
            });
        }
        if (!(event.getData() instanceof InternationalTransferEvent.Error) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.transfers.international.ui.InternationalTransferActivity$handleEvent$$inlined$consumeIfType$10
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m19638invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m19638invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                RhDialogFragment.Builder builderCreateRhDialogFragment = ErrorDialog2.createRhDialogFragment(((InternationalTransferEvent.Error) event.getData()).getErrorDialog(), this);
                FragmentManager supportFragmentManager = this.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                RhDialogFragment.Builder.show$default(builderCreateRhDialogFragment, supportFragmentManager, "transfer-error", false, 4, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InternationalTransferDuxo getDuxo() {
        return (InternationalTransferDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), AchromaticOverlay.INSTANCE, null, 2, null);
        BaseActivity.collectDuxoState$default(this, null, new C303231(null), 1, null);
        if (savedInstanceState == null) {
            getDuxo().resolveInitialFragment();
        }
    }

    /* compiled from: InternationalTransferActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.international.ui.InternationalTransferActivity$onCreate$1", m3645f = "InternationalTransferActivity.kt", m3646l = {44}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.international.ui.InternationalTransferActivity$onCreate$1 */
    static final class C303231 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C303231(Continuation<? super C303231> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InternationalTransferActivity.this.new C303231(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C303231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: InternationalTransferActivity.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.transfers.international.ui.InternationalTransferActivity$onCreate$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ InternationalTransferActivity $tmp0;

            AnonymousClass1(InternationalTransferActivity internationalTransferActivity) {
                this.$tmp0 = internationalTransferActivity;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, InternationalTransferActivity.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<InternationalTransferEvent> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleEvent = C303231.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<InternationalTransferEvent>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(InternationalTransferActivity.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(InternationalTransferActivity.this);
                this.label = 1;
                if (flowFilterNotNull.collect(anonymousClass1, this) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$handleEvent(InternationalTransferActivity internationalTransferActivity, Event event, Continuation continuation) {
            internationalTransferActivity.handleEvent(event);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.transfers.international.p266ui.actions.InternationalTransferFlowAction2
    public void resolve(InternationalTransferFlowAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        getDuxo().handleAction(action);
    }

    @Override // com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoFragment.Callbacks
    public void showConfirmation(StandardScreenDataDto screenData) {
        Intrinsics.checkNotNullParameter(screenData, "screenData");
        replaceFragment(DepositConfirmationFragment.INSTANCE.newInstance((Parcelable) new DepositConfirmationFragment.Args(screenData)));
    }

    @Override // com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoFragment.Callbacks
    public void exitNonOriginatedAccountInfo() {
        finish();
    }

    @Override // com.robinhood.android.transfers.contracts.TransferSuccessCallbacks
    public void onTransferConfirmationComplete(PostTransferFlow postTransferFlow) {
        Intrinsics.checkNotNullParameter(postTransferFlow, "postTransferFlow");
        finish();
    }

    @Override // com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == 1) {
            finish();
        }
    }

    /* compiled from: InternationalTransferActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/InternationalTransferActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/transfers/international/ui/InternationalTransferActivity;", "Lcom/robinhood/android/transfers/contracts/InternationalTransfer;", "<init>", "()V", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<InternationalTransferActivity, InternationalTransfer> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public InternationalTransfer getExtras(InternationalTransferActivity internationalTransferActivity) {
            return (InternationalTransfer) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, internationalTransferActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, InternationalTransfer internationalTransfer) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, internationalTransfer);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, InternationalTransfer internationalTransfer) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, internationalTransfer);
        }
    }
}
