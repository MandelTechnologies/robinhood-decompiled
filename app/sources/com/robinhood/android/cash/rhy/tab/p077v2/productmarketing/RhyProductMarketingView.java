package com.robinhood.android.cash.rhy.tab.p077v2.productmarketing;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.cash.rhy.tab.databinding.IncludeRhyOnboardingInfoBannerBinding;
import com.robinhood.android.cash.rhy.tab.databinding.IncludeRhyProductMarketingFeatureBinding;
import com.robinhood.android.cash.rhy.tab.databinding.IncludeRhyProductMarketingHeroBinding;
import com.robinhood.android.cash.rhy.tab.p077v2.productmarketing.RhyProductMarketingView;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.staticcontent.model.disclosure.DisclosureContent;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketingContent;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketingPictogram;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.extensions.TypedArrays3;
import com.robinhood.utils.p409ui.view.recyclerview.CompositeAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.SingleItemAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;

/* compiled from: RhyProductMarketingView.kt */
@Metadata(m3635d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 /2\u00020\u0001:\u0003-./B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010#\u001a\u00020\u00142\b\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020'2\u0010\u0010(\u001a\f\u0012\u0004\u0012\u00020\u00140\u0013j\u0002`\u0015J\u0016\u0010)\u001a\u00020\u0014*\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0002R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00140\u0013j\u0002`\u00150\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00140\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/productmarketing/RhyProductMarketingView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "assetContext", "Lcom/robinhood/android/cash/rhy/tab/v2/productmarketing/RhyProductMarketingAssetContext;", "bannerAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/SingleItemAdapter;", "Lcom/robinhood/android/designsystem/banner/RdsInfoBannerView;", "Lkotlin/Function0;", "", "Lcom/robinhood/android/cash/rhy/tab/v2/productmarketing/OnDismissCallback;", "heroAdapter", "Landroid/view/View;", "Lcom/robinhood/android/cash/rhy/tab/v2/productmarketing/RhyProductMarketingView$HeroFeature;", "featuresAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent$Feature;", "valuePropsAdapter", "Lcom/robinhood/android/cash/rhy/tab/v2/productmarketing/RhyProductMarketingValuePropsView;", "Lcom/robinhood/android/cash/rhy/tab/v2/productmarketing/RhyProductMarketingView$ValueProps;", "disclosureAdapter", "Lcom/robinhood/android/designsystem/text/RhTextView;", "itemAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapter;", "bind", "content", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;", "showClosedCashManagementBanner", "", "dismissCallback", "setPictogram", "Landroid/widget/ImageView;", "pictogram", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingPictogram;", "HeroFeature", "ValueProps", "Companion", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class RhyProductMarketingView extends Hammer_RhyProductMarketingView {
    private RhyProductMarketingAssetContext assetContext;
    private final SingleItemAdapter<RdsInfoBannerView, Function0<Unit>> bannerAdapter;
    private final SingleItemAdapter<RhTextView, Unit> disclosureAdapter;
    private final GenericListAdapter<View, ProductMarketingContent.Feature> featuresAdapter;
    private final SingleItemAdapter<View, HeroFeature> heroAdapter;
    public ImageLoader imageLoader;
    private final CompositeAdapter itemAdapter;
    private final SingleItemAdapter<RhyProductMarketingValuePropsView, ValueProps> valuePropsAdapter;
    public static final int $stable = 8;
    private static final String FEATURE_HERO_IMAGE = "hero-image";
    private static final String FEATURE_VALUE_PROPS = "features-list";
    private static final Set<String> metaFeatures = SetsKt.setOf((Object[]) new String[]{FEATURE_HERO_IMAGE, FEATURE_VALUE_PROPS});

    public /* synthetic */ RhyProductMarketingView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RhyProductMarketingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        Intrinsics.checkNotNullParameter(context, "context");
        SingleItemAdapter.Companion companion = SingleItemAdapter.INSTANCE;
        SingleItemAdapter<RdsInfoBannerView, Function0<Unit>> singleItemAdapterOf$default = SingleItemAdapter.Companion.of$default(companion, C10285R.layout.include_rhy_onboarding_info_banner, (DiffUtil.ItemCallback) null, new Function2() { // from class: com.robinhood.android.cash.rhy.tab.v2.productmarketing.RhyProductMarketingView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return RhyProductMarketingView.bannerAdapter$lambda$2((RdsInfoBannerView) obj, (Function0) obj2);
            }
        }, 2, (Object) null);
        this.bannerAdapter = singleItemAdapterOf$default;
        SingleItemAdapter<View, HeroFeature> singleItemAdapterOf$default2 = SingleItemAdapter.Companion.of$default(companion, C10285R.layout.include_rhy_product_marketing_hero, (DiffUtil.ItemCallback) null, new Function2() { // from class: com.robinhood.android.cash.rhy.tab.v2.productmarketing.RhyProductMarketingView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return RhyProductMarketingView.heroAdapter$lambda$4(this.f$0, (View) obj, (RhyProductMarketingView.HeroFeature) obj2);
            }
        }, 2, (Object) null);
        this.heroAdapter = singleItemAdapterOf$default2;
        GenericListAdapter<View, ProductMarketingContent.Feature> genericListAdapterM2985of = GenericListAdapter.INSTANCE.m2985of(C10285R.layout.include_rhy_product_marketing_feature, DiffCallbacks.INSTANCE.byEquality(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.productmarketing.RhyProductMarketingView$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyProductMarketingView.featuresAdapter$lambda$5((ProductMarketingContent.Feature) obj);
            }
        }), new Function2() { // from class: com.robinhood.android.cash.rhy.tab.v2.productmarketing.RhyProductMarketingView$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return RhyProductMarketingView.featuresAdapter$lambda$7(this.f$0, (View) obj, (ProductMarketingContent.Feature) obj2);
            }
        });
        this.featuresAdapter = genericListAdapterM2985of;
        SingleItemAdapter<RhyProductMarketingValuePropsView, ValueProps> singleItemAdapterOf$default3 = SingleItemAdapter.Companion.of$default(companion, RhyProductMarketingValuePropsView.INSTANCE, null, 2, null);
        this.valuePropsAdapter = singleItemAdapterOf$default3;
        SingleItemAdapter<RhTextView, Unit> singleItemAdapterOfUnit$default = SingleItemAdapter.Companion.ofUnit$default(companion, C10285R.layout.rhy_onboarding_disclosure_view, (DiffUtil.ItemCallback) null, (Function1) null, 6, (Object) null);
        this.disclosureAdapter = singleItemAdapterOfUnit$default;
        CompositeAdapter compositeAdapter = new CompositeAdapter((RecyclerView.Adapter<?>[]) new RecyclerView.Adapter[]{singleItemAdapterOf$default, singleItemAdapterOf$default2, genericListAdapterM2985of, singleItemAdapterOf$default3, singleItemAdapterOfUnit$default});
        this.itemAdapter = compositeAdapter;
        setAdapter(compositeAdapter);
        int[] RhyProductMarketingView = C10285R.styleable.RhyProductMarketingView;
        Intrinsics.checkNotNullExpressionValue(RhyProductMarketingView, "RhyProductMarketingView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RhyProductMarketingView, 0, 0);
        Integer intOrNull = TypedArrays3.getIntOrNull(typedArrayObtainStyledAttributes, C10285R.styleable.RhyProductMarketingView_assetContext);
        this.assetContext = intOrNull != null ? RhyProductMarketingAssetContext.values()[intOrNull.intValue()] : null;
        typedArrayObtainStyledAttributes.recycle();
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bannerAdapter$lambda$2(RdsInfoBannerView of, final Function0 callback) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(callback, "callback");
        IncludeRhyOnboardingInfoBannerBinding.bind(of);
        of.onDismiss(new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.productmarketing.RhyProductMarketingView$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyProductMarketingView.bannerAdapter$lambda$2$lambda$1$lambda$0(callback);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bannerAdapter$lambda$2$lambda$1$lambda$0(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit heroAdapter$lambda$4(RhyProductMarketingView rhyProductMarketingView, View of, HeroFeature hero) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(hero, "hero");
        IncludeRhyProductMarketingHeroBinding includeRhyProductMarketingHeroBindingBind = IncludeRhyProductMarketingHeroBinding.bind(of);
        includeRhyProductMarketingHeroBindingBind.heroTitle.setText(hero.getPageTitle());
        includeRhyProductMarketingHeroBindingBind.heroSubtitle.setText(hero.getProductDescription());
        RhTextView rhTextView = includeRhyProductMarketingHeroBindingBind.heroDisclosure;
        DisclosureContent disclosure = hero.getDisclosure();
        rhTextView.setText(disclosure != null ? disclosure.getContent() : null);
        ImageView heroImage = includeRhyProductMarketingHeroBindingBind.heroImage;
        Intrinsics.checkNotNullExpressionValue(heroImage, "heroImage");
        rhyProductMarketingView.setPictogram(heroImage, hero.getHeroImage());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object featuresAdapter$lambda$5(ProductMarketingContent.Feature byEquality) {
        Intrinsics.checkNotNullParameter(byEquality, "$this$byEquality");
        return byEquality.getIdentifier();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit featuresAdapter$lambda$7(RhyProductMarketingView rhyProductMarketingView, View of, ProductMarketingContent.Feature feature) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(feature, "feature");
        IncludeRhyProductMarketingFeatureBinding includeRhyProductMarketingFeatureBindingBind = IncludeRhyProductMarketingFeatureBinding.bind(of);
        includeRhyProductMarketingFeatureBindingBind.featureTitle.setText(feature.getTitle());
        includeRhyProductMarketingFeatureBindingBind.featureSubtitle.setText(feature.getDescription());
        ImageView featureImage = includeRhyProductMarketingFeatureBindingBind.featureImage;
        Intrinsics.checkNotNullExpressionValue(featureImage, "featureImage");
        rhyProductMarketingView.setPictogram(featureImage, feature.getPictogram());
        return Unit.INSTANCE;
    }

    public final void bind(ProductMarketingContent content, boolean showClosedCashManagementBanner, Function0<Unit> dismissCallback) {
        HeroFeature heroFeature;
        ArrayList arrayList;
        List<ProductMarketingContent.Feature> features;
        Object next;
        List<ProductMarketingContent.Feature> features2;
        Object next2;
        Intrinsics.checkNotNullParameter(dismissCallback, "dismissCallback");
        SingleItemAdapter<RdsInfoBannerView, Function0<Unit>> singleItemAdapter = this.bannerAdapter;
        ValueProps valueProps = null;
        if (!showClosedCashManagementBanner) {
            dismissCallback = null;
        }
        singleItemAdapter.setData(dismissCallback);
        SingleItemAdapter<View, HeroFeature> singleItemAdapter2 = this.heroAdapter;
        if (content != null) {
            String pageTitle = content.getPageTitle();
            CharSequence productDescription = content.getProductDescription();
            DisclosureContent disclosure = content.getDisclosure();
            Iterator<T> it = content.getFeatures().iterator();
            while (true) {
                if (it.hasNext()) {
                    next2 = it.next();
                    if (Intrinsics.areEqual(((ProductMarketingContent.Feature) next2).getIdentifier(), FEATURE_HERO_IMAGE)) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            ProductMarketingContent.Feature feature = (ProductMarketingContent.Feature) next2;
            heroFeature = new HeroFeature(pageTitle, productDescription, disclosure, feature != null ? feature.getPictogram() : null);
        } else {
            heroFeature = null;
        }
        singleItemAdapter2.setData(heroFeature);
        GenericListAdapter<View, ProductMarketingContent.Feature> genericListAdapter = this.featuresAdapter;
        if (content == null || (features2 = content.getFeatures()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object obj : features2) {
                if (!metaFeatures.contains(((ProductMarketingContent.Feature) obj).getIdentifier())) {
                    arrayList.add(obj);
                }
            }
        }
        genericListAdapter.submitList(arrayList);
        SingleItemAdapter<RhyProductMarketingValuePropsView, ValueProps> singleItemAdapter3 = this.valuePropsAdapter;
        if (content != null && (features = content.getFeatures()) != null) {
            Iterator<T> it2 = features.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.areEqual(((ProductMarketingContent.Feature) next).getIdentifier(), FEATURE_VALUE_PROPS)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            ProductMarketingContent.Feature feature2 = (ProductMarketingContent.Feature) next;
            if (feature2 != null) {
                valueProps = new ValueProps(feature2.getTitle(), StringsKt.split$default(feature2.getDescription(), new String[]{"\n"}, false, 0, 6, (Object) null));
            }
        }
        singleItemAdapter3.setData(valueProps);
    }

    private final void setPictogram(ImageView imageView, ProductMarketingPictogram productMarketingPictogram) {
        if (productMarketingPictogram instanceof ProductMarketingPictogram.Legacy) {
            Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ProductMarketingPictogram.Legacy legacy = (ProductMarketingPictogram.Legacy) productMarketingPictogram;
            imageView.setImageResource(DayNightChanges.isDay(ScarletManager2.getScarletManager(Contexts7.requireBaseActivityBaseContext(context))) ? legacy.getDayResId() : legacy.getNightResId());
            return;
        }
        if (productMarketingPictogram instanceof ProductMarketingPictogram.Pog) {
            imageView.setImageResource(((ProductMarketingPictogram.Pog) productMarketingPictogram).getResId());
            return;
        }
        if (!(productMarketingPictogram instanceof ProductMarketingPictogram.Remote)) {
            if (productMarketingPictogram != null) {
                throw new NoWhenBranchMatchedException();
            }
            imageView.setImageDrawable(null);
            return;
        }
        ImageLoader imageLoader = getImageLoader();
        RhyProductMarketingAssetContext rhyProductMarketingAssetContext = this.assetContext;
        if (rhyProductMarketingAssetContext != null) {
            String name = ((ProductMarketingPictogram.Remote) productMarketingPictogram).getName();
            Context context2 = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            HttpUrl assetUrl = rhyProductMarketingAssetContext.getAssetUrl(name, ContextsUiExtensions.getDensitySpec(context2));
            if (assetUrl != null) {
                ImageLoader.ImageRequest.DefaultImpls.into$default(imageLoader.load(assetUrl), imageView, null, null, 6, null);
                return;
            }
        }
        throw new IllegalStateException("Asset context must be set when using remote pictograms");
    }

    /* compiled from: RhyProductMarketingView.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/productmarketing/RhyProductMarketingView$HeroFeature;", "", "pageTitle", "", "productDescription", "", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Lcom/robinhood/staticcontent/model/disclosure/DisclosureContent;", "heroImage", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingPictogram;", "<init>", "(Ljava/lang/String;Ljava/lang/CharSequence;Lcom/robinhood/staticcontent/model/disclosure/DisclosureContent;Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingPictogram;)V", "getPageTitle", "()Ljava/lang/String;", "getProductDescription", "()Ljava/lang/CharSequence;", "getDisclosure", "()Lcom/robinhood/staticcontent/model/disclosure/DisclosureContent;", "getHeroImage", "()Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingPictogram;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class HeroFeature {
        public static final int $stable = 8;
        private final DisclosureContent disclosure;
        private final ProductMarketingPictogram heroImage;
        private final String pageTitle;
        private final CharSequence productDescription;

        public static /* synthetic */ HeroFeature copy$default(HeroFeature heroFeature, String str, CharSequence charSequence, DisclosureContent disclosureContent, ProductMarketingPictogram productMarketingPictogram, int i, Object obj) {
            if ((i & 1) != 0) {
                str = heroFeature.pageTitle;
            }
            if ((i & 2) != 0) {
                charSequence = heroFeature.productDescription;
            }
            if ((i & 4) != 0) {
                disclosureContent = heroFeature.disclosure;
            }
            if ((i & 8) != 0) {
                productMarketingPictogram = heroFeature.heroImage;
            }
            return heroFeature.copy(str, charSequence, disclosureContent, productMarketingPictogram);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPageTitle() {
            return this.pageTitle;
        }

        /* renamed from: component2, reason: from getter */
        public final CharSequence getProductDescription() {
            return this.productDescription;
        }

        /* renamed from: component3, reason: from getter */
        public final DisclosureContent getDisclosure() {
            return this.disclosure;
        }

        /* renamed from: component4, reason: from getter */
        public final ProductMarketingPictogram getHeroImage() {
            return this.heroImage;
        }

        public final HeroFeature copy(String pageTitle, CharSequence productDescription, DisclosureContent disclosure, ProductMarketingPictogram heroImage) {
            return new HeroFeature(pageTitle, productDescription, disclosure, heroImage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HeroFeature)) {
                return false;
            }
            HeroFeature heroFeature = (HeroFeature) other;
            return Intrinsics.areEqual(this.pageTitle, heroFeature.pageTitle) && Intrinsics.areEqual(this.productDescription, heroFeature.productDescription) && Intrinsics.areEqual(this.disclosure, heroFeature.disclosure) && Intrinsics.areEqual(this.heroImage, heroFeature.heroImage);
        }

        public int hashCode() {
            String str = this.pageTitle;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            CharSequence charSequence = this.productDescription;
            int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
            DisclosureContent disclosureContent = this.disclosure;
            int iHashCode3 = (iHashCode2 + (disclosureContent == null ? 0 : disclosureContent.hashCode())) * 31;
            ProductMarketingPictogram productMarketingPictogram = this.heroImage;
            return iHashCode3 + (productMarketingPictogram != null ? productMarketingPictogram.hashCode() : 0);
        }

        public String toString() {
            String str = this.pageTitle;
            CharSequence charSequence = this.productDescription;
            return "HeroFeature(pageTitle=" + str + ", productDescription=" + ((Object) charSequence) + ", disclosure=" + this.disclosure + ", heroImage=" + this.heroImage + ")";
        }

        public HeroFeature(String str, CharSequence charSequence, DisclosureContent disclosureContent, ProductMarketingPictogram productMarketingPictogram) {
            this.pageTitle = str;
            this.productDescription = charSequence;
            this.disclosure = disclosureContent;
            this.heroImage = productMarketingPictogram;
        }

        public final String getPageTitle() {
            return this.pageTitle;
        }

        public final CharSequence getProductDescription() {
            return this.productDescription;
        }

        public final DisclosureContent getDisclosure() {
            return this.disclosure;
        }

        public final ProductMarketingPictogram getHeroImage() {
            return this.heroImage;
        }
    }

    /* compiled from: RhyProductMarketingView.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/productmarketing/RhyProductMarketingView$ValueProps;", "", "title", "", "valueProps", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getValueProps", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ValueProps {
        public static final int $stable = 8;
        private final String title;
        private final List<String> valueProps;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ValueProps copy$default(ValueProps valueProps, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = valueProps.title;
            }
            if ((i & 2) != 0) {
                list = valueProps.valueProps;
            }
            return valueProps.copy(str, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final List<String> component2() {
            return this.valueProps;
        }

        public final ValueProps copy(String title, List<String> valueProps) {
            return new ValueProps(title, valueProps);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ValueProps)) {
                return false;
            }
            ValueProps valueProps = (ValueProps) other;
            return Intrinsics.areEqual(this.title, valueProps.title) && Intrinsics.areEqual(this.valueProps, valueProps.valueProps);
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<String> list = this.valueProps;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "ValueProps(title=" + this.title + ", valueProps=" + this.valueProps + ")";
        }

        public ValueProps(String str, List<String> list) {
            this.title = str;
            this.valueProps = list;
        }

        public final String getTitle() {
            return this.title;
        }

        public final List<String> getValueProps() {
            return this.valueProps;
        }
    }
}
