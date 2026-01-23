package com.robinhood.shared.onboarding.lib.menuofoption;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.LogOnceAnalytics;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.models.api.identi.sortinghat.SortingHatTypes;
import com.robinhood.models.p320db.identi.sortinghat.MenuOfOptionsHeader;
import com.robinhood.models.p320db.identi.sortinghat.MenuOfOptionsPathItem;
import com.robinhood.models.p320db.identi.sortinghat.SortingHatExperienceV2;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsState;
import com.robinhood.shared.onboarding.lib.menuofoption.databinding.MergeMenuOfOptionsHeaderBinding;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import io.noties.markwon.Markwon;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: MenuOfOptionsHeaderView.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 @2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001@B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010)\u001a\u00020*H\u0014J\u0010\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u0003H\u0016J\u0010\u0010-\u001a\u00020*2\u0006\u0010,\u001a\u00020\u0003H\u0002J\u0010\u0010.\u001a\u00020*2\u0006\u0010/\u001a\u000200H\u0002J\u0010\u00101\u001a\u00020*2\u0006\u00102\u001a\u000203H\u0002J\u0016\u00104\u001a\u0002052\f\u00106\u001a\b\u0012\u0004\u0012\u00020807H\u0002J\u0012\u00109\u001a\u00020*2\b\u00102\u001a\u0004\u0018\u000103H\u0002J#\u0010:\u001a\u00020*2\b\b\u0001\u0010;\u001a\u00020<2\n\b\u0003\u0010=\u001a\u0004\u0018\u00010<H\u0002¢\u0006\u0002\u0010>J\b\u0010?\u001a\u00020*H\u0002R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\u0010\u0010(\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006A"}, m3636d2 = {"Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsHeaderView;", "Landroid/widget/LinearLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsState;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "viewBinding", "Lcom/robinhood/shared/onboarding/lib/menuofoption/databinding/MergeMenuOfOptionsHeaderBinding;", "getViewBinding", "()Lcom/robinhood/shared/onboarding/lib/menuofoption/databinding/MergeMenuOfOptionsHeaderBinding;", "viewBinding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "logOnceAnalytics", "Lcom/robinhood/analytics/LogOnceAnalytics;", "getLogOnceAnalytics", "()Lcom/robinhood/analytics/LogOnceAnalytics;", "logOnceAnalytics$delegate", "Lkotlin/Lazy;", "lastState", "onDetachedFromWindow", "", "bind", "state", "bindVisibilities", "bindSuccess", "experience", "Lcom/robinhood/models/db/identi/sortinghat/SortingHatExperienceV2$MenuOfOptions;", "bindBanner", "asset", "Lcom/robinhood/models/api/identi/sortinghat/MenuOfOptionsAsset;", "bindPathItems", "", "pathNodes", "", "Lcom/robinhood/models/db/identi/sortinghat/MenuOfOptionsPathItem;", "bindHeroHeader", "bindHero", "drawableRes", "", "drawableResTint", "(ILjava/lang/Integer;)V", "bindError", "Companion", "lib-menu-of-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class MenuOfOptionsHeaderView extends Hammer_MenuOfOptionsHeaderView implements Bindable<MenuOfOptionsState> {
    public AnalyticsLogger analytics;
    private MenuOfOptionsState lastState;

    /* renamed from: logOnceAnalytics$delegate, reason: from kotlin metadata */
    private final Lazy logOnceAnalytics;
    public Markwon markwon;
    public Navigator navigator;

    /* renamed from: viewBinding$delegate, reason: from kotlin metadata */
    private final Interfaces2 viewBinding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MenuOfOptionsHeaderView.class, "viewBinding", "getViewBinding()Lcom/robinhood/shared/onboarding/lib/menuofoption/databinding/MergeMenuOfOptionsHeaderBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ MenuOfOptionsHeaderView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuOfOptionsHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C39252R.layout.merge_menu_of_options_header, true);
        this.viewBinding = ViewBinding5.viewBinding(this, MenuOfOptionsHeaderView3.INSTANCE);
        this.logOnceAnalytics = LazyKt.lazy(new Function0() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsHeaderView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MenuOfOptionsHeaderView.logOnceAnalytics_delegate$lambda$0(this.f$0);
            }
        });
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

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
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

    private final MergeMenuOfOptionsHeaderBinding getViewBinding() {
        Object value = this.viewBinding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeMenuOfOptionsHeaderBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LogOnceAnalytics getLogOnceAnalytics() {
        return (LogOnceAnalytics) this.logOnceAnalytics.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LogOnceAnalytics logOnceAnalytics_delegate$lambda$0(MenuOfOptionsHeaderView menuOfOptionsHeaderView) {
        return new LogOnceAnalytics(menuOfOptionsHeaderView.getAnalytics());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        getLogOnceAnalytics().reset();
        super.onDetachedFromWindow();
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(MenuOfOptionsState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (Intrinsics.areEqual(state, this.lastState)) {
            return;
        }
        this.lastState = state;
        bindVisibilities(state);
        if (Intrinsics.areEqual(state, MenuOfOptionsState.Invested.INSTANCE) || Intrinsics.areEqual(state, MenuOfOptionsState.Loading.INSTANCE)) {
            return;
        }
        if (Intrinsics.areEqual(state, MenuOfOptionsState.Error.INSTANCE)) {
            bindError();
        } else {
            if (!(state instanceof MenuOfOptionsState.MenuOfOptions)) {
                throw new NoWhenBranchMatchedException();
            }
            bindSuccess(((MenuOfOptionsState.MenuOfOptions) state).getExperience());
        }
    }

    private final void bindVisibilities(MenuOfOptionsState state) {
        MergeMenuOfOptionsHeaderBinding viewBinding = getViewBinding();
        RhTextView menuOfOptionsHeaderTitle = viewBinding.menuOfOptionsHeaderTitle;
        Intrinsics.checkNotNullExpressionValue(menuOfOptionsHeaderTitle, "menuOfOptionsHeaderTitle");
        boolean z = state instanceof MenuOfOptionsState.Loading;
        menuOfOptionsHeaderTitle.setVisibility(!z ? 0 : 8);
        RhTextView menuOfOptionsHeaderSubtitle = viewBinding.menuOfOptionsHeaderSubtitle;
        Intrinsics.checkNotNullExpressionValue(menuOfOptionsHeaderSubtitle, "menuOfOptionsHeaderSubtitle");
        menuOfOptionsHeaderSubtitle.setVisibility(!z ? 0 : 8);
        ImageView menuOfOptionsHeroHeader = viewBinding.menuOfOptionsHeroHeader;
        Intrinsics.checkNotNullExpressionValue(menuOfOptionsHeroHeader, "menuOfOptionsHeroHeader");
        menuOfOptionsHeroHeader.setVisibility(state.getShowHeroHeader() ? 0 : 8);
        RecyclerView menuOfOptionsPathRecyclerView = viewBinding.menuOfOptionsPathRecyclerView;
        Intrinsics.checkNotNullExpressionValue(menuOfOptionsPathRecyclerView, "menuOfOptionsPathRecyclerView");
        menuOfOptionsPathRecyclerView.setVisibility(state.getShowPathHeader() ? 0 : 8);
        ImageView menuOfOptionsBannerHeader = viewBinding.menuOfOptionsBannerHeader;
        Intrinsics.checkNotNullExpressionValue(menuOfOptionsBannerHeader, "menuOfOptionsBannerHeader");
        menuOfOptionsBannerHeader.setVisibility(state.getShowBannerHeader() ? 0 : 8);
        RhTextView menuOfOptionsHeaderSubtitle2 = viewBinding.menuOfOptionsHeaderSubtitle;
        Intrinsics.checkNotNullExpressionValue(menuOfOptionsHeaderSubtitle2, "menuOfOptionsHeaderSubtitle");
        menuOfOptionsHeaderSubtitle2.setVisibility(state.getShowSubtitle() ? 0 : 8);
        FrameLayout menuOfOptionsLoading = viewBinding.menuOfOptionsLoading;
        Intrinsics.checkNotNullExpressionValue(menuOfOptionsLoading, "menuOfOptionsLoading");
        menuOfOptionsLoading.setVisibility(state instanceof MenuOfOptionsState.Loading ? 0 : 8);
    }

    private final void bindSuccess(final SortingHatExperienceV2.MenuOfOptions experience) {
        MergeMenuOfOptionsHeaderBinding viewBinding = getViewBinding();
        viewBinding.menuOfOptionsHeaderTitle.setText(experience.getTitle());
        RhTextView menuOfOptionsHeaderTitle = viewBinding.menuOfOptionsHeaderTitle;
        Intrinsics.checkNotNullExpressionValue(menuOfOptionsHeaderTitle, "menuOfOptionsHeaderTitle");
        TextViewsKt.setTextAppearanceAttr(menuOfOptionsHeaderTitle, C20690R.attr.textAppearanceDisplayMedium);
        RhTextView rhTextView = viewBinding.menuOfOptionsHeaderSubtitle;
        String subtitleMarkdown = experience.getSubtitleMarkdown();
        rhTextView.setText(subtitleMarkdown != null ? getMarkwon().toMarkdown(subtitleMarkdown) : null);
        MenuOfOptionsHeader header = experience.getHeader();
        if (!(header instanceof MenuOfOptionsHeader.HeaderCard)) {
            if (header instanceof MenuOfOptionsHeader.Banner) {
                bindBanner(((MenuOfOptionsHeader.Banner) header).getAsset());
            } else if (header instanceof MenuOfOptionsHeader.Hero) {
                bindHeroHeader(((MenuOfOptionsHeader.Hero) header).getAsset());
            } else {
                if (!(header instanceof MenuOfOptionsHeader.Path)) {
                    throw new NoWhenBranchMatchedException();
                }
                bindPathItems(((MenuOfOptionsHeader.Path) header).getPathItems());
            }
        }
        if (!isAttachedToWindow()) {
            addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsHeaderView$bindSuccess$lambda$3$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    this.removeOnAttachStateChangeListener(this);
                    LogOnceAnalytics.logButtonGroupAppear$default(this.getLogOnceAnalytics(), AnalyticsStrings.BUTTON_GROUP_MENU_OF_OPTIONS, AnalyticsStrings.BUTTON_MENU_OF_OPTIONS_HEADER, null, experience.getLoggingState(), null, null, null, experience.getLoggingVariant(), 116, null);
                }
            });
        } else {
            LogOnceAnalytics.logButtonGroupAppear$default(getLogOnceAnalytics(), AnalyticsStrings.BUTTON_GROUP_MENU_OF_OPTIONS, AnalyticsStrings.BUTTON_MENU_OF_OPTIONS_HEADER, null, experience.getLoggingState(), null, null, null, experience.getLoggingVariant(), 116, null);
        }
    }

    private final void bindBanner(SortingHatTypes asset) {
        MergeMenuOfOptionsHeaderBinding viewBinding = getViewBinding();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        boolean zIsDay = DayNightChanges.isDay(ScarletManager2.getScarletManager(Contexts7.requireBaseActivityBaseContext(context)));
        ImageView menuOfOptionsBannerHeader = viewBinding.menuOfOptionsBannerHeader;
        Intrinsics.checkNotNullExpressionValue(menuOfOptionsBannerHeader, "menuOfOptionsBannerHeader");
        menuOfOptionsBannerHeader.setVisibility(0);
        ImageView menuOfOptionsHeroHeader = viewBinding.menuOfOptionsHeroHeader;
        Intrinsics.checkNotNullExpressionValue(menuOfOptionsHeroHeader, "menuOfOptionsHeroHeader");
        menuOfOptionsHeroHeader.setVisibility(8);
        viewBinding.menuOfOptionsBannerHeader.setImageDrawable(ViewsKt.getDrawable(this, MenuOfOptionsAssetMappers.drawableRes(asset, zIsDay)));
    }

    private final boolean bindPathItems(List<MenuOfOptionsPathItem> pathNodes) {
        final MergeMenuOfOptionsHeaderBinding viewBinding = getViewBinding();
        MenuOfOptionsPathItemsAdapter menuOfOptionsPathItemsAdapter = new MenuOfOptionsPathItemsAdapter();
        viewBinding.menuOfOptionsPathRecyclerView.setAdapter(menuOfOptionsPathItemsAdapter);
        menuOfOptionsPathItemsAdapter.submitList(pathNodes);
        Iterator<MenuOfOptionsPathItem> it = pathNodes.iterator();
        final int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().getFeatured()) {
                break;
            }
            i++;
        }
        return viewBinding.getRoot().post(new Runnable() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsHeaderView$bindPathItems$1$1
            @Override // java.lang.Runnable
            public final void run() {
                RecyclerView.LayoutManager layoutManager = viewBinding.menuOfOptionsPathRecyclerView.getLayoutManager();
                Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(i, 0);
            }
        });
    }

    private final void bindHeroHeader(SortingHatTypes asset) {
        MergeMenuOfOptionsHeaderBinding viewBinding = getViewBinding();
        ImageView menuOfOptionsBannerHeader = getViewBinding().menuOfOptionsBannerHeader;
        Intrinsics.checkNotNullExpressionValue(menuOfOptionsBannerHeader, "menuOfOptionsBannerHeader");
        menuOfOptionsBannerHeader.setVisibility(8);
        if (asset != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            bindHero(MenuOfOptionsAssetMappers.drawableRes(asset, DayNightChanges.isDay(ScarletManager2.getScarletManager(Contexts7.requireBaseActivityBaseContext(context)))), MenuOfOptionsAssetMappers.getDrawableResTint(asset));
            ImageView menuOfOptionsHeroHeader = viewBinding.menuOfOptionsHeroHeader;
            Intrinsics.checkNotNullExpressionValue(menuOfOptionsHeroHeader, "menuOfOptionsHeroHeader");
            menuOfOptionsHeroHeader.setVisibility(0);
            return;
        }
        ImageView menuOfOptionsHeroHeader2 = viewBinding.menuOfOptionsHeroHeader;
        Intrinsics.checkNotNullExpressionValue(menuOfOptionsHeroHeader2, "menuOfOptionsHeroHeader");
        menuOfOptionsHeroHeader2.setVisibility(8);
        getAnalytics().logError(AnalyticsStrings.ERROR_UNDEFINED_HERO_IMAGE, "null");
    }

    static /* synthetic */ void bindHero$default(MenuOfOptionsHeaderView menuOfOptionsHeaderView, int i, Integer num, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            num = null;
        }
        menuOfOptionsHeaderView.bindHero(i, num);
    }

    private final void bindHero(int drawableRes, Integer drawableResTint) {
        MergeMenuOfOptionsHeaderBinding viewBinding = getViewBinding();
        viewBinding.menuOfOptionsHeroHeader.setImageDrawable(ViewsKt.getDrawable(this, drawableRes));
        if (drawableResTint == null) {
            viewBinding.menuOfOptionsHeroHeader.setColorFilter((ColorFilter) null);
            return;
        }
        ImageView imageView = viewBinding.menuOfOptionsHeroHeader;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        imageView.setColorFilter(ThemeColors.getThemeColor(context, drawableResTint.intValue()), PorterDuff.Mode.SRC_IN);
    }

    private final void bindError() {
        MergeMenuOfOptionsHeaderBinding viewBinding = getViewBinding();
        viewBinding.menuOfOptionsHeaderTitle.setText(C39252R.string.menu_of_options_error_title);
        viewBinding.menuOfOptionsHeaderSubtitle.setText(C39252R.string.menu_of_options_error_description);
        bindHero$default(this, C11048R.drawable.svg_error_triangle, null, 2, null);
    }

    /* compiled from: MenuOfOptionsHeaderView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsHeaderView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsHeaderView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "lib-menu-of-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<MenuOfOptionsHeaderView> {
        private final /* synthetic */ Inflater<MenuOfOptionsHeaderView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public MenuOfOptionsHeaderView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (MenuOfOptionsHeaderView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C39252R.layout.include_menu_of_options_header_view);
        }
    }
}
