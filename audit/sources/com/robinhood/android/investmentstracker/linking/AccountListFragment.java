package com.robinhood.android.investmentstracker.linking;

import accio.service.p003v1.PurposeDto;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import bff_money_movement.service.p019v1.InvestmentsTrackerAccountContainerDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerGetAgreementResponseDto;
import com.plaid.internal.EnumC7081g;
import com.plaid.link.FastOpenPlaidLink;
import com.plaid.link.Plaid;
import com.plaid.link.PlaidHandler;
import com.plaid.link.PlaidKotlinFunctionsKt;
import com.plaid.link.configuration.LinkTokenConfiguration;
import com.plaid.link.result.LinkResult;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.investmentstracker.composables.AccountListAppBar;
import com.robinhood.android.investmentstracker.composables.components.AddAccountAgreementOverlay;
import com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerAccountContainer6;
import com.robinhood.android.investmentstracker.features.plaid.DuxoExtensions;
import com.robinhood.android.investmentstracker.linking.AccountListFragment;
import com.robinhood.android.investmentstracker.linking.AccountListSettingsBottomSheetDialogFragment;
import com.robinhood.android.investmentstracker.linking.models.AccountListContainerViewModel;
import com.robinhood.android.investmentstracker.linking.models.AccountListEvent;
import com.robinhood.android.investmentstracker.linking.models.AccountListViewState;
import com.robinhood.android.investmentstracker.linktypeselection.InvestmentsTrackerLinkTypeDialogFragment;
import com.robinhood.android.investmentstracker.linktypeselection.LinkType;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerAgreementViewModel;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.transfers.contracts.AccountListSettingsBottomSheetDialogFragmentKey;
import com.robinhood.android.transfers.contracts.InvestmentsTrackerAccountLinkingKey;
import com.robinhood.android.transfers.contracts.UnlinkInstitutionDialogFragmentKey;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: AccountListFragment.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u0000 '2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001'B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u001c\u001a\u00020\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\r\u0010\u001f\u001a\u00020\u0013H\u0017¢\u0006\u0002\u0010 J\u0010\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00180\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00180\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001b\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00180\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006(²\u0006\n\u0010)\u001a\u00020*X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/linking/AccountListFragment;", "Lcom/robinhood/android/investmentstracker/linking/AccountListSettingsBottomSheetDialogFragment$Callbacks;", "Lcom/robinhood/android/investmentstracker/linktypeselection/InvestmentsTrackerLinkTypeDialogFragment$Callbacks;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/investmentstracker/linking/AccountListDuxo;", "getDuxo", "()Lcom/robinhood/android/investmentstracker/linking/AccountListDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "hasBottomBar", "getHasBottomBar", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/plaid/link/PlaidHandler;", "kotlin.jvm.PlatformType", "updateModeLauncher", "oldLauncher", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "typeSelected", "linkType", "Lcom/robinhood/android/investmentstracker/linktypeselection/LinkType;", "showRemoveDialog", "account", "Lbff_money_movement/service/v1/InvestmentsTrackerAccountContainerDto;", "Companion", "feature-investments-tracker_externalDebug", "viewState", "Lcom/robinhood/android/investmentstracker/linking/models/AccountListViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class AccountListFragment extends GenericComposeFragment implements AccountListSettingsBottomSheetDialogFragment.Callbacks, InvestmentsTrackerLinkTypeDialogFragment.Callbacks {
    private final ActivityResultLauncher<PlaidHandler> launcher;
    private final ActivityResultLauncher<PlaidHandler> oldLauncher;
    private final ActivityResultLauncher<PlaidHandler> updateModeLauncher;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, AccountListDuxo.class);
    private final boolean useDesignSystemToolbar = true;
    private final boolean hasBottomBar = true;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(AccountListFragment accountListFragment, int i, Composer composer, int i2) {
        accountListFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public AccountListFragment() {
        ActivityResultLauncher<PlaidHandler> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new FastOpenPlaidLink(), new ActivityResultCallback() { // from class: com.robinhood.android.investmentstracker.linking.AccountListFragment$launcher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(LinkResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                DuxoExtensions.DefaultImpls.handlePlaidCallback$default(this.this$0.getDuxo(), result, this.this$0.getActivityErrorHandler(), false, null, 12, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.launcher = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<PlaidHandler> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new FastOpenPlaidLink(), new ActivityResultCallback() { // from class: com.robinhood.android.investmentstracker.linking.AccountListFragment$updateModeLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(LinkResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                this.this$0.getDuxo().handlePlaidCallback(result, this.this$0.getActivityErrorHandler(), true, this.this$0.getDuxo().getStateFlow().getValue().getCurrentReconnectId());
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "registerForActivityResult(...)");
        this.updateModeLauncher = activityResultLauncherRegisterForActivityResult2;
        ActivityResultLauncher<PlaidHandler> activityResultLauncherRegisterForActivityResult3 = registerForActivityResult(new FastOpenPlaidLink(), new AccountListFragment6(this));
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult3, "registerForActivityResult(...)");
        this.oldLauncher = activityResultLauncherRegisterForActivityResult3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AccountListDuxo getDuxo() {
        return (AccountListDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getHasBottomBar() {
        return this.hasBottomBar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountListViewState ComposeContent$lambda$0(SnapshotState4<AccountListViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: AccountListFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.linking.AccountListFragment$onCreate$1", m3645f = "AccountListFragment.kt", m3646l = {104}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investmentstracker.linking.AccountListFragment$onCreate$1 */
    static final class C196151 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C196151(Continuation<? super C196151> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccountListFragment.this.new C196151(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C196151) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AccountListFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/investmentstracker/linking/models/AccountListEvent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.linking.AccountListFragment$onCreate$1$1", m3645f = "AccountListFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.investmentstracker.linking.AccountListFragment$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Event<AccountListEvent>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AccountListFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AccountListFragment accountListFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = accountListFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Event<AccountListEvent> event, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(event, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                EventConsumer eventConsumer;
                EventConsumer eventConsumer2;
                EventConsumer eventConsumer3;
                EventConsumer eventConsumer4;
                EventConsumer eventConsumer5;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final Event event = (Event) this.L$0;
                if (event != null) {
                    final AccountListFragment accountListFragment = this.this$0;
                    if ((event.getData() instanceof AccountListEvent.PlaidStart) && (eventConsumer5 = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer5.consume(event, new Function1() { // from class: com.robinhood.android.investmentstracker.linking.AccountListFragment$onCreate$1$1$invokeSuspend$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m15635invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m15635invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                final AccountListEvent.PlaidStart plaidStart = (AccountListEvent.PlaidStart) event.getData();
                                ActivityResultLauncher activityResultLauncher = accountListFragment.oldLauncher;
                                Application application = accountListFragment.requireActivity().getApplication();
                                Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
                                activityResultLauncher.launch(Plaid.create(application, PlaidKotlinFunctionsKt.linkTokenConfiguration(new Function1<LinkTokenConfiguration.Builder, Unit>() { // from class: com.robinhood.android.investmentstracker.linking.AccountListFragment$onCreate$1$1$1$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(LinkTokenConfiguration.Builder builder) {
                                        invoke2(builder);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(LinkTokenConfiguration.Builder linkTokenConfiguration) {
                                        Intrinsics.checkNotNullParameter(linkTokenConfiguration, "$this$linkTokenConfiguration");
                                        linkTokenConfiguration.setToken(plaidStart.getLinkToken());
                                    }
                                })));
                            }
                        });
                    }
                }
                if (event != null) {
                    final AccountListFragment accountListFragment2 = this.this$0;
                    if ((event.getData() instanceof AccountListEvent.PlaidStartWithBff) && (eventConsumer4 = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer4.consume(event, new Function1() { // from class: com.robinhood.android.investmentstracker.linking.AccountListFragment$onCreate$1$1$invokeSuspend$$inlined$consumeIfType$2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m15636invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m15636invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                AccountListDuxo duxo = accountListFragment2.getDuxo();
                                ActivityResultLauncher activityResultLauncher = accountListFragment2.launcher;
                                FragmentActivity fragmentActivityRequireActivity = accountListFragment2.requireActivity();
                                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                                DuxoExtensions.DefaultImpls.startPlaid$default(duxo, fragmentActivityRequireActivity, activityResultLauncher, PurposeDto.PURPOSE_INVESTMENT_TRACKING, null, 8, null);
                            }
                        });
                    }
                }
                if (event != null) {
                    final AccountListFragment accountListFragment3 = this.this$0;
                    if ((event.getData() instanceof AccountListEvent.ShowManageOptions) && (eventConsumer3 = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer3.consume(event, new Function1() { // from class: com.robinhood.android.investmentstracker.linking.AccountListFragment$onCreate$1$1$invokeSuspend$$inlined$consumeIfType$3
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m15637invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m15637invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                Navigator.DefaultImpls.createDialogFragment$default(accountListFragment3.getNavigator(), new AccountListSettingsBottomSheetDialogFragmentKey(((AccountListEvent.ShowManageOptions) event.getData()).getAccount()), null, 2, null).show(accountListFragment3.getChildFragmentManager(), "manageDialog");
                            }
                        });
                    }
                }
                if (event != null) {
                    final AccountListFragment accountListFragment4 = this.this$0;
                    if ((event.getData() instanceof AccountListEvent.ShowUnlinkDialog) && (eventConsumer2 = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer2.consume(event, new Function1() { // from class: com.robinhood.android.investmentstracker.linking.AccountListFragment$onCreate$1$1$invokeSuspend$$inlined$consumeIfType$4
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m15638invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m15638invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                AccountListEvent.ShowUnlinkDialog showUnlinkDialog = (AccountListEvent.ShowUnlinkDialog) event.getData();
                                Navigator.DefaultImpls.createDialogFragment$default(accountListFragment4.getNavigator(), new UnlinkInstitutionDialogFragmentKey(showUnlinkDialog.getInstitutionId(), showUnlinkDialog.getName()), null, 2, null).show(accountListFragment4.getChildFragmentManager(), "unlinkInstitutionDialog");
                            }
                        });
                    }
                }
                if (event != null) {
                    final AccountListFragment accountListFragment5 = this.this$0;
                    if ((event.getData() instanceof AccountListEvent.StartUpdateMode) && (eventConsumer = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer.consume(event, new Function1() { // from class: com.robinhood.android.investmentstracker.linking.AccountListFragment$onCreate$1$1$invokeSuspend$$inlined$consumeIfType$5
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m15639invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m15639invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                AccountListEvent.StartUpdateMode startUpdateMode = (AccountListEvent.StartUpdateMode) event.getData();
                                AccountListDuxo duxo = accountListFragment5.getDuxo();
                                ActivityResultLauncher<PlaidHandler> activityResultLauncher = accountListFragment5.updateModeLauncher;
                                FragmentActivity fragmentActivityRequireActivity = accountListFragment5.requireActivity();
                                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                                duxo.startPlaid(fragmentActivityRequireActivity, activityResultLauncher, PurposeDto.PURPOSE_INVESTMENT_TRACKING, startUpdateMode.getInstitutionId());
                            }
                        });
                    }
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<AccountListEvent>> eventFlow = AccountListFragment.this.getDuxo().getEventFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AccountListFragment.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(eventFlow, anonymousClass1, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C196151(null), 3, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(280781091);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(280781091, i2, -1, "com.robinhood.android.investmentstracker.linking.AccountListFragment.ComposeContent (AccountListFragment.kt:148)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-730536229, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investmentstracker.linking.AccountListFragment.ComposeContent.1

                /* compiled from: AccountListFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.investmentstracker.linking.AccountListFragment$ComposeContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ SnapshotState4<AccountListViewState> $viewState$delegate;
                    final /* synthetic */ AccountListFragment this$0;

                    AnonymousClass1(AccountListFragment accountListFragment, SnapshotState4<AccountListViewState> snapshotState4) {
                        this.this$0 = accountListFragment;
                        this.$viewState$delegate = snapshotState4;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* compiled from: AccountListFragment.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.investmentstracker.linking.AccountListFragment$ComposeContent$1$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C502301 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ SnapshotState4<AccountListViewState> $viewState$delegate;
                        final /* synthetic */ AccountListFragment this$0;

                        C502301(AccountListFragment accountListFragment, SnapshotState4<AccountListViewState> snapshotState4) {
                            this.this$0 = accountListFragment;
                            this.$viewState$delegate = snapshotState4;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer, int i) {
                            if ((i & 3) == 2 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1129835562, i, -1, "com.robinhood.android.investmentstracker.linking.AccountListFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (AccountListFragment.kt:160)");
                            }
                            AccountListViewState accountListViewStateComposeContent$lambda$0 = AccountListFragment.ComposeContent$lambda$0(this.$viewState$delegate);
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer.changedInstance(this.this$0);
                            final AccountListFragment accountListFragment = this.this$0;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.investmentstracker.linking.AccountListFragment$ComposeContent$1$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AccountListFragment.C196141.AnonymousClass1.C502301.invoke$lambda$1$lambda$0(accountListFragment);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            Function0 function0 = (Function0) objRememberedValue;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance2 = composer.changedInstance(this.this$0);
                            final AccountListFragment accountListFragment2 = this.this$0;
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.investmentstracker.linking.AccountListFragment$ComposeContent$1$1$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AccountListFragment.C196141.AnonymousClass1.C502301.invoke$lambda$3$lambda$2(accountListFragment2);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            composer.endReplaceGroup();
                            AccountListAppBar.AccountListAppBar(accountListViewStateComposeContent$lambda$0, function0, (Function0) objRememberedValue2, null, composer, 0, 8);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(AccountListFragment accountListFragment) {
                            accountListFragment.getDuxo().startPlaidWithChecks();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$3$lambda$2(AccountListFragment accountListFragment) {
                            accountListFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
                            return Unit.INSTANCE;
                        }
                    }

                    /* compiled from: AccountListFragment.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.investmentstracker.linking.AccountListFragment$ComposeContent$1$1$2, reason: invalid class name */
                    static final class AnonymousClass2 implements Function3<PaddingValues, Composer, Integer, Unit> {
                        final /* synthetic */ SnapshotState4<AccountListViewState> $viewState$delegate;
                        final /* synthetic */ AccountListFragment this$0;

                        AnonymousClass2(SnapshotState4<AccountListViewState> snapshotState4, AccountListFragment accountListFragment) {
                            this.$viewState$delegate = snapshotState4;
                            this.this$0 = accountListFragment;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                            invoke(paddingValues, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues padding, Composer composer, int i) {
                            int i2;
                            Intrinsics.checkNotNullParameter(padding, "padding");
                            if ((i & 6) == 0) {
                                i2 = i | (composer.changed(padding) ? 4 : 2);
                            } else {
                                i2 = i;
                            }
                            if ((i2 & 19) == 18 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2028567883, i2, -1, "com.robinhood.android.investmentstracker.linking.AccountListFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (AccountListFragment.kt:171)");
                            }
                            Modifier modifierPadding = PaddingKt.padding(Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), padding);
                            composer.startReplaceGroup(-1633490746);
                            boolean zChanged = composer.changed(this.$viewState$delegate) | composer.changedInstance(this.this$0);
                            final SnapshotState4<AccountListViewState> snapshotState4 = this.$viewState$delegate;
                            final AccountListFragment accountListFragment = this.this$0;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.investmentstracker.linking.AccountListFragment$ComposeContent$1$1$2$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AccountListFragment.C196141.AnonymousClass1.AnonymousClass2.invoke$lambda$4$lambda$3(snapshotState4, accountListFragment, (LazyListScope) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            LazyDslKt.LazyColumn(modifierPadding, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 510);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$4$lambda$3(SnapshotState4 snapshotState4, final AccountListFragment accountListFragment, LazyListScope LazyColumn) {
                            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                            final ImmutableList<AccountListContainerViewModel> accounts2 = AccountListFragment.ComposeContent$lambda$0(snapshotState4).getAccounts();
                            final C19605x1d41306e c19605x1d41306e = new Function1() { // from class: com.robinhood.android.investmentstracker.linking.AccountListFragment$ComposeContent$1$1$2$invoke$lambda$4$lambda$3$$inlined$items$default$1
                                @Override // kotlin.jvm.functions.Function1
                                public final Void invoke(AccountListContainerViewModel accountListContainerViewModel) {
                                    return null;
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    return invoke((AccountListContainerViewModel) obj);
                                }
                            };
                            LazyColumn.items(accounts2.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.investmentstracker.linking.AccountListFragment$ComposeContent$1$1$2$invoke$lambda$4$lambda$3$$inlined$items$default$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                    return invoke(num.intValue());
                                }

                                public final Object invoke(int i) {
                                    return c19605x1d41306e.invoke(accounts2.get(i));
                                }
                            }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.investmentstracker.linking.AccountListFragment$ComposeContent$1$1$2$invoke$lambda$4$lambda$3$$inlined$items$default$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(4);
                                }

                                @Override // kotlin.jvm.functions.Function4
                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                                    int i3;
                                    if ((i2 & 6) == 0) {
                                        i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                                    } else {
                                        i3 = i2;
                                    }
                                    if ((i2 & 48) == 0) {
                                        i3 |= composer.changed(i) ? 32 : 16;
                                    }
                                    if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                                    }
                                    AccountListContainerViewModel accountListContainerViewModel = (AccountListContainerViewModel) accounts2.get(i);
                                    composer.startReplaceGroup(1178148897);
                                    AccountListDuxo duxo = accountListFragment.getDuxo();
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance = composer.changedInstance(duxo);
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new AccountListFragment2(duxo);
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    Function1 function1 = (Function1) ((KFunction) objRememberedValue);
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance2 = composer.changedInstance(accountListFragment);
                                    Object objRememberedValue2 = composer.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        final AccountListFragment accountListFragment2 = accountListFragment;
                                        objRememberedValue2 = new Function1<InvestmentsTrackerAccountContainerDto, Unit>() { // from class: com.robinhood.android.investmentstracker.linking.AccountListFragment$ComposeContent$1$1$2$1$1$1$2$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(InvestmentsTrackerAccountContainerDto investmentsTrackerAccountContainerDto) {
                                                invoke2(investmentsTrackerAccountContainerDto);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(InvestmentsTrackerAccountContainerDto account) {
                                                Intrinsics.checkNotNullParameter(account, "account");
                                                accountListFragment2.getDuxo().manageAccountSelected(account);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer.endReplaceGroup();
                                    InvestmentsTrackerAccountContainer6.InvestmentsTrackerAccountContainer(accountListContainerViewModel, function1, (Function1) objRememberedValue2, null, composer, 0, 8);
                                    composer.endReplaceGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }));
                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1745344640, true, new AccountListFragment4(accountListFragment, snapshotState4)), 3, null);
                            return Unit.INSTANCE;
                        }
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(213871206, i, -1, "com.robinhood.android.investmentstracker.linking.AccountListFragment.ComposeContent.<anonymous>.<anonymous> (AccountListFragment.kt:152)");
                        }
                        ScaffoldKt.m5939ScaffoldTvnljyQ(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.INVESTMENTS_TRACKER_SETTINGS, null, null, null, 14, null), null, null, null, null, 61, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), ComposableLambda3.rememberComposableLambda(1129835562, true, new C502301(this.this$0, this.$viewState$delegate), composer, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-2028567883, true, new AnonymousClass2(this.$viewState$delegate, this.this$0), composer, 54), composer, 805306416, 508);
                        InvestmentsTrackerAgreementViewModel agreementResponse = AccountListFragment.ComposeContent$lambda$0(this.$viewState$delegate).getAgreementResponse();
                        if (agreementResponse != null) {
                            final AccountListFragment accountListFragment = this.this$0;
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer.changedInstance(accountListFragment);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.investmentstracker.linking.AccountListFragment$ComposeContent$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AccountListFragment.C196141.AnonymousClass1.invoke$lambda$6$lambda$1$lambda$0(accountListFragment);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            Function0 function0 = (Function0) objRememberedValue;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance2 = composer.changedInstance(accountListFragment);
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.investmentstracker.linking.AccountListFragment$ComposeContent$1$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AccountListFragment.C196141.AnonymousClass1.invoke$lambda$6$lambda$3$lambda$2(accountListFragment, (InvestmentsTrackerGetAgreementResponseDto) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            Function1 function1 = (Function1) objRememberedValue2;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance3 = composer.changedInstance(accountListFragment);
                            Object objRememberedValue3 = composer.rememberedValue();
                            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.investmentstracker.linking.AccountListFragment$ComposeContent$1$1$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AccountListFragment.C196141.AnonymousClass1.invoke$lambda$6$lambda$5$lambda$4(accountListFragment, (String) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue3);
                            }
                            composer.endReplaceGroup();
                            AddAccountAgreementOverlay.AddAccountAgreementOverlay(agreementResponse, function0, function1, (Function1) objRememberedValue3, null, composer, 0, 16);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$6$lambda$1$lambda$0(AccountListFragment accountListFragment) {
                        accountListFragment.getDuxo().closeAgreements();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$6$lambda$3$lambda$2(AccountListFragment accountListFragment, InvestmentsTrackerGetAgreementResponseDto it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        accountListFragment.getDuxo().agreetoAgreement(it);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$6$lambda$5$lambda$4(AccountListFragment accountListFragment, String it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        Navigator navigator = accountListFragment.getNavigator();
                        Context contextRequireContext = accountListFragment.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(it), null, null, false, null, 60, null);
                        return Unit.INSTANCE;
                    }
                }

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
                        ComposerKt.traceEventStart(-730536229, i3, -1, "com.robinhood.android.investmentstracker.linking.AccountListFragment.ComposeContent.<anonymous> (AccountListFragment.kt:151)");
                    }
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(213871206, true, new AnonymousClass1(AccountListFragment.this, snapshotState4CollectAsStateWithLifecycle), composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investmentstracker.linking.AccountListFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountListFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.investmentstracker.linktypeselection.InvestmentsTrackerLinkTypeDialogFragment.Callbacks
    public void typeSelected(LinkType linkType) {
        Intrinsics.checkNotNullParameter(linkType, "linkType");
        if (linkType == LinkType.BANK) {
            AccountListDuxo duxo = getDuxo();
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            duxo.startOldPlaid(fragmentActivityRequireActivity, this.oldLauncher);
            return;
        }
        AccountListDuxo duxo2 = getDuxo();
        ActivityResultLauncher<PlaidHandler> activityResultLauncher = this.launcher;
        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
        DuxoExtensions.DefaultImpls.startPlaid$default(duxo2, fragmentActivityRequireActivity2, activityResultLauncher, PurposeDto.PURPOSE_INVESTMENT_TRACKING, null, 8, null);
    }

    @Override // com.robinhood.android.investmentstracker.linking.AccountListSettingsBottomSheetDialogFragment.Callbacks
    public void showRemoveDialog(InvestmentsTrackerAccountContainerDto account) {
        Intrinsics.checkNotNullParameter(account, "account");
        getDuxo().unlinkSelected(account);
    }

    /* compiled from: AccountListFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/linking/AccountListFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/investmentstracker/linking/AccountListFragment;", "Lcom/robinhood/android/transfers/contracts/InvestmentsTrackerAccountLinkingKey;", "<init>", "()V", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AccountListFragment, InvestmentsTrackerAccountLinkingKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(InvestmentsTrackerAccountLinkingKey investmentsTrackerAccountLinkingKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, investmentsTrackerAccountLinkingKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public InvestmentsTrackerAccountLinkingKey getArgs(AccountListFragment accountListFragment) {
            return (InvestmentsTrackerAccountLinkingKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, accountListFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AccountListFragment newInstance(InvestmentsTrackerAccountLinkingKey investmentsTrackerAccountLinkingKey) {
            return (AccountListFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, investmentsTrackerAccountLinkingKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AccountListFragment accountListFragment, InvestmentsTrackerAccountLinkingKey investmentsTrackerAccountLinkingKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, accountListFragment, investmentsTrackerAccountLinkingKey);
        }
    }
}
