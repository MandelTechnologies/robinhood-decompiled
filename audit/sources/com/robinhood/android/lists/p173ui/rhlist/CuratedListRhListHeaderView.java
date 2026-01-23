package com.robinhood.android.lists.p173ui.rhlist;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.content.ContextCompat;
import coil.compose.AsyncImagePainter;
import coil.compose.SingletonAsyncImagePainter;
import com.google.android.material.chip.Chip;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionTextView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.lists.C20839R;
import com.robinhood.android.lists.databinding.MergeRhListHeaderViewBinding;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.lists.models.shared.p298db.SizedUrlHolder;
import com.robinhood.models.serverdriven.experimental.api.LinearGradientColor;
import com.robinhood.staticcontent.util.Markwons;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.noties.markwon.Markwon;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: CuratedListRhListHeaderView.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001-B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020#J\u0010\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020#H\u0002J\u0010\u0010&\u001a\u00020\u00102\u0006\u0010%\u001a\u00020#H\u0002J\u0010\u0010'\u001a\u00020\u00102\u0006\u0010%\u001a\u00020#H\u0002J\u0010\u0010(\u001a\u00020\u00102\u0006\u0010%\u001a\u00020#H\u0002J\u0010\u0010)\u001a\u00020\u00102\u0006\u0010%\u001a\u00020#H\u0002J\u0011\u0010*\u001a\u00020+*\u00020#H\u0003¢\u0006\u0002\u0010,R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/lists/databinding/MergeRhListHeaderViewBinding;", "getBinding", "()Lcom/robinhood/android/lists/databinding/MergeRhListHeaderViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "imageLoaderOnError", "Lkotlin/Function0;", "", "getImageLoaderOnError", "()Lkotlin/jvm/functions/Function0;", "setImageLoaderOnError", "(Lkotlin/jvm/functions/Function0;)V", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "bind", "state", "Lcom/robinhood/android/lists/ui/rhlist/HeaderState;", "bindHeaderImage", WebsocketGatewayConstants.DATA_KEY, "bindNewChip", "bindTitle", "bindSubtitle", "bindDescription", "getBackgroundBrush", "Landroidx/compose/ui/graphics/Brush;", "(Lcom/robinhood/android/lists/ui/rhlist/HeaderState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Brush;", "Companion", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class CuratedListRhListHeaderView extends Hammer_CuratedListRhListHeaderView {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public ImageLoader imageLoader;
    public Function0<Unit> imageLoaderOnError;
    public Markwon markwon;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CuratedListRhListHeaderView.class, "binding", "getBinding()Lcom/robinhood/android/lists/databinding/MergeRhListHeaderViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CuratedListRhListHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C20839R.layout.merge_rh_list_header_view, true);
        this.binding = ViewBinding5.viewBinding(this, CuratedListRhListHeaderView4.INSTANCE);
    }

    private final MergeRhListHeaderViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeRhListHeaderViewBinding) value;
    }

    public final Function0<Unit> getImageLoaderOnError() {
        Function0<Unit> function0 = this.imageLoaderOnError;
        if (function0 != null) {
            return function0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageLoaderOnError");
        return null;
    }

    public final void setImageLoaderOnError(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.imageLoaderOnError = function0;
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

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    public final void bind(HeaderState state) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(state, "state");
        bindHeaderImage(state);
        bindNewChip(state);
        bindTitle(state);
        bindSubtitle(state);
        bindDescription(state);
    }

    private final void bindHeaderImage(final HeaderState data) {
        final ComposeView composeView = getBinding().fragmentRhListHeaderIllustration;
        if (data.getShowErrorImage()) {
            composeView.setContent(ComposableLambda3.composableLambdaInstance(1743643350, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListHeaderView$bindHeaderImage$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    if ((i & 3) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1743643350, i, -1, "com.robinhood.android.lists.ui.rhlist.CuratedListRhListHeaderView.bindHeaderImage.<anonymous>.<anonymous> (CuratedListRhListHeaderView.kt:66)");
                    }
                    AsyncImagePainter asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg = SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Integer.valueOf(C20839R.drawable.curated_list_error_header), null, null, null, 0, null, composer, 0, 62);
                    ContentScale fillHeight = ContentScale.INSTANCE.getFillHeight();
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    ComposeView composeView2 = composeView;
                    Intrinsics.checkNotNull(composeView2);
                    ImageKt.Image(asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg, "", Background3.m4872backgroundbw27NRU$default(modifierFillMaxSize$default, Color2.Color(ViewsKt.getColor(composeView2, C20839R.color.curated_list_error_illustration_background)), null, 2, null), (Alignment) null, fillHeight, 0.0f, (ColorFilter) null, composer, 24624, 104);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        } else {
            composeView.setContent(ComposableLambda3.composableLambdaInstance(-922539617, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListHeaderView$bindHeaderImage$1$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    if ((i & 3) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-922539617, i, -1, "com.robinhood.android.lists.ui.rhlist.CuratedListRhListHeaderView.bindHeaderImage.<anonymous>.<anonymous> (CuratedListRhListHeaderView.kt:80)");
                    }
                    final HeaderState headerState = data;
                    final ComposeView composeView2 = composeView;
                    final CuratedListRhListHeaderView curatedListRhListHeaderView = this;
                    BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1150494377, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListHeaderView$bindHeaderImage$1$2.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i2) {
                            if ((i2 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1150494377, i2, -1, "com.robinhood.android.lists.ui.rhlist.CuratedListRhListHeaderView.bindHeaderImage.<anonymous>.<anonymous>.<anonymous> (CuratedListRhListHeaderView.kt:81)");
                            }
                            SizedUrlHolder headerImages = headerState.getHeaderImages();
                            Intrinsics.checkNotNull(headerImages);
                            Context context = composeView2.getContext();
                            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                            ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(headerImages.getSizedUrl(context), null, null, null, 0, null, composer2, 0, 62), "", Background3.background$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), curatedListRhListHeaderView.getBackgroundBrush(headerState, composer2, 0), null, 0.0f, 6, null), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer2, 24624, 104);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer, 54), composer, 100663296, 255);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        }
    }

    private final void bindNewChip(HeaderState data) {
        Chip chip = getBinding().fragmentRhListNewChip;
        Intrinsics.checkNotNull(chip);
        chip.setVisibility(data.getShowBadge() ? 0 : 8);
        if (data.getShowBadge()) {
            ServerToBentoAssetMapper2 badgeIcon = data.getBadgeIcon();
            if (badgeIcon != null) {
                chip.setChipIcon(ContextCompat.getDrawable(chip.getContext(), badgeIcon.getResourceId()));
            }
            chip.setText(data.getBadgeTitle());
        }
    }

    private final void bindTitle(HeaderState data) {
        getBinding().fragmentRhListTitle.setText(data.getDisplayName());
    }

    private final void bindSubtitle(HeaderState data) throws Resources.NotFoundException {
        String str = InstantFormatter.MEDIUM_DATE_IN_SYSTEM_ZONE.format(data.getUpdatedAt());
        String string2 = getResources().getString(C11048R.string.general_label_robinhood);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        RhTextView rhTextView = getBinding().fragmentRhListSubtitle;
        rhTextView.setText(rhTextView.getResources().getString(C20839R.string.lists_subtitle_owner_and_date_format, string2, str));
        Intrinsics.checkNotNull(rhTextView);
        TextViewsKt.setDrawables$default((TextView) rhTextView, C20690R.drawable.ic_rds_circle_check_12dp, 0, 0, 0, true, 14, (Object) null);
    }

    private final void bindDescription(HeaderState data) {
        RdsInlineDefinitionTextView rdsInlineDefinitionTextView = getBinding().fragmentRhListDescription;
        Intrinsics.checkNotNull(rdsInlineDefinitionTextView);
        rdsInlineDefinitionTextView.setVisibility(data.getShowDescription() ? 0 : 8);
        MarkdownContent description = data.getDescription();
        if (description != null) {
            rdsInlineDefinitionTextView.setSpannableString(new SpannableString(Markwons.toSpanned$default(getMarkwon(), description, null, 2, null)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Brush getBackgroundBrush(HeaderState headerState, Composer composer, int i) {
        long jM6725getTransparent0d7_KjU;
        Brush solidColor;
        composer.startReplaceGroup(1690773297);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1690773297, i, -1, "com.robinhood.android.lists.ui.rhlist.CuratedListRhListHeaderView.getBackgroundBrush (CuratedListRhListHeaderView.kt:141)");
        }
        LinearGradientColor backgroundGradient = headerState.getBackgroundGradient();
        if (backgroundGradient != null) {
            solidColor = com.robinhood.shared.compose.color.LinearGradientColor.getBrush$default(SduiColors2.toLinearGradientColor(backgroundGradient, 0.0f, composer, 0, 1), null, 1, null);
        } else {
            String backgroundColor = headerState.getBackgroundColor();
            if (backgroundColor != null) {
                jM6725getTransparent0d7_KjU = Color2.Color(Color.parseColor(backgroundColor));
            } else {
                jM6725getTransparent0d7_KjU = androidx.compose.p011ui.graphics.Color.INSTANCE.m6725getTransparent0d7_KjU();
            }
            solidColor = new SolidColor(jM6725getTransparent0d7_KjU, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return solidColor;
    }

    /* compiled from: CuratedListRhListHeaderView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListHeaderView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListHeaderView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<CuratedListRhListHeaderView> {
        private final /* synthetic */ Inflater<CuratedListRhListHeaderView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public CuratedListRhListHeaderView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (CuratedListRhListHeaderView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C20839R.layout.include_rh_list_header_view);
        }
    }
}
