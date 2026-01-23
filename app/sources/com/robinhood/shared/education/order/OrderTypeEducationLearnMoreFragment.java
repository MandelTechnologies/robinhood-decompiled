package com.robinhood.shared.education.order;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.robinhood.android.common.p088ui.NoTitleToolbarFragment;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: OrderTypeEducationLearnMoreFragment.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\u000b\u0010\u0007R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0014\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019¨\u0006%"}, m3636d2 = {"Lcom/robinhood/shared/education/order/OrderTypeEducationLearnMoreFragment;", "Lcom/robinhood/android/common/ui/NoTitleToolbarFragment;", "<init>", "()V", OrderTypeEducationLearnMoreFragment.ARG_TITLE_RES, "", "getTitleRes", "()I", "titleRes$delegate", "Lkotlin/Lazy;", OrderTypeEducationLearnMoreFragment.ARG_DESCRIPTION_RES, "getDescriptionRes", "descriptionRes$delegate", "titleTxt", "Lcom/robinhood/android/designsystem/text/RhTextView;", "getTitleTxt", "()Lcom/robinhood/android/designsystem/text/RhTextView;", "titleTxt$delegate", "Lkotlin/properties/ReadOnlyProperty;", "descriptionTxt", "getDescriptionTxt", "descriptionTxt$delegate", "doneButton", "Lcom/robinhood/android/designsystem/button/RdsButton;", "getDoneButton", "()Lcom/robinhood/android/designsystem/button/RdsButton;", "doneButton$delegate", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "lib-order-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class OrderTypeEducationLearnMoreFragment extends NoTitleToolbarFragment {
    public static final String ARG_DESCRIPTION_RES = "descriptionRes";
    public static final String ARG_TITLE_RES = "titleRes";

    /* renamed from: descriptionRes$delegate, reason: from kotlin metadata */
    private final Lazy descriptionRes;

    /* renamed from: descriptionTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 descriptionTxt;

    /* renamed from: doneButton$delegate, reason: from kotlin metadata */
    private final Interfaces2 doneButton;

    /* renamed from: titleRes$delegate, reason: from kotlin metadata */
    private final Lazy titleRes;

    /* renamed from: titleTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 titleTxt;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OrderTypeEducationLearnMoreFragment.class, "titleTxt", "getTitleTxt()Lcom/robinhood/android/designsystem/text/RhTextView;", 0)), Reflection.property1(new PropertyReference1Impl(OrderTypeEducationLearnMoreFragment.class, "descriptionTxt", "getDescriptionTxt()Lcom/robinhood/android/designsystem/text/RhTextView;", 0)), Reflection.property1(new PropertyReference1Impl(OrderTypeEducationLearnMoreFragment.class, "doneButton", "getDoneButton()Lcom/robinhood/android/designsystem/button/RdsButton;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public OrderTypeEducationLearnMoreFragment() {
        super(C38811R.layout.fragment_order_type_education_learn_more);
        this.titleRes = Fragments2.argument(this, ARG_TITLE_RES);
        this.descriptionRes = Fragments2.argument(this, ARG_DESCRIPTION_RES);
        this.titleTxt = bindView(C38811R.id.title_txt);
        this.descriptionTxt = bindView(C38811R.id.description_txt);
        this.doneButton = bindView(C38811R.id.done_btn);
    }

    private final int getTitleRes() {
        return ((Number) this.titleRes.getValue()).intValue();
    }

    private final int getDescriptionRes() {
        return ((Number) this.descriptionRes.getValue()).intValue();
    }

    private final RhTextView getTitleTxt() {
        return (RhTextView) this.titleTxt.getValue(this, $$delegatedProperties[0]);
    }

    private final RhTextView getDescriptionTxt() {
        return (RhTextView) this.descriptionTxt.getValue(this, $$delegatedProperties[1]);
    }

    private final RdsButton getDoneButton() {
        return (RdsButton) this.doneButton.getValue(this, $$delegatedProperties[2]);
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
        getTitleTxt().setText(getString(getTitleRes()));
        getDescriptionTxt().setText(getString(getDescriptionRes()));
        OnClickListeners.onClick(getDoneButton(), new Function0() { // from class: com.robinhood.shared.education.order.OrderTypeEducationLearnMoreFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderTypeEducationLearnMoreFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(OrderTypeEducationLearnMoreFragment orderTypeEducationLearnMoreFragment) {
        orderTypeEducationLearnMoreFragment.requireActivity().onBackPressed();
        return Unit.INSTANCE;
    }

    /* compiled from: OrderTypeEducationLearnMoreFragment.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/education/order/OrderTypeEducationLearnMoreFragment$Companion;", "", "<init>", "()V", "ARG_TITLE_RES", "", "ARG_DESCRIPTION_RES", "newInstance", "Lcom/robinhood/shared/education/order/OrderTypeEducationLearnMoreFragment;", OrderTypeEducationLearnMoreFragment.ARG_TITLE_RES, "", OrderTypeEducationLearnMoreFragment.ARG_DESCRIPTION_RES, "lib-order-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final OrderTypeEducationLearnMoreFragment newInstance(int titleRes, int descriptionRes) {
            OrderTypeEducationLearnMoreFragment orderTypeEducationLearnMoreFragment = new OrderTypeEducationLearnMoreFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(OrderTypeEducationLearnMoreFragment.ARG_TITLE_RES, titleRes);
            bundle.putInt(OrderTypeEducationLearnMoreFragment.ARG_DESCRIPTION_RES, descriptionRes);
            orderTypeEducationLearnMoreFragment.setArguments(bundle);
            return orderTypeEducationLearnMoreFragment;
        }
    }
}
