package com.robinhood.android.crypto.gifting.details.p092ui;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.crypto.gifting.databinding.MergeCryptoGiftEditorGiftCardRowViewBinding;
import com.robinhood.android.crypto.gifting.details.models.CryptoGiftEditorViewData;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.compose.extensions.ThemedImageUrlExtensions;
import com.robinhood.models.serverdriven.p347db.ImageSource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GiftCardRowView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.gifting.details.ui.GiftCardRowView$bind$1$1$1, reason: use source file name */
/* loaded from: classes2.dex */
final class GiftCardRowView2 implements Function1<DayNightOverlay, Unit> {
    final /* synthetic */ View $it;
    final /* synthetic */ CryptoGiftEditorViewData.GiftCardViewData $state;
    final /* synthetic */ MergeCryptoGiftEditorGiftCardRowViewBinding $this_with;
    final /* synthetic */ GiftCardRowView this$0;

    GiftCardRowView2(CryptoGiftEditorViewData.GiftCardViewData giftCardViewData, View view, GiftCardRowView giftCardRowView, MergeCryptoGiftEditorGiftCardRowViewBinding mergeCryptoGiftEditorGiftCardRowViewBinding) {
        this.$state = giftCardViewData;
        this.$it = view;
        this.this$0 = giftCardRowView;
        this.$this_with = mergeCryptoGiftEditorGiftCardRowViewBinding;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DayNightOverlay dayNightOverlay) {
        invoke2(dayNightOverlay);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(DayNightOverlay overlay) {
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        ImageSource densitySet = ThemedImageUrlExtensions.getDensitySet(this.$state.getSelectedCardDesign().getImageUrl(), DayNightChanges.isDay(overlay));
        Context context = this.$it.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ImageLoader.ImageRequest imageRequestLoad = this.this$0.getImageLoader().load(densitySet.toImageUrl(context));
        ImageView imageView = this.$this_with.imageView;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ImageLoader.ImageRequest.DefaultImpls.into$default(imageRequestLoad, imageView, null, null, 6, null);
    }
}
