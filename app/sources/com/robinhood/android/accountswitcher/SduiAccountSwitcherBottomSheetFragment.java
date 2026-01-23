package com.robinhood.android.accountswitcher;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.view.result.ActivityResultCaller;
import com.robinhood.android.lib.accountswitcher.sdui.SduiAccountSwitcher;
import com.robinhood.android.lib.accountswitcher.sdui.SduiAccountSwitcher2;
import com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks;
import com.robinhood.shared.account.contracts.switcher.SduiAccountSwitcherBottomSheetFragmentKey;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import contracts.account_switcher.proto.p427v1.SurfaceDto;
import java.util.NoSuchElementException;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SduiAccountSwitcherBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\n\u001a\u00020\u000bH\u0017¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000bH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/accountswitcher/SduiAccountSwitcherBottomSheetFragment;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherCallbacks;", "getCallbacks", "()Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherCallbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "safeDismiss", "Companion", "feature-account-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class SduiAccountSwitcherBottomSheetFragment extends GenericComposeBottomSheetDialogFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(AccountSwitcherCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.accountswitcher.SduiAccountSwitcherBottomSheetFragment$special$$inlined$parentFragmentThenActivityHostCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            ActivityResultCaller parentFragment = CallbacksProperty.getParentFragment();
            if (!(parentFragment instanceof AccountSwitcherCallbacks)) {
                parentFragment = null;
            }
            AccountSwitcherCallbacks accountSwitcherCallbacks = (AccountSwitcherCallbacks) parentFragment;
            if (accountSwitcherCallbacks != null) {
                return accountSwitcherCallbacks;
            }
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof AccountSwitcherCallbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SduiAccountSwitcherBottomSheetFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(SduiAccountSwitcherBottomSheetFragment sduiAccountSwitcherBottomSheetFragment, int i, Composer composer, int i2) {
        sduiAccountSwitcherBottomSheetFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AccountSwitcherCallbacks getCallbacks() {
        return (AccountSwitcherCallbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(750365195);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(750365195, i2, -1, "com.robinhood.android.accountswitcher.SduiAccountSwitcherBottomSheetFragment.ComposeContent (SduiAccountSwitcherBottomSheetFragment.kt:22)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-2062331565, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.accountswitcher.SduiAccountSwitcherBottomSheetFragment.ComposeContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2062331565, i3, -1, "com.robinhood.android.accountswitcher.SduiAccountSwitcherBottomSheetFragment.ComposeContent.<anonymous> (SduiAccountSwitcherBottomSheetFragment.kt:24)");
                    }
                    SurfaceDto surface = ((SduiAccountSwitcherBottomSheetFragmentKey) SduiAccountSwitcherBottomSheetFragment.INSTANCE.getArgs((Fragment) SduiAccountSwitcherBottomSheetFragment.this)).getSurface();
                    final SduiAccountSwitcherBottomSheetFragment sduiAccountSwitcherBottomSheetFragment = SduiAccountSwitcherBottomSheetFragment.this;
                    SduiAccountSwitcher2.SduiAccountSwitcher(surface, new SduiAccountSwitcher() { // from class: com.robinhood.android.accountswitcher.SduiAccountSwitcherBottomSheetFragment.ComposeContent.1.1
                        @Override // com.robinhood.android.lib.accountswitcher.sdui.SduiAccountSwitcher
                        public void onDismiss() {
                            sduiAccountSwitcherBottomSheetFragment.safeDismiss();
                        }

                        @Override // com.robinhood.android.lib.accountswitcher.sdui.SduiAccountSwitcher
                        public void onAccountSelected(String accountNumber, BrokerageAccountType brokerageAccountType) {
                            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
                            sduiAccountSwitcherBottomSheetFragment.getCallbacks().onAccountSelected(accountNumber, brokerageAccountType);
                            sduiAccountSwitcherBottomSheetFragment.safeDismiss();
                        }

                        @Override // com.robinhood.android.lib.accountswitcher.sdui.SduiAccountSwitcher
                        public void onShowAllAccounts() {
                            sduiAccountSwitcherBottomSheetFragment.getCallbacks().onAllAccountsSelected();
                            sduiAccountSwitcherBottomSheetFragment.safeDismiss();
                        }

                        @Override // com.robinhood.android.lib.accountswitcher.sdui.SduiAccountSwitcher
                        public void onRefresh() {
                            sduiAccountSwitcherBottomSheetFragment.getCallbacks().onRefreshAccountsClicked();
                            sduiAccountSwitcherBottomSheetFragment.safeDismiss();
                        }

                        @Override // com.robinhood.android.lib.accountswitcher.sdui.SduiAccountSwitcher
                        public void onDeeplink(String url) {
                            Intrinsics.checkNotNullParameter(url, "url");
                            Navigator navigator = sduiAccountSwitcherBottomSheetFragment.getNavigator();
                            Context contextRequireContext = sduiAccountSwitcherBottomSheetFragment.requireContext();
                            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                            Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(url), null, null, false, null, 60, null);
                            sduiAccountSwitcherBottomSheetFragment.safeDismiss();
                        }
                    }, null, null, composer2, 0, 12);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.accountswitcher.SduiAccountSwitcherBottomSheetFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiAccountSwitcherBottomSheetFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: SduiAccountSwitcherBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.accountswitcher.SduiAccountSwitcherBottomSheetFragment$safeDismiss$1", m3645f = "SduiAccountSwitcherBottomSheetFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.accountswitcher.SduiAccountSwitcherBottomSheetFragment$safeDismiss$1 */
    static final class C83281 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C83281(Continuation<? super C83281> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SduiAccountSwitcherBottomSheetFragment.this.new C83281(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C83281) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SduiAccountSwitcherBottomSheetFragment.this.dismiss();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void safeDismiss() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C83281(null), 3, null);
    }

    /* compiled from: SduiAccountSwitcherBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/accountswitcher/SduiAccountSwitcherBottomSheetFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/accountswitcher/SduiAccountSwitcherBottomSheetFragment;", "Lcom/robinhood/shared/account/contracts/switcher/SduiAccountSwitcherBottomSheetFragmentKey;", "<init>", "()V", "feature-account-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolverWithArgsCompanion<SduiAccountSwitcherBottomSheetFragment, SduiAccountSwitcherBottomSheetFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion, com.robinhood.android.navigation.DialogFragmentResolver
        public SduiAccountSwitcherBottomSheetFragment createDialogFragment(SduiAccountSwitcherBottomSheetFragmentKey sduiAccountSwitcherBottomSheetFragmentKey) {
            return (SduiAccountSwitcherBottomSheetFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.createDialogFragment(this, sduiAccountSwitcherBottomSheetFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public SduiAccountSwitcherBottomSheetFragmentKey getArgs(SduiAccountSwitcherBottomSheetFragment sduiAccountSwitcherBottomSheetFragment) {
            return (SduiAccountSwitcherBottomSheetFragmentKey) DialogFragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, sduiAccountSwitcherBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SduiAccountSwitcherBottomSheetFragment newInstance(SduiAccountSwitcherBottomSheetFragmentKey sduiAccountSwitcherBottomSheetFragmentKey) {
            return (SduiAccountSwitcherBottomSheetFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, sduiAccountSwitcherBottomSheetFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SduiAccountSwitcherBottomSheetFragment sduiAccountSwitcherBottomSheetFragment, SduiAccountSwitcherBottomSheetFragmentKey sduiAccountSwitcherBottomSheetFragmentKey) {
            DialogFragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, sduiAccountSwitcherBottomSheetFragment, sduiAccountSwitcherBottomSheetFragmentKey);
        }
    }
}
