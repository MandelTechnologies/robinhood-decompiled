package coil.compose;

import android.content.Context;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import androidx.compose.runtime.ProvidedValue;
import coil.Coil;
import coil.ImageLoader;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LocalImageLoader.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087@\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0087\u0004¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u00038GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u0088\u0001\u0004\u0092\u0001\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¨\u0006\u0011"}, m3636d2 = {"Lcoil/compose/ImageLoaderProvidableCompositionLocal;", "", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcoil/ImageLoader;", "delegate", "constructor-impl", "(Landroidx/compose/runtime/ProvidableCompositionLocal;)Landroidx/compose/runtime/ProvidableCompositionLocal;", "value", "Landroidx/compose/runtime/ProvidedValue;", "provides-impl", "(Landroidx/compose/runtime/ProvidableCompositionLocal;Lcoil/ImageLoader;)Landroidx/compose/runtime/ProvidedValue;", "provides", "getCurrent", "(Landroidx/compose/runtime/ProvidableCompositionLocal;Landroidx/compose/runtime/Composer;I)Lcoil/ImageLoader;", "getCurrent$annotations", "()V", "current", "coil-compose-singleton_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
@JvmInline
@SourceDebugExtension
/* renamed from: coil.compose.ImageLoaderProvidableCompositionLocal, reason: use source file name */
/* loaded from: classes16.dex */
public final class LocalImageLoader {
    /* renamed from: constructor-impl, reason: not valid java name */
    public static CompositionLocal6<ImageLoader> m9115constructorimpl(CompositionLocal6<ImageLoader> compositionLocal6) {
        return compositionLocal6;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ CompositionLocal6 m9116constructorimpl$default(CompositionLocal6 compositionLocal6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            compositionLocal6 = CompositionLocal3.staticCompositionLocalOf(new Function0<ImageLoader>() { // from class: coil.compose.ImageLoaderProvidableCompositionLocal.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final ImageLoader invoke() {
                    return null;
                }
            });
        }
        return m9115constructorimpl(compositionLocal6);
    }

    @JvmName
    public static final ImageLoader getCurrent(CompositionLocal6<ImageLoader> compositionLocal6, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-617597678, i, -1, "coil.compose.ImageLoaderProvidableCompositionLocal.<get-current> (LocalImageLoader.kt:49)");
        }
        ImageLoader imageLoader = (ImageLoader) composer.consume(compositionLocal6);
        if (imageLoader == null) {
            imageLoader = Coil.imageLoader((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return imageLoader;
    }

    @Deprecated
    /* renamed from: provides-impl, reason: not valid java name */
    public static final ProvidedValue<ImageLoader> m9117providesimpl(CompositionLocal6<ImageLoader> compositionLocal6, ImageLoader imageLoader) {
        return compositionLocal6.provides(imageLoader);
    }
}
