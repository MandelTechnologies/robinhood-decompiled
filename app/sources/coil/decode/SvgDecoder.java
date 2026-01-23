package coil.decode;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import coil.ImageLoader;
import coil.content.SvgUtils;
import coil.decode.Decoder;
import coil.fetch.FetchResult3;
import coil.request.Options;
import coil.request.Svgs;
import coil.size.Scale;
import coil.size.Size;
import coil.size.Sizes;
import com.caverock.androidsvg.RenderOptions;
import com.caverock.androidsvg.SVG;
import com.caverock.androidsvg.SVGParseException;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.p481io.Closeable;
import kotlinx.coroutines.Interruptible;
import okio.BufferedSource;

/* compiled from: SvgDecoder.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001b\u001aB#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ3\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, m3636d2 = {"Lcoil/decode/SvgDecoder;", "Lcoil/decode/Decoder;", "Lcoil/decode/ImageSource;", "source", "Lcoil/request/Options;", "options", "", "useViewBoundsAsIntrinsicSize", "<init>", "(Lcoil/decode/ImageSource;Lcoil/request/Options;Z)V", "", "srcWidth", "srcHeight", "Lcoil/size/Scale;", "scale", "Lkotlin/Pair;", "getDstSize", "(FFLcoil/size/Scale;)Lkotlin/Pair;", "Lcoil/decode/DecodeResult;", "decode", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcoil/decode/ImageSource;", "Lcoil/request/Options;", "Z", "getUseViewBoundsAsIntrinsicSize", "()Z", "Companion", "Factory", "coil-svg_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class SvgDecoder implements Decoder {
    private final Options options;
    private final ImageSource source;
    private final boolean useViewBoundsAsIntrinsicSize;

    @JvmOverloads
    public SvgDecoder(ImageSource imageSource, Options options, boolean z) {
        this.source = imageSource;
        this.options = options;
        this.useViewBoundsAsIntrinsicSize = z;
    }

    public /* synthetic */ SvgDecoder(ImageSource imageSource, Options options, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageSource, options, (i & 4) != 0 ? true : z);
    }

    @Override // coil.decode.Decoder
    public Object decode(Continuation<? super DecodeResult> continuation) {
        return Interruptible.runInterruptible$default(null, new Function0() { // from class: coil.decode.SvgDecoder$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SvgDecoder.decode$lambda$2(this.f$0);
            }
        }, continuation, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DecodeResult decode$lambda$2(SvgDecoder svgDecoder) throws SVGParseException {
        float documentWidth;
        float documentHeight;
        int iRoundToInt;
        int iRoundToInt2;
        BufferedSource bufferedSourceSource = svgDecoder.source.source();
        try {
            SVG fromInputStream = SVG.getFromInputStream(bufferedSourceSource.inputStream());
            Closeable.closeFinally(bufferedSourceSource, null);
            RectF documentViewBox = fromInputStream.getDocumentViewBox();
            if (svgDecoder.useViewBoundsAsIntrinsicSize && documentViewBox != null) {
                documentWidth = documentViewBox.width();
                documentHeight = documentViewBox.height();
            } else {
                documentWidth = fromInputStream.getDocumentWidth();
                documentHeight = fromInputStream.getDocumentHeight();
            }
            Tuples2<Float, Float> dstSize = svgDecoder.getDstSize(documentWidth, documentHeight, svgDecoder.options.getScale());
            float fFloatValue = dstSize.component1().floatValue();
            float fFloatValue2 = dstSize.component2().floatValue();
            if (documentWidth > 0.0f && documentHeight > 0.0f) {
                float fComputeSizeMultiplier = DecodeUtils.computeSizeMultiplier(documentWidth, documentHeight, fFloatValue, fFloatValue2, svgDecoder.options.getScale());
                iRoundToInt = (int) (fComputeSizeMultiplier * documentWidth);
                iRoundToInt2 = (int) (fComputeSizeMultiplier * documentHeight);
            } else {
                iRoundToInt = MathKt.roundToInt(fFloatValue);
                iRoundToInt2 = MathKt.roundToInt(fFloatValue2);
            }
            if (documentViewBox == null && documentWidth > 0.0f && documentHeight > 0.0f) {
                fromInputStream.setDocumentViewBox(0.0f, 0.0f, documentWidth, documentHeight);
            }
            fromInputStream.setDocumentWidth("100%");
            fromInputStream.setDocumentHeight("100%");
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iRoundToInt, iRoundToInt2, SvgUtils.toSoftware(svgDecoder.options.getConfig()));
            String strCss = Svgs.css(svgDecoder.options.getParameters());
            fromInputStream.renderToCanvas(new Canvas(bitmapCreateBitmap), strCss != null ? new RenderOptions().css(strCss) : null);
            return new DecodeResult(new BitmapDrawable(svgDecoder.options.getContext().getResources(), bitmapCreateBitmap), true);
        } finally {
        }
    }

    private final Tuples2<Float, Float> getDstSize(float srcWidth, float srcHeight, Scale scale) {
        if (Sizes.isOriginal(this.options.getSize())) {
            if (srcWidth <= 0.0f) {
                srcWidth = 512.0f;
            }
            if (srcHeight <= 0.0f) {
                srcHeight = 512.0f;
            }
            return Tuples4.m3642to(Float.valueOf(srcWidth), Float.valueOf(srcHeight));
        }
        Size size = this.options.getSize();
        return Tuples4.m3642to(Float.valueOf(SvgUtils.toPx(size.getWidth(), scale)), Float.valueOf(SvgUtils.toPx(size.getHeight(), scale)));
    }

    /* compiled from: SvgDecoder.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"Lcoil/decode/SvgDecoder$Factory;", "Lcoil/decode/Decoder$Factory;", "", "useViewBoundsAsIntrinsicSize", "<init>", "(Z)V", "Lcoil/fetch/SourceResult;", "result", "isApplicable", "(Lcoil/fetch/SourceResult;)Z", "Lcoil/request/Options;", "options", "Lcoil/ImageLoader;", "imageLoader", "Lcoil/decode/Decoder;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Lcoil/fetch/SourceResult;Lcoil/request/Options;Lcoil/ImageLoader;)Lcoil/decode/Decoder;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Z", "getUseViewBoundsAsIntrinsicSize", "()Z", "coil-svg_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* loaded from: classes.dex */
    public static final class Factory implements Decoder.Factory {
        private final boolean useViewBoundsAsIntrinsicSize;

        @JvmOverloads
        public Factory() {
            this(false, 1, null);
        }

        @JvmOverloads
        public Factory(boolean z) {
            this.useViewBoundsAsIntrinsicSize = z;
        }

        public /* synthetic */ Factory(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z);
        }

        @Override // coil.decode.Decoder.Factory
        public Decoder create(FetchResult3 result, Options options, ImageLoader imageLoader) {
            if (isApplicable(result)) {
                return new SvgDecoder(result.getSource(), options, this.useViewBoundsAsIntrinsicSize);
            }
            return null;
        }

        private final boolean isApplicable(FetchResult3 result) {
            return Intrinsics.areEqual(result.getMimeType(), "image/svg+xml") || DecodeUtils2.isSvg(DecodeUtils.INSTANCE, result.getSource().source());
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Factory) && this.useViewBoundsAsIntrinsicSize == ((Factory) other).useViewBoundsAsIntrinsicSize;
        }

        public int hashCode() {
            return Boolean.hashCode(this.useViewBoundsAsIntrinsicSize);
        }
    }
}
