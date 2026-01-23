package com.robinhood.android.common.p088ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: FragmentContainerLayout.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001 B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0014J0\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0014J\b\u0010\u0019\u001a\u00020\u0010H\u0014J\b\u0010\u001a\u001a\u00020\u001bH\u0014J\u0012\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0014J\u0010\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0014R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/common/ui/view/FragmentContainerLayout;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "toolbarHeight", "", "isNestedContainer", "", "hasChildThatsUnderneathToolbar", "getHasChildThatsUnderneathToolbar", "()Z", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onLayout", UpdatePortfolioResultsScreenKt.ChangeLoggingIdentifier, "left", "top", "right", "bottom", "onAttachedToWindow", "generateDefaultLayoutParams", "Lcom/robinhood/android/common/ui/view/FragmentContainerLayout$LayoutParams;", "generateLayoutParams", Constants.RequestParamsKeys.PLATFORM_KEY, "Landroid/view/ViewGroup$LayoutParams;", "checkLayoutParams", "LayoutParams", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class FragmentContainerLayout extends ViewGroup {
    public static final int $stable = 8;
    private boolean isNestedContainer;
    private int toolbarHeight;

    public /* synthetic */ FragmentContainerLayout(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        int[] FragmentContainerLayout_Layout = C11048R.styleable.FragmentContainerLayout_Layout;
        Intrinsics.checkNotNullExpressionValue(FragmentContainerLayout_Layout, "FragmentContainerLayout_Layout");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FragmentContainerLayout_Layout, 0, 0);
        this.isNestedContainer = typedArrayObtainStyledAttributes.getBoolean(C11048R.styleable.FragmentContainerLayout_Layout_isNestedContainer, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final boolean getHasChildThatsUnderneathToolbar() {
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.robinhood.android.common.ui.view.FragmentContainerLayout.LayoutParams");
            boolean z2 = true;
            z = z || ((LayoutParams) layoutParams).getIsUnderneathToolbar();
            if (childAt instanceof FragmentContainerLayout) {
                if (!z && !((FragmentContainerLayout) childAt).getHasChildThatsUnderneathToolbar()) {
                    z2 = false;
                }
                z = z2;
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = getMeasuredHeight();
            childAt.layout(0, measuredHeight2 - measuredHeight, measuredWidth, measuredHeight2);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        if (mode == 0 || mode2 == 0) {
            setMeasuredDimension(0, 0);
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
                childAt.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            return;
        }
        setMeasuredDimension(size, size2);
        boolean hasChildThatsUnderneathToolbar = getHasChildThatsUnderneathToolbar();
        int childCount2 = getChildCount();
        for (int i2 = 0; i2 < childCount2; i2++) {
            View childAt2 = getChildAt(i2);
            if (childAt2 instanceof FragmentContainerLayout) {
                ((FragmentContainerLayout) childAt2).toolbarHeight = hasChildThatsUnderneathToolbar ? this.toolbarHeight : 0;
            }
            childAt2.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(hasChildThatsUnderneathToolbar ? size2 : size2 - this.toolbarHeight, 1073741824));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.isNestedContainer) {
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Sequence sequenceFilter = SequencesKt.filter(BaseContexts.baseContexts(context), new Function1<Object, Boolean>() { // from class: com.robinhood.android.common.ui.view.FragmentContainerLayout$onAttachedToWindow$$inlined$requireActivityTypeBaseContext$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof BaseActivity);
            }
        });
        Intrinsics.checkNotNull(sequenceFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        AppCompatActivity appCompatActivity = (AppCompatActivity) SequencesKt.firstOrNull(sequenceFilter);
        if (appCompatActivity == null) {
            throw new IllegalStateException(("Context has no Activity: " + context).toString());
        }
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(((BaseActivity) appCompatActivity).getToolbarHeightObs()), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.ui.view.FragmentContainerLayout$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FragmentContainerLayout.onAttachedToWindow$lambda$5(this.f$0, ((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$5(FragmentContainerLayout fragmentContainerLayout, int i) {
        fragmentContainerLayout.toolbarHeight = i;
        fragmentContainerLayout.requestLayout();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attrs) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new LayoutParams(context, attrs);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) {
        Intrinsics.checkNotNullParameter(p, "p");
        return new LayoutParams(p);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        Intrinsics.checkNotNullParameter(p, "p");
        return p instanceof LayoutParams;
    }

    /* compiled from: FragmentContainerLayout.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001d\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0005\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\rJ\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u0000H\u0002R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/common/ui/view/FragmentContainerLayout$LayoutParams;", "Landroid/view/ViewGroup$LayoutParams;", "width", "", "height", "<init>", "(II)V", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "source", "(Landroid/view/ViewGroup$LayoutParams;)V", "isUnderneathToolbar", "", "()Z", "setUnderneathToolbar", "(Z)V", "init", "", "set", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class LayoutParams extends ViewGroup.LayoutParams {
        public static final int $stable = 8;
        private boolean isUnderneathToolbar;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        @JvmOverloads
        public LayoutParams(Context context) {
            this(context, null, 2, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        /* renamed from: isUnderneathToolbar, reason: from getter */
        public final boolean getIsUnderneathToolbar() {
            return this.isUnderneathToolbar;
        }

        public final void setUnderneathToolbar(boolean z) {
            this.isUnderneathToolbar = z;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public /* synthetic */ LayoutParams(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, (i & 2) != 0 ? null : attributeSet);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            Intrinsics.checkNotNullParameter(context, "context");
            init(context, attributeSet);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LayoutParams(ViewGroup.LayoutParams source) {
            super(source);
            Intrinsics.checkNotNullParameter(source, "source");
            if (source instanceof LayoutParams) {
                set((LayoutParams) source);
            }
        }

        private final void init(Context context, AttributeSet attrs) {
            int[] FragmentContainerLayout_Layout = C11048R.styleable.FragmentContainerLayout_Layout;
            Intrinsics.checkNotNullExpressionValue(FragmentContainerLayout_Layout, "FragmentContainerLayout_Layout");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, FragmentContainerLayout_Layout, 0, 0);
            this.isUnderneathToolbar = typedArrayObtainStyledAttributes.getBoolean(C11048R.styleable.FragmentContainerLayout_Layout_layout_underneathToolbar, false);
            typedArrayObtainStyledAttributes.recycle();
        }

        private final void set(LayoutParams source) {
            this.isUnderneathToolbar = source.isUnderneathToolbar;
        }
    }
}
