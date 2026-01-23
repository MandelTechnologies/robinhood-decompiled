package com.robinhood.android.odyssey.lib.template;

import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.view.SdButton;
import com.robinhood.android.odyssey.lib.view.SdImageView;
import com.robinhood.android.odyssey.lib.view.SdTextView;
import com.robinhood.models.api.serverdrivenui.page.ApiSdImagePage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: SdImageFragment.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0002H\u0014J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dH\u0014R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0011\u0010\u000eR\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/SdImageFragment;", "Lcom/robinhood/android/odyssey/lib/template/BaseSdTemplateFragment;", "Lcom/robinhood/models/api/serverdrivenui/page/ApiSdImagePage;", "<init>", "()V", "imageView", "Lcom/robinhood/android/odyssey/lib/view/SdImageView;", "getImageView", "()Lcom/robinhood/android/odyssey/lib/view/SdImageView;", "imageView$delegate", "Lkotlin/properties/ReadOnlyProperty;", "titleText", "Lcom/robinhood/android/odyssey/lib/view/SdTextView;", "getTitleText", "()Lcom/robinhood/android/odyssey/lib/view/SdTextView;", "titleText$delegate", "subtitleText", "getSubtitleText", "subtitleText$delegate", "primaryCta", "Lcom/robinhood/android/odyssey/lib/view/SdButton;", "getPrimaryCta", "()Lcom/robinhood/android/odyssey/lib/view/SdButton;", "primaryCta$delegate", "bind", "", "pageData", "onLoading", "loading", "", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class SdImageFragment extends BaseSdTemplateFragment<ApiSdImagePage> {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SdImageFragment.class, "imageView", "getImageView()Lcom/robinhood/android/odyssey/lib/view/SdImageView;", 0)), Reflection.property1(new PropertyReference1Impl(SdImageFragment.class, "titleText", "getTitleText()Lcom/robinhood/android/odyssey/lib/view/SdTextView;", 0)), Reflection.property1(new PropertyReference1Impl(SdImageFragment.class, "subtitleText", "getSubtitleText()Lcom/robinhood/android/odyssey/lib/view/SdTextView;", 0)), Reflection.property1(new PropertyReference1Impl(SdImageFragment.class, "primaryCta", "getPrimaryCta()Lcom/robinhood/android/odyssey/lib/view/SdButton;", 0))};
    public static final int $stable = 8;

    /* renamed from: imageView$delegate, reason: from kotlin metadata */
    private final Interfaces2 imageView;

    /* renamed from: primaryCta$delegate, reason: from kotlin metadata */
    private final Interfaces2 primaryCta;

    /* renamed from: subtitleText$delegate, reason: from kotlin metadata */
    private final Interfaces2 subtitleText;

    /* renamed from: titleText$delegate, reason: from kotlin metadata */
    private final Interfaces2 titleText;

    public SdImageFragment() {
        super(C20335R.layout.fragment_sd_image);
        this.imageView = bindView(C20335R.id.sdo_image_image_view);
        this.titleText = bindView(C20335R.id.sdo_image_title);
        this.subtitleText = bindView(C20335R.id.sdo_image_subtitle);
        this.primaryCta = bindView(C20335R.id.sdo_image_primary_cta);
    }

    private final SdImageView getImageView() {
        return (SdImageView) this.imageView.getValue(this, $$delegatedProperties[0]);
    }

    private final SdTextView getTitleText() {
        return (SdTextView) this.titleText.getValue(this, $$delegatedProperties[1]);
    }

    private final SdTextView getSubtitleText() {
        return (SdTextView) this.subtitleText.getValue(this, $$delegatedProperties[2]);
    }

    private final SdButton getPrimaryCta() {
        return (SdButton) this.primaryCta.getValue(this, $$delegatedProperties[3]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment
    public void bind(ApiSdImagePage pageData) {
        Intrinsics.checkNotNullParameter(pageData, "pageData");
        ApiSdImagePage.Components components = pageData.getComponents();
        TemplateUtil.bindOnNotNull(getImageView(), components.getHero_image());
        TemplateUtil.bindOnNotNull(getTitleText(), components.getTitle());
        TemplateUtil.bindOnNotNull(getSubtitleText(), components.getSubtitle());
        TemplateUtil.bindOnNotNull(getPrimaryCta(), components.getPrimary_cta());
    }

    @Override // com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment
    protected void onLoading(boolean loading) {
        super.onLoading(loading);
        getPrimaryCta().setLoading(loading);
    }
}
