package com.robinhood.android.transfers.ach.p265ui.posttransfer;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.airbnb.lottie.LottieAnimationView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.extensions.RichTexts;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.gold.contracts.GoldUpgradeIntentKey;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.transfers.ach.C30082R;
import com.robinhood.android.transfers.ach.databinding.FragmentAchTransferInstantDepositCleanupBinding;
import com.robinhood.android.transfers.ach.p265ui.posttransfer.AchTransferInstantDepositViewState;
import com.robinhood.android.util.extensions.LottieAnimationViewsKt;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.transfers.models.p406db.AchTransfer;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.Arrays;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: AchTransferInstantDepositFragment.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0002\"#B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020!H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferInstantDepositFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnClickListener;", "<init>", "()V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "binding", "Lcom/robinhood/android/transfers/ach/databinding/FragmentAchTransferInstantDepositCleanupBinding;", "getBinding", "()Lcom/robinhood/android/transfers/ach/databinding/FragmentAchTransferInstantDepositCleanupBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferInstantDepositDuxo;", "getDuxo", "()Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferInstantDepositDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "bindState", "state", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferInstantDepositViewState;", "refreshUi", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferInstantDepositViewState$Loaded;", "Args", "Companion", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class AchTransferInstantDepositFragment extends BaseFragment implements RhDialogFragment.OnClickListener {
    private static final String LOOP_END = "Rotation - Loop-Ends";
    private static final String LOOP_START = "Rotation - Loop-Starts";
    public AnalyticsLogger analytics;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AchTransferInstantDepositFragment.class, "binding", "getBinding()Lcom/robinhood/android/transfers/ach/databinding/FragmentAchTransferInstantDepositCleanupBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public AchTransferInstantDepositFragment() {
        super(C30082R.layout.fragment_ach_transfer_instant_deposit_cleanup);
        this.binding = ViewBinding5.viewBinding(this, AchTransferInstantDepositFragment2.INSTANCE);
        this.duxo = DuxosKt.duxo(this, AchTransferInstantDepositDuxo.class);
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    private final FragmentAchTransferInstantDepositCleanupBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentAchTransferInstantDepositCleanupBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AchTransferInstantDepositDuxo getDuxo() {
        return (AchTransferInstantDepositDuxo) this.duxo.getValue();
    }

    /* compiled from: AchTransferInstantDepositFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ach.ui.posttransfer.AchTransferInstantDepositFragment$onViewCreated$1", m3645f = "AchTransferInstantDepositFragment.kt", m3646l = {44}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ach.ui.posttransfer.AchTransferInstantDepositFragment$onViewCreated$1 */
    static final class C301811 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C301811(Continuation<? super C301811> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AchTransferInstantDepositFragment.this.new C301811(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C301811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AchTransferInstantDepositFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.transfers.ach.ui.posttransfer.AchTransferInstantDepositFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ AchTransferInstantDepositFragment $tmp0;

            AnonymousClass1(AchTransferInstantDepositFragment achTransferInstantDepositFragment) {
                this.$tmp0 = achTransferInstantDepositFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, AchTransferInstantDepositFragment.class, "bindState", "bindState(Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferInstantDepositViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(AchTransferInstantDepositViewState achTransferInstantDepositViewState, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$bindState = C301811.invokeSuspend$bindState(this.$tmp0, achTransferInstantDepositViewState, continuation);
                return objInvokeSuspend$bindState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$bindState : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((AchTransferInstantDepositViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<AchTransferInstantDepositViewState> stateFlow = AchTransferInstantDepositFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AchTransferInstantDepositFragment.this);
                this.label = 1;
                if (stateFlow.collect(anonymousClass1, this) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$bindState(AchTransferInstantDepositFragment achTransferInstantDepositFragment, AchTransferInstantDepositViewState achTransferInstantDepositViewState, Continuation continuation) {
            achTransferInstantDepositFragment.bindState(achTransferInstantDepositViewState);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C301811(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindState(AchTransferInstantDepositViewState state) {
        if (state instanceof AchTransferInstantDepositViewState.Loaded) {
            refreshUi((AchTransferInstantDepositViewState.Loaded) state);
        } else {
            if (!(state instanceof AchTransferInstantDepositViewState.Exit)) {
                throw new NoWhenBranchMatchedException();
            }
            requireActivity().finish();
        }
    }

    private final void refreshUi(final AchTransferInstantDepositViewState.Loaded state) {
        SpannableString spannableString$default;
        UiEvent<Unit> closeAfterGoldSubscriptionEvent = state.getCloseAfterGoldSubscriptionEvent();
        if ((closeAfterGoldSubscriptionEvent != null ? closeAfterGoldSubscriptionEvent.consume() : null) != null) {
            requireActivity().finish();
        }
        FragmentAchTransferInstantDepositCleanupBinding binding = getBinding();
        if (!binding.lottie.isAnimating()) {
            binding.lottie.setMaxFrame(LOOP_START);
            LottieAnimationView lottie = binding.lottie;
            Intrinsics.checkNotNullExpressionValue(lottie, "lottie");
            LottieAnimationViewsKt.addEndingInfiniteLoop(lottie, LOOP_START, LOOP_END, 2);
            binding.lottie.playAnimation();
        }
        RhTextView rhTextView = binding.detailText;
        int textRes = state.getDetail().getTextRes();
        String[] strArr = (String[]) state.getDetail().getFormatArgs().toArray(new String[0]);
        rhTextView.setText(getString(textRes, Arrays.copyOf(strArr, strArr.length)));
        RhTextView cryptoDetailText = binding.cryptoDetailText;
        Intrinsics.checkNotNullExpressionValue(cryptoDetailText, "cryptoDetailText");
        RichText instantDepositInfo = state.getInstantDepositInfo();
        if (instantDepositInfo != null) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            spannableString$default = RichTexts.toSpannableString$default(instantDepositInfo, contextRequireContext, null, false, null, 14, null);
        } else {
            spannableString$default = null;
        }
        TextViewsKt.setVisibilityText(cryptoDetailText, spannableString$default);
        RhTextView restrictionsText = binding.restrictionsText;
        Intrinsics.checkNotNullExpressionValue(restrictionsText, "restrictionsText");
        String string2 = ViewsKt.getString(restrictionsText, state.getRestrictions().getTextRes());
        num = num.intValue() == 0 ? null : 0;
        com.robinhood.android.common.util.extensions.TextViewsKt.setTextWithLearnMore((TextView) restrictionsText, (CharSequence) string2, false, false, num != null ? ViewsKt.getString(restrictionsText, num.intValue()) : null, (ClickableSpan) new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.transfers.ach.ui.posttransfer.AchTransferInstantDepositFragment$refreshUi$lambda$3$$inlined$setTextWithLearnMore$default$1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                String string3 = this.this$0.getText(state.getRestrictions().getLearnMoreLink()).toString();
                Navigator navigator = this.this$0.getNavigator();
                Context contextRequireContext2 = this.this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                Navigators3.showHelpCenterWebViewFragment(navigator, contextRequireContext2, string3);
            }
        }, 1, (DefaultConstructorMarker) null));
        RdsButton doneButton = binding.doneButton;
        Intrinsics.checkNotNullExpressionValue(doneButton, "doneButton");
        OnClickListeners.onClick(doneButton, new Function0() { // from class: com.robinhood.android.transfers.ach.ui.posttransfer.AchTransferInstantDepositFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AchTransferInstantDepositFragment.refreshUi$lambda$3$lambda$1(this.f$0);
            }
        });
        RdsButton goldHookButton = binding.goldHookButton;
        Intrinsics.checkNotNullExpressionValue(goldHookButton, "goldHookButton");
        goldHookButton.setVisibility(state.getShowGoldHookButton() ? 0 : 8);
        RdsButton goldHookButton2 = binding.goldHookButton;
        Intrinsics.checkNotNullExpressionValue(goldHookButton2, "goldHookButton");
        OnClickListeners.onClick(goldHookButton2, new Function0() { // from class: com.robinhood.android.transfers.ach.ui.posttransfer.AchTransferInstantDepositFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AchTransferInstantDepositFragment.refreshUi$lambda$3$lambda$2(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshUi$lambda$3$lambda$1(AchTransferInstantDepositFragment achTransferInstantDepositFragment) {
        achTransferInstantDepositFragment.getDuxo().onContinue();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshUi$lambda$3$lambda$2(AchTransferInstantDepositFragment achTransferInstantDepositFragment) {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(achTransferInstantDepositFragment.getAnalytics(), AnalyticsStrings.BUTTON_GROUP_DEPOSIT_FLOW_HOOKS, AnalyticsStrings.BUTTON_NUX_BIGGER_INSTANT_DEPOSITS, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        Navigator navigator = achTransferInstantDepositFragment.getNavigator();
        Context contextRequireContext = achTransferInstantDepositFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new GoldUpgradeIntentKey("deposit_success_gold_instant_upsell", null, null, null, null, false, 62, null), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    /* compiled from: AchTransferInstantDepositFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferInstantDepositFragment$Args;", "Landroid/os/Parcelable;", "achTransfer", "Lcom/robinhood/transfers/models/db/AchTransfer;", "<init>", "(Lcom/robinhood/transfers/models/db/AchTransfer;)V", "getAchTransfer", "()Lcom/robinhood/transfers/models/db/AchTransfer;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final AchTransfer achTransfer;

        /* compiled from: AchTransferInstantDepositFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((AchTransfer) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, AchTransfer achTransfer, int i, Object obj) {
            if ((i & 1) != 0) {
                achTransfer = args.achTransfer;
            }
            return args.copy(achTransfer);
        }

        /* renamed from: component1, reason: from getter */
        public final AchTransfer getAchTransfer() {
            return this.achTransfer;
        }

        public final Args copy(AchTransfer achTransfer) {
            Intrinsics.checkNotNullParameter(achTransfer, "achTransfer");
            return new Args(achTransfer);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.achTransfer, ((Args) other).achTransfer);
        }

        public int hashCode() {
            return this.achTransfer.hashCode();
        }

        public String toString() {
            return "Args(achTransfer=" + this.achTransfer + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.achTransfer, flags);
        }

        public Args(AchTransfer achTransfer) {
            Intrinsics.checkNotNullParameter(achTransfer, "achTransfer");
            this.achTransfer = achTransfer;
        }

        public final AchTransfer getAchTransfer() {
            return this.achTransfer;
        }
    }

    /* compiled from: AchTransferInstantDepositFragment.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferInstantDepositFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferInstantDepositFragment;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferInstantDepositFragment$Args;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$AchTransferInstantDepositFragmentV3;", "<init>", "()V", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "LOOP_START", "", "LOOP_END", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<AchTransferInstantDepositFragment, Args>, FragmentResolver<LegacyFragmentKey.AchTransferInstantDepositFragmentV3> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(AchTransferInstantDepositFragment achTransferInstantDepositFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, achTransferInstantDepositFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AchTransferInstantDepositFragment newInstance(Args args) {
            return (AchTransferInstantDepositFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AchTransferInstantDepositFragment achTransferInstantDepositFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, achTransferInstantDepositFragment, args);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.AchTransferInstantDepositFragmentV3 key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return newInstance((Parcelable) new Args(key.getAchTransfer()));
        }
    }
}
