package com.robinhood.android.debitcard.linking.p098ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.debitcard.linking.C13894R;
import com.robinhood.android.debitcard.linking.databinding.FragmentDebitCardVerificationInfoBinding;
import com.robinhood.android.debitcard.linking.p098ui.DebitCardVerificationInfoContent;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
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
import me.saket.bettermovementmethod.BetterLinkMovementMethod;

/* compiled from: DebitCardVerificationInfoFragment.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0002+,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010)\u001a\u00020*H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\t\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationInfoFragment;", "Lcom/robinhood/android/debitcard/linking/ui/AutoLoggableDebitCardLinkingFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/debitcard/linking/databinding/FragmentDebitCardVerificationInfoBinding;", "getBinding", "()Lcom/robinhood/android/debitcard/linking/databinding/FragmentDebitCardVerificationInfoBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "protoScreenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "getProtoScreenName", "()Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "duxo", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationInfoDuxo;", "getDuxo", "()Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationInfoDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationInfoFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationInfoFragment$Callbacks;", "callbacks$delegate", "adapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationInfoContent$Row;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onBackPressed", "", "Callbacks", "Companion", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class DebitCardVerificationInfoFragment extends AutoLoggableDebitCardLinkingFragment {
    private final GenericListAdapter<RdsRowView, DebitCardVerificationInfoContent.Row> adapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    private final Screen.Name protoScreenName;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DebitCardVerificationInfoFragment.class, "binding", "getBinding()Lcom/robinhood/android/debitcard/linking/databinding/FragmentDebitCardVerificationInfoBinding;", 0)), Reflection.property1(new PropertyReference1Impl(DebitCardVerificationInfoFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationInfoFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DebitCardVerificationInfoFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationInfoFragment$Callbacks;", "", "onContinueWithVerification", "", "onVerifyLater", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onContinueWithVerification();

        void onVerifyLater();
    }

    public DebitCardVerificationInfoFragment() {
        super(C13894R.layout.fragment_debit_card_verification_info);
        this.binding = ViewBinding5.viewBinding(this, DebitCardVerificationInfoFragment2.INSTANCE);
        this.protoScreenName = Screen.Name.VERIFY_DEBIT_CARD_STEPS;
        this.duxo = OldDuxos.oldDuxo(this, DebitCardVerificationInfoDuxo.class);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardVerificationInfoFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        GenericListAdapter.Companion companion = GenericListAdapter.INSTANCE;
        RdsRowView.ValuePropRowInflater valuePropRowInflater = RdsRowView.ValuePropRowInflater.INSTANCE;
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        this.adapter = companion.m2987of(valuePropRowInflater, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardVerificationInfoFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DebitCardVerificationInfoFragment.adapter$lambda$0((RdsRowView) obj, (DebitCardVerificationInfoContent.Row) obj2);
            }
        });
    }

    private final FragmentDebitCardVerificationInfoBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentDebitCardVerificationInfoBinding) value;
    }

    @Override // com.robinhood.android.debitcard.linking.p098ui.AutoLoggableDebitCardLinkingFragment
    public Screen.Name getProtoScreenName() {
        return this.protoScreenName;
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    private final DebitCardVerificationInfoDuxo getDuxo() {
        return (DebitCardVerificationInfoDuxo) this.duxo.getValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$0(RdsRowView of, DebitCardVerificationInfoContent.Row row) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(row, "row");
        of.setPogNumber(Integer.valueOf(row.getPogNumber()));
        of.setPrimaryText(row.getPrimaryText());
        of.setSecondaryText(row.getSecondaryText());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        final FragmentDebitCardVerificationInfoBinding binding = getBinding();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardVerificationInfoFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DebitCardVerificationInfoFragment.onViewCreated$lambda$7$lambda$1(binding, this, (DebitCardVerificationInfoViewState) obj);
            }
        });
        binding.recyclerView.setAdapter(this.adapter);
        RdsButton rdsButton = binding.primaryButton;
        Intrinsics.checkNotNull(rdsButton);
        ViewsKt.eventData$default(rdsButton, false, new Function0() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardVerificationInfoFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DebitCardVerificationInfoFragment.onViewCreated$lambda$7$lambda$3$lambda$2(this.f$0);
            }
        }, 1, null);
        OnClickListeners.onClick(rdsButton, new DebitCardVerificationInfoFragment3(getCallbacks()));
        RdsButton rdsButton2 = binding.secondaryButton;
        Intrinsics.checkNotNull(rdsButton2);
        ViewsKt.eventData$default(rdsButton2, false, new Function0() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardVerificationInfoFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DebitCardVerificationInfoFragment.onViewCreated$lambda$7$lambda$5$lambda$4(this.f$0);
            }
        }, 1, null);
        OnClickListeners.onClick(rdsButton2, new DebitCardVerificationInfoFragment4(getCallbacks()));
        RhTextView rhTextView = binding.disclosure;
        BetterLinkMovementMethod betterLinkMovementMethodNewInstance = BetterLinkMovementMethod.newInstance();
        betterLinkMovementMethodNewInstance.setOnLinkClickListener(new BetterLinkMovementMethod.OnLinkClickListener() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardVerificationInfoFragment$onViewCreated$1$4$1
            @Override // me.saket.bettermovementmethod.BetterLinkMovementMethod.OnLinkClickListener
            public final boolean onClick(TextView textView, String str) {
                EventLogger.DefaultImpls.logTap$default(this.this$0.getEventLogger(), UserInteractionEventData.Action.NEED_HELP, this.this$0.getEventScreen(), new Component(Component.ComponentType.LINK_BUTTON, null, null, 6, null), null, this.this$0.getLoggingContext(), false, 40, null);
                Navigator navigator = this.this$0.getNavigator();
                Context contextRequireContext = this.this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Intrinsics.checkNotNull(str);
                Navigators3.showHelpCenterWebViewFragment(navigator, contextRequireContext, str);
                return true;
            }
        });
        rhTextView.setMovementMethod(betterLinkMovementMethodNewInstance);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7$lambda$1(FragmentDebitCardVerificationInfoBinding fragmentDebitCardVerificationInfoBinding, DebitCardVerificationInfoFragment debitCardVerificationInfoFragment, DebitCardVerificationInfoViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        ShimmerLoadingView loadingView = fragmentDebitCardVerificationInfoBinding.loadingView;
        Intrinsics.checkNotNullExpressionValue(loadingView, "loadingView");
        loadingView.setVisibility(state.isLoadingViewVisible() ? 0 : 8);
        ConstraintLayout content = fragmentDebitCardVerificationInfoBinding.content;
        Intrinsics.checkNotNullExpressionValue(content, "content");
        content.setVisibility(state.isContentVisible() ? 0 : 8);
        RhTextView title = fragmentDebitCardVerificationInfoBinding.title;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        TextViewsKt.setVisibilityText(title, state.getTitleVisibilityText());
        debitCardVerificationInfoFragment.adapter.submitList(state.getRows());
        RhTextView disclosure = fragmentDebitCardVerificationInfoBinding.disclosure;
        Intrinsics.checkNotNullExpressionValue(disclosure, "disclosure");
        TextViewsKt.setVisibilityText(disclosure, state.getDisclosure());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$7$lambda$3$lambda$2(DebitCardVerificationInfoFragment debitCardVerificationInfoFragment) {
        return new UserInteractionEventDescriptor(null, debitCardVerificationInfoFragment.getEventScreen(), UserInteractionEventData.Action.CONTINUE, debitCardVerificationInfoFragment.getLoggingContext(), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 33, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$7$lambda$5$lambda$4(DebitCardVerificationInfoFragment debitCardVerificationInfoFragment) {
        return new UserInteractionEventDescriptor(null, debitCardVerificationInfoFragment.getEventScreen(), UserInteractionEventData.Action.CANCEL, debitCardVerificationInfoFragment.getLoggingContext(), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 33, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        requireActivity().finish();
        return true;
    }

    /* compiled from: DebitCardVerificationInfoFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationInfoFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithoutArgsCompanion;", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationInfoFragment;", "<init>", "()V", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithoutArgsCompanion<DebitCardVerificationInfoFragment> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public /* bridge */ /* synthetic */ Parcelable getArgs(Fragment fragment) {
            return (Parcelable) getArgs((DebitCardVerificationInfoFragment) fragment);
        }

        public Void getArgs(DebitCardVerificationInfoFragment debitCardVerificationInfoFragment) {
            return FragmentWithoutArgsCompanion.DefaultImpls.getArgs(this, debitCardVerificationInfoFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public DebitCardVerificationInfoFragment newInstance() {
            return (DebitCardVerificationInfoFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public DebitCardVerificationInfoFragment newInstance(Void r1) {
            return (DebitCardVerificationInfoFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this, r1);
        }
    }
}
