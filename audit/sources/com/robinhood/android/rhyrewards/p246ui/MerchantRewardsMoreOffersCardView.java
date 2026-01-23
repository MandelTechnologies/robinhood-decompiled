package com.robinhood.android.rhyrewards.p246ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.card.RdsCardView;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.android.rhyrewards.C27650R;
import com.robinhood.android.rhyrewards.databinding.MergeMerchantrewardsMoreOffersCardBinding;
import com.robinhood.models.p320db.mcduckling.MerchantOfferV2;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import okhttp3.HttpUrl;

/* compiled from: MerchantRewardsMoreOffersCardView.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001a2\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002:\u0001\u001aB\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/rhyrewards/ui/MerchantRewardsMoreOffersCardView;", "Lcom/robinhood/android/designsystem/container/RdsRippleContainerView;", "Lcom/robinhood/utils/ui/view/Bindable;", "", "Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/rhyrewards/databinding/MergeMerchantrewardsMoreOffersCardBinding;", "getBinding", "()Lcom/robinhood/android/rhyrewards/databinding/MergeMerchantrewardsMoreOffersCardBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "bind", "", "state", "Companion", "feature-lib-rhy-rewards_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class MerchantRewardsMoreOffersCardView extends Hammer_MerchantRewardsMoreOffersCardView implements Bindable<List<? extends MerchantOfferV2>> {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public ImageLoader imageLoader;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MerchantRewardsMoreOffersCardView.class, "binding", "getBinding()Lcom/robinhood/android/rhyrewards/databinding/MergeMerchantrewardsMoreOffersCardBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public /* bridge */ /* synthetic */ void bind(List<? extends MerchantOfferV2> list) {
        bind2((List<MerchantOfferV2>) list);
    }

    public /* synthetic */ MerchantRewardsMoreOffersCardView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MerchantRewardsMoreOffersCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewBinding5.viewBinding(this, MerchantRewardsMoreOffersCardView2.INSTANCE);
        ViewGroups.inflate(this, C27650R.layout.merge_merchantrewards_more_offers_card, true);
    }

    private final MergeMerchantrewardsMoreOffersCardBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeMerchantrewardsMoreOffersCardBinding) value;
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

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(List<MerchantOfferV2> state) {
        Intrinsics.checkNotNullParameter(state, "state");
        MergeMerchantrewardsMoreOffersCardBinding binding = getBinding();
        binding.merchantMoreOffersCardTitle.setText(getResources().getQuantityString(C27650R.plurals.cash_merchant_rewards_more_offers, state.size(), Integer.valueOf(state.size())));
        ImageLoader imageLoader = getImageLoader();
        HttpUrl.Companion companion = HttpUrl.INSTANCE;
        ImageLoader.ImageRequest imageRequestLoad = imageLoader.load(companion.get(((MerchantOfferV2) CollectionsKt.first((List) state)).getMerchantLogo()));
        ImageView merchantOfferLogo1 = binding.merchantOfferLogo1;
        Intrinsics.checkNotNullExpressionValue(merchantOfferLogo1, "merchantOfferLogo1");
        ImageLoader.ImageRequest.DefaultImpls.into$default(imageRequestLoad, merchantOfferLogo1, null, null, 6, null);
        binding.merchantOfferLogo1.setClipToOutline(true);
        RdsCardView merchantOfferLogoWrapper2 = binding.merchantOfferLogoWrapper2;
        Intrinsics.checkNotNullExpressionValue(merchantOfferLogoWrapper2, "merchantOfferLogoWrapper2");
        merchantOfferLogoWrapper2.setVisibility(state.size() > 1 ? 0 : 8);
        ImageView imageView = binding.merchantOfferLogo2;
        if (state.size() > 1) {
            imageView.setClipToOutline(true);
            ImageLoader.ImageRequest imageRequestLoad2 = getImageLoader().load(companion.get(state.get(1).getMerchantLogo()));
            Intrinsics.checkNotNull(imageView);
            ImageLoader.ImageRequest.DefaultImpls.into$default(imageRequestLoad2, imageView, null, null, 6, null);
        }
        RdsCardView merchantOfferLogoWrapper3 = binding.merchantOfferLogoWrapper3;
        Intrinsics.checkNotNullExpressionValue(merchantOfferLogoWrapper3, "merchantOfferLogoWrapper3");
        merchantOfferLogoWrapper3.setVisibility(state.size() > 2 ? 0 : 8);
        ImageView imageView2 = binding.merchantOfferLogo3;
        if (state.size() > 2) {
            imageView2.setClipToOutline(true);
            ImageLoader.ImageRequest imageRequestLoad3 = getImageLoader().load(companion.get(state.get(2).getMerchantLogo()));
            Intrinsics.checkNotNull(imageView2);
            ImageLoader.ImageRequest.DefaultImpls.into$default(imageRequestLoad3, imageView2, null, null, 6, null);
        }
        RdsCardView merchantOfferLogoWrapper4 = binding.merchantOfferLogoWrapper4;
        Intrinsics.checkNotNullExpressionValue(merchantOfferLogoWrapper4, "merchantOfferLogoWrapper4");
        merchantOfferLogoWrapper4.setVisibility(state.size() > 3 ? 0 : 8);
        ImageView imageView3 = binding.merchantOfferLogo4;
        if (state.size() > 3) {
            imageView3.setClipToOutline(true);
            ImageLoader.ImageRequest imageRequestLoad4 = getImageLoader().load(companion.get(state.get(3).getMerchantLogo()));
            Intrinsics.checkNotNull(imageView3);
            ImageLoader.ImageRequest.DefaultImpls.into$default(imageRequestLoad4, imageView3, null, null, 6, null);
        }
    }

    /* compiled from: MerchantRewardsMoreOffersCardView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/rhyrewards/ui/MerchantRewardsMoreOffersCardView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/rhyrewards/ui/MerchantRewardsMoreOffersCardView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-rhy-rewards_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<MerchantRewardsMoreOffersCardView> {
        private final /* synthetic */ Inflater<MerchantRewardsMoreOffersCardView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public MerchantRewardsMoreOffersCardView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (MerchantRewardsMoreOffersCardView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C27650R.layout.include_merchantrewards_more_offers_card);
        }
    }
}
