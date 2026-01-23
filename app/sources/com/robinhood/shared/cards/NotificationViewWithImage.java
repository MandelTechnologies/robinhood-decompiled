package com.robinhood.shared.cards;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.robinhood.android.common.p088ui.BindViewDelegate2;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.cards.C31879R;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.card.p311db.CardAsset;
import com.robinhood.shared.cards.NotificationCard;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.extensions.ContextsUiExtensions2;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: NotificationViewWithImage.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001+B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020%H\u0002R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001e@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006,"}, m3636d2 = {"Lcom/robinhood/shared/cards/NotificationViewWithImage;", "Lcom/robinhood/shared/cards/NotificationView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "image", "Landroid/widget/ImageView;", "getImage", "()Landroid/widget/ImageView;", "image$delegate", "Lkotlin/properties/ReadOnlyProperty;", "optionalPadding", "Landroid/view/View;", "getOptionalPadding", "()Landroid/view/View;", "optionalPadding$delegate", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "density", "Lcom/robinhood/utils/extensions/DensitySpec;", "card", "Lcom/robinhood/models/card/db/Card;", "value", "Lcom/robinhood/models/card/db/CardAsset$Tint;", "tint", "getTint", "()Lcom/robinhood/models/card/db/CardAsset$Tint;", "setTint", "(Lcom/robinhood/models/card/db/CardAsset$Tint;)V", "bind", "", "notificationCard", "Lcom/robinhood/shared/cards/ServerCard;", "callbacks", "Lcom/robinhood/shared/cards/NotificationCard$Callbacks;", "resetImageResource", "Companion", "lib-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class NotificationViewWithImage extends Hammer_NotificationViewWithImage {
    private Card card;
    private final ContextsUiExtensions2 density;

    /* renamed from: image$delegate, reason: from kotlin metadata */
    private final Interfaces2 image;
    public ImageLoader imageLoader;

    /* renamed from: optionalPadding$delegate, reason: from kotlin metadata */
    private final Interfaces2 optionalPadding;
    private CardAsset.Tint tint;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(NotificationViewWithImage.class, "image", "getImage()Landroid/widget/ImageView;", 0)), Reflection.property1(new PropertyReference1Impl(NotificationViewWithImage.class, "optionalPadding", "getOptionalPadding()Landroid/view/View;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationViewWithImage(Context context, AttributeSet attrs) {
        super(context, attrs, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.image = BindViewDelegate2.bindView$default(this, C31879R.id.notification_view_image, null, 2, null);
        this.optionalPadding = BindViewDelegate2.bindView$default(this, C31879R.id.notification_view_content_padding, null, 2, null);
        this.density = ContextsUiExtensions.getDensitySpec(context);
        this.tint = CardAsset.Tint.GREEN;
    }

    private final ImageView getImage() {
        return (ImageView) this.image.getValue(this, $$delegatedProperties[0]);
    }

    private final View getOptionalPadding() {
        return (View) this.optionalPadding.getValue(this, $$delegatedProperties[1]);
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

    public final CardAsset.Tint getTint() {
        return this.tint;
    }

    public final void setTint(CardAsset.Tint value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.tint = value;
        resetImageResource();
    }

    @Override // com.robinhood.shared.cards.NotificationView
    public void bind(ServerCard notificationCard, NotificationCard.Callbacks callbacks) {
        Intrinsics.checkNotNullParameter(notificationCard, "notificationCard");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        super.bind(notificationCard, callbacks);
        Card card = notificationCard.getCard();
        Card.SideImage sideImage = card.getSideImage();
        this.card = card;
        if (sideImage != null) {
            ViewGroup.LayoutParams layoutParams = getImage().getLayoutParams();
            layoutParams.width = (int) (sideImage.getWidth() * this.density.getMultiplier());
            getImage().setLayoutParams(layoutParams);
            getImage().setVisibility(0);
            getOptionalPadding().setVisibility(8);
        } else {
            getImage().setVisibility(8);
            getOptionalPadding().setVisibility(0);
        }
        if (card.isRhdMargin()) {
            getImage().setColorFilter(getContext().getColor(C20690R.color.mobius_nova));
        }
        resetImageResource();
    }

    private final void resetImageResource() {
        Card.SideImage sideImage;
        Card card = this.card;
        if (card == null || (sideImage = card.getSideImage()) == null) {
            return;
        }
        ImageLoader.ImageRequest.DefaultImpls.into$default(getImageLoader().load(sideImage.getUrl(this.density, this.tint)), getImage(), null, null, 6, null);
    }

    /* compiled from: NotificationViewWithImage.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/cards/NotificationViewWithImage$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/shared/cards/NotificationViewWithImage;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "lib-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Companion implements Inflater<NotificationViewWithImage> {
        private final /* synthetic */ Inflater<NotificationViewWithImage> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public NotificationViewWithImage inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (NotificationViewWithImage) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C31879R.layout.include_notification_view_with_image);
        }
    }
}
