package com.robinhood.android.odyssey.lib.view;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.robinhood.models.api.serverdrivenui.component.ApiSdFlexibleComponent;
import com.robinhood.models.api.serverdrivenui.part.ApiSdAxis;
import com.robinhood.models.api.serverdrivenui.part.ApiSdGravity;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ViewLayoutUtils.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0002\u001a\u0014\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0000\u001a$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0000\u001a\u001c\u0010\u0014\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0000\u001a\u001c\u0010\u0018\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0017H\u0000\u001a\u001c\u0010\u001b\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u0017H\u0002\u001a\u0014\u0010\u001e\u001a\u00020\u000f*\u00020\t2\u0006\u0010\u001f\u001a\u00020 H\u0002\u001a\u0014\u0010!\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\"\u001a\u00020\u000fH\u0002¨\u0006#"}, m3636d2 = {"updateInsetsUsingMargin", "", "Landroid/view/View;", "insets", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdFlexibleComponent$Insets;", "updateInsetsUsingPadding", "toPxInsets", "Lcom/robinhood/android/odyssey/lib/view/PxInsets;", "resources", "Landroid/content/res/Resources;", "setSdGravity", "sdGravity", "Lcom/robinhood/models/api/serverdrivenui/part/ApiSdGravity;", "getChildComponentLayout", "Lkotlin/Pair;", "", "layoutStrategy", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdFlexibleComponent$LayoutStrategy;", "listAxis", "Lcom/robinhood/models/api/serverdrivenui/part/ApiSdAxis;", "calculateExplicitWidth", "screenWidth", "widthMeasurement", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdFlexibleComponent$Size$Measurement;", "calculateExplicitHeight", "screenHeight", "heightMeasurement", "calculateExplicitEdge", "screenEdge", "measurement", "getPxSize", "dpValue", "", "setLayoutGravity", "gravity", "feature-lib-odyssey_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.odyssey.lib.view.ViewLayoutUtilsKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class ViewLayoutUtils2 {

    /* compiled from: ViewLayoutUtils.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.odyssey.lib.view.ViewLayoutUtilsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ApiSdGravity.values().length];
            try {
                iArr[ApiSdGravity.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiSdGravity.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiSdGravity.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ApiSdAxis.values().length];
            try {
                iArr2[ApiSdAxis.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ApiSdAxis.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ApiSdFlexibleComponent.LayoutStrategy.values().length];
            try {
                iArr3[ApiSdFlexibleComponent.LayoutStrategy.MATCH_PARENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[ApiSdFlexibleComponent.LayoutStrategy.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final void updateInsetsUsingMargin(View view, ApiSdFlexibleComponent.Insets insets) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        Resources resources = view.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        PxInsets pxInsets = toPxInsets(insets, resources);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(pxInsets.getStart(), pxInsets.getTop(), pxInsets.getEnd(), pxInsets.getBottom());
        view.setLayoutParams(marginLayoutParams);
    }

    public static final void updateInsetsUsingPadding(View view, ApiSdFlexibleComponent.Insets insets) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        Resources resources = view.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        PxInsets pxInsets = toPxInsets(insets, resources);
        view.setPaddingRelative(pxInsets.getStart(), pxInsets.getTop(), pxInsets.getEnd(), pxInsets.getBottom());
    }

    private static final PxInsets toPxInsets(ApiSdFlexibleComponent.Insets insets, Resources resources) {
        return new PxInsets(getPxSize(resources, insets.getStart()), getPxSize(resources, insets.getTop()), getPxSize(resources, insets.getEnd()), getPxSize(resources, insets.getBottom()));
    }

    public static final void setSdGravity(View view, ApiSdGravity sdGravity) {
        int i;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(sdGravity, "sdGravity");
        int i2 = WhenMappings.$EnumSwitchMapping$0[sdGravity.ordinal()];
        if (i2 == 1) {
            i = 8388611;
        } else if (i2 == 2) {
            i = 8388613;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = 17;
        }
        setLayoutGravity(view, i);
    }

    public static final Tuples2<Integer, Integer> getChildComponentLayout(ApiSdFlexibleComponent.LayoutStrategy layoutStrategy, ApiSdAxis listAxis) {
        Intrinsics.checkNotNullParameter(layoutStrategy, "layoutStrategy");
        Intrinsics.checkNotNullParameter(listAxis, "listAxis");
        int i = WhenMappings.$EnumSwitchMapping$2[layoutStrategy.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return Tuples4.m3642to(-2, -2);
            }
            throw new NoWhenBranchMatchedException();
        }
        int i2 = WhenMappings.$EnumSwitchMapping$1[listAxis.ordinal()];
        if (i2 == 1) {
            return Tuples4.m3642to(-1, -2);
        }
        if (i2 == 2) {
            return Tuples4.m3642to(-2, -1);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int calculateExplicitWidth(View view, int i, ApiSdFlexibleComponent.Size.Measurement widthMeasurement) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(widthMeasurement, "widthMeasurement");
        return calculateExplicitEdge(view, i, widthMeasurement);
    }

    public static final int calculateExplicitHeight(View view, int i, ApiSdFlexibleComponent.Size.Measurement heightMeasurement) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(heightMeasurement, "heightMeasurement");
        return calculateExplicitEdge(view, i, heightMeasurement);
    }

    private static final int calculateExplicitEdge(View view, int i, ApiSdFlexibleComponent.Size.Measurement measurement) {
        Number numberValueOf;
        if (measurement instanceof ApiSdFlexibleComponent.Size.Measurement.Constant) {
            Resources resources = view.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            numberValueOf = Integer.valueOf(getPxSize(resources, ((ApiSdFlexibleComponent.Size.Measurement.Constant) measurement).getValue()));
        } else {
            if (!(measurement instanceof ApiSdFlexibleComponent.Size.Measurement.Percentage)) {
                throw new NoWhenBranchMatchedException();
            }
            numberValueOf = Float.valueOf(i * ((ApiSdFlexibleComponent.Size.Measurement.Percentage) measurement).getValue());
        }
        return numberValueOf.intValue();
    }

    private static final int getPxSize(Resources resources, float f) {
        return (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
    }

    private static final void setLayoutGravity(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = i;
        } else if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = i;
        } else {
            throw new IllegalStateException("Root layout is not LinearLayout or FrameLayout");
        }
        view.setLayoutParams(layoutParams);
    }
}
