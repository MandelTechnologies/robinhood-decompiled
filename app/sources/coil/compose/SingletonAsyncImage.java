package coil.compose;

import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import coil.compose.AsyncImagePainter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: SingletonAsyncImage.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aä\u0001\u0010\"\u001a\u00020\f2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a¦\u0001\u0010\"\u001a\u00020\f2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#0\n2\u0016\b\u0002\u0010%\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, m3636d2 = {"", "model", "", "contentDescription", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/painter/Painter;", "placeholder", "error", "fallback", "Lkotlin/Function1;", "Lcoil/compose/AsyncImagePainter$State$Loading;", "", "onLoading", "Lcoil/compose/AsyncImagePainter$State$Success;", "onSuccess", "Lcoil/compose/AsyncImagePainter$State$Error;", "onError", "Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Landroidx/compose/ui/graphics/FilterQuality;", "filterQuality", "", "clipToBounds", "Lcoil/compose/EqualityDelegate;", "modelEqualityDelegate", "AsyncImage-Vb_qNX0", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;IZLcoil/compose/EqualityDelegate;Landroidx/compose/runtime/Composer;III)V", "AsyncImage", "Lcoil/compose/AsyncImagePainter$State;", "transform", "onState", "AsyncImage-gl8XCv8", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;IZLcoil/compose/EqualityDelegate;Landroidx/compose/runtime/Composer;III)V", "coil-compose-singleton_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: coil.compose.SingletonAsyncImageKt, reason: use source file name */
/* loaded from: classes16.dex */
public final class SingletonAsyncImage {
    /* renamed from: AsyncImage-Vb_qNX0, reason: not valid java name */
    public static final void m9118AsyncImageVb_qNX0(Object obj, String str, Modifier modifier, Painter painter, Painter painter2, Painter painter3, Function1<? super AsyncImagePainter.State.Loading, Unit> function1, Function1<? super AsyncImagePainter.State.Success, Unit> function12, Function1<? super AsyncImagePainter.State.Error, Unit> function13, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i, boolean z, EqualityDelegate equalityDelegate, Composer composer, int i2, int i3, int i4) {
        boolean z2;
        composer.startReplaceableGroup(1693837359);
        Modifier modifier2 = (i4 & 4) != 0 ? Modifier.INSTANCE : modifier;
        Painter painter4 = (i4 & 8) != 0 ? null : painter;
        Painter painter5 = (i4 & 16) != 0 ? null : painter2;
        Painter painter6 = (i4 & 32) != 0 ? painter5 : painter3;
        Function1<? super AsyncImagePainter.State.Loading, Unit> function14 = (i4 & 64) != 0 ? null : function1;
        Function1<? super AsyncImagePainter.State.Success, Unit> function15 = (i4 & 128) != 0 ? null : function12;
        Function1<? super AsyncImagePainter.State.Error, Unit> function16 = (i4 & 256) != 0 ? null : function13;
        Alignment center = (i4 & 512) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        ContentScale fit = (i4 & 1024) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        float f2 = (i4 & 2048) != 0 ? 1.0f : f;
        ColorFilter colorFilter2 = (i4 & 4096) != 0 ? null : colorFilter;
        int iM6965getDefaultFilterQualityfv9h1I = (i4 & 8192) != 0 ? DrawScope.INSTANCE.m6965getDefaultFilterQualityfv9h1I() : i;
        boolean z3 = (i4 & 16384) != 0 ? true : z;
        EqualityDelegate defaultModelEqualityDelegate = (i4 & 32768) != 0 ? EqualityDelegate2.getDefaultModelEqualityDelegate() : equalityDelegate;
        if (ComposerKt.isTraceInProgress()) {
            z2 = z3;
            ComposerKt.traceEventStart(1693837359, i2, i3, "coil.compose.AsyncImage (SingletonAsyncImage.kt:65)");
        } else {
            z2 = z3;
        }
        int i5 = i2 << 3;
        int i6 = (i5 & 7168) | (i2 & 112) | 2392584 | (29360128 & i5) | (234881024 & i5) | (i5 & 1879048192);
        int i7 = i3 << 3;
        Modifier modifier3 = modifier2;
        Painter painter7 = painter4;
        Painter painter8 = painter5;
        Painter painter9 = painter6;
        AsyncImage.m9100AsyncImageJFEaFM(obj, str, LocalImageLoader.getCurrent(LocalImageLoader2.getLocalImageLoader(), composer, 6), modifier3, painter7, painter8, painter9, function14, function15, function16, center, fit, f2, colorFilter2, iM6965getDefaultFilterQualityfv9h1I, z2, defaultModelEqualityDelegate, composer, i6, ((i2 >> 27) & 14) | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (57344 & i7) | (458752 & i7) | (i7 & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    /* renamed from: AsyncImage-gl8XCv8, reason: not valid java name */
    public static final void m9119AsyncImagegl8XCv8(Object obj, String str, Modifier modifier, Function1<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> function1, Function1<? super AsyncImagePainter.State, Unit> function12, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i, boolean z, EqualityDelegate equalityDelegate, Composer composer, int i2, int i3, int i4) {
        composer.startReplaceableGroup(1451072229);
        Modifier modifier2 = (i4 & 4) != 0 ? Modifier.INSTANCE : modifier;
        Function1<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> defaultTransform = (i4 & 8) != 0 ? AsyncImagePainter.INSTANCE.getDefaultTransform() : function1;
        Function1<? super AsyncImagePainter.State, Unit> function13 = (i4 & 16) != 0 ? null : function12;
        Alignment center = (i4 & 32) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        ContentScale fit = (i4 & 64) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        float f2 = (i4 & 128) != 0 ? 1.0f : f;
        ColorFilter colorFilter2 = (i4 & 256) == 0 ? colorFilter : null;
        int iM6965getDefaultFilterQualityfv9h1I = (i4 & 512) != 0 ? DrawScope.INSTANCE.m6965getDefaultFilterQualityfv9h1I() : i;
        boolean z2 = (i4 & 1024) != 0 ? true : z;
        EqualityDelegate defaultModelEqualityDelegate = (i4 & 2048) != 0 ? EqualityDelegate2.getDefaultModelEqualityDelegate() : equalityDelegate;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1451072229, i2, i3, "coil.compose.AsyncImage (SingletonAsyncImage.kt:161)");
        }
        int i5 = i2 << 3;
        int i6 = i3 << 3;
        AsyncImage.m9101AsyncImageQgsmV_s(obj, str, LocalImageLoader.getCurrent(LocalImageLoader2.getLocalImageLoader(), composer, 6), modifier2, defaultTransform, function13, center, fit, f2, colorFilter2, iM6965getDefaultFilterQualityfv9h1I, z2, defaultModelEqualityDelegate, composer, (1879048192 & i5) | (i5 & 7168) | (i2 & 112) | 520 | (57344 & i5) | (458752 & i5) | (3670016 & i5) | (29360128 & i5) | (234881024 & i5), ((i2 >> 27) & 14) | (i6 & 112) | (i6 & 896), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }
}
