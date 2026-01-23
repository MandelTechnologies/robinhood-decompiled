package com.robinhood.android.crypto.gifting.details.p092ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.drawable.DrawableCompat;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.common.util.extensions.Views;
import com.robinhood.android.crypto.gifting.C12906R;
import com.robinhood.android.crypto.gifting.databinding.MergeCryptoGiftEditorGiftCardRowViewBinding;
import com.robinhood.android.crypto.gifting.details.models.CryptoGiftEditorViewData;
import com.robinhood.android.crypto.gifting.details.utils.RhTextViewExtensions;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: GiftCardRowView.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00192\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0019B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003H\u0016R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/crypto/gifting/details/ui/GiftCardRowView;", "Lcom/robinhood/android/designsystem/container/RdsRippleContainerView;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/crypto/gifting/details/models/CryptoGiftEditorViewData$GiftCardViewData;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "binding", "Lcom/robinhood/android/crypto/gifting/databinding/MergeCryptoGiftEditorGiftCardRowViewBinding;", "getBinding", "()Lcom/robinhood/android/crypto/gifting/databinding/MergeCryptoGiftEditorGiftCardRowViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", "state", "Companion", "feature-crypto-gifting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class GiftCardRowView extends Hammer_GiftCardRowView implements Bindable<CryptoGiftEditorViewData.GiftCardViewData> {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public ImageLoader imageLoader;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(GiftCardRowView.class, "binding", "getBinding()Lcom/robinhood/android/crypto/gifting/databinding/MergeCryptoGiftEditorGiftCardRowViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftCardRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewBinding5.viewBinding(this, GiftCardRowView3.INSTANCE);
        ViewGroups.inflate(this, C12906R.layout.merge_crypto_gift_editor_gift_card_row_view, true);
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

    private final MergeCryptoGiftEditorGiftCardRowViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeCryptoGiftEditorGiftCardRowViewBinding) value;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(final CryptoGiftEditorViewData.GiftCardViewData state) {
        Intrinsics.checkNotNullParameter(state, "state");
        final MergeCryptoGiftEditorGiftCardRowViewBinding binding = getBinding();
        CardView giftCardView = getBinding().giftCardView;
        Intrinsics.checkNotNullExpressionValue(giftCardView, "giftCardView");
        int i = (int) (Activity.getDisplayMetrics(Views.baseActivity(giftCardView)).heightPixels * 0.4d);
        binding.giftCardView.getLayoutParams().height = i;
        binding.giftCardView.getLayoutParams().width = i;
        final ImageView imageView = binding.imageView;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        if (imageView.isAttachedToWindow()) {
            Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ViewDisposerKt.bindTo$default(Contexts7.requireBaseActivityBaseContext(context).getDayNightStyleChanges(), imageView, false, 2, null).subscribeKotlin(new GiftCardRowView2(state, imageView, this, binding));
        } else {
            imageView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.robinhood.android.crypto.gifting.details.ui.GiftCardRowView$bind$lambda$1$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    imageView.removeOnAttachStateChangeListener(this);
                    Context context2 = view.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    ViewDisposerKt.bindTo$default(Contexts7.requireBaseActivityBaseContext(context2).getDayNightStyleChanges(), view, false, 2, null).subscribeKotlin(new GiftCardRowView2(state, view, this, binding));
                }
            });
        }
        RhTextView rhTextView = binding.currencyText;
        String currencyText = state.getCurrencyText();
        if (currencyText == null) {
            currencyText = ViewsKt.getString(this, C12906R.string.currency_text_placeholder);
        }
        rhTextView.setText(currencyText);
        RhTextView currencyText2 = binding.currencyText;
        Intrinsics.checkNotNullExpressionValue(currencyText2, "currencyText");
        RhTextViewExtensions.setCustomTextColor(currencyText2, state.getSelectedCardDesign().getTintColor());
        DrawableCompat.setTint(binding.currencyText.getBackground(), state.getSelectedCardDesign().getAccessoryBackgroundColor());
        DrawableCompat.setTint(binding.giftIcon.getBackground(), state.getSelectedCardDesign().getAccessoryBackgroundColor());
        binding.giftIcon.setColorFilter(state.getSelectedCardDesign().getTintColor());
        binding.amountView.setText(String.valueOf(state.getAmount()));
        RhTextView amountView = binding.amountView;
        Intrinsics.checkNotNullExpressionValue(amountView, "amountView");
        RhTextViewExtensions.setCustomTextColor(amountView, state.getSelectedCardDesign().getTextColor());
        RhTextView signView = binding.signView;
        Intrinsics.checkNotNullExpressionValue(signView, "signView");
        RhTextViewExtensions.setCustomTextColor(signView, state.getSelectedCardDesign().getTextColor());
    }

    /* compiled from: GiftCardRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/crypto/gifting/details/ui/GiftCardRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/crypto/gifting/details/ui/GiftCardRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-crypto-gifting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<GiftCardRowView> {
        private final /* synthetic */ Inflater<GiftCardRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public GiftCardRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (GiftCardRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C12906R.layout.include_crypto_gift_editor_gift_card_row_view);
        }
    }
}
