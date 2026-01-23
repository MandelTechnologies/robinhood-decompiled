package com.robinhood.android.earlypay.enrollment.p110ui;

import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.directdeposit.C11131R;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.earlypay.C14433R;
import com.robinhood.android.earlypay.enrollment.p110ui.EarlyPayEnrollmentViewState;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.CompositeAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.SingleItemAdapter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EarlyPayEnrollmentAdapterContainer.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentAdapterContainer;", "", "callbacks", "Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentAdapterContainer$Callbacks;", "<init>", "(Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentAdapterContainer$Callbacks;)V", "headerAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/SingleItemAdapter;", "Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayHeaderView;", "Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentViewState$EarlyPayEnrollmentContent$Disclosure;", "bannerAdapter", "Lcom/robinhood/android/designsystem/banner/RdsInfoBannerView;", "", "valuePropsHeaderAdapter", "Lcom/robinhood/android/designsystem/text/RhTextView;", "faqHeaderAdapter", "disclaimerAdapter", "valuePropsAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentViewState$EarlyPayEnrollmentContent$ValueProp;", "faqAdapter", "Lcom/robinhood/android/earlypay/enrollment/ui/FaqAdapter;", "compositeAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapter;", "getCompositeAdapter", "()Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapter;", "bindContent", "content", "Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentViewState$EarlyPayEnrollmentContent;", "Callbacks", "feature-early-pay_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class EarlyPayEnrollmentAdapterContainer {
    public static final int $stable = 8;
    private final SingleItemAdapter<RdsInfoBannerView, Unit> bannerAdapter;
    private final Callbacks callbacks;
    private final CompositeAdapter compositeAdapter;
    private final SingleItemAdapter<RhTextView, Unit> disclaimerAdapter;
    private final FaqAdapter faqAdapter;
    private final SingleItemAdapter<RhTextView, Unit> faqHeaderAdapter;
    private final SingleItemAdapter<EarlyPayHeaderView, EarlyPayEnrollmentViewState.EarlyPayEnrollmentContent.Disclosure> headerAdapter;
    private final GenericListAdapter<RdsRowView, EarlyPayEnrollmentViewState.EarlyPayEnrollmentContent.ValueProp> valuePropsAdapter;
    private final SingleItemAdapter<RhTextView, Unit> valuePropsHeaderAdapter;

    /* compiled from: EarlyPayEnrollmentAdapterContainer.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentAdapterContainer$Callbacks;", "", "onDisclosureClicked", "", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentViewState$EarlyPayEnrollmentContent$Disclosure;", "feature-early-pay_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onDisclosureClicked(EarlyPayEnrollmentViewState.EarlyPayEnrollmentContent.Disclosure disclosure);
    }

    public EarlyPayEnrollmentAdapterContainer(Callbacks callbacks) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.callbacks = callbacks;
        SingleItemAdapter.Companion companion = SingleItemAdapter.INSTANCE;
        SingleItemAdapter<EarlyPayHeaderView, EarlyPayEnrollmentViewState.EarlyPayEnrollmentContent.Disclosure> singleItemAdapterOf$default = SingleItemAdapter.Companion.of$default(companion, EarlyPayHeaderView.INSTANCE, (DiffUtil.ItemCallback) null, new Function2() { // from class: com.robinhood.android.earlypay.enrollment.ui.EarlyPayEnrollmentAdapterContainer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return EarlyPayEnrollmentAdapterContainer.headerAdapter$lambda$1(this.f$0, (EarlyPayHeaderView) obj, (EarlyPayEnrollmentViewState.EarlyPayEnrollmentContent.Disclosure) obj2);
            }
        }, 2, (Object) null);
        this.headerAdapter = singleItemAdapterOf$default;
        SingleItemAdapter<RdsInfoBannerView, Unit> singleItemAdapterOfUnit$default = SingleItemAdapter.Companion.ofUnit$default(companion, C14433R.layout.include_early_pay_enrollment_banner, (DiffUtil.ItemCallback) null, (Function1) null, 6, (Object) null);
        this.bannerAdapter = singleItemAdapterOfUnit$default;
        SingleItemAdapter<RhTextView, Unit> singleItemAdapterOfUnit$default2 = SingleItemAdapter.Companion.ofUnit$default(companion, C14433R.layout.include_early_pay_section_header, (DiffUtil.ItemCallback) null, new Function1() { // from class: com.robinhood.android.earlypay.enrollment.ui.EarlyPayEnrollmentAdapterContainer$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EarlyPayEnrollmentAdapterContainer.valuePropsHeaderAdapter$lambda$2((RhTextView) obj);
            }
        }, 2, (Object) null);
        this.valuePropsHeaderAdapter = singleItemAdapterOfUnit$default2;
        SingleItemAdapter<RhTextView, Unit> singleItemAdapterOfUnit$default3 = SingleItemAdapter.Companion.ofUnit$default(companion, C14433R.layout.include_early_pay_section_header, (DiffUtil.ItemCallback) null, new Function1() { // from class: com.robinhood.android.earlypay.enrollment.ui.EarlyPayEnrollmentAdapterContainer$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EarlyPayEnrollmentAdapterContainer.faqHeaderAdapter$lambda$3((RhTextView) obj);
            }
        }, 2, (Object) null);
        this.faqHeaderAdapter = singleItemAdapterOfUnit$default3;
        SingleItemAdapter<RhTextView, Unit> singleItemAdapterOfUnit$default4 = SingleItemAdapter.Companion.ofUnit$default(companion, C14433R.layout.include_early_pay_disclaimer_item, (DiffUtil.ItemCallback) null, new Function1() { // from class: com.robinhood.android.earlypay.enrollment.ui.EarlyPayEnrollmentAdapterContainer$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EarlyPayEnrollmentAdapterContainer.disclaimerAdapter$lambda$4((RhTextView) obj);
            }
        }, 2, (Object) null);
        this.disclaimerAdapter = singleItemAdapterOfUnit$default4;
        GenericListAdapter<RdsRowView, EarlyPayEnrollmentViewState.EarlyPayEnrollmentContent.ValueProp> genericListAdapterM2985of = GenericListAdapter.INSTANCE.m2985of(C11131R.layout.view_direct_deposit_splash_bullet_row, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.earlypay.enrollment.ui.EarlyPayEnrollmentAdapterContainer$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return EarlyPayEnrollmentAdapterContainer.valuePropsAdapter$lambda$5((RdsRowView) obj, (EarlyPayEnrollmentViewState.EarlyPayEnrollmentContent.ValueProp) obj2);
            }
        });
        this.valuePropsAdapter = genericListAdapterM2985of;
        FaqAdapter faqAdapter = new FaqAdapter();
        this.faqAdapter = faqAdapter;
        this.compositeAdapter = new CompositeAdapter((RecyclerView.Adapter<?>[]) new RecyclerView.Adapter[]{singleItemAdapterOf$default, singleItemAdapterOfUnit$default2, genericListAdapterM2985of, singleItemAdapterOfUnit$default, singleItemAdapterOfUnit$default3, faqAdapter, singleItemAdapterOfUnit$default4});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit headerAdapter$lambda$1(final EarlyPayEnrollmentAdapterContainer earlyPayEnrollmentAdapterContainer, EarlyPayHeaderView of, final EarlyPayEnrollmentViewState.EarlyPayEnrollmentContent.Disclosure it) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(it, "it");
        OnClickListeners.onClick(of.getDisclosureTxt(), new Function0() { // from class: com.robinhood.android.earlypay.enrollment.ui.EarlyPayEnrollmentAdapterContainer$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EarlyPayEnrollmentAdapterContainer.headerAdapter$lambda$1$lambda$0(this.f$0, it);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit headerAdapter$lambda$1$lambda$0(EarlyPayEnrollmentAdapterContainer earlyPayEnrollmentAdapterContainer, EarlyPayEnrollmentViewState.EarlyPayEnrollmentContent.Disclosure disclosure) {
        earlyPayEnrollmentAdapterContainer.callbacks.onDisclosureClicked(disclosure);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit valuePropsHeaderAdapter$lambda$2(RhTextView ofUnit) {
        Intrinsics.checkNotNullParameter(ofUnit, "$this$ofUnit");
        ofUnit.setText(ViewsKt.getString(ofUnit, C14433R.string.early_pay_benefits_header));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit faqHeaderAdapter$lambda$3(RhTextView ofUnit) {
        Intrinsics.checkNotNullParameter(ofUnit, "$this$ofUnit");
        ofUnit.setText(ViewsKt.getString(ofUnit, C14433R.string.early_pay_faq_header));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit disclaimerAdapter$lambda$4(RhTextView ofUnit) {
        Intrinsics.checkNotNullParameter(ofUnit, "$this$ofUnit");
        ofUnit.setText(ViewsKt.getString(ofUnit, C14433R.string.early_pay_disclaimer));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit valuePropsAdapter$lambda$5(RdsRowView of, EarlyPayEnrollmentViewState.EarlyPayEnrollmentContent.ValueProp it) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(it, "it");
        of.setPrimaryText(it.getTitle());
        of.setSecondaryText(it.getDetail());
        return Unit.INSTANCE;
    }

    public final CompositeAdapter getCompositeAdapter() {
        return this.compositeAdapter;
    }

    public final void bindContent(EarlyPayEnrollmentViewState.EarlyPayEnrollmentContent content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.valuePropsAdapter.submitList(content.getValueProps());
        this.faqAdapter.submitList(content.getFaqs());
        this.headerAdapter.setData(content.getDisclosure());
    }
}
