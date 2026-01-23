package com.robinhood.android.equitydetail.p123ui.ipo;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.databinding.MergeIpoHeaderBinding;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoColorMapper;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.models.p320db.bonfire.StockDetailHeader;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.noties.markwon.Markwon;
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

/* compiled from: IpoHeaderView.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dR\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/ipo/IpoHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "binding", "Lcom/robinhood/android/equitydetail/databinding/MergeIpoHeaderBinding;", "getBinding", "()Lcom/robinhood/android/equitydetail/databinding/MergeIpoHeaderBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "setData", "", "header", "Lcom/robinhood/models/db/bonfire/StockDetailHeader;", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class IpoHeaderView extends Hammer_IpoHeaderView {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public Markwon markwon;
    public Navigator navigator;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(IpoHeaderView.class, "binding", "getBinding()Lcom/robinhood/android/equitydetail/databinding/MergeIpoHeaderBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IpoHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C15314R.layout.merge_ipo_header, true);
        this.binding = ViewBinding5.viewBinding(this, IpoHeaderView2.INSTANCE);
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

    public final Navigator getNavigator() {
        Navigator navigator = this.navigator;
        if (navigator != null) {
            return navigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void setNavigator(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "<set-?>");
        this.navigator = navigator;
    }

    private final MergeIpoHeaderBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeIpoHeaderBinding) value;
    }

    public final void setData(StockDetailHeader header) {
        Intrinsics.checkNotNullParameter(header, "header");
        MergeIpoHeaderBinding binding = getBinding();
        binding.ipoHeaderTitleTxt.setText(header.getTitle());
        binding.ipoHeaderSubtitleTxt.setText(header.getSubtitle());
        RhTextView ipoHeaderSubtitleTxt = binding.ipoHeaderSubtitleTxt;
        Intrinsics.checkNotNullExpressionValue(ipoHeaderSubtitleTxt, "ipoHeaderSubtitleTxt");
        ServerToBentoColorMapper serverToBentoColorMapper = ServerToBentoColorMapper.INSTANCE;
        String light = header.getSubtitleColor().getLight();
        String dark = header.getSubtitleColor().getDark();
        int i = C20690R.attr.colorForeground1;
        ScarletManager2.overrideAttribute(ipoHeaderSubtitleTxt, R.attr.textColor, serverToBentoColorMapper.mapDayNightSelectorServerColor(light, dark, i, i));
        binding.lottieView.setAnimationFromUrl(header.getLottieAnimationUrl());
        IpoHeaderProgressBar phaseProgressBar = binding.phaseProgressBar;
        Intrinsics.checkNotNullExpressionValue(phaseProgressBar, "phaseProgressBar");
        phaseProgressBar.setVisibility(header.getShouldShowPhaseProgress() ? 0 : 8);
        binding.phaseProgressBar.setProgress(header.getPhaseProgress());
        binding.phaseSubtitle.setText(getMarkwon().toMarkdown(header.getPhaseDetailMarkdown()));
        final RhTextView rhTextView = getBinding().phaseTitle;
        rhTextView.setText(header.getPhaseTitle());
        final String phaseDeeplinkUrl = header.getPhaseDeeplinkUrl();
        if (phaseDeeplinkUrl != null) {
            Intrinsics.checkNotNull(rhTextView);
            TextViewsKt.setDrawables$default((TextView) rhTextView, 0, 0, C20690R.drawable.ic_rds_info_24dp, 0, true, 11, (Object) null);
            OnClickListeners.onClick(rhTextView, new Function0() { // from class: com.robinhood.android.equitydetail.ui.ipo.IpoHeaderView$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IpoHeaderView.setData$lambda$2$lambda$1(this.f$0, rhTextView, phaseDeeplinkUrl);
                }
            });
        } else {
            Intrinsics.checkNotNull(rhTextView);
            TextViewsKt.setDrawables$default((TextView) rhTextView, (Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null, false, 27, (Object) null);
            rhTextView.setOnClickListener(null);
        }
        if (getBinding().lottieView.isAnimating()) {
            return;
        }
        getBinding().lottieView.playAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setData$lambda$2$lambda$1(IpoHeaderView ipoHeaderView, RhTextView rhTextView, String str) {
        Navigator navigator = ipoHeaderView.getNavigator();
        Context context = rhTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Navigator.DefaultImpls.handleDeepLink$default(navigator, context, Uri.parse(str), null, null, false, null, 60, null);
        return Unit.INSTANCE;
    }

    /* compiled from: IpoHeaderView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/ipo/IpoHeaderView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/equitydetail/ui/ipo/IpoHeaderView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<IpoHeaderView> {
        private final /* synthetic */ Inflater<IpoHeaderView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public IpoHeaderView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (IpoHeaderView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C15314R.layout.include_ipo_header);
        }
    }
}
