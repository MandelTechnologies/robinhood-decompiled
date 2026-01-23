package com.robinhood.android.common.onboarding.p085ui;

import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.view.ViewGroup2;
import com.robinhood.android.common.onboarding.C11287R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.equitydetail.p123ui.statistics.StatisticsSection2;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlin.sequences.SequencesKt;

/* compiled from: BaseScrollableFragment.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00172\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010-\u001a\u00020)H\u0016J\b\u0010.\u001a\u00020)H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000f\u0010\nR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u001c8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010 \u001a\u00020!8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0015\u001a\u0004\b\"\u0010#R\u001b\u0010%\u001a\u00020!8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0015\u001a\u0004\b&\u0010#¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/common/onboarding/ui/BaseScrollableFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "scrollableContentRes", "", "<init>", "(I)V", "getScrollableContentRes", "()I", "disclaimerStringRes", "getDisclaimerStringRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "primaryButtonStringRes", "getPrimaryButtonStringRes", "secondaryButtonStringRes", "getSecondaryButtonStringRes", "scrollView", "Landroid/widget/ScrollView;", "getScrollView", "()Landroid/widget/ScrollView;", "scrollView$delegate", "Lkotlin/properties/ReadOnlyProperty;", StatisticsSection2.DIVIDER, "Landroid/view/View;", "getDivider", "()Landroid/view/View;", "divider$delegate", "disclaimer", "Landroid/widget/TextView;", "getDisclaimer", "()Landroid/widget/TextView;", "disclaimer$delegate", "primaryBtn", "Lcom/robinhood/android/designsystem/button/RdsButton;", "getPrimaryBtn", "()Lcom/robinhood/android/designsystem/button/RdsButton;", "primaryBtn$delegate", "secondaryBtn", "getSecondaryBtn", "secondaryBtn$delegate", "onViewCreated", "", "view", "savedInstanceState", "Landroid/os/Bundle;", "onPrimaryBtnClicked", "onSecondaryBtnClicked", "lib-common-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public abstract class BaseScrollableFragment extends BaseFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(BaseScrollableFragment.class, "scrollView", "getScrollView()Landroid/widget/ScrollView;", 0)), Reflection.property1(new PropertyReference1Impl(BaseScrollableFragment.class, StatisticsSection2.DIVIDER, "getDivider()Landroid/view/View;", 0)), Reflection.property1(new PropertyReference1Impl(BaseScrollableFragment.class, "disclaimer", "getDisclaimer()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(BaseScrollableFragment.class, "primaryBtn", "getPrimaryBtn()Lcom/robinhood/android/designsystem/button/RdsButton;", 0)), Reflection.property1(new PropertyReference1Impl(BaseScrollableFragment.class, "secondaryBtn", "getSecondaryBtn()Lcom/robinhood/android/designsystem/button/RdsButton;", 0))};

    /* renamed from: disclaimer$delegate, reason: from kotlin metadata */
    private final Interfaces2 disclaimer;
    private final Integer disclaimerStringRes;

    /* renamed from: divider$delegate, reason: from kotlin metadata */
    private final Interfaces2 divider;

    /* renamed from: primaryBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 primaryBtn;
    private final Integer primaryButtonStringRes;

    /* renamed from: scrollView$delegate, reason: from kotlin metadata */
    private final Interfaces2 scrollView;
    private final int scrollableContentRes;

    /* renamed from: secondaryBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 secondaryBtn;
    private final Integer secondaryButtonStringRes;

    public void onPrimaryBtnClicked() {
    }

    public void onSecondaryBtnClicked() {
    }

    public final int getScrollableContentRes() {
        return this.scrollableContentRes;
    }

    public BaseScrollableFragment(int i) {
        super(C11287R.layout.fragment_base_scrollable);
        this.scrollableContentRes = i;
        this.scrollView = bindView(C11287R.id.scroll_view);
        this.divider = bindView(C11287R.id.content_divider);
        this.disclaimer = bindView(C11287R.id.disclaimer_text);
        this.primaryBtn = bindView(C11287R.id.primary_btn);
        this.secondaryBtn = bindView(C11287R.id.secondary_btn);
    }

    public Integer getDisclaimerStringRes() {
        return this.disclaimerStringRes;
    }

    public Integer getPrimaryButtonStringRes() {
        return this.primaryButtonStringRes;
    }

    public Integer getSecondaryButtonStringRes() {
        return this.secondaryButtonStringRes;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ScrollView getScrollView() {
        return (ScrollView) this.scrollView.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getDivider() {
        return (View) this.divider.getValue(this, $$delegatedProperties[1]);
    }

    public final TextView getDisclaimer() {
        return (TextView) this.disclaimer.getValue(this, $$delegatedProperties[2]);
    }

    public final RdsButton getPrimaryBtn() {
        return (RdsButton) this.primaryBtn.getValue(this, $$delegatedProperties[3]);
    }

    public final RdsButton getSecondaryBtn() {
        return (RdsButton) this.secondaryBtn.getValue(this, $$delegatedProperties[4]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (!isInTabFragment()) {
            ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        }
        ViewGroups.inflate(getScrollView(), this.scrollableContentRes, true);
        Integer disclaimerStringRes = getDisclaimerStringRes();
        if (disclaimerStringRes != null) {
            getDisclaimer().setText(getString(disclaimerStringRes.intValue()));
            getDisclaimer().setVisibility(0);
        }
        Integer primaryButtonStringRes = getPrimaryButtonStringRes();
        if (primaryButtonStringRes != null) {
            getPrimaryBtn().setText(primaryButtonStringRes.intValue());
            getPrimaryBtn().setVisibility(0);
            OnClickListeners.onClick(getPrimaryBtn(), new BaseScrollableFragment2(this));
        }
        Integer secondaryButtonStringRes = getSecondaryButtonStringRes();
        if (secondaryButtonStringRes != null) {
            getSecondaryBtn().setText(secondaryButtonStringRes.intValue());
            getSecondaryBtn().setVisibility(0);
            OnClickListeners.onClick(getSecondaryBtn(), new BaseScrollableFragment3(this));
        }
        getScrollView().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.robinhood.android.common.onboarding.ui.BaseScrollableFragment.onViewCreated.4
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                BaseScrollableFragment.this.getDivider().setVisibility(BaseScrollableFragment.this.getScrollView().getHeight() < ((View) SequencesKt.single(ViewGroup2.getChildren(BaseScrollableFragment.this.getScrollView()))).getHeight() ? 0 : 8);
            }
        });
    }
}
