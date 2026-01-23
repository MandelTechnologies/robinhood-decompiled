package com.robinhood.android.common.p088ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.Interfaces2;

/* compiled from: BindResources.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\n\u001a \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u0007*\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\n\u001a \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u0007*\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\n\u001a \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u0007*\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\n\u001a \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u0007*\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\n\u001a \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u0007*\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\n\u001a \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00150\u0007*\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\n\u001a \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00180\u0007*\u00020\u00022\b\b\u0001\u0010\u0019\u001a\u00020\n\u001a&\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u001b0\u0007*\u00020\u00022\b\b\u0001\u0010\u001c\u001a\u00020\n\u001a \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u001e2\b\b\u0001\u0010\t\u001a\u00020\n\u001a \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\n0\u0007*\u00020\u001e2\b\b\u0001\u0010\f\u001a\u00020\n\u001a \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\n0\u0007*\u00020\u001e2\b\b\u0001\u0010\u000e\u001a\u00020\n\u001a \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00100\u0007*\u00020\u001e2\b\b\u0001\u0010\u0011\u001a\u00020\n\u001a \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\n0\u0007*\u00020\u001e2\b\b\u0001\u0010\u0011\u001a\u00020\n\u001a \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\n0\u0007*\u00020\u001e2\b\b\u0001\u0010\u0011\u001a\u00020\n\u001a \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00150\u0007*\u00020\u001e2\b\b\u0001\u0010\u0016\u001a\u00020\n\u001a \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00180\u0007*\u00020\u001e2\b\b\u0001\u0010\u0019\u001a\u00020\n\u001a&\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u001b0\u0007*\u00020\u001e2\b\b\u0001\u0010\u001c\u001a\u00020\n\u001a \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\b0\u0007*\u00020!2\b\b\u0001\u0010\t\u001a\u00020\n\u001a \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\n0\u0007*\u00020!2\b\b\u0001\u0010\f\u001a\u00020\n\u001a \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\n0\u0007*\u00020!2\b\b\u0001\u0010\u000e\u001a\u00020\n\u001a \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00100\u0007*\u00020!2\b\b\u0001\u0010\u0011\u001a\u00020\n\u001a \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\n0\u0007*\u00020!2\b\b\u0001\u0010\u0011\u001a\u00020\n\u001a \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\n0\u0007*\u00020!2\b\b\u0001\u0010\u0011\u001a\u00020\n\u001a \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00150\u0007*\u00020!2\b\b\u0001\u0010\u0016\u001a\u00020\n\u001a \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00180\u0007*\u00020!2\b\b\u0001\u0010\u0019\u001a\u00020\n\u001a&\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u001b0\u0007*\u00020!2\b\b\u0001\u0010\u001c\u001a\u00020\n\"\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00050\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00050\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, m3636d2 = {"activityContext", "Lkotlin/Function1;", "Landroid/app/Activity;", "Landroid/content/Context;", "activityResources", "Landroid/content/res/Resources;", "bindBool", "Lkotlin/properties/ReadOnlyProperty;", "", "bool", "", "bindColor", ResourceTypes.COLOR, "bindInteger", "resId", "bindDimen", "", ResourceTypes.DIMENSION, "bindDimenPixelOffset", "bindDimenPixelSize", "bindDrawable", "Landroid/graphics/drawable/Drawable;", ResourceTypes.DRAWABLE, "bindString", "", "string", "bindStringArray", "", ResourceTypes.ARRAY, "fragmentContext", "Landroidx/fragment/app/Fragment;", "fragmentResources", "viewContext", "Landroid/view/View;", "viewResources", "lib-common_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class BindResourcesKt {
    private static final Function1<Activity, Context> activityContext = new Function1() { // from class: com.robinhood.android.common.ui.BindResourcesKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return BindResourcesKt.activityContext$lambda$0((Activity) obj);
        }
    };
    private static final Function1<Activity, Resources> activityResources = new Function1() { // from class: com.robinhood.android.common.ui.BindResourcesKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return BindResourcesKt.activityResources$lambda$1((Activity) obj);
        }
    };
    private static final Function1<Fragment, Context> fragmentContext = new Function1() { // from class: com.robinhood.android.common.ui.BindResourcesKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return BindResourcesKt.fragmentContext$lambda$2((Fragment) obj);
        }
    };
    private static final Function1<Fragment, Resources> fragmentResources = new Function1() { // from class: com.robinhood.android.common.ui.BindResourcesKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return BindResourcesKt.fragmentResources$lambda$3((Fragment) obj);
        }
    };
    private static final Function1<View, Context> viewContext = new Function1() { // from class: com.robinhood.android.common.ui.BindResourcesKt$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return BindResourcesKt.viewContext$lambda$4((View) obj);
        }
    };
    private static final Function1<View, Resources> viewResources = new Function1() { // from class: com.robinhood.android.common.ui.BindResourcesKt$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return BindResourcesKt.viewResources$lambda$5((View) obj);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Activity activityContext$lambda$0(Activity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Resources activityResources$lambda$1(Activity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getResources();
    }

    public static final Interfaces2<Activity, Boolean> bindBool(Activity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        return new BooleanProperty(i, activityResources);
    }

    public static final Interfaces2<Activity, Integer> bindColor(Activity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        return new ColorProperty(i, activityContext);
    }

    public static final Interfaces2<Activity, Integer> bindInteger(Activity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        return new IntegerProperty(i, activityContext);
    }

    public static final Interfaces2<Activity, Float> bindDimen(Activity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        return new DimenProperty(i, activityResources);
    }

    public static final Interfaces2<Activity, Integer> bindDimenPixelOffset(Activity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        return new DimenPixelOffsetProperty(i, activityResources);
    }

    public static final Interfaces2<Activity, Integer> bindDimenPixelSize(Activity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        return new DimenPixelSizeProperty(i, activityResources);
    }

    public static final Interfaces2<Activity, Drawable> bindDrawable(Activity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        return new DrawableProperty(i, activityContext);
    }

    public static final Interfaces2<Activity, String> bindString(Activity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        return new StringProperty(i, activityResources);
    }

    public static final Interfaces2<Activity, String[]> bindStringArray(Activity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        return new StringArrayProperty(i, activityResources);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context fragmentContext$lambda$2(Fragment it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.requireContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Resources fragmentResources$lambda$3(Fragment it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getResources();
    }

    public static final Interfaces2<Fragment, Boolean> bindBool(Fragment fragment, int i) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        return new BooleanProperty(i, fragmentResources);
    }

    public static final Interfaces2<Fragment, Integer> bindColor(Fragment fragment, int i) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        return new ColorProperty(i, fragmentContext);
    }

    public static final Interfaces2<Fragment, Integer> bindInteger(Fragment fragment, int i) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        return new IntegerProperty(i, fragmentContext);
    }

    public static final Interfaces2<Fragment, Float> bindDimen(Fragment fragment, int i) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        return new DimenProperty(i, fragmentResources);
    }

    public static final Interfaces2<Fragment, Integer> bindDimenPixelOffset(Fragment fragment, int i) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        return new DimenPixelOffsetProperty(i, fragmentResources);
    }

    public static final Interfaces2<Fragment, Integer> bindDimenPixelSize(Fragment fragment, int i) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        return new DimenPixelSizeProperty(i, fragmentResources);
    }

    public static final Interfaces2<Fragment, Drawable> bindDrawable(Fragment fragment, int i) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        return new DrawableProperty(i, fragmentContext);
    }

    public static final Interfaces2<Fragment, String> bindString(Fragment fragment, int i) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        return new StringProperty(i, fragmentResources);
    }

    public static final Interfaces2<Fragment, String[]> bindStringArray(Fragment fragment, int i) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        return new StringArrayProperty(i, fragmentResources);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context viewContext$lambda$4(View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Resources viewResources$lambda$5(View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getResources();
    }

    public static final Interfaces2<View, Boolean> bindBool(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return new BooleanProperty(i, viewResources);
    }

    public static final Interfaces2<View, Integer> bindColor(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return new ColorProperty(i, viewContext);
    }

    public static final Interfaces2<View, Integer> bindInteger(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return new IntegerProperty(i, viewContext);
    }

    public static final Interfaces2<View, Float> bindDimen(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return new DimenProperty(i, viewResources);
    }

    public static final Interfaces2<View, Integer> bindDimenPixelOffset(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return new DimenPixelOffsetProperty(i, viewResources);
    }

    public static final Interfaces2<View, Integer> bindDimenPixelSize(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return new DimenPixelSizeProperty(i, viewResources);
    }

    public static final Interfaces2<View, Drawable> bindDrawable(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return new DrawableProperty(i, viewContext);
    }

    public static final Interfaces2<View, String> bindString(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return new StringProperty(i, viewResources);
    }

    public static final Interfaces2<View, String[]> bindStringArray(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return new StringArrayProperty(i, viewResources);
    }
}
