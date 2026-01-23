package com.robinhood.android.designsystem.row;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.R$attr;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.android.util.extensions.ViewTags;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.res.ResourceArray;
import com.robinhood.scarlet.util.ThemeNode;
import com.robinhood.scarlet.util.resource.StyleResource;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Action;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference2Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: RdsSectionHeaderItemDecoration.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 *2\u00020\u0001:\u0002)*B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u001e\u0010\u0004\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0002J\u0018\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0003J(\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020%H\u0016J \u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020(2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020%H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0004\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/designsystem/row/RdsSectionHeaderItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "useDisplayStyle", "", "headerSelector", "Lkotlin/Function2;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "", "", "<init>", "(ZLkotlin/jvm/functions/Function2;)V", "themeChangeDisposable", "Lio/reactivex/disposables/Disposable;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "paddingStart", "paddingTop", "paddingTopInTopPosition", "paddingEnd", "paddingBottom", "lineHeight", "textPaint", "Landroid/text/TextPaint;", "checkAttach", "", "parent", "update", "context", "Landroid/content/Context;", "themeNode", "Lcom/robinhood/scarlet/util/ThemeNode;", "getItemOffsets", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "onDraw", "canvas", "Landroid/graphics/Canvas;", "HeaderInfo", "Companion", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RdsSectionHeaderItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Interfaces3<? super View, HeaderInfo> headerInfo$delegate = ViewTags.INSTANCE.property(C13997R.id.rds_section_header_info, new Function1() { // from class: com.robinhood.android.designsystem.row.RdsSectionHeaderItemDecoration$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return RdsSectionHeaderItemDecoration.headerInfo_delegate$lambda$15((View) obj);
        }
    });
    private final Function2<RecyclerView.Adapter<?>, Integer, String> headerSelector;
    private int lineHeight;
    private int paddingBottom;
    private int paddingEnd;
    private int paddingStart;
    private int paddingTop;
    private int paddingTopInTopPosition;
    private RecyclerView recyclerView;
    private final TextPaint textPaint;
    private Disposable themeChangeDisposable;
    private final boolean useDisplayStyle;

    public /* synthetic */ RdsSectionHeaderItemDecoration(boolean z, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RdsSectionHeaderItemDecoration(boolean z, Function2<? super RecyclerView.Adapter<?>, ? super Integer, String> headerSelector) {
        Intrinsics.checkNotNullParameter(headerSelector, "headerSelector");
        this.useDisplayStyle = z;
        this.headerSelector = headerSelector;
        Disposable disposableDisposed = Disposables.disposed();
        Intrinsics.checkNotNullExpressionValue(disposableDisposed, "disposed(...)");
        this.themeChangeDisposable = disposableDisposed;
        this.lineHeight = -1;
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        this.textPaint = textPaint;
    }

    private final void checkAttach(RecyclerView parent) {
        if (Intrinsics.areEqual(this.recyclerView, parent)) {
            return;
        }
        final Context context = parent.getContext();
        this.themeChangeDisposable.dispose();
        this.recyclerView = parent;
        Observable<ThemeNode> observableDoOnDispose = ScarletManager2.getScarletManager(parent).getThemeChanges().doOnDispose(new Action() { // from class: com.robinhood.android.designsystem.row.RdsSectionHeaderItemDecoration.checkAttach.1
            @Override // io.reactivex.functions.Action
            public final void run() {
                RdsSectionHeaderItemDecoration.this.recyclerView = null;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoOnDispose, "doOnDispose(...)");
        this.themeChangeDisposable = ViewDisposerKt.bindTo$default(observableDoOnDispose, parent, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.designsystem.row.RdsSectionHeaderItemDecoration$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RdsSectionHeaderItemDecoration.checkAttach$lambda$1(this.f$0, context, (ThemeNode) obj);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int childCount = parent.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = parent.getChildAt(i);
            HeaderInfo headerInfo = INSTANCE.getHeaderInfo(childAt);
            StaticLayout layout = headerInfo.getLayout();
            if (layout != null) {
                PointF position = headerInfo.getPosition();
                float x = childAt.getX() + position.x;
                float y = (childAt.getY() - position.y) - layout.getHeight();
                int iSave = canvas.save();
                canvas.translate(x, y);
                try {
                    layout.draw(canvas);
                } finally {
                    canvas.restoreToCount(iSave);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkAttach$lambda$1(RdsSectionHeaderItemDecoration rdsSectionHeaderItemDecoration, Context context, ThemeNode themeNode) {
        Intrinsics.checkNotNull(context);
        Intrinsics.checkNotNull(themeNode);
        rdsSectionHeaderItemDecoration.update(context, themeNode);
        return Unit.INSTANCE;
    }

    @SuppressLint({"InlinedApi"})
    private final void update(Context context, ThemeNode themeNode) {
        int resId = ((StyleResource) themeNode.getResourceOrThrow(this.useDisplayStyle ? ThemeAttributes.INSTANCE.getROW_SECTION_HEADER_DISPLAY_STYLE() : ThemeAttributes.INSTANCE.getROW_SECTION_HEADER_STYLE())).getResId();
        int[] iArr = {R.attr.textAppearance, R.attr.paddingStart, R.attr.paddingTop, R.attr.paddingEnd, R.attr.paddingBottom};
        ArraysKt.sort(iArr);
        ResourceArray resourceArrayObtainStyledResources = themeNode.obtainStyledResources(iArr, resId, CollectionsKt.emptyList());
        try {
            int resourceIdOrThrow = resourceArrayObtainStyledResources.getResourceIdOrThrow(ArraysKt.indexOf(iArr, R.attr.textAppearance));
            int dimensionPixelSizeOrThrow = resourceArrayObtainStyledResources.getDimensionPixelSizeOrThrow(ArraysKt.indexOf(iArr, R.attr.paddingStart));
            int dimensionPixelSizeOrThrow2 = resourceArrayObtainStyledResources.getDimensionPixelSizeOrThrow(ArraysKt.indexOf(iArr, R.attr.paddingTop));
            int dimensionPixelSizeOrThrow3 = resourceArrayObtainStyledResources.getDimensionPixelSizeOrThrow(ArraysKt.indexOf(iArr, R.attr.paddingEnd));
            int dimensionPixelSizeOrThrow4 = resourceArrayObtainStyledResources.getDimensionPixelSizeOrThrow(ArraysKt.indexOf(iArr, R.attr.paddingBottom));
            Unit unit = Unit.INSTANCE;
            resourceArrayObtainStyledResources.recycle();
            resourceArrayObtainStyledResources = themeNode.obtainStyledResources(iArr, ((StyleResource) themeNode.getResourceOrThrow(this.useDisplayStyle ? ThemeAttributes.INSTANCE.getROW_TOP_SECTION_HEADER_DISPLAY_STYLE() : ThemeAttributes.INSTANCE.getROW_TOP_SECTION_HEADER_STYLE())).getResId(), CollectionsKt.emptyList());
            try {
                int dimensionPixelSizeOrThrow5 = resourceArrayObtainStyledResources.getDimensionPixelSizeOrThrow(ArraysKt.indexOf(iArr, R.attr.paddingTop));
                resourceArrayObtainStyledResources.recycle();
                TextPaint textPaint = this.textPaint;
                textPaint.getColor();
                textPaint.getTextSize();
                textPaint.getTypeface();
                int[] iArr2 = {R.attr.fontFamily, R.attr.textColor, R.attr.textSize, R.attr.lineHeight, R$attr.lineHeight};
                ArraysKt.sort(iArr2);
                resourceArrayObtainStyledResources = themeNode.obtainStyledResources(iArr2, resourceIdOrThrow, CollectionsKt.emptyList());
                try {
                    int colorOrThrow = resourceArrayObtainStyledResources.getColorOrThrow(ArraysKt.indexOf(iArr2, R.attr.textColor));
                    float dimensionOrThrow = resourceArrayObtainStyledResources.getDimensionOrThrow(ArraysKt.indexOf(iArr2, R.attr.textSize));
                    Typeface fontOrThrow = resourceArrayObtainStyledResources.getFontOrThrow(context, ArraysKt.indexOf(iArr2, R.attr.fontFamily));
                    Integer dimensionPixelSize = resourceArrayObtainStyledResources.getDimensionPixelSize(ArraysKt.indexOf(iArr2, R.attr.lineHeight));
                    int iIntValue = dimensionPixelSize != null ? dimensionPixelSize.intValue() : -1;
                    if (iIntValue == -1) {
                        Integer dimensionPixelSize2 = resourceArrayObtainStyledResources.getDimensionPixelSize(ArraysKt.indexOf(iArr2, R$attr.lineHeight));
                        iIntValue = dimensionPixelSize2 != null ? dimensionPixelSize2.intValue() : -1;
                    }
                    resourceArrayObtainStyledResources.recycle();
                    if (dimensionPixelSizeOrThrow == this.paddingStart && dimensionPixelSizeOrThrow2 == this.paddingTop && dimensionPixelSizeOrThrow5 == this.paddingTopInTopPosition && dimensionPixelSizeOrThrow3 == this.paddingEnd && dimensionPixelSizeOrThrow4 == this.paddingBottom && iIntValue == this.lineHeight && colorOrThrow == textPaint.getColor() && dimensionOrThrow == textPaint.getTextSize() && Intrinsics.areEqual(fontOrThrow, textPaint.getTypeface())) {
                        return;
                    }
                    this.paddingStart = dimensionPixelSizeOrThrow;
                    this.paddingTop = dimensionPixelSizeOrThrow2;
                    this.paddingTopInTopPosition = dimensionPixelSizeOrThrow5;
                    this.paddingEnd = dimensionPixelSizeOrThrow3;
                    this.paddingBottom = dimensionPixelSizeOrThrow4;
                    this.lineHeight = iIntValue;
                    textPaint.setColor(colorOrThrow);
                    textPaint.setTextSize(dimensionOrThrow);
                    textPaint.setTypeface(fontOrThrow);
                    RecyclerView recyclerView = this.recyclerView;
                    Intrinsics.checkNotNull(recyclerView);
                    if (recyclerView.isComputingLayout()) {
                        return;
                    }
                    recyclerView.invalidateItemDecorations();
                } catch (Throwable th) {
                    throw th;
                }
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0038  */
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        CharSequence text;
        int i;
        StaticLayout.Builder lineSpacing;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        checkAttach(parent);
        HeaderInfo headerInfo = INSTANCE.getHeaderInfo(view);
        RecyclerView.Adapter<?> adapter = parent.getAdapter();
        int adapterPosition = parent.getChildViewHolder(view).getAdapterPosition();
        if (adapterPosition == -1) {
            StaticLayout layout = headerInfo.getLayout();
            text = layout != null ? layout.getText() : null;
        } else {
            Function2<RecyclerView.Adapter<?>, Integer, String> function2 = this.headerSelector;
            Intrinsics.checkNotNull(adapter);
            String strInvoke = function2.invoke(adapter, Integer.valueOf(adapterPosition));
            if (!Intrinsics.areEqual(strInvoke, adapterPosition == 0 ? null : this.headerSelector.invoke(adapter, Integer.valueOf(adapterPosition - 1)))) {
                text = strInvoke;
            }
        }
        TextPaint textPaint = this.textPaint;
        if (text != null) {
            if (adapterPosition == 0) {
                i = this.paddingTopInTopPosition;
            } else {
                i = this.paddingTop;
            }
            StaticLayout.Builder ellipsize = StaticLayout.Builder.obtain(text, 0, text.length(), textPaint, (parent.getWidth() - (parent.getPaddingStart() + parent.getPaddingEnd())) - (this.paddingStart + this.paddingEnd)).setMaxLines(1).setEllipsize(TextUtils.TruncateAt.END);
            if (this.lineHeight >= 0) {
                lineSpacing = ellipsize.setLineSpacing(r0 - textPaint.getFontMetricsInt(null), 1.0f);
            } else {
                lineSpacing = ellipsize.setLineSpacing(0.0f, 1.0f);
            }
            StaticLayout staticLayoutBuild = lineSpacing.build();
            Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "build(...)");
            PointF position = headerInfo.getPosition();
            position.x = this.paddingStart;
            position.y = this.paddingBottom;
            outRect.left = 0;
            outRect.top = staticLayoutBuild.getHeight() + i + this.paddingBottom;
            outRect.right = 0;
            outRect.bottom = 0;
            headerInfo.setLayout(staticLayoutBuild);
            return;
        }
        headerInfo.setLayout(null);
        outRect.setEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RdsSectionHeaderItemDecoration.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/designsystem/row/RdsSectionHeaderItemDecoration$HeaderInfo;", "", "<init>", "()V", "position", "Landroid/graphics/PointF;", "getPosition", "()Landroid/graphics/PointF;", "layout", "Landroid/text/StaticLayout;", "getLayout", "()Landroid/text/StaticLayout;", "setLayout", "(Landroid/text/StaticLayout;)V", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final class HeaderInfo {
        private StaticLayout layout;
        private final PointF position = new PointF();

        public final PointF getPosition() {
            return this.position;
        }

        public final StaticLayout getLayout() {
            return this.layout;
        }

        public final void setLayout(StaticLayout staticLayout) {
            this.layout = staticLayout;
        }
    }

    /* compiled from: RdsSectionHeaderItemDecoration.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R/\u0010\u0006\u001a\u00020\u0005*\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/designsystem/row/RdsSectionHeaderItemDecoration$Companion;", "", "<init>", "()V", "<set-?>", "Lcom/robinhood/android/designsystem/row/RdsSectionHeaderItemDecoration$HeaderInfo;", "headerInfo", "Landroid/view/View;", "getHeaderInfo", "(Landroid/view/View;)Lcom/robinhood/android/designsystem/row/RdsSectionHeaderItemDecoration$HeaderInfo;", "setHeaderInfo", "(Landroid/view/View;Lcom/robinhood/android/designsystem/row/RdsSectionHeaderItemDecoration$HeaderInfo;)V", "headerInfo$delegate", "Lkotlin/properties/ReadWriteProperty;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty2(new MutablePropertyReference2Impl(Companion.class, "headerInfo", "getHeaderInfo(Landroid/view/View;)Lcom/robinhood/android/designsystem/row/RdsSectionHeaderItemDecoration$HeaderInfo;", 0))};

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final HeaderInfo getHeaderInfo(View view) {
            return (HeaderInfo) RdsSectionHeaderItemDecoration.headerInfo$delegate.getValue(view, $$delegatedProperties[0]);
        }

        private final void setHeaderInfo(View view, HeaderInfo headerInfo) {
            RdsSectionHeaderItemDecoration.headerInfo$delegate.setValue(view, $$delegatedProperties[0], headerInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HeaderInfo headerInfo_delegate$lambda$15(View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new HeaderInfo();
    }
}
