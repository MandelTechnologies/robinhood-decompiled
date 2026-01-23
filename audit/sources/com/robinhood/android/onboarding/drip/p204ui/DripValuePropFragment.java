package com.robinhood.android.onboarding.drip.p204ui;

import android.content.Context;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.util.extensions.TextViewsKt;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.onboarding.drip.C22776R;
import com.robinhood.android.onboarding.drip.p204ui.DripValuePropFragment;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.librobinhood.data.store.DripEligibility;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.NoSuchElementException;
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

/* compiled from: DripValuePropFragment.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0002!\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/onboarding/drip/ui/DripValuePropFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/onboarding/drip/ui/DripValuePropFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/onboarding/drip/ui/DripValuePropFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "dripPropSummaryTxt", "Lcom/robinhood/android/designsystem/text/RhTextView;", "getDripPropSummaryTxt", "()Lcom/robinhood/android/designsystem/text/RhTextView;", "dripPropSummaryTxt$delegate", "continueButton", "Lcom/robinhood/android/designsystem/button/RdsButton;", "getContinueButton", "()Lcom/robinhood/android/designsystem/button/RdsButton;", "continueButton$delegate", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onAttach", "context", "Landroid/content/Context;", "Callbacks", "Companion", "feature-drip-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class DripValuePropFragment extends BaseFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: continueButton$delegate, reason: from kotlin metadata */
    private final Interfaces2 continueButton;

    /* renamed from: dripPropSummaryTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 dripPropSummaryTxt;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DripValuePropFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/onboarding/drip/ui/DripValuePropFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(DripValuePropFragment.class, "dripPropSummaryTxt", "getDripPropSummaryTxt()Lcom/robinhood/android/designsystem/text/RhTextView;", 0)), Reflection.property1(new PropertyReference1Impl(DripValuePropFragment.class, "continueButton", "getContinueButton()Lcom/robinhood/android/designsystem/button/RdsButton;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DripValuePropFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/onboarding/drip/ui/DripValuePropFragment$Callbacks;", "", "onValuePropContinueClicked", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/librobinhood/data/store/DripEligibility$Eligible;", "feature-drip-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onValuePropContinueClicked(DripEligibility.Eligible data);
    }

    public DripValuePropFragment() {
        super(C22776R.layout.fragment_drip_value_prop);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.onboarding.drip.ui.DripValuePropFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof DripValuePropFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.dripPropSummaryTxt = bindView(C22776R.id.drip_prop_summary_txt);
        this.continueButton = bindView(C22776R.id.drip_prop_continue_btn);
        this.useDesignSystemToolbar = true;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final RhTextView getDripPropSummaryTxt() {
        return (RhTextView) this.dripPropSummaryTxt.getValue(this, $$delegatedProperties[1]);
    }

    private final RdsButton getContinueButton() {
        return (RdsButton) this.continueButton.getValue(this, $$delegatedProperties[2]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        RhTextView dripPropSummaryTxt = getDripPropSummaryTxt();
        String string2 = ViewsKt.getString(dripPropSummaryTxt, C22776R.string.drip_value_prop_header_description);
        num = num.intValue() == 0 ? null : 0;
        TextViewsKt.setTextWithLearnMore((TextView) dripPropSummaryTxt, (CharSequence) string2, false, false, num != null ? ViewsKt.getString(dripPropSummaryTxt, num.intValue()) : null, (ClickableSpan) new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.onboarding.drip.ui.DripValuePropFragment$onViewCreated$$inlined$setTextWithLearnMore$default$1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                WebUtils.viewUrl$default(this.this$0.getContext(), this.this$0.getResources().getString(C22776R.string.drip_learn_article_url), 0, 4, (Object) null);
            }
        }, 1, (DefaultConstructorMarker) null));
        OnClickListeners.onClick(getContinueButton(), new Function0() { // from class: com.robinhood.android.onboarding.drip.ui.DripValuePropFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DripValuePropFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(DripValuePropFragment dripValuePropFragment) {
        dripValuePropFragment.getCallbacks().onValuePropContinueClicked((DripEligibility.Eligible) INSTANCE.getArgs((Fragment) dripValuePropFragment));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    /* compiled from: DripValuePropFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/onboarding/drip/ui/DripValuePropFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/onboarding/drip/ui/DripValuePropFragment;", "Lcom/robinhood/librobinhood/data/store/DripEligibility$Eligible;", "<init>", "()V", "feature-drip-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DripValuePropFragment, DripEligibility.Eligible> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public DripEligibility.Eligible getArgs(DripValuePropFragment dripValuePropFragment) {
            return (DripEligibility.Eligible) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, dripValuePropFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DripValuePropFragment newInstance(DripEligibility.Eligible eligible) {
            return (DripValuePropFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, eligible);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DripValuePropFragment dripValuePropFragment, DripEligibility.Eligible eligible) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, dripValuePropFragment, eligible);
        }
    }
}
