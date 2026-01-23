package com.robinhood.android.cash.rhy.tab.p077v2.p078ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.cash.rhy.tab.databinding.MergeRhyHeroAssetViewBinding;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.models.api.bonfire.rhy.ApiRhyTabStateResponse;
import com.robinhood.models.p320db.rhy.RhyTabState;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.extensions.ViewGroups;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import okhttp3.HttpUrl;

/* compiled from: RhyHeroAssetView.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/RhyHeroAssetView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "binding", "Lcom/robinhood/android/cash/rhy/tab/databinding/MergeRhyHeroAssetViewBinding;", "getBinding", "()Lcom/robinhood/android/cash/rhy/tab/databinding/MergeRhyHeroAssetViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bindHeroAsset", "", "heroAsset", "Lcom/robinhood/models/db/rhy/RhyTabState$HeroAsset;", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class RhyHeroAssetView extends Hammer_RhyHeroAssetView {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RhyHeroAssetView.class, "binding", "getBinding()Lcom/robinhood/android/cash/rhy/tab/databinding/MergeRhyHeroAssetViewBinding;", 0))};
    public static final int $stable = 8;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public ImageLoader imageLoader;

    /* compiled from: RhyHeroAssetView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiRhyTabStateResponse.ApiRhyTabStateAssetType.values().length];
            try {
                iArr[ApiRhyTabStateResponse.ApiRhyTabStateAssetType.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiRhyTabStateResponse.ApiRhyTabStateAssetType.ANIMATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiRhyTabStateResponse.ApiRhyTabStateAssetType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ RhyHeroAssetView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhyHeroAssetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C10285R.layout.merge_rhy_hero_asset_view, true);
        this.binding = ViewBinding5.viewBinding(this, RhyHeroAssetView2.INSTANCE);
    }

    public final ImageLoader getImageLoader() {
        ImageLoader imageLoader = this.imageLoader;
        if (imageLoader != null) {
            return imageLoader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageLoader");
        return null;
    }

    public final void setImageLoader(ImageLoader imageLoader) {
        Intrinsics.checkNotNullParameter(imageLoader, "<set-?>");
        this.imageLoader = imageLoader;
    }

    private final MergeRhyHeroAssetViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeRhyHeroAssetViewBinding) value;
    }

    public final void bindHeroAsset(RhyTabState.HeroAsset heroAsset) {
        Intrinsics.checkNotNullParameter(heroAsset, "heroAsset");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        HttpUrl url = heroAsset.getUrl(ContextsUiExtensions.getDensitySpec(context), DayNightChanges.isDay(ScarletManager2.getScarletManager(this)));
        int i = WhenMappings.$EnumSwitchMapping$0[heroAsset.getAssetType().ordinal()];
        if (i == 1) {
            ImageView imageView = getBinding().rhyHeroAssetImage;
            Intrinsics.checkNotNull(imageView);
            imageView.setVisibility(0);
            imageView.getLayoutParams().height = (int) (heroAsset.getAssetHeight() * imageView.getResources().getDisplayMetrics().density);
            ImageLoader.ImageRequest.DefaultImpls.into$default(getImageLoader().load(url), imageView, null, null, 6, null);
            LottieAnimationView lottieAnimationView = getBinding().rhyHeroAssetAnimation;
            Intrinsics.checkNotNull(lottieAnimationView);
            lottieAnimationView.setVisibility(8);
            lottieAnimationView.clearAnimation();
            Intrinsics.checkNotNull(lottieAnimationView);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            ImageView rhyHeroAssetImage = getBinding().rhyHeroAssetImage;
            Intrinsics.checkNotNullExpressionValue(rhyHeroAssetImage, "rhyHeroAssetImage");
            rhyHeroAssetImage.setVisibility(8);
            LottieAnimationView rhyHeroAssetAnimation = getBinding().rhyHeroAssetAnimation;
            Intrinsics.checkNotNullExpressionValue(rhyHeroAssetAnimation, "rhyHeroAssetAnimation");
            rhyHeroAssetAnimation.setVisibility(8);
            return;
        }
        ImageView imageView2 = getBinding().rhyHeroAssetImage;
        Intrinsics.checkNotNull(imageView2);
        imageView2.setVisibility(8);
        getImageLoader().cancelRequest(imageView2);
        LottieAnimationView lottieAnimationView2 = getBinding().rhyHeroAssetAnimation;
        Intrinsics.checkNotNull(lottieAnimationView2);
        lottieAnimationView2.setVisibility(0);
        lottieAnimationView2.getLayoutParams().height = (int) (heroAsset.getAssetHeight() * lottieAnimationView2.getResources().getDisplayMetrics().density);
        if (heroAsset.getLoopAnimation()) {
            lottieAnimationView2.setRepeatCount(-1);
        }
        lottieAnimationView2.setAnimationFromUrl(url.getUrl());
        lottieAnimationView2.playAnimation();
        Intrinsics.checkNotNull(lottieAnimationView2);
    }
}
