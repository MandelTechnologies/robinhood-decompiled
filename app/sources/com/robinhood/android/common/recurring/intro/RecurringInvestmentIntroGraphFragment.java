package com.robinhood.android.common.recurring.intro;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.common.recurring.databinding.FragmentRecurringInvestmentIntroGraphBinding;
import com.robinhood.android.common.recurring.intro.RecurringInvestmentBottomSheetFragment;
import com.robinhood.android.common.recurring.utils.RecurringInvestmentIntroUtils;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.text.Spans;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RecurringInvestmentIntroGraphFragment.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001$B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0011H\u0016J\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0016H\u0002J\b\u0010#\u001a\u00020\u0016H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0010\u0010\u0012¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/intro/RecurringInvestmentIntroGraphFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/common/recurring/intro/RecurringInvestmentBottomSheetFragment$Callbacks;", "<init>", "()V", "binding", "Lcom/robinhood/android/common/recurring/databinding/FragmentRecurringInvestmentIntroGraphBinding;", "getBinding", "()Lcom/robinhood/android/common/recurring/databinding/FragmentRecurringInvestmentIntroGraphBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/common/recurring/intro/RecurringInvestmentIntroCallbacks;", "getCallbacks", "()Lcom/robinhood/android/common/recurring/intro/RecurringInvestmentIntroCallbacks;", "callbacks$delegate", "isCrypto", "", "()Z", "isCrypto$delegate", "Lkotlin/Lazy;", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onBackPressed", "onUpdateFrequency", "frequency", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "showInvestmentFrequencyBottomSheetFragment", "setupDisclosureText", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RecurringInvestmentIntroGraphFragment extends BaseFragment implements RecurringInvestmentBottomSheetFragment.Callbacks {
    private static final String ARG_IS_CRYPTO = "isCrypto";

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: isCrypto$delegate, reason: from kotlin metadata */
    private final Lazy isCrypto;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RecurringInvestmentIntroGraphFragment.class, "binding", "getBinding()Lcom/robinhood/android/common/recurring/databinding/FragmentRecurringInvestmentIntroGraphBinding;", 0)), Reflection.property1(new PropertyReference1Impl(RecurringInvestmentIntroGraphFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/common/recurring/intro/RecurringInvestmentIntroCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public RecurringInvestmentIntroGraphFragment() {
        super(C11595R.layout.fragment_recurring_investment_intro_graph);
        this.binding = ViewBinding5.viewBinding(this, RecurringInvestmentIntroGraphFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(RecurringInvestmentIntroCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.common.recurring.intro.RecurringInvestmentIntroGraphFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.isCrypto = Fragments2.argument(this, "isCrypto");
    }

    private final FragmentRecurringInvestmentIntroGraphBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRecurringInvestmentIntroGraphBinding) value;
    }

    private final RecurringInvestmentIntroCallbacks getCallbacks() {
        return (RecurringInvestmentIntroCallbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    /* renamed from: isCrypto */
    public boolean getIsCrypto() {
        return ((Boolean) this.isCrypto.getValue()).booleanValue();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentRecurringInvestmentIntroGraphBinding binding = getBinding();
        binding.recurringInvestmentGraph.setFrequencyButtonOnClick(new Function0() { // from class: com.robinhood.android.common.recurring.intro.RecurringInvestmentIntroGraphFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecurringInvestmentIntroGraphFragment.onViewCreated$lambda$3$lambda$1(this.f$0);
            }
        });
        RdsButton cta = binding.cta;
        Intrinsics.checkNotNullExpressionValue(cta, "cta");
        OnClickListeners.onClick(cta, new Function0() { // from class: com.robinhood.android.common.recurring.intro.RecurringInvestmentIntroGraphFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecurringInvestmentIntroGraphFragment.onViewCreated$lambda$3$lambda$2(this.f$0);
            }
        });
        binding.recurringInvestmentGraph.setCrypto(getIsCrypto());
        setupDisclosureText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3$lambda$1(RecurringInvestmentIntroGraphFragment recurringInvestmentIntroGraphFragment) {
        recurringInvestmentIntroGraphFragment.showInvestmentFrequencyBottomSheetFragment();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3$lambda$2(RecurringInvestmentIntroGraphFragment recurringInvestmentIntroGraphFragment) {
        recurringInvestmentIntroGraphFragment.getCallbacks().onStartCreateRecurringInvestmentFlow();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        getCallbacks().onExitCreateRecurringInvestmentFlow();
        return true;
    }

    @Override // com.robinhood.android.common.recurring.intro.RecurringInvestmentBottomSheetFragment.Callbacks
    public void onUpdateFrequency(ApiInvestmentSchedule.Frequency frequency) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        getBinding().recurringInvestmentGraph.setFrequency(frequency);
    }

    private final void showInvestmentFrequencyBottomSheetFragment() {
        RecurringInvestmentBottomSheetFragment recurringInvestmentBottomSheetFragmentNewInstance = RecurringInvestmentBottomSheetFragment.INSTANCE.newInstance(getBinding().recurringInvestmentGraph.getFrequency(), getIsCrypto());
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        recurringInvestmentBottomSheetFragmentNewInstance.show(childFragmentManager, "recurring-investment-intro-frequency-bottom-sheet");
    }

    private final void setupDisclosureText() {
        RhTextView rhTextView = getBinding().disclosure;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) getString(C11595R.string.recurring_investment_graph_disclosure));
        String string2 = getString(C11595R.string.recurring_investment_graph_disclosure_clickable);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        spannableStringBuilder.append((CharSequence) "\n");
        Spans spans = Spans.INSTANCE;
        final boolean z = false;
        final boolean z2 = true;
        ClickableSpan clickableSpan = new ClickableSpan() { // from class: com.robinhood.android.common.recurring.intro.RecurringInvestmentIntroGraphFragment$setupDisclosureText$lambda$5$$inlined$appendClickableSpan$default$1
            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                Intrinsics.checkNotNullParameter(textPaint, "textPaint");
                textPaint.setColor(textPaint.linkColor);
                textPaint.setUnderlineText(z);
                if (z2) {
                    textPaint.setTypeface(Typeface.DEFAULT_BOLD);
                }
            }

            @Override // android.text.style.ClickableSpan
            public void onClick(View widget) {
                Intrinsics.checkNotNullParameter(widget, "widget");
                RecurringInvestmentIntroUtils recurringInvestmentIntroUtils = RecurringInvestmentIntroUtils.INSTANCE;
                Context contextRequireContext = this.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                FragmentManager childFragmentManager = this.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                recurringInvestmentIntroUtils.showDisclosureDialog(contextRequireContext, childFragmentManager);
            }
        };
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) string2);
        spannableStringBuilder.setSpan(clickableSpan, length, spannableStringBuilder.length(), 17);
        rhTextView.setText(new SpannedString(spannableStringBuilder));
    }

    /* compiled from: RecurringInvestmentIntroGraphFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/intro/RecurringInvestmentIntroGraphFragment$Companion;", "", "<init>", "()V", "ARG_IS_CRYPTO", "", "newInstance", "Lcom/robinhood/android/common/recurring/intro/RecurringInvestmentIntroGraphFragment;", "isCrypto", "", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RecurringInvestmentIntroGraphFragment newInstance(boolean isCrypto) {
            RecurringInvestmentIntroGraphFragment recurringInvestmentIntroGraphFragment = new RecurringInvestmentIntroGraphFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("isCrypto", isCrypto);
            recurringInvestmentIntroGraphFragment.setArguments(bundle);
            return recurringInvestmentIntroGraphFragment;
        }
    }
}
