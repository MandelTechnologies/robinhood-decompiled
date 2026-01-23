package com.robinhood.android.common.p088ui.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$style;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.OneShotPreDrawListener;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.util.extensions.Views;
import com.robinhood.android.common.util.p090rx.view.VisibilityObservable;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.colorscheme.ColorSchemeManager;
import com.robinhood.android.designsystem.progress.RdsSegmentedProgressBar;
import com.robinhood.android.designsystem.style.ColorScheme;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.style.DesignSystemOverlay;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.disposer.ViewScopedObservable;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.ScarletOverlay;
import com.robinhood.scarlet.util.ThemeNode;
import com.robinhood.scarlet.util.resource.DirectResourceReference;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.StyleResource;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: RhToolbar.kt */
@Metadata(m3635d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\t\n\u0002\b\u000f\b\u0007\u0018\u0000 \u0088\u00012\u00020\u00012\u00020\u0002:\u0004\u0088\u0001\u0089\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u000207H\u0016J\u0010\u0010D\u001a\u00020B2\u0006\u0010E\u001a\u00020@H\u0016J\u0010\u0010F\u001a\u00020B2\u0006\u0010E\u001a\u00020@H\u0016J\b\u0010L\u001a\u00020BH\u0002J\u0010\u0010]\u001a\u00020B2\b\b\u0001\u0010_\u001a\u000207J\u0010\u0010b\u001a\u00020B2\b\b\u0001\u0010_\u001a\u000207J\u0018\u0010x\u001a\u00020B2\u0006\u0010y\u001a\u00020\u00102\b\b\u0002\u0010z\u001a\u00020{J\u0018\u0010|\u001a\u00020B2\u0006\u0010y\u001a\u00020\u00102\b\b\u0002\u0010z\u001a\u00020{J\b\u0010}\u001a\u00020BH\u0014J\b\u0010~\u001a\u00020BH\u0014J'\u0010\u007f\u001a\u00020%2\t\b\u0001\u0010\u0080\u0001\u001a\u0002072\t\b\u0002\u0010\u0081\u0001\u001a\u00020\u00122\t\b\u0002\u0010\u0082\u0001\u001a\u000207J\u0007\u0010\u0083\u0001\u001a\u00020BJ\u0007\u0010\u0084\u0001\u001a\u00020BJ\u000b\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u001fH\u0002J\t\u0010\u0086\u0001\u001a\u00020/H\u0002J\t\u0010\u0087\u0001\u001a\u00020/H\u0002R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001e\u001a\u00020\u001f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\u0011\u0010$\u001a\u00020%¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001b\u0010.\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010#\u001a\u0004\b0\u00101R\u001b\u00103\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010#\u001a\u0004\b4\u00101R\u000e\u00106\u001a\u000207X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000207X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00109\u001a\b\u0012\u0004\u0012\u00020;0:8F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010>\u001a\b\u0012\u0004\u0012\u00020@0?X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010G\u001a\u0004\u0018\u00010;2\b\u0010\u0016\u001a\u0004\u0018\u00010;@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR$\u0010M\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bM\u0010\u0013\"\u0004\bN\u0010\u0015R$\u0010O\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\u0013\"\u0004\bQ\u0010\u0015R4\u0010T\u001a\n\u0012\u0004\u0012\u00020S\u0018\u00010R2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020S\u0018\u00010R@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR(\u0010Z\u001a\u0004\u0018\u00010Y2\b\u0010\u0016\u001a\u0004\u0018\u00010Y8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R(\u0010`\u001a\u0004\u0018\u00010Y2\b\u0010\u0016\u001a\u0004\u0018\u00010Y8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\ba\u0010\\\"\u0004\bb\u0010^R$\u0010d\u001a\u00020c2\u0006\u0010\u0016\u001a\u00020c8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR$\u0010i\u001a\u00020c2\u0006\u0010\u0016\u001a\u00020c8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bj\u0010f\"\u0004\bk\u0010hR$\u0010l\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bl\u0010\u0013\"\u0004\bm\u0010\u0015R$\u0010n\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bo\u0010\u0019\"\u0004\bp\u0010qR$\u0010r\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bs\u0010\u0019\"\u0004\bt\u0010qR$\u0010u\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bv\u0010\u0019\"\u0004\bw\u0010q¨\u0006\u008a\u0001"}, m3636d2 = {"Lcom/robinhood/android/common/ui/view/RhToolbar;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/robinhood/android/common/util/rx/view/VisibilityObservable;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "colorSchemeManager", "Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;", "getColorSchemeManager", "()Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;", "setColorSchemeManager", "(Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;)V", "defaultElevation", "", "isDesignSystemThemeTransitionAnimationEnabled", "", "()Z", "setDesignSystemThemeTransitionAnimationEnabled", "(Z)V", "value", "scrollRaisedElevation", "getScrollRaisedElevation", "()F", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "getToolbar", "()Landroidx/appcompat/widget/Toolbar;", "progressBar", "Lcom/robinhood/android/designsystem/progress/RdsSegmentedProgressBar;", "getProgressBar", "()Lcom/robinhood/android/designsystem/progress/RdsSegmentedProgressBar;", "progressBar$delegate", "Lkotlin/Lazy;", "loadingView", "Landroid/view/View;", "getLoadingView", "()Landroid/view/View;", "customContainer", "Landroid/widget/FrameLayout;", "getCustomContainer", "()Landroid/widget/FrameLayout;", "setCustomContainer", "(Landroid/widget/FrameLayout;)V", "titleTxt", "Landroid/widget/TextView;", "getTitleTxt", "()Landroid/widget/TextView;", "titleTxt$delegate", "subtitleTxt", "getSubtitleTxt", "subtitleTxt$delegate", "toolbarInsetLeft", "", "toolbarInsetRight", "dayNightStyleChanges", "Lio/reactivex/Observable;", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "getDayNightStyleChanges", "()Lio/reactivex/Observable;", "visibilityListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/robinhood/android/common/util/rx/view/VisibilityObservable$VisibilityChangeListener;", "setVisibility", "", "visibility", "addVisibilityListener", "listener", "removeVisibilityListener", "forcedDayNightOverlay", "getForcedDayNightOverlay", "()Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "setForcedDayNightOverlay", "(Lcom/robinhood/android/designsystem/style/DayNightOverlay;)V", "updateDayNightOverlay", "isLoadingViewVisible", "setLoadingViewVisible", "useDesignSystemTheme", "getUseDesignSystemTheme", "setUseDesignSystemTheme", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "Landroid/content/res/ColorStateList;", "colorControlNormalOverride", "getColorControlNormalOverride", "()Lcom/robinhood/scarlet/util/resource/ResourceReference;", "setColorControlNormalOverride", "(Lcom/robinhood/scarlet/util/resource/ResourceReference;)V", "", "title", "getTitle", "()Ljava/lang/CharSequence;", "setTitle", "(Ljava/lang/CharSequence;)V", "resId", "subtitle", "getSubtitle", "setSubtitle", "Landroid/graphics/Typeface;", "titleTypeface", "getTitleTypeface", "()Landroid/graphics/Typeface;", "setTitleTypeface", "(Landroid/graphics/Typeface;)V", "subtitleTypeface", "getSubtitleTypeface", "setSubtitleTypeface", "isTitleVisible", "setTitleVisible", "titleAlpha", "getTitleAlpha", "setTitleAlpha", "(F)V", "subtitleAlpha", "getSubtitleAlpha", "setSubtitleAlpha", "backgroundAlpha", "getBackgroundAlpha", "setBackgroundAlpha", "animateTitleAlpha", "alpha", "duration", "", "animateSubtitleAlpha", "onAttachedToWindow", "onDetachedFromWindow", "addCustomView", "id", "centerCustomView", "viewGravity", "removeCustomView", "reset", "getInflatedProgressBarViewStub", "findTitle", "findSubtitle", "Companion", "DesignSystemToolbarOverlay", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class RhToolbar extends Hammer_RhToolbar implements VisibilityObservable {
    private static final DirectResourceReference<StyleResource> DESIGN_SYSTEM_STYLE_SUBTITLE;
    private static final DirectResourceReference<StyleResource> DESIGN_SYSTEM_STYLE_TITLE;

    @SuppressLint({"PrivateResource"})
    private static final DirectResourceReference<StyleResource> STYLE_SUBTITLE;

    @SuppressLint({"PrivateResource"})
    private static final DirectResourceReference<StyleResource> STYLE_TITLE;
    private ResourceReferences4<? extends ColorStateList> colorControlNormalOverride;
    public ColorSchemeManager colorSchemeManager;
    private FrameLayout customContainer;
    private final float defaultElevation;
    private DayNightOverlay forcedDayNightOverlay;
    private boolean isDesignSystemThemeTransitionAnimationEnabled;
    private final View loadingView;

    /* renamed from: progressBar$delegate, reason: from kotlin metadata */
    private final Lazy progressBar;
    private float scrollRaisedElevation;

    /* renamed from: subtitleTxt$delegate, reason: from kotlin metadata */
    private final Lazy subtitleTxt;

    /* renamed from: titleTxt$delegate, reason: from kotlin metadata */
    private final Lazy titleTxt;
    private final Toolbar toolbar;
    private final int toolbarInsetLeft;
    private final int toolbarInsetRight;
    private boolean useDesignSystemTheme;
    private final CopyOnWriteArrayList<VisibilityObservable.VisibilityChangeListener> visibilityListeners;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        float elevation = getElevation();
        this.defaultElevation = elevation;
        ViewGroups.inflate(this, C11048R.layout.merge_toolbar, true);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(this, InsetSides.INSTANCE.m26683getTopXedK2Rk());
        int[] RhToolbar = C11048R.styleable.RhToolbar;
        Intrinsics.checkNotNullExpressionValue(RhToolbar, "RhToolbar");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RhToolbar, 0, 0);
        this.isDesignSystemThemeTransitionAnimationEnabled = typedArrayObtainStyledAttributes.getBoolean(C11048R.styleable.RhToolbar_animateDesignSystemThemeTransition, false);
        this.scrollRaisedElevation = RangesKt.coerceAtLeast(typedArrayObtainStyledAttributes.getDimension(C11048R.styleable.RhToolbar_scrollRaisedElevation, this.scrollRaisedElevation), elevation);
        typedArrayObtainStyledAttributes.recycle();
        View viewFindViewById = findViewById(C11048R.id.toolbar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        Toolbar toolbar = (Toolbar) viewFindViewById;
        this.toolbar = toolbar;
        this.progressBar = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.common.ui.view.RhToolbar$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhToolbar.progressBar_delegate$lambda$1(this.f$0);
            }
        });
        View viewFindViewById2 = findViewById(C11048R.id.toolbar_loading_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.loadingView = viewFindViewById2;
        this.titleTxt = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.common.ui.view.RhToolbar$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.findTitle();
            }
        });
        this.subtitleTxt = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.common.ui.view.RhToolbar$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhToolbar.subtitleTxt_delegate$lambda$3(this.f$0);
            }
        });
        this.toolbarInsetLeft = toolbar.getContentInsetLeft();
        this.toolbarInsetRight = toolbar.getContentInsetRight();
        this.visibilityListeners = new CopyOnWriteArrayList<>();
    }

    public final ColorSchemeManager getColorSchemeManager() {
        ColorSchemeManager colorSchemeManager = this.colorSchemeManager;
        if (colorSchemeManager != null) {
            return colorSchemeManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("colorSchemeManager");
        return null;
    }

    public final void setColorSchemeManager(ColorSchemeManager colorSchemeManager) {
        Intrinsics.checkNotNullParameter(colorSchemeManager, "<set-?>");
        this.colorSchemeManager = colorSchemeManager;
    }

    /* renamed from: isDesignSystemThemeTransitionAnimationEnabled, reason: from getter */
    public final boolean getIsDesignSystemThemeTransitionAnimationEnabled() {
        return this.isDesignSystemThemeTransitionAnimationEnabled;
    }

    public final void setDesignSystemThemeTransitionAnimationEnabled(boolean z) {
        this.isDesignSystemThemeTransitionAnimationEnabled = z;
    }

    public final float getScrollRaisedElevation() {
        return this.scrollRaisedElevation;
    }

    public final Toolbar getToolbar() {
        return this.toolbar;
    }

    public final RdsSegmentedProgressBar getProgressBar() {
        return (RdsSegmentedProgressBar) this.progressBar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RdsSegmentedProgressBar progressBar_delegate$lambda$1(RhToolbar rhToolbar) {
        ViewStub viewStub = (ViewStub) rhToolbar.findViewById(C11048R.id.toolbar_progress_bar_view_stub);
        if (viewStub == null) {
            RdsSegmentedProgressBar inflatedProgressBarViewStub = rhToolbar.getInflatedProgressBarViewStub();
            Intrinsics.checkNotNull(inflatedProgressBarViewStub);
            return inflatedProgressBarViewStub;
        }
        View viewInflate = viewStub.inflate();
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type com.robinhood.android.designsystem.progress.RdsSegmentedProgressBar");
        return (RdsSegmentedProgressBar) viewInflate;
    }

    public final View getLoadingView() {
        return this.loadingView;
    }

    public final FrameLayout getCustomContainer() {
        return this.customContainer;
    }

    public final void setCustomContainer(FrameLayout frameLayout) {
        this.customContainer = frameLayout;
    }

    private final TextView getTitleTxt() {
        return (TextView) this.titleTxt.getValue();
    }

    private final TextView getSubtitleTxt() {
        return (TextView) this.subtitleTxt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView subtitleTxt_delegate$lambda$3(RhToolbar rhToolbar) {
        if (rhToolbar.getSubtitle() == null) {
            rhToolbar.setSubtitle(PlaceholderUtils.XXShortPlaceholderText);
        }
        return rhToolbar.findSubtitle();
    }

    public final Observable<DayNightOverlay> getDayNightStyleChanges() {
        Observable<DayNightOverlay> observableDistinctUntilChanged = ScarletManager2.getScarletManager(this).getThemeChanges().map(new Function() { // from class: com.robinhood.android.common.ui.view.RhToolbar$dayNightStyleChanges$1
            @Override // io.reactivex.functions.Function
            public final DayNightOverlay apply(ThemeNode it) {
                Intrinsics.checkNotNullParameter(it, "it");
                ScarletManager scarletManager = ScarletManager2.getScarletManager(this.this$0);
                DayNightOverlay dayNightOverlay = DayNightOverlay.NIGHT;
                return scarletManager.contains(dayNightOverlay) ? dayNightOverlay : DayNightOverlay.DAY;
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return observableDistinctUntilChanged;
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        Iterator<T> it = this.visibilityListeners.iterator();
        while (it.hasNext()) {
            ((VisibilityObservable.VisibilityChangeListener) it.next()).onVisibilityChange(getVisibility() == 0);
        }
    }

    @Override // com.robinhood.android.common.util.p090rx.view.VisibilityObservable
    public void addVisibilityListener(VisibilityObservable.VisibilityChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.visibilityListeners.add(listener);
    }

    @Override // com.robinhood.android.common.util.p090rx.view.VisibilityObservable
    public void removeVisibilityListener(VisibilityObservable.VisibilityChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.visibilityListeners.remove(listener);
    }

    public final DayNightOverlay getForcedDayNightOverlay() {
        return this.forcedDayNightOverlay;
    }

    public final void setForcedDayNightOverlay(DayNightOverlay dayNightOverlay) {
        this.forcedDayNightOverlay = dayNightOverlay;
        updateDayNightOverlay();
    }

    private final void updateDayNightOverlay() {
        ScarletManager scarletManager = ScarletManager2.getScarletManager(Views.baseActivity(this));
        DayNightOverlay dayNightOverlay = this.forcedDayNightOverlay;
        if (dayNightOverlay == null) {
            dayNightOverlay = DayNightOverlay.NIGHT;
            if (!scarletManager.contains(dayNightOverlay)) {
                dayNightOverlay = DayNightOverlay.DAY;
            }
        }
        ScarletManager2.getScarletManager(this).putOverlay(dayNightOverlay, Boolean.valueOf(this.isDesignSystemThemeTransitionAnimationEnabled));
    }

    public final boolean isLoadingViewVisible() {
        return this.loadingView.getVisibility() == 0;
    }

    public final void setLoadingViewVisible(boolean z) {
        if ((this.loadingView.getVisibility() == 0) != z) {
            this.loadingView.setVisibility(z ? 0 : 8);
            if (z) {
                IdlingResourceCounters2.increment(IdlingResourceType.TOOLBAR_PROGRESS_BAR);
            } else {
                IdlingResourceCounters2.decrement(IdlingResourceType.TOOLBAR_PROGRESS_BAR);
            }
        }
    }

    public final boolean getUseDesignSystemTheme() {
        return this.useDesignSystemTheme;
    }

    public final void setUseDesignSystemTheme(boolean z) {
        this.useDesignSystemTheme = z;
        if (z) {
            ScarletManager scarletManager = ScarletManager2.getScarletManager(this);
            scarletManager.putOverlay(DesignSystemOverlay.INSTANCE, Boolean.valueOf(this.isDesignSystemThemeTransitionAnimationEnabled));
            scarletManager.putOverlay(DesignSystemToolbarOverlay.INSTANCE, Boolean.valueOf(this.isDesignSystemThemeTransitionAnimationEnabled));
            ScarletManager2.overrideAttribute(this.toolbar, R$attr.titleTextAppearance, DESIGN_SYSTEM_STYLE_TITLE);
            ScarletManager2.overrideAttribute(this.toolbar, R$attr.subtitleTextAppearance, DESIGN_SYSTEM_STYLE_SUBTITLE);
            ScarletManager2.overrideAttribute(this.toolbar, R$attr.colorControlNormal, ThemeAttributes.INSTANCE.getCOLOR_FOREGROUND_1());
            updateDayNightOverlay();
        } else {
            ScarletManager2.overrideAttribute(this.toolbar, R$attr.titleTextAppearance, STYLE_TITLE);
            ScarletManager2.overrideAttribute(this.toolbar, R$attr.subtitleTextAppearance, STYLE_SUBTITLE);
            ScarletManager2.overrideAttribute(this.toolbar, R$attr.colorControlNormal, ThemeAttributes.INSTANCE.getTEXT_COLOR_PRIMARY());
            ScarletManager scarletManager2 = ScarletManager2.getScarletManager(this);
            scarletManager2.removeOverlay(DesignSystemOverlay.INSTANCE.getPriority(), Boolean.valueOf(this.isDesignSystemThemeTransitionAnimationEnabled));
            scarletManager2.removeOverlay(DesignSystemToolbarOverlay.INSTANCE.getPriority(), Boolean.valueOf(this.isDesignSystemThemeTransitionAnimationEnabled));
        }
        Toolbar toolbar = this.toolbar;
        int childCount = toolbar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            toolbar.getChildAt(i).refreshDrawableState();
        }
    }

    public final ResourceReferences4<ColorStateList> getColorControlNormalOverride() {
        return this.colorControlNormalOverride;
    }

    public final void setColorControlNormalOverride(ResourceReferences4<? extends ColorStateList> resourceReferences4) {
        ResourceReferences4 text_color_primary;
        this.colorControlNormalOverride = resourceReferences4;
        if (resourceReferences4 != null) {
            ScarletManager2.overrideAttribute(this.toolbar, R$attr.colorControlNormal, resourceReferences4);
            return;
        }
        if (this.useDesignSystemTheme) {
            text_color_primary = ThemeAttributes.INSTANCE.getCOLOR_FOREGROUND_1();
        } else {
            text_color_primary = ThemeAttributes.INSTANCE.getTEXT_COLOR_PRIMARY();
        }
        ScarletManager2.overrideAttribute(this.toolbar, R$attr.colorControlNormal, text_color_primary);
    }

    public final void setTitle(CharSequence charSequence) {
        ActionBar supportActionBar;
        if (charSequence == null || charSequence.length() == 0) {
            charSequence = PlaceholderUtils.XXShortPlaceholderText;
        }
        this.toolbar.setTitle(charSequence);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AppCompatActivity appCompatActivityFindActivityBaseContext = BaseContexts.findActivityBaseContext(context);
        if (appCompatActivityFindActivityBaseContext == null || (supportActionBar = appCompatActivityFindActivityBaseContext.getSupportActionBar()) == null) {
            return;
        }
        supportActionBar.setTitle(charSequence);
    }

    public final CharSequence getTitle() {
        return this.toolbar.getTitle();
    }

    public final void setTitle(int resId) {
        setTitle(ViewsKt.getString(this, resId));
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.toolbar.setSubtitle(charSequence);
    }

    public final CharSequence getSubtitle() {
        return this.toolbar.getSubtitle();
    }

    public final void setSubtitle(int resId) {
        setSubtitle(ViewsKt.getString(this, resId));
    }

    public final void setTitleTypeface(Typeface value) {
        Intrinsics.checkNotNullParameter(value, "value");
        getTitleTxt().setTypeface(value);
    }

    public final Typeface getTitleTypeface() {
        Typeface typeface = getTitleTxt().getTypeface();
        Intrinsics.checkNotNullExpressionValue(typeface, "getTypeface(...)");
        return typeface;
    }

    public final void setSubtitleTypeface(Typeface value) {
        Intrinsics.checkNotNullParameter(value, "value");
        getSubtitleTxt().setTypeface(value);
    }

    public final Typeface getSubtitleTypeface() {
        Typeface typeface = getSubtitleTxt().getTypeface();
        Intrinsics.checkNotNullExpressionValue(typeface, "getTypeface(...)");
        return typeface;
    }

    public final void setTitleVisible(boolean z) {
        getTitleTxt().setVisibility(z ? 0 : 8);
    }

    public final boolean isTitleVisible() {
        return getTitleTxt().getVisibility() == 0;
    }

    public final void setTitleAlpha(float f) {
        getTitleTxt().setAlpha(f);
    }

    public final float getTitleAlpha() {
        return getTitleTxt().getAlpha();
    }

    public final void setSubtitleAlpha(float f) {
        getSubtitleTxt().setAlpha(f);
    }

    public final float getSubtitleAlpha() {
        return getSubtitleTxt().getAlpha();
    }

    public final void setBackgroundAlpha(float f) {
        Drawable background = getBackground();
        if (background != null) {
            background.setAlpha(RangesKt.coerceIn(MathKt.roundToInt(f * 255), 0, 255));
        }
    }

    public final float getBackgroundAlpha() {
        if (getBackground() != null) {
            return r0.getAlpha() / 255.0f;
        }
        return 1.0f;
    }

    public static /* synthetic */ void animateTitleAlpha$default(RhToolbar rhToolbar, float f, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 300;
        }
        rhToolbar.animateTitleAlpha(f, j);
    }

    public final void animateTitleAlpha(float alpha, long duration) {
        getTitleTxt().animate().alpha(alpha).setDuration(duration).start();
    }

    public static /* synthetic */ void animateSubtitleAlpha$default(RhToolbar rhToolbar, float f, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 300;
        }
        rhToolbar.animateSubtitleAlpha(f, j);
    }

    public final void animateSubtitleAlpha(float alpha, long duration) {
        getSubtitleTxt().animate().alpha(alpha).setDuration(duration).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        Observable<DayNightOverlay> dayNightStyleChanges;
        ViewScopedObservable viewScopedObservableBindTo$default;
        super.onAttachedToWindow();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AppCompatActivity appCompatActivityRequireActivityBaseContext = BaseContexts.requireActivityBaseContext(context);
        BaseActivity baseActivity = appCompatActivityRequireActivityBaseContext instanceof BaseActivity ? (BaseActivity) appCompatActivityRequireActivityBaseContext : null;
        if (baseActivity != null && (dayNightStyleChanges = baseActivity.getDayNightStyleChanges()) != null && (viewScopedObservableBindTo$default = ViewDisposerKt.bindTo$default(dayNightStyleChanges, this, false, 2, null)) != null) {
            viewScopedObservableBindTo$default.subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.ui.view.RhToolbar$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhToolbar.onAttachedToWindow$lambda$8(this.f$0, (DayNightOverlay) obj);
                }
            });
        }
        ViewDisposerKt.bindTo$default(getColorSchemeManager().getChanges(), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.ui.view.RhToolbar$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhToolbar.onAttachedToWindow$lambda$9(this.f$0, (Tuples2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$8(RhToolbar rhToolbar, DayNightOverlay overlay) {
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        if (ScarletManager2.getScarletManager(rhToolbar).contains(DesignSystemOverlay.INSTANCE)) {
            ScarletManager2.getScarletManager(rhToolbar).putOverlay(overlay, Boolean.FALSE);
            rhToolbar.updateDayNightOverlay();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$9(RhToolbar rhToolbar, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        ScarletManager2.getScarletManager(rhToolbar).putOverlay((ColorScheme) tuples2.component1(), Boolean.valueOf(!((Boolean) tuples2.component2()).booleanValue()));
        return Unit.INSTANCE;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setLoadingViewVisible(false);
    }

    public static /* synthetic */ View addCustomView$default(RhToolbar rhToolbar, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return rhToolbar.addCustomView(i, z, i2);
    }

    public final View addCustomView(int id, boolean centerCustomView, int viewGravity) {
        if (this.customContainer == null) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.customContainer = frameLayout;
            if (viewGravity == 0) {
                this.toolbar.addView(frameLayout, -1, -1);
            } else {
                this.toolbar.addView(frameLayout, new Toolbar.LayoutParams(-2, -1, viewGravity));
            }
        }
        FrameLayout frameLayout2 = this.customContainer;
        Intrinsics.checkNotNull(frameLayout2);
        final View viewInflate = LayoutInflater.from(getContext()).inflate(id, (ViewGroup) frameLayout2, false);
        frameLayout2.addView(viewInflate);
        if (centerCustomView) {
            Intrinsics.checkNotNull(viewInflate);
            OneShotPreDrawListener.add(viewInflate, new Runnable() { // from class: com.robinhood.android.common.ui.view.RhToolbar$addCustomView$$inlined$doOnPreDraw$1
                @Override // java.lang.Runnable
                public final void run() {
                    Intrinsics.checkNotNull(viewInflate);
                    ViewsKt.setEndPadding(viewInflate, this.getToolbar().getWidth() - viewInflate.getWidth());
                }
            });
        }
        Intrinsics.checkNotNull(viewInflate);
        return viewInflate;
    }

    public final void removeCustomView() {
        FrameLayout frameLayout = this.customContainer;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        FrameLayout frameLayout2 = this.customContainer;
        if (frameLayout2 != null) {
            this.toolbar.removeView(frameLayout2);
            this.customContainer = null;
        }
    }

    public final void reset() {
        setTitle((CharSequence) null);
        getTitleTxt().setVisibility(0);
        getTitleTxt().setAlpha(1.0f);
        if (getSubtitle() != null) {
            setSubtitleAlpha(1.0f);
        }
        setSubtitle((CharSequence) null);
        setBackgroundAlpha(1.0f);
        setForcedDayNightOverlay(null);
        setLoadingViewVisible(false);
        FrameLayout frameLayout = this.customContainer;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.toolbar.getMenu().clear();
        setElevation(this.defaultElevation);
        this.toolbar.setContentInsetsAbsolute(this.toolbarInsetLeft, this.toolbarInsetRight);
        FrameLayout frameLayout2 = this.customContainer;
        if (frameLayout2 != null) {
            this.toolbar.removeView(frameLayout2);
            this.customContainer = null;
        }
        RdsSegmentedProgressBar inflatedProgressBarViewStub = getInflatedProgressBarViewStub();
        if (inflatedProgressBarViewStub != null) {
            inflatedProgressBarViewStub.setVisibility(8);
        }
    }

    private final RdsSegmentedProgressBar getInflatedProgressBarViewStub() {
        return (RdsSegmentedProgressBar) findViewById(C11048R.id.toolbar_progress_bar_inflated);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView findTitle() {
        int childCount = this.toolbar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.toolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                return (TextView) childAt;
            }
        }
        throw new IllegalStateException("Toolbar title not found!");
    }

    private final TextView findSubtitle() {
        int childCount = this.toolbar.getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.toolbar.getChildAt(i2);
            if ((childAt instanceof TextView) && (i = i + 1) == 2) {
                return (TextView) childAt;
            }
        }
        throw new IllegalStateException("Toolbar subtitle not found!");
    }

    static {
        ResourceType.STYLE style = ResourceType.STYLE.INSTANCE;
        DESIGN_SYSTEM_STYLE_TITLE = new DirectResourceReference<>(style, C13997R.style.TextAppearance_Robinhood_Widget_Toolbar_Title);
        DESIGN_SYSTEM_STYLE_SUBTITLE = new DirectResourceReference<>(style, C13997R.style.TextAppearance_Robinhood_Widget_Toolbar_Subtitle);
        STYLE_TITLE = new DirectResourceReference<>(style, R$style.TextAppearance_Widget_AppCompat_Toolbar_Title);
        STYLE_SUBTITLE = new DirectResourceReference<>(style, R$style.TextAppearance_Widget_AppCompat_Toolbar_Subtitle);
    }

    /* compiled from: RhToolbar.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/common/ui/view/RhToolbar$DesignSystemToolbarOverlay;", "Lcom/robinhood/scarlet/ScarletOverlay;", "<init>", "()V", "styleReference", "Lcom/robinhood/scarlet/util/resource/ThemedResourceReference;", "Lcom/robinhood/scarlet/util/resource/StyleResource;", "getStyleReference", "()Lcom/robinhood/scarlet/util/resource/ThemedResourceReference;", "priority", "", "getPriority", "()I", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes2.dex */
    private static final class DesignSystemToolbarOverlay implements ScarletOverlay {
        public static final DesignSystemToolbarOverlay INSTANCE = new DesignSystemToolbarOverlay();
        private static final ThemedResourceReference<StyleResource> styleReference = new ThemedResourceReference<>(ResourceType.STYLE.INSTANCE, C20690R.attr.rhToolbarTheme);

        @Override // com.robinhood.scarlet.ScarletOverlay
        public int getPriority() {
            return 151;
        }

        private DesignSystemToolbarOverlay() {
        }

        @Override // com.robinhood.scarlet.ScarletOverlay
        public ThemedResourceReference<StyleResource> getStyleReference() {
            return styleReference;
        }
    }
}
