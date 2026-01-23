package com.robinhood.android.maxonboarding;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import com.robinhood.android.designsystem.progress.RdsSegmentedProgressBar;
import com.robinhood.scarlet.property.StyleProperty;
import com.robinhood.scarlet.property.StyleableProperty;
import com.robinhood.scarlet.transition.StylePropertyTransition;
import com.robinhood.scarlet.transition.attribute.ColorStateListAttributeTransition;
import com.robinhood.scarlet.util.resource.ResourceType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LibMaxOnboardingTransitionsModule.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/maxonboarding/LibMaxOnboardingTransitionsModule;", "", "<init>", "()V", "provideProgressBarTint", "Lcom/robinhood/scarlet/transition/StylePropertyTransition;", "resources", "Landroid/content/res/Resources;", "provideProgressBarBackgroundTint", "feature-lib-max-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class LibMaxOnboardingTransitionsModule {
    public static final int $stable = 0;
    public static final LibMaxOnboardingTransitionsModule INSTANCE = new LibMaxOnboardingTransitionsModule();

    private LibMaxOnboardingTransitionsModule() {
    }

    public final StylePropertyTransition<?, ?> provideProgressBarTint(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorStateListAttributeTransition(StyleableProperty.INSTANCE.from(RdsSegmentedProgressBar.class, new MutablePropertyReference1Impl() { // from class: com.robinhood.android.maxonboarding.LibMaxOnboardingTransitionsModule.provideProgressBarTint.1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((RdsSegmentedProgressBar) obj).getProgressTint();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((RdsSegmentedProgressBar) obj).setProgressTint((ColorStateList) obj2);
            }
        }, new Function2() { // from class: com.robinhood.android.maxonboarding.LibMaxOnboardingTransitionsModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LibMaxOnboardingTransitionsModule.provideProgressBarTint$lambda$0((RdsSegmentedProgressBar) obj, (ColorStateList) obj2);
            }
        }, StyleProperty.INSTANCE.from(resources, android.R.attr.progressTint, ResourceType.COLOR_STATE_LIST.INSTANCE)), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideProgressBarTint$lambda$0(RdsSegmentedProgressBar from, ColorStateList colorStateList) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setProgressTint(colorStateList);
        return Unit.INSTANCE;
    }

    public final StylePropertyTransition<?, ?> provideProgressBarBackgroundTint(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorStateListAttributeTransition(StyleableProperty.INSTANCE.from(RdsSegmentedProgressBar.class, new MutablePropertyReference1Impl() { // from class: com.robinhood.android.maxonboarding.LibMaxOnboardingTransitionsModule.provideProgressBarBackgroundTint.1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((RdsSegmentedProgressBar) obj).getProgressBackgroundTint();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((RdsSegmentedProgressBar) obj).setProgressBackgroundTint((ColorStateList) obj2);
            }
        }, new Function2() { // from class: com.robinhood.android.maxonboarding.LibMaxOnboardingTransitionsModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LibMaxOnboardingTransitionsModule.provideProgressBarBackgroundTint$lambda$1((RdsSegmentedProgressBar) obj, (ColorStateList) obj2);
            }
        }, StyleProperty.INSTANCE.from(resources, android.R.attr.progressBackgroundTint, ResourceType.COLOR_STATE_LIST.INSTANCE)), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideProgressBarBackgroundTint$lambda$1(RdsSegmentedProgressBar from, ColorStateList colorStateList) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setProgressBackgroundTint(colorStateList);
        return Unit.INSTANCE;
    }
}
