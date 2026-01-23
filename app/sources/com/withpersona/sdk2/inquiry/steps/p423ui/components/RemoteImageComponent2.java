package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import coil.ComponentRegistry;
import coil.ImageLoader;
import coil.decode.Decoder;
import coil.decode.ImageSource5;
import coil.decode.SvgDecoder;
import coil.fetch.FetchResult3;
import coil.request.ImageRequest;
import coil.request.Options;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.shared.ResTools;
import com.withpersona.sdk2.inquiry.shared.ResTools2;
import com.withpersona.sdk2.inquiry.shared.databinding.Pi2UiImageLottieBinding;
import com.withpersona.sdk2.inquiry.shared.databinding.Pi2UiImageViewBinding;
import com.withpersona.sdk2.inquiry.shared.p422ui.ThemeableLottieAnimationView;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.ImageStyling;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import okio.Buffer;

/* compiled from: RemoteImageComponent.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\u001c\u0010\b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002\u001a$\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002\u001a\u001a\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002\u001a$\u0010\u0014\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eH\u0002¨\u0006\u0018"}, m3636d2 = {"makeView", "Landroid/view/View;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/RemoteImageComponent;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentHelper;", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "remoteImageFromBundledResource", "remoteImageFromUrl", "loadImage", "", "imageView", "Landroid/widget/ImageView;", "uri", "", "loadSvg", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$RemoteImageComponentStyle;", "getColorReplacedSvg", "originalSvg", "replaceHexCodes", "originalHex", "newHex", "fallbackColor", "ui-step-renderer_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.RemoteImageComponentKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class RemoteImageComponent2 {

    /* compiled from: RemoteImageComponent.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.RemoteImageComponentKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RemoteImage.ContentType.values().length];
            try {
                iArr[RemoteImage.ContentType.JSON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RemoteImage.ContentType.Image.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RemoteImage.ContentType.SVG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final View makeView(RemoteImageComponent remoteImageComponent, UiComponentHelper uiComponentHelper, RemoteImage config) {
        Intrinsics.checkNotNullParameter(remoteImageComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        View viewRemoteImageFromBundledResource = remoteImageFromBundledResource(remoteImageComponent, uiComponentHelper, config);
        return viewRemoteImageFromBundledResource == null ? remoteImageFromUrl(remoteImageComponent, uiComponentHelper, config) : viewRemoteImageFromBundledResource;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final View remoteImageFromBundledResource(RemoteImageComponent remoteImageComponent, UiComponentHelper uiComponentHelper, final RemoteImage remoteImage) throws Resources.NotFoundException {
        Integer numResourceIdFromName;
        Pi2UiImageLottieBinding pi2UiImageLottieBinding;
        RemoteImage.Attributes attributes = remoteImage.getAttributes();
        String localAssetName = attributes != null ? attributes.getLocalAssetName() : null;
        RemoteImage.ContentType localAssetContentType = attributes != null ? attributes.getLocalAssetContentType() : null;
        final Context context = uiComponentHelper.getContext();
        if (localAssetName != null && localAssetContentType != null) {
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i = iArr[localAssetContentType.ordinal()];
            if (i == 1) {
                numResourceIdFromName = ResTools.resourceIdFromName(context, localAssetName, ResTools2.Raw);
            } else if (i == 2) {
                numResourceIdFromName = ResTools.resourceIdFromName(context, localAssetName, ResTools2.Drawable);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                numResourceIdFromName = ResTools.resourceIdFromName(context, localAssetName, ResTools2.Raw);
                if (numResourceIdFromName != null) {
                    booleanRef.element = true;
                } else {
                    numResourceIdFromName = ResTools.resourceIdFromName(context, localAssetName, ResTools2.Drawable);
                }
            }
            if (numResourceIdFromName != null) {
                final int iIntValue = numResourceIdFromName.intValue();
                int i2 = iArr[localAssetContentType.ordinal()];
                if (i2 == 1) {
                    final Pi2UiImageLottieBinding pi2UiImageLottieBindingInflate = Pi2UiImageLottieBinding.inflate(uiComponentHelper.getLayoutInflater());
                    uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.RemoteImageComponentKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RemoteImageComponent2.remoteImageFromBundledResource$lambda$1$lambda$0(pi2UiImageLottieBindingInflate, remoteImage);
                        }
                    });
                    pi2UiImageLottieBindingInflate.lottieView.setAnimation(iIntValue);
                    pi2UiImageLottieBinding = pi2UiImageLottieBindingInflate;
                } else if (i2 == 2) {
                    final Pi2UiImageViewBinding pi2UiImageViewBindingInflate = Pi2UiImageViewBinding.inflate(uiComponentHelper.getLayoutInflater());
                    uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.RemoteImageComponentKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RemoteImageComponent2.remoteImageFromBundledResource$lambda$3$lambda$2(pi2UiImageViewBindingInflate, remoteImage, iIntValue);
                        }
                    });
                    pi2UiImageLottieBinding = pi2UiImageViewBindingInflate;
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    final Pi2UiImageViewBinding pi2UiImageViewBindingInflate2 = Pi2UiImageViewBinding.inflate(uiComponentHelper.getLayoutInflater());
                    uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.RemoteImageComponentKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RemoteImageComponent2.remoteImageFromBundledResource$lambda$7$lambda$6(pi2UiImageViewBindingInflate2, remoteImage, booleanRef, context, iIntValue);
                        }
                    });
                    pi2UiImageLottieBinding = pi2UiImageViewBindingInflate2;
                }
                return pi2UiImageLottieBinding.getRoot();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit remoteImageFromBundledResource$lambda$1$lambda$0(Pi2UiImageLottieBinding pi2UiImageLottieBinding, RemoteImage remoteImage) {
        ThemeableLottieAnimationView lottieView = pi2UiImageLottieBinding.lottieView;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        ImageStyling.applyStyles(lottieView, remoteImage);
        pi2UiImageLottieBinding.lottieView.setRepeatMode(1);
        pi2UiImageLottieBinding.lottieView.setRepeatCount(-1);
        pi2UiImageLottieBinding.lottieView.playAnimation();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit remoteImageFromBundledResource$lambda$3$lambda$2(Pi2UiImageViewBinding pi2UiImageViewBinding, RemoteImage remoteImage, int i) {
        ImageView imageView = pi2UiImageViewBinding.imageView;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ImageStyling.applyStyles(imageView, remoteImage);
        pi2UiImageViewBinding.imageView.setImageResource(i);
        pi2UiImageViewBinding.imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        pi2UiImageViewBinding.imageView.setAdjustViewBounds(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit remoteImageFromBundledResource$lambda$7$lambda$6(final Pi2UiImageViewBinding pi2UiImageViewBinding, final RemoteImage remoteImage, Ref.BooleanRef booleanRef, Context context, int i) throws Resources.NotFoundException {
        ImageView imageView = pi2UiImageViewBinding.imageView;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ImageStyling.applyStyles(imageView, remoteImage);
        if (booleanRef.element) {
            Context context2 = pi2UiImageViewBinding.imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            ImageLoader imageLoaderBuild = new ImageLoader.Builder(context2).build();
            String resourcePackageName = context.getResources().getResourcePackageName(i);
            String lowerCase = ResTools2.Raw.toString().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            Uri uri = Uri.parse("android.resource://" + resourcePackageName + "/" + lowerCase + "/" + context.getResources().getResourceEntryName(i));
            ImageView imageView2 = pi2UiImageViewBinding.imageView;
            Intrinsics.checkNotNullExpressionValue(imageView2, "imageView");
            ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView2.getContext()).data(uri).target(imageView2);
            builderTarget.decoderFactory(new Decoder.Factory() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.RemoteImageComponentKt$$ExternalSyntheticLambda7
                @Override // coil.decode.Decoder.Factory
                public final Decoder create(FetchResult3 fetchResult3, Options options, ImageLoader imageLoader) {
                    return RemoteImageComponent2.m3259x4f53dd4f(remoteImage, pi2UiImageViewBinding, fetchResult3, options, imageLoader);
                }
            });
            imageLoaderBuild.enqueue(builderTarget.build());
        } else {
            pi2UiImageViewBinding.imageView.setImageResource(i);
        }
        pi2UiImageViewBinding.imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        pi2UiImageViewBinding.imageView.setAdjustViewBounds(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: remoteImageFromBundledResource$lambda$7$lambda$6$lambda$5$lambda$4 */
    public static final Decoder m3259x4f53dd4f(RemoteImage remoteImage, Pi2UiImageViewBinding pi2UiImageViewBinding, FetchResult3 result, Options options, ImageLoader imageLoader) throws IOException {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(imageLoader, "<unused var>");
        byte[] byteArray = result.getSource().source().readByteArray();
        Charset charset = Charsets.UTF_8;
        byte[] bytes = getColorReplacedSvg(new String(byteArray, charset), remoteImage.getStyles()).getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        Buffer bufferWrite = new Buffer().write(bytes);
        Context context = pi2UiImageViewBinding.imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new SvgDecoder(ImageSource5.create(bufferWrite, context), options, false, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final View remoteImageFromUrl(RemoteImageComponent remoteImageComponent, UiComponentHelper uiComponentHelper, final RemoteImage remoteImage) {
        Pi2UiImageLottieBinding pi2UiImageLottieBinding;
        final RemoteImage.Attributes attributes = remoteImage.getAttributes();
        RemoteImage.ContentType contentType = attributes != null ? attributes.getContentType() : null;
        int i = contentType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[contentType.ordinal()];
        if (i == 1) {
            final Pi2UiImageLottieBinding pi2UiImageLottieBindingInflate = Pi2UiImageLottieBinding.inflate(uiComponentHelper.getLayoutInflater());
            uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.RemoteImageComponentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RemoteImageComponent2.remoteImageFromUrl$lambda$13$lambda$11(pi2UiImageLottieBindingInflate, remoteImage);
                }
            });
            pi2UiImageLottieBindingInflate.lottieView.loadFromUrl(attributes.getUrl());
            pi2UiImageLottieBinding = pi2UiImageLottieBindingInflate;
        } else if (i == 3) {
            final Pi2UiImageViewBinding pi2UiImageViewBindingInflate = Pi2UiImageViewBinding.inflate(uiComponentHelper.getLayoutInflater());
            uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.RemoteImageComponentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RemoteImageComponent2.remoteImageFromUrl$lambda$10$lambda$9(pi2UiImageViewBindingInflate, remoteImage, attributes);
                }
            });
            pi2UiImageLottieBinding = pi2UiImageViewBindingInflate;
        } else {
            final Pi2UiImageViewBinding pi2UiImageViewBindingInflate2 = Pi2UiImageViewBinding.inflate(uiComponentHelper.getLayoutInflater());
            uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.RemoteImageComponentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RemoteImageComponent2.remoteImageFromUrl$lambda$16$lambda$15(pi2UiImageViewBindingInflate2, remoteImage, attributes);
                }
            });
            pi2UiImageLottieBinding = pi2UiImageViewBindingInflate2;
        }
        View root = pi2UiImageLottieBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit remoteImageFromUrl$lambda$10$lambda$9(Pi2UiImageViewBinding pi2UiImageViewBinding, RemoteImage remoteImage, RemoteImage.Attributes attributes) {
        ImageView imageView = pi2UiImageViewBinding.imageView;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ImageStyling.applyStyles(imageView, remoteImage);
        String url = attributes.getUrl();
        ImageView imageView2 = pi2UiImageViewBinding.imageView;
        Intrinsics.checkNotNullExpressionValue(imageView2, "imageView");
        loadSvg(imageView2, url, remoteImage.getStyles());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit remoteImageFromUrl$lambda$13$lambda$11(Pi2UiImageLottieBinding pi2UiImageLottieBinding, RemoteImage remoteImage) {
        ThemeableLottieAnimationView lottieView = pi2UiImageLottieBinding.lottieView;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        ImageStyling.applyStyles(lottieView, remoteImage);
        pi2UiImageLottieBinding.lottieView.setRepeatMode(1);
        pi2UiImageLottieBinding.lottieView.setRepeatCount(-1);
        pi2UiImageLottieBinding.lottieView.playAnimation();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit remoteImageFromUrl$lambda$16$lambda$15(Pi2UiImageViewBinding pi2UiImageViewBinding, RemoteImage remoteImage, RemoteImage.Attributes attributes) {
        ImageView imageView = pi2UiImageViewBinding.imageView;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ImageStyling.applyStyles(imageView, remoteImage);
        String url = attributes != null ? attributes.getUrl() : null;
        ImageView imageView2 = pi2UiImageViewBinding.imageView;
        Intrinsics.checkNotNullExpressionValue(imageView2, "imageView");
        loadImage(imageView2, url);
        return Unit.INSTANCE;
    }

    private static final void loadImage(ImageView imageView, String str) {
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ImageLoader.Builder builder = new ImageLoader.Builder(context);
        ComponentRegistry.Builder builder2 = new ComponentRegistry.Builder();
        builder2.add(new SvgDecoder.Factory(false, 1, null));
        builder.components(builder2.build()).crossfade(true).crossfade(500).build().enqueue(new ImageRequest.Builder(imageView.getContext()).data(str).target(imageView).build());
    }

    private static final void loadSvg(final ImageView imageView, String str, final RemoteImage.RemoteImageComponentStyle remoteImageComponentStyle) {
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ImageLoader imageLoaderBuild = new ImageLoader.Builder(context).crossfade(true).crossfade(500).build();
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(str).target(imageView);
        builderTarget.decoderFactory(new Decoder.Factory() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.RemoteImageComponentKt$$ExternalSyntheticLambda6
            @Override // coil.decode.Decoder.Factory
            public final Decoder create(FetchResult3 fetchResult3, Options options, ImageLoader imageLoader) {
                return RemoteImageComponent2.loadSvg$lambda$19$lambda$18(remoteImageComponentStyle, imageView, fetchResult3, options, imageLoader);
            }
        });
        imageLoaderBuild.enqueue(builderTarget.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Decoder loadSvg$lambda$19$lambda$18(RemoteImage.RemoteImageComponentStyle remoteImageComponentStyle, ImageView imageView, FetchResult3 result, Options options, ImageLoader imageLoader) throws IOException {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(imageLoader, "<unused var>");
        byte[] byteArray = result.getSource().source().readByteArray();
        Charset charset = Charsets.UTF_8;
        byte[] bytes = getColorReplacedSvg(new String(byteArray, charset), remoteImageComponentStyle).getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        Buffer bufferWrite = new Buffer().write(bytes);
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new SvgDecoder(ImageSource5.create(bufferWrite, context), options, false, 4, null);
    }

    private static final String getColorReplacedSvg(String str, RemoteImage.RemoteImageComponentStyle remoteImageComponentStyle) {
        String strReplace$default;
        Integer originalStrokeColorValue;
        String hexColorString;
        Integer originalBackgroundColorValue;
        String hexColorString2;
        Integer originalHighlightColorValue;
        String hexColorString3;
        Integer originalFillColorValue;
        String hexColorString4;
        Integer originalStrokeColorValue2;
        Integer originalBackgroundColorValue2;
        Integer originalHighlightColorValue2;
        Integer originalFillColorValue2;
        if (remoteImageComponentStyle == null || (originalFillColorValue2 = remoteImageComponentStyle.getOriginalFillColorValue()) == null) {
            strReplace$default = str;
        } else {
            int iIntValue = originalFillColorValue2.intValue();
            Integer newFillColorValue = remoteImageComponentStyle.getNewFillColorValue();
            strReplace$default = (newFillColorValue == null || ExtensionsKt.toHexColorString(newFillColorValue.intValue()) == null) ? str : StringsKt.replace$default(str, ExtensionsKt.toHexColorString(iIntValue), "{{ fill_color }}", false, 4, (Object) null);
        }
        if (remoteImageComponentStyle != null && (originalHighlightColorValue2 = remoteImageComponentStyle.getOriginalHighlightColorValue()) != null) {
            int iIntValue2 = originalHighlightColorValue2.intValue();
            Integer newHighlightColorValue = remoteImageComponentStyle.getNewHighlightColorValue();
            if (newHighlightColorValue != null && ExtensionsKt.toHexColorString(newHighlightColorValue.intValue()) != null) {
                strReplace$default = StringsKt.replace$default(strReplace$default, ExtensionsKt.toHexColorString(iIntValue2), "{{ highlight_color }}", false, 4, (Object) null);
            }
        }
        String strReplace$default2 = strReplace$default;
        if (remoteImageComponentStyle != null && (originalBackgroundColorValue2 = remoteImageComponentStyle.getOriginalBackgroundColorValue()) != null) {
            int iIntValue3 = originalBackgroundColorValue2.intValue();
            Integer newBackgroundColorValue = remoteImageComponentStyle.getNewBackgroundColorValue();
            if (newBackgroundColorValue != null && ExtensionsKt.toHexColorString(newBackgroundColorValue.intValue()) != null) {
                strReplace$default2 = StringsKt.replace$default(strReplace$default2, ExtensionsKt.toHexColorString(iIntValue3), "{{ background_color }}", false, 4, (Object) null);
            }
        }
        String strReplaceHexCodes = strReplace$default2;
        if (remoteImageComponentStyle != null && (originalStrokeColorValue2 = remoteImageComponentStyle.getOriginalStrokeColorValue()) != null) {
            int iIntValue4 = originalStrokeColorValue2.intValue();
            Integer newStrokeColorValue = remoteImageComponentStyle.getNewStrokeColorValue();
            if (newStrokeColorValue != null && ExtensionsKt.toHexColorString(newStrokeColorValue.intValue()) != null) {
                strReplaceHexCodes = StringsKt.replace$default(strReplaceHexCodes, ExtensionsKt.toHexColorString(iIntValue4), "{{ stroke_color }}", false, 4, (Object) null);
            }
        }
        if (remoteImageComponentStyle != null && (originalFillColorValue = remoteImageComponentStyle.getOriginalFillColorValue()) != null) {
            int iIntValue5 = originalFillColorValue.intValue();
            Integer newFillColorValue2 = remoteImageComponentStyle.getNewFillColorValue();
            if (newFillColorValue2 != null && (hexColorString4 = ExtensionsKt.toHexColorString(newFillColorValue2.intValue())) != null) {
                strReplaceHexCodes = replaceHexCodes(strReplaceHexCodes, "{{ fill_color }}", hexColorString4, ExtensionsKt.toHexColorString(iIntValue5));
            }
        }
        if (remoteImageComponentStyle != null && (originalHighlightColorValue = remoteImageComponentStyle.getOriginalHighlightColorValue()) != null) {
            int iIntValue6 = originalHighlightColorValue.intValue();
            Integer newHighlightColorValue2 = remoteImageComponentStyle.getNewHighlightColorValue();
            if (newHighlightColorValue2 != null && (hexColorString3 = ExtensionsKt.toHexColorString(newHighlightColorValue2.intValue())) != null) {
                strReplaceHexCodes = replaceHexCodes(strReplaceHexCodes, "{{ highlight_color }}", hexColorString3, ExtensionsKt.toHexColorString(iIntValue6));
            }
        }
        if (remoteImageComponentStyle != null && (originalBackgroundColorValue = remoteImageComponentStyle.getOriginalBackgroundColorValue()) != null) {
            int iIntValue7 = originalBackgroundColorValue.intValue();
            Integer newBackgroundColorValue2 = remoteImageComponentStyle.getNewBackgroundColorValue();
            if (newBackgroundColorValue2 != null && (hexColorString2 = ExtensionsKt.toHexColorString(newBackgroundColorValue2.intValue())) != null) {
                strReplaceHexCodes = replaceHexCodes(strReplaceHexCodes, "{{ background_color }}", hexColorString2, ExtensionsKt.toHexColorString(iIntValue7));
            }
        }
        if (remoteImageComponentStyle != null && (originalStrokeColorValue = remoteImageComponentStyle.getOriginalStrokeColorValue()) != null) {
            int iIntValue8 = originalStrokeColorValue.intValue();
            Integer newStrokeColorValue2 = remoteImageComponentStyle.getNewStrokeColorValue();
            if (newStrokeColorValue2 != null && (hexColorString = ExtensionsKt.toHexColorString(newStrokeColorValue2.intValue())) != null) {
                return replaceHexCodes(strReplaceHexCodes, "{{ stroke_color }}", hexColorString, ExtensionsKt.toHexColorString(iIntValue8));
            }
        }
        return strReplaceHexCodes;
    }

    private static final String replaceHexCodes(String str, String str2, String str3, String str4) {
        String str5;
        String str6;
        try {
            Color.parseColor(str3);
            str5 = str;
            str6 = str2;
        } catch (IllegalArgumentException unused) {
            str5 = str;
            str6 = str2;
        }
        try {
            return StringsKt.replace$default(str5, str6, str3, false, 4, (Object) null);
        } catch (IllegalArgumentException unused2) {
            return StringsKt.replace$default(str5, str6, str4, false, 4, (Object) null);
        }
    }
}
