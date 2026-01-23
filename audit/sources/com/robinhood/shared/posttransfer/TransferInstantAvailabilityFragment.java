package com.robinhood.shared.posttransfer;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.extensions.RichTexts;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView;
import com.robinhood.android.util.extensions.LottieAnimationViewsKt;
import com.robinhood.models.api.bonfire.ApiPostTransferPage;
import com.robinhood.models.p355ui.bonfire.UiPostTransferPage;
import com.robinhood.models.serverdriven.p347db.GenericButton;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.posttransfer.databinding.FragmentTransferInstantAvailabilityBinding;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.noties.markwon.Markwon;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: TransferInstantAvailabilityFragment.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/shared/posttransfer/TransferInstantAvailabilityFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "binding", "Lcom/robinhood/shared/posttransfer/databinding/FragmentTransferInstantAvailabilityBinding;", "getBinding", "()Lcom/robinhood/shared/posttransfer/databinding/FragmentTransferInstantAvailabilityBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/shared/posttransfer/TransferInstantAvailabilityFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/shared/posttransfer/TransferInstantAvailabilityFragment$Callbacks;", "callbacks$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "startLottieAnimation", "lottie", "Lcom/airbnb/lottie/LottieAnimationView;", "Callbacks", "Companion", "lib-post-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class TransferInstantAvailabilityFragment extends BaseFragment {
    private static final String LOOP_END = "Rotation - Loop-Ends";
    private static final String LOOP_START = "Rotation - Loop-Starts";

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    public Markwon markwon;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(TransferInstantAvailabilityFragment.class, "binding", "getBinding()Lcom/robinhood/shared/posttransfer/databinding/FragmentTransferInstantAvailabilityBinding;", 0)), Reflection.property1(new PropertyReference1Impl(TransferInstantAvailabilityFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/posttransfer/TransferInstantAvailabilityFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: TransferInstantAvailabilityFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/shared/posttransfer/TransferInstantAvailabilityFragment$Callbacks;", "", "onContinueClick", "", "lib-post-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onContinueClick();
    }

    public TransferInstantAvailabilityFragment() {
        super(C39496R.layout.fragment_transfer_instant_availability);
        this.binding = ViewBinding5.viewBinding(this, TransferInstantAvailabilityFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.posttransfer.TransferInstantAvailabilityFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    private final FragmentTransferInstantAvailabilityBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentTransferInstantAvailabilityBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        SpannableString spannableString$default;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        FragmentTransferInstantAvailabilityBinding binding = getBinding();
        LottieAnimationView lottie = binding.lottie;
        Intrinsics.checkNotNullExpressionValue(lottie, "lottie");
        startLottieAnimation(lottie);
        RhTextView rhTextView = binding.titleTxt;
        Companion companion = INSTANCE;
        rhTextView.setText(((UiPostTransferPage.InstantAvailability) companion.getArgs((Fragment) this)).getTitle());
        RhTextView rhTextView2 = binding.detailTxt;
        RichText detail = ((UiPostTransferPage.InstantAvailability) companion.getArgs((Fragment) this)).getDetail();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        rhTextView2.setText(RichTexts.toSpannableString$default(detail, contextRequireContext, null, false, null, 14, null));
        RhTextView additionalDetailTxt = binding.additionalDetailTxt;
        Intrinsics.checkNotNullExpressionValue(additionalDetailTxt, "additionalDetailTxt");
        RichText additionalDetail = ((UiPostTransferPage.InstantAvailability) companion.getArgs((Fragment) this)).getAdditionalDetail();
        if (additionalDetail != null) {
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            spannableString$default = RichTexts.toSpannableString$default(additionalDetail, contextRequireContext2, null, false, null, 14, null);
        } else {
            spannableString$default = null;
        }
        TextViewsKt.setVisibilityText(additionalDetailTxt, spannableString$default);
        RhTextView disclosureTxt = binding.disclosureTxt;
        Intrinsics.checkNotNullExpressionValue(disclosureTxt, "disclosureTxt");
        ScarletManager2.overrideAttribute(disclosureTxt, android.R.attr.textColorLink, ThemeAttributes.INSTANCE.getCOLOR_FOREGROUND_2());
        binding.disclosureTxt.setText(getMarkwon().toMarkdown(((UiPostTransferPage.InstantAvailability) companion.getArgs((Fragment) this)).getDisclosureMarkdown()));
        binding.primaryBtn.setText(((UiPostTransferPage.InstantAvailability) companion.getArgs((Fragment) this)).getPrimaryButton().getTitle());
        RdsButton primaryBtn = binding.primaryBtn;
        Intrinsics.checkNotNullExpressionValue(primaryBtn, "primaryBtn");
        OnClickListeners.onClick(primaryBtn, new TransferInstantAvailabilityFragment3(getCallbacks()));
        GenericButton goldHook = ((UiPostTransferPage.InstantAvailability) companion.getArgs((Fragment) this)).getGoldHook();
        if (goldHook != null) {
            ClientComponentButtonView goldHookBtn = binding.goldHookBtn;
            Intrinsics.checkNotNullExpressionValue(goldHookBtn, "goldHookBtn");
            goldHookBtn.setVisibility(0);
            binding.goldHookBtn.bind(ServerDrivenButton.INSTANCE.from(goldHook));
        }
        if (((UiPostTransferPage.InstantAvailability) companion.getArgs((Fragment) this)).getDesignVariant() == ApiPostTransferPage.InstantAvailability.InstantAvailabilityDesignType.RECURRING_GOLD_UPSELLS) {
            LottieAnimationView lottieBottom = binding.lottieBottom;
            Intrinsics.checkNotNullExpressionValue(lottieBottom, "lottieBottom");
            startLottieAnimation(lottieBottom);
            LottieAnimationView lottieBottom2 = binding.lottieBottom;
            Intrinsics.checkNotNullExpressionValue(lottieBottom2, "lottieBottom");
            lottieBottom2.setVisibility(0);
            LottieAnimationView lottie2 = binding.lottie;
            Intrinsics.checkNotNullExpressionValue(lottie2, "lottie");
            lottie2.setVisibility(8);
            binding.lottie.cancelAnimation();
            binding.titleTxt.setGravity(2);
            binding.detailTxt.setGravity(2);
            binding.additionalDetailTxt.setGravity(2);
        }
    }

    private final void startLottieAnimation(LottieAnimationView lottie) {
        if (lottie.isAnimating()) {
            return;
        }
        lottie.setMaxFrame(LOOP_START);
        LottieAnimationViewsKt.addEndingInfiniteLoop(lottie, LOOP_START, LOOP_END, 2);
        lottie.playAnimation();
    }

    /* compiled from: TransferInstantAvailabilityFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/posttransfer/TransferInstantAvailabilityFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/shared/posttransfer/TransferInstantAvailabilityFragment;", "Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$InstantAvailability;", "<init>", "()V", "LOOP_START", "", "LOOP_END", "lib-post-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<TransferInstantAvailabilityFragment, UiPostTransferPage.InstantAvailability> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public UiPostTransferPage.InstantAvailability getArgs(TransferInstantAvailabilityFragment transferInstantAvailabilityFragment) {
            return (UiPostTransferPage.InstantAvailability) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, transferInstantAvailabilityFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public TransferInstantAvailabilityFragment newInstance(UiPostTransferPage.InstantAvailability instantAvailability) {
            return (TransferInstantAvailabilityFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, instantAvailability);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(TransferInstantAvailabilityFragment transferInstantAvailabilityFragment, UiPostTransferPage.InstantAvailability instantAvailability) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, transferInstantAvailabilityFragment, instantAvailability);
        }
    }
}
