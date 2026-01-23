package com.robinhood.android.microdeposits.p182ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.microdeposits.C21805R;
import com.robinhood.android.microdeposits.p182ui.AchRelationshipCreatedFragment;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: AchRelationshipCreatedFragment.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 (2\u00020\u0001:\u0002'(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0005H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0004\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010#\u001a\u0004\u0018\u00010$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/microdeposits/ui/AchRelationshipCreatedFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", AchRelationshipCreatedFragment.ARG_IS_QUEUED, "", "()Z", "isQueued$delegate", "Lkotlin/Lazy;", "summaryTxt", "Landroid/widget/TextView;", "getSummaryTxt", "()Landroid/widget/TextView;", "summaryTxt$delegate", "Lkotlin/properties/ReadOnlyProperty;", "nextBtn", "Landroid/widget/Button;", "getNextBtn", "()Landroid/widget/Button;", "nextBtn$delegate", "callbacks", "Lcom/robinhood/android/microdeposits/ui/AchRelationshipCreatedFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/microdeposits/ui/AchRelationshipCreatedFragment$Callbacks;", "callbacks$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onBackPressed", "screenDescription", "", "getScreenDescription", "()Ljava/lang/String;", "Callbacks", "Companion", "feature-microdeposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class AchRelationshipCreatedFragment extends BaseFragment {
    private static final String ARG_IS_QUEUED = "isQueued";

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: isQueued$delegate, reason: from kotlin metadata */
    private final Lazy isQueued;

    /* renamed from: nextBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 nextBtn;

    /* renamed from: summaryTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 summaryTxt;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AchRelationshipCreatedFragment.class, "summaryTxt", "getSummaryTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(AchRelationshipCreatedFragment.class, "nextBtn", "getNextBtn()Landroid/widget/Button;", 0)), Reflection.property1(new PropertyReference1Impl(AchRelationshipCreatedFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/microdeposits/ui/AchRelationshipCreatedFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AchRelationshipCreatedFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/microdeposits/ui/AchRelationshipCreatedFragment$Callbacks;", "", "onComplete", "", "feature-microdeposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onComplete();
    }

    @JvmStatic
    public static final AchRelationshipCreatedFragment newInstance(boolean z) {
        return INSTANCE.newInstance(z);
    }

    public AchRelationshipCreatedFragment() {
        super(C21805R.layout.fragment_ach_relationship_created);
        this.isQueued = Fragments2.argument(this, ARG_IS_QUEUED);
        this.summaryTxt = bindView(C21805R.id.summary_txt);
        this.nextBtn = bindView(C21805R.id.next_btn);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.microdeposits.ui.AchRelationshipCreatedFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof AchRelationshipCreatedFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    private final boolean isQueued() {
        return ((Boolean) this.isQueued.getValue()).booleanValue();
    }

    private final TextView getSummaryTxt() {
        return (TextView) this.summaryTxt.getValue(this, $$delegatedProperties[0]);
    }

    private final Button getNextBtn() {
        return (Button) this.nextBtn.getValue(this, $$delegatedProperties[1]);
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[2]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        int i;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        TextView summaryTxt = getSummaryTxt();
        if (isQueued()) {
            i = C21805R.string.iav_custom_verify_microdeposit_queued_explanation;
        } else {
            i = C21805R.string.iav_custom_verify_microdeposit_explanation;
        }
        summaryTxt.setText(i);
        OnClickListeners.onClick(getNextBtn(), new C218111(getCallbacks()));
    }

    /* compiled from: AchRelationshipCreatedFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.microdeposits.ui.AchRelationshipCreatedFragment$onViewCreated$1 */
    /* synthetic */ class C218111 extends FunctionReferenceImpl implements Function0<Unit> {
        C218111(Object obj) {
            super(0, obj, Callbacks.class, "onComplete", "onComplete()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((Callbacks) this.receiver).onComplete();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle(C21805R.string.ach_create_pending_title);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        getCallbacks().onComplete();
        return true;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNull(fragmentActivityRequireActivity, "null cannot be cast to non-null type com.robinhood.android.microdeposits.ui.CreateAchRelationshipActivity");
        return ((CreateAchRelationshipActivity) fragmentActivityRequireActivity).getIavSource$feature_microdeposits_externalDebug().getAnalyticsTag();
    }

    /* compiled from: AchRelationshipCreatedFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/microdeposits/ui/AchRelationshipCreatedFragment$Companion;", "", "<init>", "()V", "ARG_IS_QUEUED", "", "newInstance", "Lcom/robinhood/android/microdeposits/ui/AchRelationshipCreatedFragment;", AchRelationshipCreatedFragment.ARG_IS_QUEUED, "", "feature-microdeposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AchRelationshipCreatedFragment newInstance(boolean isQueued) {
            AchRelationshipCreatedFragment achRelationshipCreatedFragment = new AchRelationshipCreatedFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean(AchRelationshipCreatedFragment.ARG_IS_QUEUED, isQueued);
            achRelationshipCreatedFragment.setArguments(bundle);
            return achRelationshipCreatedFragment;
        }
    }
}
