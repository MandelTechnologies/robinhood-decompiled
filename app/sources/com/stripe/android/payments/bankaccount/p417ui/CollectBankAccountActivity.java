package com.stripe.android.payments.bankaccount.p417ui;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwner2;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.financialconnections.FinancialConnectionsSheetResult;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetInstantDebitsResult;
import com.stripe.android.payments.bankaccount.CollectBankAccountLauncher;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResultInternal;
import com.stripe.android.payments.bankaccount.p417ui.CollectBankAccountViewEffect;
import com.stripe.android.payments.bankaccount.p417ui.CollectBankAccountViewModel;
import com.stripe.android.payments.financialconnections.FinancialConnectionsPaymentsProxy;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

/* compiled from: CollectBankAccountActivity.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0012\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\f\u0010\u0017\u001a\u00020\u0011*\u00020\u0018H\u0002J\f\u0010\u0017\u001a\u00020\u0011*\u00020\u0019H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "financialConnectionsPaymentsProxy", "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy;", "starterArgs", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;", "getStarterArgs", "()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;", "starterArgs$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;", "getViewModel", "()Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;", "viewModel$delegate", "initConnectionsPaymentsProxy", "", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "launch", "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$FinishWithResult;", "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes22.dex */
public final class CollectBankAccountActivity extends AppCompatActivity {
    private FinancialConnectionsPaymentsProxy financialConnectionsPaymentsProxy;

    /* renamed from: starterArgs$delegate, reason: from kotlin metadata */
    private final Lazy starterArgs = LazyKt.lazy(new Function0<CollectBankAccountContract.Args>() { // from class: com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity$starterArgs$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CollectBankAccountContract.Args invoke() {
            CollectBankAccountContract.Args.Companion companion = CollectBankAccountContract.Args.INSTANCE;
            Intent intent = this.this$0.getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
            return companion.fromIntent(intent);
        }
    });

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    public CollectBankAccountActivity() {
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(CollectBankAccountViewModel.class), new Function0<ViewModelStore>() { // from class: com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return this.getStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity$viewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                final CollectBankAccountActivity collectBankAccountActivity = this.this$0;
                return new CollectBankAccountViewModel.Factory(new Function0<CollectBankAccountContract.Args>() { // from class: com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity$viewModel$2.1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final CollectBankAccountContract.Args invoke() {
                        CollectBankAccountContract.Args starterArgs = collectBankAccountActivity.getStarterArgs();
                        if (starterArgs != null) {
                            return starterArgs;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    }
                });
            }
        }, new Function0<CreationExtras>() { // from class: com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? this.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CollectBankAccountContract.Args getStarterArgs() {
        return (CollectBankAccountContract.Args) this.starterArgs.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CollectBankAccountViewModel getViewModel() {
        return (CollectBankAccountViewModel) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CollectBankAccountContract.Args starterArgs = getStarterArgs();
        if ((starterArgs != null ? starterArgs.getConfiguration() : null) == null) {
            launch(new CollectBankAccountViewEffect.FinishWithResult(new CollectBankAccountResultInternal.Failed(new IllegalStateException("Configuration not provided"))));
            return;
        }
        CollectBankAccountContract.Args starterArgs2 = getStarterArgs();
        if (starterArgs2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        initConnectionsPaymentsProxy(starterArgs2.getConfiguration());
        LifecycleOwner2.getLifecycleScope(this).launchWhenStarted(new C425641(null));
    }

    /* compiled from: CollectBankAccountActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity$onCreate$1", m3645f = "CollectBankAccountActivity.kt", m3646l = {43}, m3647m = "invokeSuspend")
    /* renamed from: com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity$onCreate$1 */
    static final class C425641 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C425641(Continuation<? super C425641> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CollectBankAccountActivity.this.new C425641(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C425641) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<CollectBankAccountViewEffect> viewEffect = CollectBankAccountActivity.this.getViewModel().getViewEffect();
                final CollectBankAccountActivity collectBankAccountActivity = CollectBankAccountActivity.this;
                FlowCollector<? super CollectBankAccountViewEffect> flowCollector = new FlowCollector() { // from class: com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity.onCreate.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((CollectBankAccountViewEffect) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(CollectBankAccountViewEffect collectBankAccountViewEffect, Continuation<? super Unit> continuation) {
                        if (collectBankAccountViewEffect instanceof CollectBankAccountViewEffect.OpenConnectionsFlow) {
                            collectBankAccountActivity.launch((CollectBankAccountViewEffect.OpenConnectionsFlow) collectBankAccountViewEffect);
                        } else if (collectBankAccountViewEffect instanceof CollectBankAccountViewEffect.FinishWithResult) {
                            collectBankAccountActivity.launch((CollectBankAccountViewEffect.FinishWithResult) collectBankAccountViewEffect);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (viewEffect.collect(flowCollector, this) == coroutine_suspended) {
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

    private final void initConnectionsPaymentsProxy(CollectBankAccountLauncher configuration) {
        CollectBankAccountActivity collectBankAccountActivity;
        FinancialConnectionsPaymentsProxy financialConnectionsPaymentsProxyCreateForACH$default;
        if (configuration instanceof CollectBankAccountLauncher.InstantDebits) {
            financialConnectionsPaymentsProxyCreateForACH$default = FinancialConnectionsPaymentsProxy.Companion.createForInstantDebits$default(FinancialConnectionsPaymentsProxy.INSTANCE, this, new C425621(getViewModel()), null, null, 12, null);
            collectBankAccountActivity = this;
        } else if (configuration instanceof CollectBankAccountLauncher.USBankAccount) {
            collectBankAccountActivity = this;
            financialConnectionsPaymentsProxyCreateForACH$default = FinancialConnectionsPaymentsProxy.Companion.createForACH$default(FinancialConnectionsPaymentsProxy.INSTANCE, collectBankAccountActivity, new C425632(getViewModel()), null, null, 12, null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        collectBankAccountActivity.financialConnectionsPaymentsProxy = financialConnectionsPaymentsProxyCreateForACH$default;
    }

    /* compiled from: CollectBankAccountActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity$initConnectionsPaymentsProxy$1 */
    /* synthetic */ class C425621 extends FunctionReferenceImpl implements Function1<FinancialConnectionsSheetInstantDebitsResult, Unit> {
        C425621(Object obj) {
            super(1, obj, CollectBankAccountViewModel.class, "onConnectionsForInstantDebitsResult", "onConnectionsForInstantDebitsResult(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetInstantDebitsResult;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FinancialConnectionsSheetInstantDebitsResult financialConnectionsSheetInstantDebitsResult) {
            invoke2(financialConnectionsSheetInstantDebitsResult);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(FinancialConnectionsSheetInstantDebitsResult p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((CollectBankAccountViewModel) this.receiver).onConnectionsForInstantDebitsResult(p0);
        }
    }

    /* compiled from: CollectBankAccountActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity$initConnectionsPaymentsProxy$2 */
    /* synthetic */ class C425632 extends FunctionReferenceImpl implements Function1<FinancialConnectionsSheetResult, Unit> {
        C425632(Object obj) {
            super(1, obj, CollectBankAccountViewModel.class, "onConnectionsForACHResult", "onConnectionsForACHResult(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FinancialConnectionsSheetResult financialConnectionsSheetResult) {
            invoke2(financialConnectionsSheetResult);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(FinancialConnectionsSheetResult p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((CollectBankAccountViewModel) this.receiver).onConnectionsForACHResult(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launch(CollectBankAccountViewEffect.OpenConnectionsFlow openConnectionsFlow) {
        FinancialConnectionsPaymentsProxy financialConnectionsPaymentsProxy = this.financialConnectionsPaymentsProxy;
        if (financialConnectionsPaymentsProxy == null) {
            Intrinsics.throwUninitializedPropertyAccessException("financialConnectionsPaymentsProxy");
            financialConnectionsPaymentsProxy = null;
        }
        financialConnectionsPaymentsProxy.present(openConnectionsFlow.getFinancialConnectionsSessionSecret(), openConnectionsFlow.getPublishableKey(), openConnectionsFlow.getStripeAccountId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launch(CollectBankAccountViewEffect.FinishWithResult finishWithResult) {
        setResult(-1, new Intent().putExtras(new CollectBankAccountContract.Result(finishWithResult.getResult()).toBundle()));
        finish();
    }
}
