package com.robinhood.android.acatsin.positionchecklist.alternate;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.compose.p011ui.text.String2;
import androidx.compose.p011ui.text.intl.Locale;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.acatsin.C7725R;
import com.robinhood.android.acatsin.databinding.FragmentAcatsInPositionChecklistImNotSureAlternateBinding;
import com.robinhood.android.acatsin.p058ui.AcatsFlowStepFragment3;
import com.robinhood.android.acatsin.positionchecklist.alternate.AcatsInPositionChecklistImNotSureAlternateContract;
import com.robinhood.android.acatsin.util.AcatsFlowStep;
import com.robinhood.android.acatsin.util.Eithers;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.formats.FormatAsList2;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.util.extensions.LottieAnimationViewsKt;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.models.api.bonfire.ApiBrokerage;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.utils.Either;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: AcatsInPositionChecklistImNotSureAlternateFragment.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u00060\u0015j\u0002`\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/acatsin/positionchecklist/alternate/AcatsInPositionChecklistImNotSureAlternateFragment;", "Lcom/robinhood/android/acatsin/ui/BaseAcatsFlowStepFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "viewBinding", "Lcom/robinhood/android/acatsin/databinding/FragmentAcatsInPositionChecklistImNotSureAlternateBinding;", "getViewBinding", "()Lcom/robinhood/android/acatsin/databinding/FragmentAcatsInPositionChecklistImNotSureAlternateBinding;", "viewBinding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/acatsin/positionchecklist/alternate/AcatsInPositionChecklistImNotSureAlternateContract$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/acatsin/positionchecklist/alternate/AcatsInPositionChecklistImNotSureAlternateContract$Callbacks;", "callbacks$delegate", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsInPositionChecklistImNotSureAlternateFragment extends AcatsFlowStepFragment3 implements AutoLoggableFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: viewBinding$delegate, reason: from kotlin metadata */
    private final Interfaces2 viewBinding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AcatsInPositionChecklistImNotSureAlternateFragment.class, "viewBinding", "getViewBinding()Lcom/robinhood/android/acatsin/databinding/FragmentAcatsInPositionChecklistImNotSureAlternateBinding;", 0)), Reflection.property1(new PropertyReference1Impl(AcatsInPositionChecklistImNotSureAlternateFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/acatsin/positionchecklist/alternate/AcatsInPositionChecklistImNotSureAlternateContract$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public AcatsInPositionChecklistImNotSureAlternateFragment() {
        super(C7725R.layout.fragment_acats_in_position_checklist_im_not_sure_alternate, null, AcatsFlowStep.POSITION_CHECKLIST_NOT_SURE_ALTERNATE, 2, null);
        this.viewBinding = ViewBinding5.viewBinding(this, AcatsInPositionChecklistImNotSureAlternateFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(AcatsInPositionChecklistImNotSureAlternateContract.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.acatsin.positionchecklist.alternate.AcatsInPositionChecklistImNotSureAlternateFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof AcatsInPositionChecklistImNotSureAlternateContract.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    /* compiled from: AcatsInPositionChecklistImNotSureAlternateFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/positionchecklist/alternate/AcatsInPositionChecklistImNotSureAlternateFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/acatsin/positionchecklist/alternate/AcatsInPositionChecklistImNotSureAlternateFragment;", "Lcom/robinhood/android/acatsin/positionchecklist/alternate/AcatsInPositionChecklistImNotSureAlternateContract$Key;", "<init>", "()V", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AcatsInPositionChecklistImNotSureAlternateFragment, AcatsInPositionChecklistImNotSureAlternateContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AcatsInPositionChecklistImNotSureAlternateContract.Key key) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AcatsInPositionChecklistImNotSureAlternateContract.Key getArgs(AcatsInPositionChecklistImNotSureAlternateFragment acatsInPositionChecklistImNotSureAlternateFragment) {
            return (AcatsInPositionChecklistImNotSureAlternateContract.Key) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, acatsInPositionChecklistImNotSureAlternateFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AcatsInPositionChecklistImNotSureAlternateFragment newInstance(AcatsInPositionChecklistImNotSureAlternateContract.Key key) {
            return (AcatsInPositionChecklistImNotSureAlternateFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AcatsInPositionChecklistImNotSureAlternateFragment acatsInPositionChecklistImNotSureAlternateFragment, AcatsInPositionChecklistImNotSureAlternateContract.Key key) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, acatsInPositionChecklistImNotSureAlternateFragment, key);
        }
    }

    private final FragmentAcatsInPositionChecklistImNotSureAlternateBinding getViewBinding() {
        Object value = this.viewBinding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentAcatsInPositionChecklistImNotSureAlternateBinding) value;
    }

    private final AcatsInPositionChecklistImNotSureAlternateContract.Callbacks getCallbacks() {
        return (AcatsInPositionChecklistImNotSureAlternateContract.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        Screen.Name name = Screen.Name.ACATS_IN_ACCOUNT_MAY_BE_ELIGIBLE;
        Companion companion = INSTANCE;
        return new Screen(name, ((AcatsInPositionChecklistImNotSureAlternateContract.Key) companion.getArgs((Fragment) this)).getScreenContext().getSource(), Eithers.getLoggingIdentifier(((AcatsInPositionChecklistImNotSureAlternateContract.Key) companion.getArgs((Fragment) this)).getBrokerageOrDtcNumber()), null, 8, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return ((AcatsInPositionChecklistImNotSureAlternateContract.Key) INSTANCE.getArgs((Fragment) this)).getScreenContext().toEventContext();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        LottieUrl.ACATS_ELIGIBLE_MAYBE.prefetch(context);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) throws Resources.NotFoundException {
        String string2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        FragmentAcatsInPositionChecklistImNotSureAlternateBinding viewBinding = getViewBinding();
        LottieAnimationView lottieview = viewBinding.lottieview;
        Intrinsics.checkNotNullExpressionValue(lottieview, "lottieview");
        LottieAnimationViewsKt.setRemoteUrl(lottieview, LottieUrl.ACATS_ELIGIBLE_MAYBE);
        RdsTextButton reviewWhatsTransferableBtn = viewBinding.reviewWhatsTransferableBtn;
        Intrinsics.checkNotNullExpressionValue(reviewWhatsTransferableBtn, "reviewWhatsTransferableBtn");
        ViewsKt.eventData$default(reviewWhatsTransferableBtn, false, new Function0() { // from class: com.robinhood.android.acatsin.positionchecklist.alternate.AcatsInPositionChecklistImNotSureAlternateFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInPositionChecklistImNotSureAlternateFragment.onViewCreated$lambda$6$lambda$0();
            }
        }, 1, null);
        RdsTextButton reviewWhatsTransferableBtn2 = viewBinding.reviewWhatsTransferableBtn;
        Intrinsics.checkNotNullExpressionValue(reviewWhatsTransferableBtn2, "reviewWhatsTransferableBtn");
        OnClickListeners.onClick(reviewWhatsTransferableBtn2, new Function0() { // from class: com.robinhood.android.acatsin.positionchecklist.alternate.AcatsInPositionChecklistImNotSureAlternateFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInPositionChecklistImNotSureAlternateFragment.onViewCreated$lambda$6$lambda$1(this.f$0);
            }
        });
        RdsButton continueButton = viewBinding.continueButton;
        Intrinsics.checkNotNullExpressionValue(continueButton, "continueButton");
        OnClickListeners.onClick(continueButton, new Function0() { // from class: com.robinhood.android.acatsin.positionchecklist.alternate.AcatsInPositionChecklistImNotSureAlternateFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInPositionChecklistImNotSureAlternateFragment.onViewCreated$lambda$6$lambda$2(this.f$0);
            }
        });
        RhTextView rhTextView = viewBinding.positionChecklistAlternateMaybeText;
        Companion companion = INSTANCE;
        Either<ApiBrokerage, String> brokerageOrDtcNumber = ((AcatsInPositionChecklistImNotSureAlternateContract.Key) companion.getArgs((Fragment) this)).getBrokerageOrDtcNumber();
        if (brokerageOrDtcNumber instanceof Either.Left) {
            List<String> unsupportedContents = ((AcatsInPositionChecklistImNotSureAlternateContract.Key) companion.getArgs((Fragment) this)).getUnsupportedContents();
            if (unsupportedContents != null) {
                Resources resources = getResources();
                int i = C7725R.string.position_checklist_alternate_maybe_body_partials_itemized;
                String name = ((ApiBrokerage) ((Either.Left) brokerageOrDtcNumber).getValue()).getName();
                List<String> list = unsupportedContents;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(String2.toLowerCase((String) it.next(), Locale.INSTANCE.getCurrent()));
                }
                StringResource asOrList = FormatAsList2.formatAsOrList(arrayList);
                Resources resources2 = getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                string2 = resources.getString(i, name, asOrList.getText(resources2));
            } else {
                string2 = getResources().getString(C7725R.string.position_checklist_alternate_maybe_body_partials, ((ApiBrokerage) ((Either.Left) brokerageOrDtcNumber).getValue()).getName());
            }
        } else {
            if (!(brokerageOrDtcNumber instanceof Either.Right)) {
                throw new NoWhenBranchMatchedException();
            }
            List<String> unsupportedContents2 = ((AcatsInPositionChecklistImNotSureAlternateContract.Key) companion.getArgs((Fragment) this)).getUnsupportedContents();
            if (unsupportedContents2 != null) {
                Resources resources3 = getResources();
                int i2 = C7725R.string.f3875xf11a4326;
                List<String> list2 = unsupportedContents2;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(String2.toLowerCase((String) it2.next(), Locale.INSTANCE.getCurrent()));
                }
                StringResource asOrList2 = FormatAsList2.formatAsOrList(arrayList2);
                Resources resources4 = getResources();
                Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
                string2 = resources3.getString(i2, asOrList2.getText(resources4));
            } else {
                string2 = getResources().getString(C7725R.string.position_checklist_alternate_maybe_body_partials_generic);
            }
        }
        rhTextView.setText(string2);
        RdsButton choosePartialsButton = viewBinding.choosePartialsButton;
        Intrinsics.checkNotNullExpressionValue(choosePartialsButton, "choosePartialsButton");
        OnClickListeners.onClick(choosePartialsButton, new Function0() { // from class: com.robinhood.android.acatsin.positionchecklist.alternate.AcatsInPositionChecklistImNotSureAlternateFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInPositionChecklistImNotSureAlternateFragment.onViewCreated$lambda$6$lambda$5(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$6$lambda$0() {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.OPEN_URL, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6$lambda$1(AcatsInPositionChecklistImNotSureAlternateFragment acatsInPositionChecklistImNotSureAlternateFragment) {
        WebUtils.viewUrl$default(acatsInPositionChecklistImNotSureAlternateFragment.requireContext(), C7725R.string.whats_transferable_url, 0, 4, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6$lambda$2(AcatsInPositionChecklistImNotSureAlternateFragment acatsInPositionChecklistImNotSureAlternateFragment) {
        acatsInPositionChecklistImNotSureAlternateFragment.getCallbacks().onFullTransferSelected();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6$lambda$5(AcatsInPositionChecklistImNotSureAlternateFragment acatsInPositionChecklistImNotSureAlternateFragment) {
        acatsInPositionChecklistImNotSureAlternateFragment.getCallbacks().onPartialTransferSelected();
        return Unit.INSTANCE;
    }
}
