package com.robinhood.android.common.margin.p083ui;

import android.os.Bundle;
import android.view.View;
import com.robinhood.android.brokeragecontent.BrokerageOtherMarkdown;
import com.robinhood.android.brokeragecontent.BrokerageResourceManager;
import com.robinhood.android.common.margin.C11223R;
import com.robinhood.android.common.margin.databinding.LimitedMarginRisksDialogFragmentBinding;
import com.robinhood.android.common.p088ui.BaseDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.staticcontent.model.OtherMarkdown;
import com.robinhood.utils.extensions.SinglesAndroid;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.noties.markwon.Markwon;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: LimitedMarginRisksDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001eH\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/LimitedMarginRisksDialogFragment;", "Lcom/robinhood/android/common/ui/BaseDialogFragment;", "<init>", "()V", "brokerageResourceManager", "Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;", "getBrokerageResourceManager", "()Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;", "setBrokerageResourceManager", "(Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "binding", "Lcom/robinhood/android/common/margin/databinding/LimitedMarginRisksDialogFragmentBinding;", "getBinding", "()Lcom/robinhood/android/common/margin/databinding/LimitedMarginRisksDialogFragmentBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "bindUi", "otherMarkdown", "Lcom/robinhood/staticcontent/model/OtherMarkdown;", "Companion", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class LimitedMarginRisksDialogFragment extends BaseDialogFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public BrokerageResourceManager brokerageResourceManager;
    public Markwon markwon;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(LimitedMarginRisksDialogFragment.class, "binding", "getBinding()Lcom/robinhood/android/common/margin/databinding/LimitedMarginRisksDialogFragmentBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public LimitedMarginRisksDialogFragment() {
        super(C11223R.layout.limited_margin_risks_dialog_fragment);
        this.binding = ViewBinding5.viewBinding(this, LimitedMarginRisksDialogFragment2.INSTANCE);
    }

    public final BrokerageResourceManager getBrokerageResourceManager() {
        BrokerageResourceManager brokerageResourceManager = this.brokerageResourceManager;
        if (brokerageResourceManager != null) {
            return brokerageResourceManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("brokerageResourceManager");
        return null;
    }

    public final void setBrokerageResourceManager(BrokerageResourceManager brokerageResourceManager) {
        Intrinsics.checkNotNullParameter(brokerageResourceManager, "<set-?>");
        this.brokerageResourceManager = brokerageResourceManager;
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

    private final LimitedMarginRisksDialogFragmentBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (LimitedMarginRisksDialogFragmentBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RdsButton doneBtn = getBinding().doneBtn;
        Intrinsics.checkNotNullExpressionValue(doneBtn, "doneBtn");
        OnClickListeners.onClick(doneBtn, new Function0() { // from class: com.robinhood.android.common.margin.ui.LimitedMarginRisksDialogFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LimitedMarginRisksDialogFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(getBrokerageResourceManager().loadResource(BrokerageOtherMarkdown.LIMITED_MARGIN_RISK)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C112342(this), Fragments2.getActivityErrorHandler(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(LimitedMarginRisksDialogFragment limitedMarginRisksDialogFragment) {
        limitedMarginRisksDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* compiled from: LimitedMarginRisksDialogFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.margin.ui.LimitedMarginRisksDialogFragment$onViewCreated$2 */
    /* synthetic */ class C112342 extends FunctionReferenceImpl implements Function1<OtherMarkdown, Unit> {
        C112342(Object obj) {
            super(1, obj, LimitedMarginRisksDialogFragment.class, "bindUi", "bindUi(Lcom/robinhood/staticcontent/model/OtherMarkdown;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OtherMarkdown otherMarkdown) {
            invoke2(otherMarkdown);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(OtherMarkdown p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((LimitedMarginRisksDialogFragment) this.receiver).bindUi(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindUi(OtherMarkdown otherMarkdown) {
        getBinding().titleTxt.setText(otherMarkdown.getTitle());
        getBinding().descriptionTxt.setText(getMarkwon().toMarkdown(otherMarkdown.getMarkdown2()));
    }

    /* compiled from: LimitedMarginRisksDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/LimitedMarginRisksDialogFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/common/margin/ui/LimitedMarginRisksDialogFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$LimitedMarginRisks;", "<init>", "()V", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolverWithArgsCompanion<LimitedMarginRisksDialogFragment, LegacyDialogFragmentKey.LimitedMarginRisks> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion, com.robinhood.android.navigation.DialogFragmentResolver
        public LimitedMarginRisksDialogFragment createDialogFragment(LegacyDialogFragmentKey.LimitedMarginRisks limitedMarginRisks) {
            return (LimitedMarginRisksDialogFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.createDialogFragment(this, limitedMarginRisks);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyDialogFragmentKey.LimitedMarginRisks getArgs(LimitedMarginRisksDialogFragment limitedMarginRisksDialogFragment) {
            return (LegacyDialogFragmentKey.LimitedMarginRisks) DialogFragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, limitedMarginRisksDialogFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public LimitedMarginRisksDialogFragment newInstance(LegacyDialogFragmentKey.LimitedMarginRisks limitedMarginRisks) {
            return (LimitedMarginRisksDialogFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, limitedMarginRisks);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(LimitedMarginRisksDialogFragment limitedMarginRisksDialogFragment, LegacyDialogFragmentKey.LimitedMarginRisks limitedMarginRisks) {
            DialogFragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, limitedMarginRisksDialogFragment, limitedMarginRisks);
        }
    }
}
