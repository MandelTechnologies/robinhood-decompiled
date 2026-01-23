package com.robinhood.android.lib.trade.suitability;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.common.p088ui.BaseDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.trade.C20649R;
import com.robinhood.android.lib.trade.databinding.FragmentAccountSwitcherSuitabilityDialogBinding;
import com.robinhood.android.lib.trade.suitability.AccountSwitcherSuitabilityDialogFragment;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.models.p320db.Account;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.questionnaire.contracts.Questionnaire;
import com.robinhood.store.base.SuitabilityStore;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import dispatch.core.Launch;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
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
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: AccountSwitcherSuitabilityDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 /2\u00020\u0001:\u0002./B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0016J\u001a\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00180\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b\"\u0010#¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/suitability/AccountSwitcherSuitabilityDialogFragment;", "Lcom/robinhood/android/common/ui/BaseDialogFragment;", "<init>", "()V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "getAccountProvider", "()Lcom/robinhood/android/lib/account/AccountProvider;", "setAccountProvider", "(Lcom/robinhood/android/lib/account/AccountProvider;)V", "suitabilityStore", "Lcom/robinhood/store/base/SuitabilityStore;", "getSuitabilityStore", "()Lcom/robinhood/store/base/SuitabilityStore;", "setSuitabilityStore", "(Lcom/robinhood/store/base/SuitabilityStore;)V", "forceSuitabilityLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "binding", "Lcom/robinhood/android/lib/trade/databinding/FragmentAccountSwitcherSuitabilityDialogBinding;", "getBinding", "()Lcom/robinhood/android/lib/trade/databinding/FragmentAccountSwitcherSuitabilityDialogBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/lib/trade/suitability/AccountSwitcherSuitabilityDialogFragmentCallbacks;", "getCallbacks", "()Lcom/robinhood/android/lib/trade/suitability/AccountSwitcherSuitabilityDialogFragmentCallbacks;", "callbacks$delegate", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Args", "Companion", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class AccountSwitcherSuitabilityDialogFragment extends BaseDialogFragment {
    public AccountProvider accountProvider;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private final ActivityResultLauncher<Intent> forceSuitabilityLauncher;
    public Navigator navigator;
    public SuitabilityStore suitabilityStore;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AccountSwitcherSuitabilityDialogFragment.class, "binding", "getBinding()Lcom/robinhood/android/lib/trade/databinding/FragmentAccountSwitcherSuitabilityDialogBinding;", 0)), Reflection.property1(new PropertyReference1Impl(AccountSwitcherSuitabilityDialogFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/lib/trade/suitability/AccountSwitcherSuitabilityDialogFragmentCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public AccountSwitcherSuitabilityDialogFragment() {
        super(C20649R.layout.fragment_account_switcher_suitability_dialog);
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.lib.trade.suitability.AccountSwitcherSuitabilityDialogFragment$forceSuitabilityLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.getResultCode() == -1) {
                    this.this$0.getCallbacks().onSuitabilityQuestionnaireCompletedForAccount(((AccountSwitcherSuitabilityDialogFragment.Args) AccountSwitcherSuitabilityDialogFragment.INSTANCE.getArgs((Fragment) this.this$0)).getAccountNumber());
                    this.this$0.dismiss();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.forceSuitabilityLauncher = activityResultLauncherRegisterForActivityResult;
        this.binding = ViewBinding5.viewBinding(this, AccountSwitcherSuitabilityDialogFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(AccountSwitcherSuitabilityDialogFragmentCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.lib.trade.suitability.AccountSwitcherSuitabilityDialogFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
    }

    public final Navigator getNavigator() {
        Navigator navigator = this.navigator;
        if (navigator != null) {
            return navigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void setNavigator(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "<set-?>");
        this.navigator = navigator;
    }

    public final AccountProvider getAccountProvider() {
        AccountProvider accountProvider = this.accountProvider;
        if (accountProvider != null) {
            return accountProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountProvider");
        return null;
    }

    public final void setAccountProvider(AccountProvider accountProvider) {
        Intrinsics.checkNotNullParameter(accountProvider, "<set-?>");
        this.accountProvider = accountProvider;
    }

    public final SuitabilityStore getSuitabilityStore() {
        SuitabilityStore suitabilityStore = this.suitabilityStore;
        if (suitabilityStore != null) {
            return suitabilityStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("suitabilityStore");
        return null;
    }

    public final void setSuitabilityStore(SuitabilityStore suitabilityStore) {
        Intrinsics.checkNotNullParameter(suitabilityStore, "<set-?>");
        this.suitabilityStore = suitabilityStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentAccountSwitcherSuitabilityDialogBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentAccountSwitcherSuitabilityDialogBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AccountSwitcherSuitabilityDialogFragmentCallbacks getCallbacks() {
        return (AccountSwitcherSuitabilityDialogFragmentCallbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getLifecycleScope().launchWhenCreated(new C206621(null));
    }

    /* compiled from: AccountSwitcherSuitabilityDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.trade.suitability.AccountSwitcherSuitabilityDialogFragment$onViewCreated$1", m3645f = "AccountSwitcherSuitabilityDialogFragment.kt", m3646l = {60, 64}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.lib.trade.suitability.AccountSwitcherSuitabilityDialogFragment$onViewCreated$1 */
    static final class C206621 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C206621(Continuation<? super C206621> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C206621 c206621 = AccountSwitcherSuitabilityDialogFragment.this.new C206621(continuation);
            c206621.L$0 = obj;
            return c206621;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C206621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0083, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(r2, r4, r7) == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                SuitabilityStore suitabilityStore = AccountSwitcherSuitabilityDialogFragment.this.getSuitabilityStore();
                String accountNumber = ((Args) AccountSwitcherSuitabilityDialogFragment.INSTANCE.getArgs((Fragment) AccountSwitcherSuitabilityDialogFragment.this)).getAccountNumber();
                this.L$0 = coroutineScope;
                this.label = 1;
                obj = suitabilityStore.getSuitabilityQuestionnaireContext(accountNumber, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            String str = (String) obj;
            if (str != null) {
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(AccountSwitcherSuitabilityDialogFragment.this.getAccountProvider().streamAccount(((Args) AccountSwitcherSuitabilityDialogFragment.INSTANCE.getArgs((Fragment) AccountSwitcherSuitabilityDialogFragment.this)).getAccountNumber())), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(coroutineScope, AccountSwitcherSuitabilityDialogFragment.this, str, null);
                this.L$0 = null;
                this.label = 2;
            } else {
                return Unit.INSTANCE;
            }
        }

        /* compiled from: AccountSwitcherSuitabilityDialogFragment.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "account", "Lcom/robinhood/models/db/Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.lib.trade.suitability.AccountSwitcherSuitabilityDialogFragment$onViewCreated$1$1", m3645f = "AccountSwitcherSuitabilityDialogFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.lib.trade.suitability.AccountSwitcherSuitabilityDialogFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Account, Continuation<? super Unit>, Object> {
            final /* synthetic */ CoroutineScope $$this$launchWhenCreated;
            final /* synthetic */ String $questionnaireContext;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AccountSwitcherSuitabilityDialogFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CoroutineScope coroutineScope, AccountSwitcherSuitabilityDialogFragment accountSwitcherSuitabilityDialogFragment, String str, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$$this$launchWhenCreated = coroutineScope;
                this.this$0 = accountSwitcherSuitabilityDialogFragment;
                this.$questionnaireContext = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$launchWhenCreated, this.this$0, this.$questionnaireContext, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Account account, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(account, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: AccountSwitcherSuitabilityDialogFragment.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.lib.trade.suitability.AccountSwitcherSuitabilityDialogFragment$onViewCreated$1$1$1", m3645f = "AccountSwitcherSuitabilityDialogFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.lib.trade.suitability.AccountSwitcherSuitabilityDialogFragment$onViewCreated$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C502641 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Account $account;
                final /* synthetic */ String $questionnaireContext;
                int label;
                final /* synthetic */ AccountSwitcherSuitabilityDialogFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C502641(AccountSwitcherSuitabilityDialogFragment accountSwitcherSuitabilityDialogFragment, Account account, String str, Continuation<? super C502641> continuation) {
                    super(2, continuation);
                    this.this$0 = accountSwitcherSuitabilityDialogFragment;
                    this.$account = account;
                    this.$questionnaireContext = str;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C502641(this.this$0, this.$account, this.$questionnaireContext, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C502641) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        RhTextView rhTextView = this.this$0.getBinding().title;
                        AccountSwitcherSuitabilityDialogFragment accountSwitcherSuitabilityDialogFragment = this.this$0;
                        int i = C20649R.string.account_switcher_suitability_dialog_title;
                        StringResource inSentence = AccountDisplayNames.getDisplayName(this.$account).getWithAccount().getInSentence();
                        Resources resources = this.this$0.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                        rhTextView.setText(accountSwitcherSuitabilityDialogFragment.getString(i, inSentence.getText(resources)));
                        RdsButton completeSuitabilityCta = this.this$0.getBinding().completeSuitabilityCta;
                        Intrinsics.checkNotNullExpressionValue(completeSuitabilityCta, "completeSuitabilityCta");
                        final AccountSwitcherSuitabilityDialogFragment accountSwitcherSuitabilityDialogFragment2 = this.this$0;
                        final String str = this.$questionnaireContext;
                        OnClickListeners.onClick(completeSuitabilityCta, new Function0() { // from class: com.robinhood.android.lib.trade.suitability.AccountSwitcherSuitabilityDialogFragment$onViewCreated$1$1$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AccountSwitcherSuitabilityDialogFragment.C206621.AnonymousClass1.C502641.invokeSuspend$lambda$0(accountSwitcherSuitabilityDialogFragment2, str);
                            }
                        });
                        RdsButton dismissCta = this.this$0.getBinding().dismissCta;
                        Intrinsics.checkNotNullExpressionValue(dismissCta, "dismissCta");
                        final AccountSwitcherSuitabilityDialogFragment accountSwitcherSuitabilityDialogFragment3 = this.this$0;
                        OnClickListeners.onClick(dismissCta, new Function0() { // from class: com.robinhood.android.lib.trade.suitability.AccountSwitcherSuitabilityDialogFragment$onViewCreated$1$1$1$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AccountSwitcherSuitabilityDialogFragment.C206621.AnonymousClass1.C502641.invokeSuspend$lambda$1(accountSwitcherSuitabilityDialogFragment3);
                            }
                        });
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invokeSuspend$lambda$0(AccountSwitcherSuitabilityDialogFragment accountSwitcherSuitabilityDialogFragment, String str) {
                    ActivityResultLauncher activityResultLauncher = accountSwitcherSuitabilityDialogFragment.forceSuitabilityLauncher;
                    Navigator navigator = accountSwitcherSuitabilityDialogFragment.getNavigator();
                    Context contextRequireContext = accountSwitcherSuitabilityDialogFragment.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    activityResultLauncher.launch(Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, new Questionnaire(true, str, ((Args) AccountSwitcherSuitabilityDialogFragment.INSTANCE.getArgs((Fragment) accountSwitcherSuitabilityDialogFragment)).getAccountNumber(), null, null, null, false, false, false, false, false, null, null, false, false, false, false, false, null, null, 1048568, null), null, false, 12, null));
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invokeSuspend$lambda$1(AccountSwitcherSuitabilityDialogFragment accountSwitcherSuitabilityDialogFragment) {
                    accountSwitcherSuitabilityDialogFragment.dismiss();
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Launch.launchMain$default(this.$$this$launchWhenCreated, null, null, new C502641(this.this$0, (Account) this.L$0, this.$questionnaireContext, null), 3, null);
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: AccountSwitcherSuitabilityDialogFragment.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/suitability/AccountSwitcherSuitabilityDialogFragment$Args;", "Landroid/os/Parcelable;", "accountNumber", "", "<init>", "(Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;

        /* compiled from: AccountSwitcherSuitabilityDialogFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.accountNumber;
            }
            return args.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final Args copy(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new Args(accountNumber);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.accountNumber, ((Args) other).accountNumber);
        }

        public int hashCode() {
            return this.accountNumber.hashCode();
        }

        public String toString() {
            return "Args(accountNumber=" + this.accountNumber + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
        }

        public Args(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: AccountSwitcherSuitabilityDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/suitability/AccountSwitcherSuitabilityDialogFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/lib/trade/suitability/AccountSwitcherSuitabilityDialogFragment;", "Lcom/robinhood/android/lib/trade/suitability/AccountSwitcherSuitabilityDialogFragment$Args;", "<init>", "()V", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<AccountSwitcherSuitabilityDialogFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(AccountSwitcherSuitabilityDialogFragment accountSwitcherSuitabilityDialogFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, accountSwitcherSuitabilityDialogFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AccountSwitcherSuitabilityDialogFragment newInstance(Args args) {
            return (AccountSwitcherSuitabilityDialogFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AccountSwitcherSuitabilityDialogFragment accountSwitcherSuitabilityDialogFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, accountSwitcherSuitabilityDialogFragment, args);
        }
    }
}
