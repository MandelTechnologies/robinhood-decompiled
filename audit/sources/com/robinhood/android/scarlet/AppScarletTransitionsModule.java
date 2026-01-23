package com.robinhood.android.scarlet;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import com.google.android.material.R$attr;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.robinhood.scarlet.property.StyleProperty;
import com.robinhood.scarlet.property.StyleableProperty;
import com.robinhood.scarlet.transition.StylePropertyTransition;
import com.robinhood.scarlet.transition.attribute.ColorAttributeTransition;
import com.robinhood.scarlet.transition.attribute.ColorStateListAttributeTransition;
import com.robinhood.scarlet.transition.attribute.DrawableAttributeTransition;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.ticker.TickerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AppScarletTransitionsModule.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\t\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\n\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\u000b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\r\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\u000e\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\u000f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\u0010\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\u0011\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\u0012\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\u0013\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/scarlet/AppScarletTransitionsModule;", "", "<init>", "()V", "provideBottomNavigationViewItemIconTintList", "Lcom/robinhood/scarlet/transition/StylePropertyTransition;", "resources", "Landroid/content/res/Resources;", "provideCardBackgroundColor", "provideImageViewSrcCompat", "provideNavigationViewItemTextColor", "provideNavigationViewItemIconTint", "provideTabLayoutTabIndicatorColor", "provideTabLayoutIconColor", "provideTabLayoutTabRippleColor", "provideTabLayoutTabTextColors", "provideTextInputLayoutEndIconTint", "provideTextViewShadowColor", "provideTickerViewTextColor", "provideImageViewTintColor", "lib-scarlet-transitions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class AppScarletTransitionsModule {
    public static final AppScarletTransitionsModule INSTANCE = new AppScarletTransitionsModule();

    /* JADX INFO: Access modifiers changed from: private */
    public static final ColorStateList provideTextInputLayoutEndIconTint$lambda$2(TextInputLayout from) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        return null;
    }

    private AppScarletTransitionsModule() {
    }

    public final StylePropertyTransition<?, ?> provideBottomNavigationViewItemIconTintList(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorStateListAttributeTransition(StyleableProperty.INSTANCE.from(BottomNavigationView.class, C278091.INSTANCE, C278102.INSTANCE, StyleProperty.INSTANCE.from(resources, R$attr.itemIconTint, ResourceType.COLOR_STATE_LIST.INSTANCE)), false, 2, null);
    }

    /* compiled from: AppScarletTransitionsModule.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.scarlet.AppScarletTransitionsModule$provideBottomNavigationViewItemIconTintList$1 */
    /* synthetic */ class C278091 extends FunctionReferenceImpl implements Function1<BottomNavigationView, ColorStateList> {
        public static final C278091 INSTANCE = new C278091();

        C278091() {
            super(1, BottomNavigationView.class, "getItemIconTintList", "getItemIconTintList()Landroid/content/res/ColorStateList;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final ColorStateList invoke(BottomNavigationView p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return p0.getItemIconTintList();
        }
    }

    /* compiled from: AppScarletTransitionsModule.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.scarlet.AppScarletTransitionsModule$provideBottomNavigationViewItemIconTintList$2 */
    /* synthetic */ class C278102 extends FunctionReferenceImpl implements Function2<BottomNavigationView, ColorStateList, Unit> {
        public static final C278102 INSTANCE = new C278102();

        C278102() {
            super(2, BottomNavigationView.class, "setItemIconTintList", "setItemIconTintList(Landroid/content/res/ColorStateList;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(BottomNavigationView bottomNavigationView, ColorStateList colorStateList) {
            invoke2(bottomNavigationView, colorStateList);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(BottomNavigationView p0, ColorStateList colorStateList) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            p0.setItemIconTintList(colorStateList);
        }
    }

    public final StylePropertyTransition<?, ?> provideCardBackgroundColor(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorStateListAttributeTransition(StyleableProperty.INSTANCE.from(CardView.class, C278111.INSTANCE, C278122.INSTANCE, StyleProperty.INSTANCE.from(resources, androidx.cardview.R$attr.cardBackgroundColor, ResourceType.COLOR_STATE_LIST.INSTANCE)), false, 2, null);
    }

    /* compiled from: AppScarletTransitionsModule.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.scarlet.AppScarletTransitionsModule$provideCardBackgroundColor$1 */
    /* synthetic */ class C278111 extends FunctionReferenceImpl implements Function1<CardView, ColorStateList> {
        public static final C278111 INSTANCE = new C278111();

        C278111() {
            super(1, CardView.class, "getCardBackgroundColor", "getCardBackgroundColor()Landroid/content/res/ColorStateList;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final ColorStateList invoke(CardView p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return p0.getCardBackgroundColor();
        }
    }

    /* compiled from: AppScarletTransitionsModule.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.scarlet.AppScarletTransitionsModule$provideCardBackgroundColor$2 */
    /* synthetic */ class C278122 extends FunctionReferenceImpl implements Function2<CardView, ColorStateList, Unit> {
        public static final C278122 INSTANCE = new C278122();

        C278122() {
            super(2, CardView.class, "setCardBackgroundColor", "setCardBackgroundColor(Landroid/content/res/ColorStateList;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(CardView cardView, ColorStateList colorStateList) {
            invoke2(cardView, colorStateList);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CardView p0, ColorStateList colorStateList) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            p0.setCardBackgroundColor(colorStateList);
        }
    }

    public final StylePropertyTransition<?, ?> provideImageViewSrcCompat(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new DrawableAttributeTransition(StyleableProperty.INSTANCE.from(ImageView.class, C278131.INSTANCE, C278142.INSTANCE, StyleProperty.INSTANCE.from(resources, androidx.appcompat.R$attr.srcCompat, ResourceType.DRAWABLE.INSTANCE)), false, 2, null);
    }

    /* compiled from: AppScarletTransitionsModule.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.scarlet.AppScarletTransitionsModule$provideImageViewSrcCompat$1 */
    /* synthetic */ class C278131 extends FunctionReferenceImpl implements Function1<ImageView, Drawable> {
        public static final C278131 INSTANCE = new C278131();

        C278131() {
            super(1, ImageView.class, "getDrawable", "getDrawable()Landroid/graphics/drawable/Drawable;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Drawable invoke(ImageView p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return p0.getDrawable();
        }
    }

    /* compiled from: AppScarletTransitionsModule.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.scarlet.AppScarletTransitionsModule$provideImageViewSrcCompat$2 */
    /* synthetic */ class C278142 extends FunctionReferenceImpl implements Function2<ImageView, Drawable, Unit> {
        public static final C278142 INSTANCE = new C278142();

        C278142() {
            super(2, ImageView.class, "setImageDrawable", "setImageDrawable(Landroid/graphics/drawable/Drawable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(ImageView imageView, Drawable drawable) {
            invoke2(imageView, drawable);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ImageView p0, Drawable drawable) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            p0.setImageDrawable(drawable);
        }
    }

    public final StylePropertyTransition<?, ?> provideNavigationViewItemTextColor(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorStateListAttributeTransition(StyleableProperty.INSTANCE.from(NavigationView.class, C278191.INSTANCE, C278202.INSTANCE, StyleProperty.INSTANCE.from(resources, R$attr.itemTextColor, ResourceType.COLOR_STATE_LIST.INSTANCE)), false, 2, null);
    }

    /* compiled from: AppScarletTransitionsModule.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.scarlet.AppScarletTransitionsModule$provideNavigationViewItemTextColor$1 */
    /* synthetic */ class C278191 extends FunctionReferenceImpl implements Function1<NavigationView, ColorStateList> {
        public static final C278191 INSTANCE = new C278191();

        C278191() {
            super(1, NavigationView.class, "getItemTextColor", "getItemTextColor()Landroid/content/res/ColorStateList;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final ColorStateList invoke(NavigationView p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return p0.getItemTextColor();
        }
    }

    /* compiled from: AppScarletTransitionsModule.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.scarlet.AppScarletTransitionsModule$provideNavigationViewItemTextColor$2 */
    /* synthetic */ class C278202 extends FunctionReferenceImpl implements Function2<NavigationView, ColorStateList, Unit> {
        public static final C278202 INSTANCE = new C278202();

        C278202() {
            super(2, NavigationView.class, "setItemTextColor", "setItemTextColor(Landroid/content/res/ColorStateList;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(NavigationView navigationView, ColorStateList colorStateList) {
            invoke2(navigationView, colorStateList);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(NavigationView p0, ColorStateList colorStateList) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            p0.setItemTextColor(colorStateList);
        }
    }

    public final StylePropertyTransition<?, ?> provideNavigationViewItemIconTint(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorStateListAttributeTransition(StyleableProperty.INSTANCE.from(NavigationView.class, C278171.INSTANCE, C278182.INSTANCE, StyleProperty.INSTANCE.from(resources, R$attr.itemIconTint, ResourceType.COLOR_STATE_LIST.INSTANCE)), false, 2, null);
    }

    /* compiled from: AppScarletTransitionsModule.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.scarlet.AppScarletTransitionsModule$provideNavigationViewItemIconTint$1 */
    /* synthetic */ class C278171 extends FunctionReferenceImpl implements Function1<NavigationView, ColorStateList> {
        public static final C278171 INSTANCE = new C278171();

        C278171() {
            super(1, NavigationView.class, "getItemIconTintList", "getItemIconTintList()Landroid/content/res/ColorStateList;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final ColorStateList invoke(NavigationView p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return p0.getItemIconTintList();
        }
    }

    /* compiled from: AppScarletTransitionsModule.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.scarlet.AppScarletTransitionsModule$provideNavigationViewItemIconTint$2 */
    /* synthetic */ class C278182 extends FunctionReferenceImpl implements Function2<NavigationView, ColorStateList, Unit> {
        public static final C278182 INSTANCE = new C278182();

        C278182() {
            super(2, NavigationView.class, "setItemIconTintList", "setItemIconTintList(Landroid/content/res/ColorStateList;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(NavigationView navigationView, ColorStateList colorStateList) {
            invoke2(navigationView, colorStateList);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(NavigationView p0, ColorStateList colorStateList) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            p0.setItemIconTintList(colorStateList);
        }
    }

    public final StylePropertyTransition<?, ?> provideTabLayoutTabIndicatorColor(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorAttributeTransition(StyleableProperty.INSTANCE.from(TabLayout.class, new Function1() { // from class: com.robinhood.android.scarlet.AppScarletTransitionsModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AppScarletTransitionsModule.provideTabLayoutTabIndicatorColor$lambda$0((TabLayout) obj);
            }
        }, new Function2() { // from class: com.robinhood.android.scarlet.AppScarletTransitionsModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AppScarletTransitionsModule.provideTabLayoutTabIndicatorColor$lambda$1((TabLayout) obj, (Integer) obj2);
            }
        }, StyleProperty.INSTANCE.from(resources, R$attr.tabIndicatorColor, ResourceType.COLOR.INSTANCE)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer provideTabLayoutTabIndicatorColor$lambda$0(TabLayout from) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideTabLayoutTabIndicatorColor$lambda$1(TabLayout from, Integer num) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setSelectedTabIndicatorColor(num != null ? num.intValue() : 0);
        return Unit.INSTANCE;
    }

    public final StylePropertyTransition<?, ?> provideTabLayoutIconColor(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorStateListAttributeTransition(StyleableProperty.INSTANCE.from(TabLayout.class, C278211.INSTANCE, C278222.INSTANCE, StyleProperty.INSTANCE.from(resources, R$attr.tabIconTint, ResourceType.COLOR_STATE_LIST.INSTANCE)), false, 2, null);
    }

    /* compiled from: AppScarletTransitionsModule.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.scarlet.AppScarletTransitionsModule$provideTabLayoutIconColor$1 */
    /* synthetic */ class C278211 extends FunctionReferenceImpl implements Function1<TabLayout, ColorStateList> {
        public static final C278211 INSTANCE = new C278211();

        C278211() {
            super(1, TabLayout.class, "getTabIconTint", "getTabIconTint()Landroid/content/res/ColorStateList;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final ColorStateList invoke(TabLayout p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return p0.getTabIconTint();
        }
    }

    /* compiled from: AppScarletTransitionsModule.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.scarlet.AppScarletTransitionsModule$provideTabLayoutIconColor$2 */
    /* synthetic */ class C278222 extends FunctionReferenceImpl implements Function2<TabLayout, ColorStateList, Unit> {
        public static final C278222 INSTANCE = new C278222();

        C278222() {
            super(2, TabLayout.class, "setTabIconTint", "setTabIconTint(Landroid/content/res/ColorStateList;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(TabLayout tabLayout, ColorStateList colorStateList) {
            invoke2(tabLayout, colorStateList);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(TabLayout p0, ColorStateList colorStateList) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            p0.setTabIconTint(colorStateList);
        }
    }

    public final StylePropertyTransition<?, ?> provideTabLayoutTabRippleColor(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorStateListAttributeTransition(StyleableProperty.INSTANCE.from(TabLayout.class, C278231.INSTANCE, C278242.INSTANCE, StyleProperty.INSTANCE.from(resources, R$attr.tabRippleColor, ResourceType.COLOR_STATE_LIST.INSTANCE)), false, 2, null);
    }

    /* compiled from: AppScarletTransitionsModule.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.scarlet.AppScarletTransitionsModule$provideTabLayoutTabRippleColor$1 */
    /* synthetic */ class C278231 extends FunctionReferenceImpl implements Function1<TabLayout, ColorStateList> {
        public static final C278231 INSTANCE = new C278231();

        C278231() {
            super(1, TabLayout.class, "getTabRippleColor", "getTabRippleColor()Landroid/content/res/ColorStateList;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final ColorStateList invoke(TabLayout p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return p0.getTabRippleColor();
        }
    }

    /* compiled from: AppScarletTransitionsModule.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.scarlet.AppScarletTransitionsModule$provideTabLayoutTabRippleColor$2 */
    /* synthetic */ class C278242 extends FunctionReferenceImpl implements Function2<TabLayout, ColorStateList, Unit> {
        public static final C278242 INSTANCE = new C278242();

        C278242() {
            super(2, TabLayout.class, "setTabRippleColor", "setTabRippleColor(Landroid/content/res/ColorStateList;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(TabLayout tabLayout, ColorStateList colorStateList) {
            invoke2(tabLayout, colorStateList);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(TabLayout p0, ColorStateList colorStateList) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            p0.setTabRippleColor(colorStateList);
        }
    }

    public final StylePropertyTransition<?, ?> provideTabLayoutTabTextColors(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorStateListAttributeTransition(StyleableProperty.INSTANCE.from(TabLayout.class, C278251.INSTANCE, C278262.INSTANCE, StyleProperty.INSTANCE.from(resources, R$attr.tabTextColor, ResourceType.COLOR_STATE_LIST.INSTANCE)), false, 2, null);
    }

    /* compiled from: AppScarletTransitionsModule.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.scarlet.AppScarletTransitionsModule$provideTabLayoutTabTextColors$1 */
    /* synthetic */ class C278251 extends FunctionReferenceImpl implements Function1<TabLayout, ColorStateList> {
        public static final C278251 INSTANCE = new C278251();

        C278251() {
            super(1, TabLayout.class, "getTabTextColors", "getTabTextColors()Landroid/content/res/ColorStateList;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final ColorStateList invoke(TabLayout p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return p0.getTabTextColors();
        }
    }

    /* compiled from: AppScarletTransitionsModule.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.scarlet.AppScarletTransitionsModule$provideTabLayoutTabTextColors$2 */
    /* synthetic */ class C278262 extends FunctionReferenceImpl implements Function2<TabLayout, ColorStateList, Unit> {
        public static final C278262 INSTANCE = new C278262();

        C278262() {
            super(2, TabLayout.class, "setTabTextColors", "setTabTextColors(Landroid/content/res/ColorStateList;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(TabLayout tabLayout, ColorStateList colorStateList) {
            invoke2(tabLayout, colorStateList);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(TabLayout p0, ColorStateList colorStateList) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            p0.setTabTextColors(colorStateList);
        }
    }

    public final StylePropertyTransition<?, ?> provideTextInputLayoutEndIconTint(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorStateListAttributeTransition(StyleableProperty.INSTANCE.from(TextInputLayout.class, new Function1() { // from class: com.robinhood.android.scarlet.AppScarletTransitionsModule$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AppScarletTransitionsModule.provideTextInputLayoutEndIconTint$lambda$2((TextInputLayout) obj);
            }
        }, C278272.INSTANCE, StyleProperty.INSTANCE.from(resources, R$attr.endIconTint, ResourceType.COLOR_STATE_LIST.INSTANCE)), false, 2, null);
    }

    /* compiled from: AppScarletTransitionsModule.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.scarlet.AppScarletTransitionsModule$provideTextInputLayoutEndIconTint$2 */
    /* synthetic */ class C278272 extends FunctionReferenceImpl implements Function2<TextInputLayout, ColorStateList, Unit> {
        public static final C278272 INSTANCE = new C278272();

        C278272() {
            super(2, TextInputLayout.class, "setEndIconTintList", "setEndIconTintList(Landroid/content/res/ColorStateList;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(TextInputLayout textInputLayout, ColorStateList colorStateList) {
            invoke2(textInputLayout, colorStateList);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(TextInputLayout p0, ColorStateList colorStateList) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            p0.setEndIconTintList(colorStateList);
        }
    }

    public final StylePropertyTransition<?, ?> provideTextViewShadowColor(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorAttributeTransition(StyleableProperty.INSTANCE.from(TextView.class, new Function1() { // from class: com.robinhood.android.scarlet.AppScarletTransitionsModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AppScarletTransitionsModule.provideTextViewShadowColor$lambda$3((TextView) obj);
            }
        }, new Function2() { // from class: com.robinhood.android.scarlet.AppScarletTransitionsModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AppScarletTransitionsModule.provideTextViewShadowColor$lambda$4((TextView) obj, (Integer) obj2);
            }
        }, StyleProperty.INSTANCE.from(resources, android.R.attr.shadowColor, ResourceType.COLOR.INSTANCE)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer provideTextViewShadowColor$lambda$3(TextView from) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        return Integer.valueOf(from.getShadowColor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideTextViewShadowColor$lambda$4(TextView from, Integer num) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setShadowLayer(from.getShadowRadius(), from.getShadowDx(), from.getShadowDy(), num != null ? num.intValue() : 0);
        return Unit.INSTANCE;
    }

    public final StylePropertyTransition<?, ?> provideTickerViewTextColor(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorAttributeTransition(StyleableProperty.INSTANCE.from(TickerView.class, C278281.INSTANCE, new Function2() { // from class: com.robinhood.android.scarlet.AppScarletTransitionsModule$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AppScarletTransitionsModule.provideTickerViewTextColor$lambda$5((TickerView) obj, (Integer) obj2);
            }
        }, StyleProperty.INSTANCE.from(resources, android.R.attr.textColor, ResourceType.COLOR.INSTANCE)));
    }

    /* compiled from: AppScarletTransitionsModule.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.scarlet.AppScarletTransitionsModule$provideTickerViewTextColor$1 */
    /* synthetic */ class C278281 extends FunctionReferenceImpl implements Function1<TickerView, Integer> {
        public static final C278281 INSTANCE = new C278281();

        C278281() {
            super(1, TickerView.class, "getTextColor", "getTextColor()I", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(TickerView p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return Integer.valueOf(p0.getTextColor());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideTickerViewTextColor$lambda$5(TickerView from, Integer num) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setTextColor(num != null ? num.intValue() : 0);
        return Unit.INSTANCE;
    }

    public final StylePropertyTransition<?, ?> provideImageViewTintColor(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorStateListAttributeTransition(StyleableProperty.INSTANCE.from(AppCompatImageView.class, C278151.INSTANCE, C278162.INSTANCE, StyleProperty.INSTANCE.from(resources, android.R.attr.tint, ResourceType.COLOR_STATE_LIST.INSTANCE)), false, 2, null);
    }

    /* compiled from: AppScarletTransitionsModule.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.scarlet.AppScarletTransitionsModule$provideImageViewTintColor$1 */
    /* synthetic */ class C278151 extends FunctionReferenceImpl implements Function1<AppCompatImageView, ColorStateList> {
        public static final C278151 INSTANCE = new C278151();

        C278151() {
            super(1, AppCompatImageView.class, "getImageTintList", "getImageTintList()Landroid/content/res/ColorStateList;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final ColorStateList invoke(AppCompatImageView p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return p0.getImageTintList();
        }
    }

    /* compiled from: AppScarletTransitionsModule.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.scarlet.AppScarletTransitionsModule$provideImageViewTintColor$2 */
    /* synthetic */ class C278162 extends FunctionReferenceImpl implements Function2<AppCompatImageView, ColorStateList, Unit> {
        public static final C278162 INSTANCE = new C278162();

        C278162() {
            super(2, AppCompatImageView.class, "setImageTintList", "setImageTintList(Landroid/content/res/ColorStateList;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(AppCompatImageView appCompatImageView, ColorStateList colorStateList) {
            invoke2(appCompatImageView, colorStateList);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AppCompatImageView p0, ColorStateList colorStateList) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            p0.setImageTintList(colorStateList);
        }
    }
}
