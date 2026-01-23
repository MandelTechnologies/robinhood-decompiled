package com.robinhood.android.earlypay.enrollment.p110ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.ListAdapter;
import com.robinhood.android.earlypay.enrollment.p110ui.EarlyPayEnrollmentViewState;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FaqAdapter.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001e\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/earlypay/enrollment/ui/FaqAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentViewState$EarlyPayEnrollmentContent$Faq;", "Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;", "Lcom/robinhood/android/earlypay/enrollment/ui/FaqRowView;", "<init>", "()V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "feature-early-pay_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class FaqAdapter extends ListAdapter<EarlyPayEnrollmentViewState.EarlyPayEnrollmentContent.Faq, GenericViewHolder<? extends FaqRowView>> {
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object _init_$lambda$0(EarlyPayEnrollmentViewState.EarlyPayEnrollmentContent.Faq faq) {
        return faq;
    }

    public FaqAdapter() {
        super(DiffCallbacks.INSTANCE.byEquality(new Function1() { // from class: com.robinhood.android.earlypay.enrollment.ui.FaqAdapter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FaqAdapter._init_$lambda$0((EarlyPayEnrollmentViewState.EarlyPayEnrollmentContent.Faq) obj);
            }
        }));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public GenericViewHolder<FaqRowView> onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new GenericViewHolder<>(FaqRowView.INSTANCE.inflate(parent));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(GenericViewHolder<FaqRowView> holder, final int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final EarlyPayEnrollmentViewState.EarlyPayEnrollmentContent.Faq item = getItem(position);
        ((FaqRowView) holder.getView()).bind(item.getQuestion(), item.getAnswer(), item.getExpanded());
        OnClickListeners.onClick(holder.getView(), new Function0() { // from class: com.robinhood.android.earlypay.enrollment.ui.FaqAdapter$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FaqAdapter.onBindViewHolder$lambda$1(item, this, position);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$1(EarlyPayEnrollmentViewState.EarlyPayEnrollmentContent.Faq faq, FaqAdapter faqAdapter, int i) {
        faq.setExpanded(!faq.getExpanded());
        faqAdapter.notifyItemChanged(i);
        return Unit.INSTANCE;
    }
}
