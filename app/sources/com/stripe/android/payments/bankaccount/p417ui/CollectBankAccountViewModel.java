package com.stripe.android.payments.bankaccount.p417ui;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModel2;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.stripe.android.core.Logger;
import com.stripe.android.core.utils.CreationExtrasKtx;
import com.stripe.android.financialconnections.FinancialConnectionsSheetResult;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetInstantDebitsResult;
import com.stripe.android.model.FinancialConnectionsSession;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.bankaccount.CollectBankAccountLauncher;
import com.stripe.android.payments.bankaccount.domain.AttachFinancialConnectionsSession;
import com.stripe.android.payments.bankaccount.domain.CreateFinancialConnectionsSession;
import com.stripe.android.payments.bankaccount.domain.RetrieveStripeIntent;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResponseInternal;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResultInternal;
import com.stripe.android.payments.bankaccount.p416di.DaggerCollectBankAccountComponent;
import com.stripe.android.payments.bankaccount.p417ui.CollectBankAccountViewEffect;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;

/* compiled from: CollectBankAccountViewModel.kt */
@Metadata(m3635d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 62\u00020\u0001:\u000267BE\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u000e\u0010\u0007\u001a\u00020\u001eH\u0082@¢\u0006\u0002\u0010!J\u0016\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$H\u0082@¢\u0006\u0002\u0010%J\u0010\u0010&\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020(H\u0002J\u001e\u0010)\u001a\u00020\u001e2\u0014\u0010*\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\u0004\u0012\u00020-0+H\u0002J\u0016\u0010.\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020/H\u0082@¢\u0006\u0002\u00100J\u0010\u00101\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u000e\u00102\u001a\u00020\u001e2\u0006\u0010'\u001a\u000203J\u000e\u00104\u001a\u00020\u001e2\u0006\u0010'\u001a\u000205R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00068"}, m3636d2 = {"Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;", "Landroidx/lifecycle/ViewModel;", "args", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;", "_viewEffect", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect;", "createFinancialConnectionsSession", "Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;", "attachFinancialConnectionsSession", "Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;", "retrieveStripeIntent", "Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "logger", "Lcom/stripe/android/core/Logger;", "(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;Lkotlinx/coroutines/flow/MutableSharedFlow;Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/core/Logger;)V", "value", "", "hasLaunched", "getHasLaunched", "()Z", "setHasLaunched", "(Z)V", "viewEffect", "Lkotlinx/coroutines/flow/SharedFlow;", "getViewEffect", "()Lkotlinx/coroutines/flow/SharedFlow;", "attachSessionToIntent", "", "financialConnectionsSession", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "finishWithError", "throwable", "", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "finishWithPaymentMethodId", "result", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetInstantDebitsResult$Completed;", "finishWithRefreshedIntent", "action", "Lkotlin/Function1;", "Lcom/stripe/android/model/StripeIntent;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;", "finishWithResult", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;", "(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "finishWithSession", "onConnectionsForACHResult", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;", "onConnectionsForInstantDebitsResult", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetInstantDebitsResult;", "Companion", "Factory", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes22.dex */
public final class CollectBankAccountViewModel extends ViewModel {
    private final SharedFlow2<CollectBankAccountViewEffect> _viewEffect;
    private final CollectBankAccountContract.Args args;
    private final AttachFinancialConnectionsSession attachFinancialConnectionsSession;
    private final CreateFinancialConnectionsSession createFinancialConnectionsSession;
    private final Logger logger;
    private final RetrieveStripeIntent retrieveStripeIntent;
    private final SavedStateHandle savedStateHandle;
    private final SharedFlow<CollectBankAccountViewEffect> viewEffect;
    public static final int $stable = 8;

    /* compiled from: CollectBankAccountViewModel.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel", m3645f = "CollectBankAccountViewModel.kt", m3646l = {63, 75, 87, 96, 108, 116}, m3647m = "createFinancialConnectionsSession")
    /* renamed from: com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$createFinancialConnectionsSession$1 */
    static final class C425681 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C425681(Continuation<? super C425681> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CollectBankAccountViewModel.this.createFinancialConnectionsSession(this);
        }
    }

    public CollectBankAccountViewModel(CollectBankAccountContract.Args args, SharedFlow2<CollectBankAccountViewEffect> _viewEffect, CreateFinancialConnectionsSession createFinancialConnectionsSession, AttachFinancialConnectionsSession attachFinancialConnectionsSession, RetrieveStripeIntent retrieveStripeIntent, SavedStateHandle savedStateHandle, Logger logger) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(_viewEffect, "_viewEffect");
        Intrinsics.checkNotNullParameter(createFinancialConnectionsSession, "createFinancialConnectionsSession");
        Intrinsics.checkNotNullParameter(attachFinancialConnectionsSession, "attachFinancialConnectionsSession");
        Intrinsics.checkNotNullParameter(retrieveStripeIntent, "retrieveStripeIntent");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.args = args;
        this._viewEffect = _viewEffect;
        this.createFinancialConnectionsSession = createFinancialConnectionsSession;
        this.attachFinancialConnectionsSession = attachFinancialConnectionsSession;
        this.retrieveStripeIntent = retrieveStripeIntent;
        this.savedStateHandle = savedStateHandle;
        this.logger = logger;
        this.viewEffect = _viewEffect;
        if (getHasLaunched()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C425661(null), 3, null);
    }

    private final boolean getHasLaunched() {
        return Intrinsics.areEqual(this.savedStateHandle.get("key_has_launched"), Boolean.TRUE);
    }

    private final void setHasLaunched(boolean z) {
        this.savedStateHandle.set("key_has_launched", Boolean.valueOf(z));
    }

    public final SharedFlow<CollectBankAccountViewEffect> getViewEffect() {
        return this.viewEffect;
    }

    /* compiled from: CollectBankAccountViewModel.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$1", m3645f = "CollectBankAccountViewModel.kt", m3646l = {55}, m3647m = "invokeSuspend")
    /* renamed from: com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$1 */
    static final class C425661 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C425661(Continuation<? super C425661> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CollectBankAccountViewModel.this.new C425661(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C425661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CollectBankAccountViewModel collectBankAccountViewModel = CollectBankAccountViewModel.this;
                this.label = 1;
                if (collectBankAccountViewModel.createFinancialConnectionsSession(this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009a, code lost:
    
        if (r14 == r11) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
    
        r0 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00de, code lost:
    
        if (r14 == r11) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x010f, code lost:
    
        if (r14 == r11) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0140, code lost:
    
        if (r14 == r11) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01ca, code lost:
    
        if (r1.finishWithError(r14, r7) == r11) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createFinancialConnectionsSession(Continuation<? super Unit> continuation) {
        C425681 c425681;
        Object objM26923forSetupIntenthUnOzRk;
        CollectBankAccountViewModel collectBankAccountViewModel;
        String clientSecret;
        Object objM28550constructorimpl;
        Object obj;
        Throwable thM28553exceptionOrNullimpl;
        if (continuation instanceof C425681) {
            c425681 = (C425681) continuation;
            int i = c425681.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c425681.label = i - Integer.MIN_VALUE;
            } else {
                c425681 = new C425681(continuation);
            }
        }
        C425681 c4256812 = c425681;
        Object obj2 = c4256812.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c4256812.label) {
            case 0:
                ResultKt.throwOnFailure(obj2);
                CollectBankAccountContract.Args args = this.args;
                if (args instanceof CollectBankAccountContract.Args.ForDeferredPaymentIntent) {
                    CreateFinancialConnectionsSession createFinancialConnectionsSession = this.createFinancialConnectionsSession;
                    String publishableKey = args.getPublishableKey();
                    String stripeAccountId = this.args.getStripeAccountId();
                    String hostedSurface = this.args.getHostedSurface();
                    String elementsSessionId = ((CollectBankAccountContract.Args.ForDeferredPaymentIntent) this.args).getElementsSessionId();
                    String customerId = ((CollectBankAccountContract.Args.ForDeferredPaymentIntent) this.args).getCustomerId();
                    String onBehalfOf = ((CollectBankAccountContract.Args.ForDeferredPaymentIntent) this.args).getOnBehalfOf();
                    Integer amount = ((CollectBankAccountContract.Args.ForDeferredPaymentIntent) this.args).getAmount();
                    String currency = ((CollectBankAccountContract.Args.ForDeferredPaymentIntent) this.args).getCurrency();
                    c4256812.L$0 = this;
                    c4256812.label = 1;
                    objM26923forSetupIntenthUnOzRk = createFinancialConnectionsSession.m26921forDeferredPaymentstZkwj4A(publishableKey, stripeAccountId, elementsSessionId, customerId, onBehalfOf, hostedSurface, amount, currency, c4256812);
                    c4256812 = c4256812;
                    break;
                } else if (args instanceof CollectBankAccountContract.Args.ForDeferredSetupIntent) {
                    CreateFinancialConnectionsSession createFinancialConnectionsSession2 = this.createFinancialConnectionsSession;
                    String publishableKey2 = args.getPublishableKey();
                    String stripeAccountId2 = this.args.getStripeAccountId();
                    String hostedSurface2 = this.args.getHostedSurface();
                    String elementsSessionId2 = ((CollectBankAccountContract.Args.ForDeferredSetupIntent) this.args).getElementsSessionId();
                    String customerId2 = ((CollectBankAccountContract.Args.ForDeferredSetupIntent) this.args).getCustomerId();
                    String onBehalfOf2 = ((CollectBankAccountContract.Args.ForDeferredSetupIntent) this.args).getOnBehalfOf();
                    c4256812.L$0 = this;
                    c4256812.label = 2;
                    objM26923forSetupIntenthUnOzRk = createFinancialConnectionsSession2.m26921forDeferredPaymentstZkwj4A(publishableKey2, stripeAccountId2, elementsSessionId2, customerId2, onBehalfOf2, hostedSurface2, null, null, c4256812);
                    c4256812 = c4256812;
                    break;
                } else if (args instanceof CollectBankAccountContract.Args.ForPaymentIntent) {
                    CreateFinancialConnectionsSession createFinancialConnectionsSession3 = this.createFinancialConnectionsSession;
                    String publishableKey3 = args.getPublishableKey();
                    String stripeAccountId3 = this.args.getStripeAccountId();
                    String hostedSurface3 = this.args.getHostedSurface();
                    String clientSecret2 = ((CollectBankAccountContract.Args.ForPaymentIntent) this.args).getClientSecret();
                    CollectBankAccountLauncher configuration = this.args.getConfiguration();
                    c4256812.L$0 = this;
                    c4256812.label = 3;
                    objM26923forSetupIntenthUnOzRk = createFinancialConnectionsSession3.m26922forPaymentIntenthUnOzRk(publishableKey3, clientSecret2, stripeAccountId3, hostedSurface3, configuration, c4256812);
                    break;
                } else if (args instanceof CollectBankAccountContract.Args.ForSetupIntent) {
                    CreateFinancialConnectionsSession createFinancialConnectionsSession4 = this.createFinancialConnectionsSession;
                    String publishableKey4 = args.getPublishableKey();
                    String stripeAccountId4 = this.args.getStripeAccountId();
                    String hostedSurface4 = this.args.getHostedSurface();
                    String clientSecret3 = ((CollectBankAccountContract.Args.ForSetupIntent) this.args).getClientSecret();
                    CollectBankAccountLauncher configuration2 = this.args.getConfiguration();
                    c4256812.L$0 = this;
                    c4256812.label = 4;
                    objM26923forSetupIntenthUnOzRk = createFinancialConnectionsSession4.m26923forSetupIntenthUnOzRk(publishableKey4, clientSecret3, stripeAccountId4, hostedSurface4, configuration2, c4256812);
                    break;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                collectBankAccountViewModel = collectBankAccountViewModel;
                if (Result.m28556isSuccessimpl(objM26923forSetupIntenthUnOzRk)) {
                    try {
                        clientSecret = ((FinancialConnectionsSession) objM26923forSetupIntenthUnOzRk).getClientSecret();
                    } catch (Throwable th) {
                        Result.Companion companion = Result.INSTANCE;
                        objM26923forSetupIntenthUnOzRk = ResultKt.createFailure(th);
                    }
                    if (clientSecret == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    objM28550constructorimpl = Result.m28550constructorimpl(clientSecret);
                    obj = objM28550constructorimpl;
                    if (Result.m28556isSuccessimpl(obj)) {
                        String str = (String) obj;
                        collectBankAccountViewModel.logger.debug("Bank account session created! " + str + ".");
                        collectBankAccountViewModel.setHasLaunched(true);
                        SharedFlow2<CollectBankAccountViewEffect> sharedFlow2 = collectBankAccountViewModel._viewEffect;
                        CollectBankAccountViewEffect.OpenConnectionsFlow openConnectionsFlow = new CollectBankAccountViewEffect.OpenConnectionsFlow(collectBankAccountViewModel.args.getPublishableKey(), str, collectBankAccountViewModel.args.getStripeAccountId());
                        c4256812.L$0 = collectBankAccountViewModel;
                        c4256812.L$1 = obj;
                        c4256812.label = 5;
                        if (sharedFlow2.emit(openConnectionsFlow, c4256812) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(obj);
                    if (thM28553exceptionOrNullimpl != null) {
                        c4256812.L$0 = obj;
                        c4256812.L$1 = null;
                        c4256812.label = 6;
                        break;
                    }
                    return Unit.INSTANCE;
                }
                objM28550constructorimpl = Result.m28550constructorimpl(objM26923forSetupIntenthUnOzRk);
                obj = objM28550constructorimpl;
                if (Result.m28556isSuccessimpl(obj)) {
                }
                thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(obj);
                if (thM28553exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 1:
            case 2:
            case 3:
            case 4:
                CollectBankAccountViewModel collectBankAccountViewModel2 = (CollectBankAccountViewModel) c4256812.L$0;
                ResultKt.throwOnFailure(obj2);
                objM26923forSetupIntenthUnOzRk = ((Result) obj2).getValue();
                collectBankAccountViewModel = collectBankAccountViewModel2;
                if (Result.m28556isSuccessimpl(objM26923forSetupIntenthUnOzRk)) {
                }
                objM28550constructorimpl = Result.m28550constructorimpl(objM26923forSetupIntenthUnOzRk);
                obj = objM28550constructorimpl;
                if (Result.m28556isSuccessimpl(obj)) {
                }
                thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(obj);
                if (thM28553exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 5:
                obj = c4256812.L$1;
                collectBankAccountViewModel = (CollectBankAccountViewModel) c4256812.L$0;
                ResultKt.throwOnFailure(obj2);
                thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(obj);
                if (thM28553exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 6:
                ResultKt.throwOnFailure(obj2);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: CollectBankAccountViewModel.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$onConnectionsForACHResult$1", m3645f = "CollectBankAccountViewModel.kt", m3646l = {123, 125}, m3647m = "invokeSuspend")
    /* renamed from: com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$onConnectionsForACHResult$1 */
    static final class C425721 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FinancialConnectionsSheetResult $result;
        int label;
        final /* synthetic */ CollectBankAccountViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C425721(FinancialConnectionsSheetResult financialConnectionsSheetResult, CollectBankAccountViewModel collectBankAccountViewModel, Continuation<? super C425721> continuation) {
            super(2, continuation);
            this.$result = financialConnectionsSheetResult;
            this.this$0 = collectBankAccountViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C425721(this.$result, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C425721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
        
            if (r5.finishWithResult(r1, r4) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
        
            if (r1.finishWithError(r5, r4) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FinancialConnectionsSheetResult.Failed failed = this.$result;
                if (failed instanceof FinancialConnectionsSheetResult.Canceled) {
                    CollectBankAccountViewModel collectBankAccountViewModel = this.this$0;
                    CollectBankAccountResultInternal.Cancelled cancelled = CollectBankAccountResultInternal.Cancelled.INSTANCE;
                    this.label = 1;
                } else if (failed instanceof FinancialConnectionsSheetResult.Failed) {
                    CollectBankAccountViewModel collectBankAccountViewModel2 = this.this$0;
                    Throwable error = failed.getError();
                    this.label = 2;
                } else if (failed instanceof FinancialConnectionsSheetResult.Completed) {
                    if (this.this$0.args.getAttachToIntent()) {
                        this.this$0.attachSessionToIntent(this.$result.getFinancialConnectionsSession());
                    } else {
                        this.this$0.finishWithSession(this.$result.getFinancialConnectionsSession());
                    }
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void onConnectionsForACHResult(FinancialConnectionsSheetResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        setHasLaunched(false);
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C425721(result, this, null), 3, null);
    }

    /* compiled from: CollectBankAccountViewModel.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$onConnectionsForInstantDebitsResult$1", m3645f = "CollectBankAccountViewModel.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$onConnectionsForInstantDebitsResult$1 */
    static final class C425731 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FinancialConnectionsSheetInstantDebitsResult $result;
        int label;
        final /* synthetic */ CollectBankAccountViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C425731(FinancialConnectionsSheetInstantDebitsResult financialConnectionsSheetInstantDebitsResult, CollectBankAccountViewModel collectBankAccountViewModel, Continuation<? super C425731> continuation) {
            super(2, continuation);
            this.$result = financialConnectionsSheetInstantDebitsResult;
            this.this$0 = collectBankAccountViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C425731(this.$result, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C425731) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
        
            if (r5.finishWithResult(r1, r4) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
        
            if (r1.finishWithError(r5, r4) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FinancialConnectionsSheetInstantDebitsResult.Failed failed = this.$result;
                if (failed instanceof FinancialConnectionsSheetInstantDebitsResult.Canceled) {
                    CollectBankAccountViewModel collectBankAccountViewModel = this.this$0;
                    CollectBankAccountResultInternal.Cancelled cancelled = CollectBankAccountResultInternal.Cancelled.INSTANCE;
                    this.label = 1;
                } else if (failed instanceof FinancialConnectionsSheetInstantDebitsResult.Failed) {
                    CollectBankAccountViewModel collectBankAccountViewModel2 = this.this$0;
                    Throwable error = failed.getError();
                    this.label = 2;
                } else if (failed instanceof FinancialConnectionsSheetInstantDebitsResult.Completed) {
                    this.this$0.finishWithPaymentMethodId((FinancialConnectionsSheetInstantDebitsResult.Completed) failed);
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void onConnectionsForInstantDebitsResult(FinancialConnectionsSheetInstantDebitsResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        setHasLaunched(false);
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C425731(result, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object finishWithResult(CollectBankAccountResultInternal collectBankAccountResultInternal, Continuation<? super Unit> continuation) {
        Object objEmit = this._viewEffect.emit(new CollectBankAccountViewEffect.FinishWithResult(collectBankAccountResultInternal), continuation);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithSession(final com.stripe.android.financialconnections.model.FinancialConnectionsSession financialConnectionsSession) {
        finishWithRefreshedIntent(new Function1<StripeIntent, CollectBankAccountResponseInternal>() { // from class: com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel.finishWithSession.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final CollectBankAccountResponseInternal invoke(StripeIntent stripeIntent) {
                return new CollectBankAccountResponseInternal(stripeIntent, new CollectBankAccountResponseInternal.USBankAccountData(financialConnectionsSession), null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithPaymentMethodId(final FinancialConnectionsSheetInstantDebitsResult.Completed result) {
        finishWithRefreshedIntent(new Function1<StripeIntent, CollectBankAccountResponseInternal>() { // from class: com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel.finishWithPaymentMethodId.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final CollectBankAccountResponseInternal invoke(StripeIntent stripeIntent) {
                return new CollectBankAccountResponseInternal(stripeIntent, null, new CollectBankAccountResponseInternal.InstantDebitsData(result.getPaymentMethodId(), result.getLast4(), result.getBankName()));
            }
        });
    }

    /* compiled from: CollectBankAccountViewModel.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$finishWithRefreshedIntent$1", m3645f = "CollectBankAccountViewModel.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, 200, EnumC7081g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$finishWithRefreshedIntent$1 */
    static final class C425701 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<StripeIntent, CollectBankAccountResponseInternal> $action;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C425701(Function1<? super StripeIntent, CollectBankAccountResponseInternal> function1, Continuation<? super C425701> continuation) {
            super(2, continuation);
            this.$action = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CollectBankAccountViewModel.this.new C425701(this.$action, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C425701) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:
        
            if (r3.finishWithResult(r4, r6) == r0) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objM26924invoke0E7RQCE;
            Object obj2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String clientSecret = CollectBankAccountViewModel.this.args.getClientSecret();
                if (clientSecret != null) {
                    RetrieveStripeIntent retrieveStripeIntent = CollectBankAccountViewModel.this.retrieveStripeIntent;
                    String publishableKey = CollectBankAccountViewModel.this.args.getPublishableKey();
                    this.label = 1;
                    objM26924invoke0E7RQCE = retrieveStripeIntent.m26924invoke0E7RQCE(publishableKey, clientSecret, this);
                    if (objM26924invoke0E7RQCE != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                objM26924invoke0E7RQCE = Result.m28550constructorimpl(null);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    obj2 = this.L$0;
                    ResultKt.throwOnFailure(obj);
                    Function1<StripeIntent, CollectBankAccountResponseInternal> function1 = this.$action;
                    CollectBankAccountViewModel collectBankAccountViewModel = CollectBankAccountViewModel.this;
                    if (Result.m28556isSuccessimpl(obj2)) {
                        CollectBankAccountResultInternal.Completed completed = new CollectBankAccountResultInternal.Completed(function1.invoke((StripeIntent) obj2));
                        this.L$0 = obj2;
                        this.label = 3;
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                objM26924invoke0E7RQCE = ((Result) obj).getValue();
            }
            obj2 = objM26924invoke0E7RQCE;
            CollectBankAccountViewModel collectBankAccountViewModel2 = CollectBankAccountViewModel.this;
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(obj2);
            if (thM28553exceptionOrNullimpl != null) {
                this.L$0 = obj2;
                this.label = 2;
                if (collectBankAccountViewModel2.finishWithError(thM28553exceptionOrNullimpl, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            Function1<StripeIntent, CollectBankAccountResponseInternal> function12 = this.$action;
            CollectBankAccountViewModel collectBankAccountViewModel3 = CollectBankAccountViewModel.this;
            if (Result.m28556isSuccessimpl(obj2)) {
            }
            return Unit.INSTANCE;
        }
    }

    private final void finishWithRefreshedIntent(Function1<? super StripeIntent, CollectBankAccountResponseInternal> action) {
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C425701(action, null), 3, null);
    }

    /* compiled from: CollectBankAccountViewModel.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$attachSessionToIntent$1", m3645f = "CollectBankAccountViewModel.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, 224, EnumC7081g.f2778x3356acf6, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$attachSessionToIntent$1 */
    static final class C425671 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ com.stripe.android.financialconnections.model.FinancialConnectionsSession $financialConnectionsSession;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C425671(com.stripe.android.financialconnections.model.FinancialConnectionsSession financialConnectionsSession, Continuation<? super C425671> continuation) {
            super(2, continuation);
            this.$financialConnectionsSession = financialConnectionsSession;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CollectBankAccountViewModel.this.new C425671(this.$financialConnectionsSession, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C425671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x011e, code lost:
        
            if (r13.finishWithError(r3, r12) == r1) goto L45;
         */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00f7  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0116  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C425671 c425671;
            Object objM26920forSetupIntentyxL6bBk;
            Object objM28550constructorimpl;
            Object obj2;
            Throwable thM28553exceptionOrNullimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CollectBankAccountContract.Args args = CollectBankAccountViewModel.this.args;
                if (args instanceof CollectBankAccountContract.Args.ForDeferredPaymentIntent ? true : args instanceof CollectBankAccountContract.Args.ForDeferredSetupIntent) {
                    throw new IllegalStateException("Attach requires client secret");
                }
                if (args instanceof CollectBankAccountContract.Args.ForPaymentIntent) {
                    AttachFinancialConnectionsSession attachFinancialConnectionsSession = CollectBankAccountViewModel.this.attachFinancialConnectionsSession;
                    String publishableKey = CollectBankAccountViewModel.this.args.getPublishableKey();
                    String stripeAccountId = CollectBankAccountViewModel.this.args.getStripeAccountId();
                    String clientSecret = ((CollectBankAccountContract.Args.ForPaymentIntent) CollectBankAccountViewModel.this.args).getClientSecret();
                    String id = this.$financialConnectionsSession.getId();
                    this.label = 1;
                    objM26920forSetupIntentyxL6bBk = attachFinancialConnectionsSession.m26919forPaymentIntentyxL6bBk(publishableKey, id, clientSecret, stripeAccountId, this);
                    c425671 = this;
                    if (objM26920forSetupIntentyxL6bBk != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                c425671 = this;
                if (args instanceof CollectBankAccountContract.Args.ForSetupIntent) {
                    AttachFinancialConnectionsSession attachFinancialConnectionsSession2 = CollectBankAccountViewModel.this.attachFinancialConnectionsSession;
                    String publishableKey2 = CollectBankAccountViewModel.this.args.getPublishableKey();
                    String stripeAccountId2 = CollectBankAccountViewModel.this.args.getStripeAccountId();
                    String clientSecret2 = ((CollectBankAccountContract.Args.ForSetupIntent) CollectBankAccountViewModel.this.args).getClientSecret();
                    String id2 = c425671.$financialConnectionsSession.getId();
                    c425671.label = 2;
                    objM26920forSetupIntentyxL6bBk = attachFinancialConnectionsSession2.m26920forSetupIntentyxL6bBk(publishableKey2, id2, clientSecret2, stripeAccountId2, c425671);
                    if (objM26920forSetupIntentyxL6bBk != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                throw new NoWhenBranchMatchedException();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                obj2 = this.L$0;
                ResultKt.throwOnFailure(obj);
                c425671 = this;
                CollectBankAccountViewModel collectBankAccountViewModel = CollectBankAccountViewModel.this;
                thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(obj2);
                if (thM28553exceptionOrNullimpl != null) {
                    c425671.L$0 = obj2;
                    c425671.label = 4;
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            objM26920forSetupIntentyxL6bBk = ((Result) obj).getValue();
            c425671 = this;
            com.stripe.android.financialconnections.model.FinancialConnectionsSession financialConnectionsSession = c425671.$financialConnectionsSession;
            if (Result.m28556isSuccessimpl(objM26920forSetupIntentyxL6bBk)) {
                try {
                    objM28550constructorimpl = Result.m28550constructorimpl(new CollectBankAccountResultInternal.Completed(new CollectBankAccountResponseInternal((StripeIntent) objM26920forSetupIntentyxL6bBk, new CollectBankAccountResponseInternal.USBankAccountData(financialConnectionsSession), null)));
                } catch (Throwable th) {
                    Result.Companion companion = Result.INSTANCE;
                    objM26920forSetupIntentyxL6bBk = ResultKt.createFailure(th);
                }
                obj2 = objM28550constructorimpl;
                CollectBankAccountViewModel collectBankAccountViewModel2 = CollectBankAccountViewModel.this;
                if (Result.m28556isSuccessimpl(obj2)) {
                    collectBankAccountViewModel2.logger.debug("Bank account session attached to intent!!");
                    c425671.L$0 = obj2;
                    c425671.label = 3;
                    if (collectBankAccountViewModel2.finishWithResult((CollectBankAccountResultInternal.Completed) obj2, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                CollectBankAccountViewModel collectBankAccountViewModel3 = CollectBankAccountViewModel.this;
                thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(obj2);
                if (thM28553exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            }
            objM28550constructorimpl = Result.m28550constructorimpl(objM26920forSetupIntentyxL6bBk);
            obj2 = objM28550constructorimpl;
            CollectBankAccountViewModel collectBankAccountViewModel22 = CollectBankAccountViewModel.this;
            if (Result.m28556isSuccessimpl(obj2)) {
            }
            CollectBankAccountViewModel collectBankAccountViewModel32 = CollectBankAccountViewModel.this;
            thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(obj2);
            if (thM28553exceptionOrNullimpl != null) {
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void attachSessionToIntent(com.stripe.android.financialconnections.model.FinancialConnectionsSession financialConnectionsSession) {
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C425671(financialConnectionsSession, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object finishWithError(Throwable th, Continuation<? super Unit> continuation) {
        this.logger.error("Error", new Exception(th));
        Object objFinishWithResult = finishWithResult(new CollectBankAccountResultInternal.Failed(th), continuation);
        return objFinishWithResult == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objFinishWithResult : Unit.INSTANCE;
    }

    /* compiled from: CollectBankAccountViewModel.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J-\u0010\u0006\u001a\u0002H\u0007\"\b\b\u0000\u0010\u0007*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¢\u0006\u0002\u0010\rR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "argsSupplier", "Lkotlin/Function0;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;", "(Lkotlin/jvm/functions/Function0;)V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Factory implements ViewModelProvider.Factory {
        private final Function0<CollectBankAccountContract.Args> argsSupplier;

        /* JADX WARN: Multi-variable type inference failed */
        public Factory(Function0<? extends CollectBankAccountContract.Args> argsSupplier) {
            Intrinsics.checkNotNullParameter(argsSupplier, "argsSupplier");
            this.argsSupplier = argsSupplier;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            CollectBankAccountViewModel viewModel = DaggerCollectBankAccountComponent.builder().savedStateHandle(SavedStateHandleSupport.createSavedStateHandle(extras)).application(CreationExtrasKtx.requireApplication(extras)).viewEffect(SharedFlow4.MutableSharedFlow$default(0, 0, null, 7, null)).configuration(this.argsSupplier.invoke()).build().getViewModel();
            Intrinsics.checkNotNull(viewModel, "null cannot be cast to non-null type T of com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel.Factory.create");
            return viewModel;
        }
    }
}
