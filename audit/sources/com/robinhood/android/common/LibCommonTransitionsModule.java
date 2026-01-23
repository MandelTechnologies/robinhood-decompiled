package com.robinhood.android.common;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import com.robinhood.android.common.p088ui.view.DotIndicators;
import com.robinhood.android.common.view.ProgressChecklistRowView;
import com.robinhood.scarlet.property.StyleProperty;
import com.robinhood.scarlet.property.StyleableProperty;
import com.robinhood.scarlet.transition.StylePropertyTransition;
import com.robinhood.scarlet.transition.attribute.ColorAttributeTransition;
import com.robinhood.scarlet.transition.attribute.ColorStateListAttributeTransition;
import com.robinhood.scarlet.util.resource.ResourceType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LibCommonTransitionsModule.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\t\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\n\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/common/LibCommonTransitionsModule;", "", "<init>", "()V", "provideDotIndicatorsDotColor", "Lcom/robinhood/scarlet/transition/StylePropertyTransition;", "resources", "Landroid/content/res/Resources;", "provideDotIndicatorsSecondaryColor", "provideProgressChecklistRowCheckIconTint", "provideProgressChecklistRowDefaultIconTint", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class LibCommonTransitionsModule {
    public static final int $stable = 0;
    public static final LibCommonTransitionsModule INSTANCE = new LibCommonTransitionsModule();

    private LibCommonTransitionsModule() {
    }

    public final StylePropertyTransition<?, ?> provideDotIndicatorsDotColor(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorAttributeTransition(StyleableProperty.INSTANCE.from(DotIndicators.class, new MutablePropertyReference1Impl() { // from class: com.robinhood.android.common.LibCommonTransitionsModule.provideDotIndicatorsDotColor.1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return Integer.valueOf(((DotIndicators) obj).getDotColor());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((DotIndicators) obj).setDotColor(((Number) obj2).intValue());
            }
        }, new Function2() { // from class: com.robinhood.android.common.LibCommonTransitionsModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LibCommonTransitionsModule.provideDotIndicatorsDotColor$lambda$0((DotIndicators) obj, (Integer) obj2);
            }
        }, StyleProperty.INSTANCE.from(resources, C11048R.attr.dotColor, ResourceType.COLOR.INSTANCE)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideDotIndicatorsDotColor$lambda$0(DotIndicators from, Integer num) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setDotColor(num != null ? num.intValue() : 0);
        return Unit.INSTANCE;
    }

    public final StylePropertyTransition<?, ?> provideDotIndicatorsSecondaryColor(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorAttributeTransition(StyleableProperty.INSTANCE.from(DotIndicators.class, new MutablePropertyReference1Impl() { // from class: com.robinhood.android.common.LibCommonTransitionsModule.provideDotIndicatorsSecondaryColor.1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return Integer.valueOf(((DotIndicators) obj).getSecondaryColor());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((DotIndicators) obj).setSecondaryColor(((Number) obj2).intValue());
            }
        }, new Function2() { // from class: com.robinhood.android.common.LibCommonTransitionsModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LibCommonTransitionsModule.provideDotIndicatorsSecondaryColor$lambda$1((DotIndicators) obj, (Integer) obj2);
            }
        }, StyleProperty.INSTANCE.from(resources, C11048R.attr.secondaryColor, ResourceType.COLOR.INSTANCE)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideDotIndicatorsSecondaryColor$lambda$1(DotIndicators from, Integer num) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setSecondaryColor(num != null ? num.intValue() : 0);
        return Unit.INSTANCE;
    }

    public final StylePropertyTransition<?, ?> provideProgressChecklistRowCheckIconTint(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorStateListAttributeTransition(StyleableProperty.INSTANCE.from(ProgressChecklistRowView.class, new MutablePropertyReference1Impl() { // from class: com.robinhood.android.common.LibCommonTransitionsModule.provideProgressChecklistRowCheckIconTint.1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((ProgressChecklistRowView) obj).getCheckIconTint();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((ProgressChecklistRowView) obj).setCheckIconTint((ColorStateList) obj2);
            }
        }, StyleProperty.INSTANCE.from(resources, C11048R.attr.checkIconTint, ResourceType.COLOR_STATE_LIST.INSTANCE)), false, 2, null);
    }

    public final StylePropertyTransition<?, ?> provideProgressChecklistRowDefaultIconTint(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorStateListAttributeTransition(StyleableProperty.INSTANCE.from(ProgressChecklistRowView.class, new MutablePropertyReference1Impl() { // from class: com.robinhood.android.common.LibCommonTransitionsModule.provideProgressChecklistRowDefaultIconTint.1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((ProgressChecklistRowView) obj).getDefaultIconTint();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((ProgressChecklistRowView) obj).setDefaultIconTint((ColorStateList) obj2);
            }
        }, StyleProperty.INSTANCE.from(resources, C11048R.attr.defaultIconTint, ResourceType.COLOR_STATE_LIST.INSTANCE)), false, 2, null);
    }
}
