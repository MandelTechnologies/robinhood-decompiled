package com.robinhood.android.transfers.ach.p265ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.ach.format.C8331R;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.view.RhEditText;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.goldearningspotential.microgram.GoldEarningsCalculatorAlertContentUiModel;
import com.robinhood.android.goldearningspotential.microgram.GoldEarningsCalculatorUiModel;
import com.robinhood.android.goldearningspotential.microgram.GoldEarningsDisclosureUiModel;
import com.robinhood.android.goldearningspotential.p152ui.GoldEarningsPotentialCalculatorComposable;
import com.robinhood.android.goldearningspotential.p152ui.GoldEarningsPotentialDisclosureBottomSheetKey;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.maxonboarding.FromOnboardingCallbacks;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.transfers.ach.C30082R;
import com.robinhood.android.transfers.ach.p265ui.CreateQueuedAchDepositFragment;
import com.robinhood.android.transfers.contracts.transfercontext.CreateIavAccountData;
import com.robinhood.android.transfers.lib.ExtensionsKt;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Money;
import com.robinhood.rosetta.eventlogging.PlaidEventData;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.TransferContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.transfers.contracts.context.PlaidIavMetadata;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import io.reactivex.Observable;
import java.math.BigDecimal;
import java.util.NoSuchElementException;
import kotlin.Lazy;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CreateQueuedAchDepositFragment.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0003)*+B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020%H\u0014J\u0010\u0010&\u001a\u00020\u00162\u0006\u0010$\u001a\u00020'H\u0014J\u0010\u0010(\u001a\u00020\u00162\u0006\u0010$\u001a\u00020'H\u0014R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/CreateQueuedAchDepositFragment;", "Lcom/robinhood/android/transfers/ach/ui/BaseCreateAchTransferFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/transfers/ach/ui/CreateQueuedAchDepositFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/transfers/ach/ui/CreateQueuedAchDepositFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/transfers/ach/ui/CreateQueuedAchDepositDuxo;", "getDuxo", "()Lcom/robinhood/android/transfers/ach/ui/CreateQueuedAchDepositDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "getLoggingContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "refreshUi", "state", "Lcom/robinhood/android/transfers/ach/ui/CreateQueuedAchDepositViewState;", "onDisplayDisclosureSheet", "alert", "Lcom/robinhood/android/goldearningspotential/microgram/GoldEarningsCalculatorAlertContentUiModel;", "setAmount", "amount", "", "displayTransferExceedsBalanceDialog", "Ljava/math/BigDecimal;", "onReview", "Callbacks", "Args", "Companion", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class CreateQueuedAchDepositFragment extends BaseCreateAchTransferFragment implements AutoLoggableFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.transfers.ach.ui.CreateQueuedAchDepositFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof CreateQueuedAchDepositFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, CreateQueuedAchDepositDuxo.class);
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CreateQueuedAchDepositFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/transfers/ach/ui/CreateQueuedAchDepositFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CreateQueuedAchDepositFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/CreateQueuedAchDepositFragment$Callbacks;", "Lcom/robinhood/android/maxonboarding/FromOnboardingCallbacks;", "onCreateQueuedDepositReview", "", "amount", "Ljava/math/BigDecimal;", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends FromOnboardingCallbacks {
        void onCreateQueuedDepositReview(BigDecimal amount);
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CreateQueuedAchDepositDuxo getDuxo() {
        return (CreateQueuedAchDepositDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.CREATE_QUEUED_DEPOSIT, null, null, null, 14, null);
    }

    @Override // com.robinhood.android.transfers.ach.p265ui.BaseCreateAchTransferFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        CreateIavAccountData accountData = getTransferContext().getAccountData();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        RhTextView rhTextView = getBinding().accountNameTxt;
        int i = C8331R.string.ach_relationship_account_summary;
        Intrinsics.checkNotNull(accountData);
        rhTextView.setText(resources.getString(i, accountData.getAccount().getName(), accountData.getAccount().getLast_four_account_number()));
        RdsButton submitBtn = getBinding().submitBtn;
        Intrinsics.checkNotNullExpressionValue(submitBtn, "submitBtn");
        ViewsKt.eventData$default(submitBtn, false, new Function0() { // from class: com.robinhood.android.transfers.ach.ui.CreateQueuedAchDepositFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateQueuedAchDepositFragment.onViewCreated$lambda$0(this.f$0);
            }
        }, 1, null);
        BaseFragment.collectDuxoState$default(this, null, new C301052(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$0(CreateQueuedAchDepositFragment createQueuedAchDepositFragment) {
        return new UserInteractionEventDescriptor("queued_deposit_submit", createQueuedAchDepositFragment.getEventScreen(), null, createQueuedAchDepositFragment.getLoggingContext(), new Component(Component.ComponentType.BUTTON, "submit", null, 4, null), null, 36, null);
    }

    /* compiled from: CreateQueuedAchDepositFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ach.ui.CreateQueuedAchDepositFragment$onViewCreated$2", m3645f = "CreateQueuedAchDepositFragment.kt", m3646l = {100}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ach.ui.CreateQueuedAchDepositFragment$onViewCreated$2 */
    static final class C301052 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C301052(Continuation<? super C301052> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateQueuedAchDepositFragment.this.new C301052(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C301052) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowOnCompletion = FlowKt.onCompletion(FlowKt.onStart(CreateQueuedAchDepositFragment.this.getDuxo().getStateFlow(), new AnonymousClass1(null)), new AnonymousClass2(null));
                final CreateQueuedAchDepositFragment createQueuedAchDepositFragment = CreateQueuedAchDepositFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.transfers.ach.ui.CreateQueuedAchDepositFragment.onViewCreated.2.3
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((CreateQueuedAchDepositViewState) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(CreateQueuedAchDepositViewState createQueuedAchDepositViewState, Continuation<? super Unit> continuation) {
                        createQueuedAchDepositFragment.refreshUi(createQueuedAchDepositViewState);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowOnCompletion.collect(flowCollector, this) == coroutine_suspended) {
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

        /* compiled from: CreateQueuedAchDepositFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/android/transfers/ach/ui/CreateQueuedAchDepositViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ach.ui.CreateQueuedAchDepositFragment$onViewCreated$2$1", m3645f = "CreateQueuedAchDepositFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ach.ui.CreateQueuedAchDepositFragment$onViewCreated$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FlowCollector<? super CreateQueuedAchDepositViewState>, Continuation<? super Unit>, Object> {
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FlowCollector<? super CreateQueuedAchDepositViewState> flowCollector, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                IdlingResourceCounters2.setBusy(IdlingResourceType.CREATE_ACH_TRANSFER_DEPOSIT, true);
                return Unit.INSTANCE;
            }
        }

        /* compiled from: CreateQueuedAchDepositFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/android/transfers/ach/ui/CreateQueuedAchDepositViewState;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ach.ui.CreateQueuedAchDepositFragment$onViewCreated$2$2", m3645f = "CreateQueuedAchDepositFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ach.ui.CreateQueuedAchDepositFragment$onViewCreated$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function3<FlowCollector<? super CreateQueuedAchDepositViewState>, Throwable, Continuation<? super Unit>, Object> {
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(FlowCollector<? super CreateQueuedAchDepositViewState> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                return new AnonymousClass2(continuation).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                IdlingResourceCounters2.setBusy(IdlingResourceType.CREATE_ACH_TRANSFER_DEPOSIT, false);
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.robinhood.rosetta.eventlogging.Context getLoggingContext() {
        PlaidEventData plaidEventData;
        PlaidIavMetadata plaidIavMetadata = getTransferContext().getPlaidIavMetadata();
        if (plaidIavMetadata != null) {
            String institutionId = plaidIavMetadata.getInstitutionId();
            String str = institutionId == null ? "" : institutionId;
            String institutionName = plaidIavMetadata.getInstitutionName();
            String str2 = institutionName == null ? "" : institutionName;
            String linkSessionId = plaidIavMetadata.getLinkSessionId();
            plaidEventData = new PlaidEventData(null, null, null, null, null, null, null, str, str2, null, linkSessionId == null ? "" : linkSessionId, null, null, null, null, null, null, null, null, null, 1047167, null);
        } else {
            plaidEventData = null;
        }
        return new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, Context.ProductTag.QUEUED_DEPOSIT, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, plaidEventData, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -129, -16385, -1, -1, -1, -1, 16383, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshUi(final CreateQueuedAchDepositViewState state) {
        getBinding().loadingView.setVisibility(state.isLoading() ? 0 : 8);
        LinearLayout suggestedAmountsView = getBinding().suggestedAmountsView;
        Intrinsics.checkNotNullExpressionValue(suggestedAmountsView, "suggestedAmountsView");
        suggestedAmountsView.setVisibility(8);
        LinearLayout suggestedAmountsViewV2 = getBinding().suggestedAmountsViewV2;
        Intrinsics.checkNotNullExpressionValue(suggestedAmountsViewV2, "suggestedAmountsViewV2");
        suggestedAmountsViewV2.setVisibility(getTransferContext().showSuggestedAmounts() ? 0 : 8);
        RhEditText rhEditText = getBinding().amountEdt;
        String amountHint = state.getAmountHint();
        if (amountHint == null) {
            amountHint = getString(C11048R.string.ach_transfer_amount_hint);
            Intrinsics.checkNotNullExpressionValue(amountHint, "getString(...)");
        }
        rhEditText.setHint(amountHint);
        RhEditText amountEdt = getBinding().amountEdt;
        Intrinsics.checkNotNullExpressionValue(amountEdt, "amountEdt");
        amountEdt.addTextChangedListener(new TextWatcher() { // from class: com.robinhood.android.transfers.ach.ui.CreateQueuedAchDepositFragment$refreshUi$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                if (s == null || StringsKt.isBlank(s)) {
                    RhEditText rhEditText2 = this.this$0.getBinding().amountEdt;
                    String amountHint2 = state.getAmountHint();
                    if (amountHint2 == null) {
                        amountHint2 = this.this$0.getString(C11048R.string.ach_transfer_amount_hint);
                        Intrinsics.checkNotNullExpressionValue(amountHint2, "getString(...)");
                    }
                    rhEditText2.setHint(amountHint2);
                    return;
                }
                String str = Formats.getCurrencyFormat().format(new BigDecimal(s.toString()));
                this.this$0.getBinding().amountEdt.announceForAccessibility(str);
                this.this$0.getBinding().amountEdt.setHint(str);
            }
        });
        RdsButton amountOneBtnV2 = getBinding().amountOneBtnV2;
        Intrinsics.checkNotNullExpressionValue(amountOneBtnV2, "amountOneBtnV2");
        ViewsKt.logAppear$default(amountOneBtnV2, null, false, 3, null);
        RdsButton amountTwoBtnV2 = getBinding().amountTwoBtnV2;
        Intrinsics.checkNotNullExpressionValue(amountTwoBtnV2, "amountTwoBtnV2");
        ViewsKt.logAppear$default(amountTwoBtnV2, null, false, 3, null);
        RdsButton amountThreeBtnV2 = getBinding().amountThreeBtnV2;
        Intrinsics.checkNotNullExpressionValue(amountThreeBtnV2, "amountThreeBtnV2");
        ViewsKt.logAppear$default(amountThreeBtnV2, null, false, 3, null);
        Observable<KeyEvent> observableTake = getBinding().numpad.getKeyEvents().take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.CreateQueuedAchDepositFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateQueuedAchDepositFragment.refreshUi$lambda$3(this.f$0, (KeyEvent) obj);
            }
        });
        getBinding().amountEdt.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.robinhood.android.transfers.ach.ui.CreateQueuedAchDepositFragment.refreshUi.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                CreateQueuedAchDepositFragment.this.getDuxo().resetDepositHintAmount();
            }
        });
        RhEditText amountEdt2 = getBinding().amountEdt;
        Intrinsics.checkNotNullExpressionValue(amountEdt2, "amountEdt");
        LifecycleHost.DefaultImpls.bind$default(this, RxTextView.textChanges(amountEdt2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.CreateQueuedAchDepositFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateQueuedAchDepositFragment.refreshUi$lambda$4(this.f$0, (CharSequence) obj);
            }
        });
        getBinding().accountInfo.setVisibility(8);
        final GoldEarningsCalculatorUiModel goldEarningsCalculatorUiModel = state.getGoldEarningsCalculatorUiModel();
        if (goldEarningsCalculatorUiModel != null) {
            getBinding().goldEarningsPotentialCalculator.setVisibility(0);
            getBinding().goldEarningsPotentialCalculator.setContent(ComposableLambda3.composableLambdaInstance(92442723, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ach.ui.CreateQueuedAchDepositFragment.refreshUi.5
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
                        ComposerKt.traceEventStart(92442723, i, -1, "com.robinhood.android.transfers.ach.ui.CreateQueuedAchDepositFragment.refreshUi.<anonymous> (CreateQueuedAchDepositFragment.kt:176)");
                    }
                    Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(CreateQueuedAchDepositFragment.this.getScarletManager());
                    final GoldEarningsCalculatorUiModel goldEarningsCalculatorUiModel2 = goldEarningsCalculatorUiModel;
                    final CreateQueuedAchDepositFragment createQueuedAchDepositFragment = CreateQueuedAchDepositFragment.this;
                    BentoTheme2.BentoTheme(observableThemeChangesForCompose, null, ComposableLambda3.rememberComposableLambda(652477973, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ach.ui.CreateQueuedAchDepositFragment.refreshUi.5.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i2) {
                            if ((i2 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(652477973, i2, -1, "com.robinhood.android.transfers.ach.ui.CreateQueuedAchDepositFragment.refreshUi.<anonymous>.<anonymous> (CreateQueuedAchDepositFragment.kt:177)");
                            }
                            GoldEarningsPotentialCalculatorComposable.GoldEarningsPotentialCalculatorComposable(goldEarningsCalculatorUiModel2, createQueuedAchDepositFragment.getEventScreen(), createQueuedAchDepositFragment.getLoggingContext(), null, composer2, GoldEarningsCalculatorUiModel.$stable, 8);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer, 54), composer, 384, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        }
        final GoldEarningsDisclosureUiModel goldEarningsDisclosureUiModel = state.getGoldEarningsDisclosureUiModel();
        if (goldEarningsDisclosureUiModel != null) {
            getBinding().goldEarningsPotentialCalculatorDisclosure.setVisibility(0);
            getBinding().goldEarningsPotentialCalculatorDisclosure.setContent(ComposableLambda3.composableLambdaInstance(1298290522, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ach.ui.CreateQueuedAchDepositFragment.refreshUi.6
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
                        ComposerKt.traceEventStart(1298290522, i, -1, "com.robinhood.android.transfers.ach.ui.CreateQueuedAchDepositFragment.refreshUi.<anonymous> (CreateQueuedAchDepositFragment.kt:190)");
                    }
                    Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(CreateQueuedAchDepositFragment.this.getScarletManager());
                    final CreateQueuedAchDepositFragment createQueuedAchDepositFragment = CreateQueuedAchDepositFragment.this;
                    final GoldEarningsDisclosureUiModel goldEarningsDisclosureUiModel2 = goldEarningsDisclosureUiModel;
                    BentoTheme2.BentoTheme(observableThemeChangesForCompose, null, ComposableLambda3.rememberComposableLambda(-1673713524, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ach.ui.CreateQueuedAchDepositFragment.refreshUi.6.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i2) {
                            if ((i2 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1673713524, i2, -1, "com.robinhood.android.transfers.ach.ui.CreateQueuedAchDepositFragment.refreshUi.<anonymous>.<anonymous> (CreateQueuedAchDepositFragment.kt:191)");
                            }
                            Screen eventScreen = createQueuedAchDepositFragment.getEventScreen();
                            com.robinhood.rosetta.eventlogging.Context loggingContext = createQueuedAchDepositFragment.getLoggingContext();
                            CreateQueuedAchDepositFragment createQueuedAchDepositFragment2 = createQueuedAchDepositFragment;
                            composer2.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer2.changedInstance(createQueuedAchDepositFragment2);
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new CreateQueuedAchDepositFragment2(createQueuedAchDepositFragment2);
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceGroup();
                            GoldEarningsPotentialCalculatorComposable.GoldEarningsPotentialCalculatorDisclosure(goldEarningsDisclosureUiModel2, (Function1) ((KFunction) objRememberedValue), eventScreen, loggingContext, null, composer2, GoldEarningsDisclosureUiModel.$stable, 16);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer, 54), composer, 384, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshUi$lambda$3(CreateQueuedAchDepositFragment createQueuedAchDepositFragment, KeyEvent keyEvent) {
        createQueuedAchDepositFragment.getDuxo().resetDepositHintAmount();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshUi$lambda$4(CreateQueuedAchDepositFragment createQueuedAchDepositFragment, CharSequence it) {
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z = it.length() > 0;
        RdsButton submitBtn = createQueuedAchDepositFragment.getBinding().submitBtn;
        Intrinsics.checkNotNullExpressionValue(submitBtn, "submitBtn");
        submitBtn.setVisibility(z ? 0 : 8);
        BigDecimal bigDecimal = null;
        if (z) {
            RdsButton submitBtn2 = createQueuedAchDepositFragment.getBinding().submitBtn;
            Intrinsics.checkNotNullExpressionValue(submitBtn2, "submitBtn");
            ViewsKt.logAppear$default(submitBtn2, null, false, 3, null);
        }
        LinearLayout suggestedAmountsViewV2 = createQueuedAchDepositFragment.getBinding().suggestedAmountsViewV2;
        Intrinsics.checkNotNullExpressionValue(suggestedAmountsViewV2, "suggestedAmountsViewV2");
        suggestedAmountsViewV2.setVisibility(it.length() == 0 ? 0 : 8);
        try {
            bigDecimal = new BigDecimal(String.valueOf(createQueuedAchDepositFragment.getBinding().amountEdt.getText()));
        } catch (NumberFormatException unused) {
        }
        createQueuedAchDepositFragment.getDuxo().updateGoldCalculationWhenDepositAmountChange(bigDecimal);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDisplayDisclosureSheet(GoldEarningsCalculatorAlertContentUiModel alert) {
        Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new GoldEarningsPotentialDisclosureBottomSheetKey(alert), null, 2, null).show(getChildFragmentManager(), "gold-earnings-potential-bottom-sheet");
    }

    @Override // com.robinhood.android.transfers.ach.p265ui.BaseCreateAchTransferFragment
    protected void setAmount(int amount) {
        super.setAmount(amount);
        getDuxo().updateGoldCalculationWhenDepositAmountChange(new BigDecimal(String.valueOf(amount)));
    }

    @Override // com.robinhood.android.transfers.ach.p265ui.BaseCreateAchTransferFragment
    protected void displayTransferExceedsBalanceDialog(BigDecimal amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        RhDialogFragment.Builder positiveButton = companion.create(fragmentActivityRequireActivity).setId(C30082R.id.dialog_id_queued_ach_deposit_potentially_exceeds_balance).setTitle(C30082R.string.queued_deposit_transfer_exceeds_current_balance_dialog_title, new Object[0]).setMessage(C30082R.string.queued_deposit_transfer_exceeds_current_balance_dialog_text, new Object[0]).setPositiveButton(C30082R.string.queued_deposit_transfer_exceeds_current_balance_dialog_cta, new Object[0]);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        RhDialogFragment.Builder.show$default(positiveButton, parentFragmentManager, "queued-deposit-exceeds-warning", false, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.transfers.ach.p265ui.BaseCreateAchTransferFragment
    protected void onReview(BigDecimal amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        EventLogger eventLogger = getEventLogger();
        UserInteractionEventData.Action action = UserInteractionEventData.Action.SUBMIT_QUEUED_DEPOSIT;
        Component component = new Component(Component.ComponentType.BUTTON, "submit", null, 4, null);
        PlaidIavMetadata plaidIavMetadata = getTransferContext().getPlaidIavMetadata();
        Intrinsics.checkNotNull(plaidIavMetadata);
        String institutionId = plaidIavMetadata.getInstitutionId();
        String str = institutionId == null ? "" : institutionId;
        String institutionName = plaidIavMetadata.getInstitutionName();
        String str2 = institutionName == null ? "" : institutionName;
        String linkSessionId = plaidIavMetadata.getLinkSessionId();
        String str3 = null;
        String str4 = null;
        String str5 = null;
        PlaidEventData plaidEventData = new PlaidEventData(null, null, null, null, null, str3, null, str, str2, null, linkSessionId == null ? "" : linkSessionId, str4, null, str5, null, null, null, null, null, null, 1047167, null);
        Money moneyForLogging = ExtensionsKt.toMoneyForLogging(amount);
        TransferContext.PaymentInstrument paymentInstrument = TransferContext.PaymentInstrument.ACH;
        String string2 = com.robinhood.android.transfers.ach.util.ExtensionsKt.getSessionId(this).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        TransferContext transferContext = new TransferContext(moneyForLogging, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, paymentInstrument, str3, string2, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE, 0 == true ? 1 : 0);
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, new UserInteractionEventData(UserInteractionEventData.EventType.TAP, getEventScreen(), component, action, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, 0 == true ? 1 : 0, null, str3, null, Context.ProductTag.QUEUED_DEPOSIT, 0, 0 == true ? 1 : 0, null, str4, 0 == true ? 1 : 0, str5, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, plaidEventData, null, transferContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -129, -81921, -1, -1, -1, -1, 16383, null), null, null, 96, null), false, false, 6, null);
        AnalyticsLogger.DefaultImpls.logUserAction$default(getAnalytics(), AnalyticsStrings.USER_ACTION_REVIEW_QUEUED_ACH_TRANSFER, null, null, "amount: " + amount.toPlainString(), 6, null);
        getCallbacks().onCreateQueuedDepositReview(amount);
    }

    /* compiled from: CreateQueuedAchDepositFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/CreateQueuedAchDepositFragment$Args;", "Landroid/os/Parcelable;", "transferContext", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;", "<init>", "(Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;)V", "getTransferContext", "()Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final com.robinhood.android.transfers.contracts.transfercontext.TransferContext transferContext;

        /* compiled from: CreateQueuedAchDepositFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((com.robinhood.android.transfers.contracts.transfercontext.TransferContext) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.transferContext, flags);
        }

        public Args(com.robinhood.android.transfers.contracts.transfercontext.TransferContext transferContext) {
            Intrinsics.checkNotNullParameter(transferContext, "transferContext");
            this.transferContext = transferContext;
        }

        public final com.robinhood.android.transfers.contracts.transfercontext.TransferContext getTransferContext() {
            return this.transferContext;
        }
    }

    /* compiled from: CreateQueuedAchDepositFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/CreateQueuedAchDepositFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/transfers/ach/ui/CreateQueuedAchDepositFragment;", "Lcom/robinhood/android/transfers/ach/ui/CreateQueuedAchDepositFragment$Args;", "<init>", "()V", "newInstance", "args", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<CreateQueuedAchDepositFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(CreateQueuedAchDepositFragment createQueuedAchDepositFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, createQueuedAchDepositFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CreateQueuedAchDepositFragment createQueuedAchDepositFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, createQueuedAchDepositFragment, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CreateQueuedAchDepositFragment newInstance(Args args) {
            Intrinsics.checkNotNullParameter(args, "args");
            CreateQueuedAchDepositFragment createQueuedAchDepositFragment = (CreateQueuedAchDepositFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
            createQueuedAchDepositFragment.requireArguments().putParcelable("extraTransferContext", args.getTransferContext());
            return createQueuedAchDepositFragment;
        }
    }
}
