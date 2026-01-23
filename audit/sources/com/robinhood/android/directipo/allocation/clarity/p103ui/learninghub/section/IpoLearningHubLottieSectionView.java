package com.robinhood.android.directipo.allocation.clarity.p103ui.learninghub.section;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.directipo.allocation.clarity.C14172R;
import com.robinhood.android.directipo.allocation.clarity.databinding.MergeIpoLearningHubLottieSectionViewBinding;
import com.robinhood.directipo.models.p292db.IpoAccessLearningHubSectionData;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: IpoLearningHubLottieSectionView.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0013B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0016R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/clarity/ui/learninghub/section/IpoLearningHubLottieSectionView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/directipo/models/db/IpoAccessLearningHubSectionData$LottieSection;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/directipo/allocation/clarity/databinding/MergeIpoLearningHubLottieSectionViewBinding;", "getBinding", "()Lcom/robinhood/android/directipo/allocation/clarity/databinding/MergeIpoLearningHubLottieSectionViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", "state", "Companion", "feature-direct-ipo-allocation-clarity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class IpoLearningHubLottieSectionView extends ConstraintLayout implements Bindable<IpoAccessLearningHubSectionData.LottieSection> {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(IpoLearningHubLottieSectionView.class, "binding", "getBinding()Lcom/robinhood/android/directipo/allocation/clarity/databinding/MergeIpoLearningHubLottieSectionViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IpoLearningHubLottieSectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewBinding5.viewBinding(this, IpoLearningHubLottieSectionView2.INSTANCE);
        ViewGroups.inflate(this, C14172R.layout.merge_ipo_learning_hub_lottie_section_view, true);
    }

    private final MergeIpoLearningHubLottieSectionViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeIpoLearningHubLottieSectionViewBinding) value;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(IpoAccessLearningHubSectionData.LottieSection state) {
        Intrinsics.checkNotNullParameter(state, "state");
        getBinding().sectionLottieAnimation.setAnimationFromUrl(state.getLottieAnimationUrl());
        getBinding().sectionLottieAnimation.playAnimation();
        Double aspectRatio = state.getAspectRatio();
        if (aspectRatio == null || aspectRatio.doubleValue() <= 0.0d) {
            return;
        }
        String heightDimensionRatioStr = IpoLearningHubLottieSectionView3.toHeightDimensionRatioStr(aspectRatio.doubleValue());
        ViewGroup.LayoutParams layoutParams = getBinding().sectionLottieAnimation.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ConstraintLayout.LayoutParams) layoutParams).dimensionRatio = heightDimensionRatioStr;
    }

    /* compiled from: IpoLearningHubLottieSectionView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/clarity/ui/learninghub/section/IpoLearningHubLottieSectionView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/directipo/allocation/clarity/ui/learninghub/section/IpoLearningHubLottieSectionView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-direct-ipo-allocation-clarity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<IpoLearningHubLottieSectionView> {
        private final /* synthetic */ Inflater<IpoLearningHubLottieSectionView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public IpoLearningHubLottieSectionView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (IpoLearningHubLottieSectionView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C14172R.layout.include_ipo_learning_hub_lottie_section_view);
        }
    }
}
