package com.robinhood.android.odyssey.lib.view;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.lib.odyssey.databinding.MergeSdBannerBinding;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoColorMapper;
import com.robinhood.android.odyssey.lib.utils.MergePropertiesValues;
import com.robinhood.android.odyssey.lib.view.SdBaseView;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.models.api.serverdrivenui.component.ApiSdBannerComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdBannerComponentData;
import com.robinhood.models.api.serverdrivenui.component.ApiSdImageComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdMediaMetadata;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTextSubComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTypedValue;
import com.robinhood.models.serverdriven.api.ApiThemedColor;
import com.robinhood.models.serverdriven.p347db.ThemedColor;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import okhttp3.HttpUrl;

/* compiled from: SdBanner.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 /2\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002:\u0001/B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020'H\u0002J\u0010\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020'H\u0002J\u0010\u0010*\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004H\u0016J\b\u0010+\u001a\u00020,H\u0014J\u0012\u0010-\u001a\u00020\u001e2\b\u0010.\u001a\u0004\u0018\u00010,H\u0014R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdBanner;", "Landroid/widget/LinearLayout;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdBannerComponent;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdBannerComponentData;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$Callbacks;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "binding", "Lcom/robinhood/android/lib/odyssey/databinding/MergeSdBannerBinding;", "getBinding", "()Lcom/robinhood/android/lib/odyssey/databinding/MergeSdBannerBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", WebsocketGatewayConstants.DATA_KEY, "getData", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdBannerComponentData;", "setData", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdBannerComponentData;)V", "onDataUpdated", "", "newData", "updateSource", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$UpdateSource;", "loadImage", "imageData", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdImageComponent$ApiSdImageComponentData;", "setImageTintColor", "tintColor", "Lcom/robinhood/models/serverdriven/db/ThemedColor;", "setBackgroundColor", "backgroundColor", "mergeNewData", "onSaveInstanceState", "Landroid/os/Parcelable;", "onRestoreInstanceState", "state", "Companion", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SdBanner extends Hammer_SdBanner implements SdBaseView<ApiSdBannerComponent, ApiSdBannerComponentData, SdBaseView.Callbacks> {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private ApiSdBannerComponentData data;
    public ImageLoader imageLoader;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SdBanner.class, "binding", "getBinding()Lcom/robinhood/android/lib/odyssey/databinding/MergeSdBannerBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void bind(ApiSdBannerComponent apiSdBannerComponent) {
        SdBaseView.DefaultImpls.bind(this, apiSdBannerComponent);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public Parcelable onRestoreState(Parcelable parcelable) {
        return SdBaseView.DefaultImpls.onRestoreState(this, parcelable);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public Parcelable onSaveState(Parcelable parcelable) {
        return SdBaseView.DefaultImpls.onSaveState(this, parcelable);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdTypedValue onSubmitValue() {
        return SdBaseView.DefaultImpls.onSubmitValue(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public Map<String, ApiSdTypedValue> requireAlternateComponentOnSubmitValueMap() {
        return SdBaseView.DefaultImpls.requireAlternateComponentOnSubmitValueMap(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public SdBaseView.Callbacks requireComponentCallbacks() {
        return SdBaseView.DefaultImpls.requireComponentCallbacks(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public View requireSdView() {
        return SdBaseView.DefaultImpls.requireSdView(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void update(ApiSdBannerComponentData apiSdBannerComponentData, SdBaseView.UpdateSource updateSource) {
        SdBaseView.DefaultImpls.update(this, apiSdBannerComponentData, updateSource);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C20335R.layout.merge_sd_banner, true);
        this.binding = ViewBinding5.viewBinding(this, SdBanner2.INSTANCE);
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

    private final MergeSdBannerBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeSdBannerBinding) value;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdBannerComponentData getData() {
        return this.data;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void setData(ApiSdBannerComponentData apiSdBannerComponentData) {
        this.data = apiSdBannerComponentData;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void onDataUpdated(ApiSdBannerComponentData newData, SdBaseView.UpdateSource updateSource) {
        ThemedColor dbModel;
        ApiThemedColor tint_color;
        ThemedColor dbModel2;
        ApiSdImageComponent.ApiSdImageComponentData data;
        Intrinsics.checkNotNullParameter(newData, "newData");
        Intrinsics.checkNotNullParameter(updateSource, "updateSource");
        SdBaseView.DefaultImpls.onDataUpdated(this, newData, updateSource);
        MergeSdBannerBinding binding = getBinding();
        RhTextView bannerTitle = binding.bannerTitle;
        Intrinsics.checkNotNullExpressionValue(bannerTitle, "bannerTitle");
        ApiSdTextSubComponent title = newData.getTitle();
        SdTextUtil.bindTextComponent(bannerTitle, title != null ? title.getData() : null, this);
        RhTextView bannerSubtitle = binding.bannerSubtitle;
        Intrinsics.checkNotNullExpressionValue(bannerSubtitle, "bannerSubtitle");
        ApiSdTextSubComponent subtitle = newData.getSubtitle();
        SdTextUtil.bindTextComponent(bannerSubtitle, subtitle != null ? subtitle.getData() : null, this);
        ApiSdImageComponent image = newData.getImage();
        if (image != null && (data = image.getData()) != null) {
            loadImage(data);
        }
        ApiSdBannerComponentData.ApiSdBannerImageConfiguration image_configuration = newData.getImage_configuration();
        if (image_configuration != null && (tint_color = image_configuration.getTint_color()) != null && (dbModel2 = tint_color.toDbModel()) != null) {
            setImageTintColor(dbModel2);
        }
        ApiThemedColor background_color = newData.getBackground_color();
        if (background_color == null || (dbModel = background_color.toDbModel()) == null) {
            return;
        }
        setBackgroundColor(dbModel);
    }

    private final void loadImage(ApiSdImageComponent.ApiSdImageComponentData imageData) {
        ApiSdMediaMetadata media = imageData.getMedia();
        if (media != null) {
            ImageLoader imageLoader = getImageLoader();
            ImageView bannerImage = getBinding().bannerImage;
            Intrinsics.checkNotNullExpressionValue(bannerImage, "bannerImage");
            imageLoader.cancelRequest(bannerImage);
            ImageLoader.ImageRequest imageRequestLoad = getImageLoader().load(HttpUrl.INSTANCE.get(media.getUrl()));
            ImageView bannerImage2 = getBinding().bannerImage;
            Intrinsics.checkNotNullExpressionValue(bannerImage2, "bannerImage");
            ImageLoader.ImageRequest.DefaultImpls.into$default(imageRequestLoad, bannerImage2, null, null, 6, null);
        }
    }

    private final void setImageTintColor(ThemedColor tintColor) {
        ResourceReferences4<Integer> resourceReferences4MapColor = ServerToBentoColorMapper.INSTANCE.mapColor(tintColor);
        if (resourceReferences4MapColor != null) {
            ImageView bannerImage = getBinding().bannerImage;
            Intrinsics.checkNotNullExpressionValue(bannerImage, "bannerImage");
            ScarletManager2.overrideAttribute(bannerImage, R.attr.tint, resourceReferences4MapColor);
        }
    }

    private final void setBackgroundColor(ThemedColor backgroundColor) {
        ResourceReferences4<Integer> resourceReferences4MapColor = ServerToBentoColorMapper.INSTANCE.mapColor(backgroundColor);
        if (resourceReferences4MapColor != null) {
            View root = getBinding().getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            ScarletManager2.overrideAttribute(root, R.attr.backgroundTint, resourceReferences4MapColor);
        }
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdBannerComponentData mergeNewData(ApiSdBannerComponentData newData) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        return (ApiSdBannerComponentData) MergePropertiesValues.mergePropertiesValues(getData(), Reflection.getOrCreateKotlinClass(ApiSdBannerComponentData.class), newData);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return onSaveState(super.onSaveInstanceState());
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        super.onRestoreInstanceState(onRestoreState(state));
    }

    /* compiled from: SdBanner.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdBanner$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/odyssey/lib/view/SdBanner;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<SdBanner> {
        private final /* synthetic */ Inflater<SdBanner> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public SdBanner inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (SdBanner) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C20335R.layout.include_sd_banner);
        }
    }
}
