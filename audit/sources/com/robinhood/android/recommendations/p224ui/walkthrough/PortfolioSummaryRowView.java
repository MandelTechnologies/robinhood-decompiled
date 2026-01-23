package com.robinhood.android.recommendations.p224ui.walkthrough;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoColorMapper;
import com.robinhood.android.recommendations.C25978R;
import com.robinhood.android.recommendations.databinding.MergePortfolioSummaryRowViewBinding;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsPortfolio;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import io.noties.markwon.Markwon;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: PortfolioSummaryRowView.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00192\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0019B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003H\u0016R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/walkthrough/PortfolioSummaryRowView;", "Lcom/robinhood/android/designsystem/container/RdsRippleContainerView;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsPortfolio$BreakdownRow;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "binding", "Lcom/robinhood/android/recommendations/databinding/MergePortfolioSummaryRowViewBinding;", "getBinding", "()Lcom/robinhood/android/recommendations/databinding/MergePortfolioSummaryRowViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", "state", "Companion", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class PortfolioSummaryRowView extends Hammer_PortfolioSummaryRowView implements Bindable<UiRecommendationsPortfolio.BreakdownRow> {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PortfolioSummaryRowView.class, "binding", "getBinding()Lcom/robinhood/android/recommendations/databinding/MergePortfolioSummaryRowViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public Markwon markwon;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PortfolioSummaryRowView(Context context, AttributeSet attrs) {
        super(context, attrs, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.binding = ViewBinding5.viewBinding(this, PortfolioSummaryRowView2.INSTANCE);
        ViewGroups.inflate(this, C25978R.layout.merge_portfolio_summary_row_view, true);
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

    private final MergePortfolioSummaryRowViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergePortfolioSummaryRowViewBinding) value;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x004b  */
    @Override // com.robinhood.utils.p409ui.view.Bindable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void bind(UiRecommendationsPortfolio.BreakdownRow state) throws Resources.NotFoundException {
        int themeColor;
        Intrinsics.checkNotNullParameter(state, "state");
        MergePortfolioSummaryRowViewBinding binding = getBinding();
        binding.title.setText(getMarkwon().toMarkdown(state.getTitleMarkdown()));
        binding.subtitle.setText(state.getSubtitle());
        ResourceReferences4<Integer> resourceReferences4MapSimpleServerColor = ServerToBentoColorMapper.INSTANCE.mapSimpleServerColor(state.getColor());
        if (resourceReferences4MapSimpleServerColor != null) {
            Resources.Theme theme = getContext().getTheme();
            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
            Integer numResolve = resourceReferences4MapSimpleServerColor.resolve(theme);
            if (numResolve != null) {
                themeColor = numResolve.intValue();
            } else {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                themeColor = ThemeColors.getThemeColor(context, C13997R.attr.paletteColorPrime);
            }
        }
        ImageView imageView = binding.image;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        imageView.setImageDrawable(new PortfolioSummaryRowBlockDrawable(context2, themeColor));
    }

    /* compiled from: PortfolioSummaryRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/walkthrough/PortfolioSummaryRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/recommendations/ui/walkthrough/PortfolioSummaryRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<PortfolioSummaryRowView> {
        private final /* synthetic */ Inflater<PortfolioSummaryRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public PortfolioSummaryRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (PortfolioSummaryRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C25978R.layout.include_portfolio_summary_row_view);
        }
    }
}
