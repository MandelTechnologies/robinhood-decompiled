package com.robinhood.android.shoestring;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Strings.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0005\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0007\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\u000b\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u000e"}, m3636d2 = {"toShoeString", "Lcom/robinhood/android/shoestring/ShoeString;", "", "handlers", "Lcom/robinhood/android/shoestring/TagHandlers;", "(Ljava/lang/String;Lcom/robinhood/android/shoestring/TagHandlers;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/shoestring/ShoeString;", "Lcom/robinhood/utils/resource/StringResource;", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/shoestring/TagHandlers;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/shoestring/ShoeString;", "handler", "Lcom/robinhood/android/shoestring/TagHandler;", "(Ljava/lang/String;Lcom/robinhood/android/shoestring/TagHandler;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/shoestring/ShoeString;", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/shoestring/TagHandler;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/shoestring/ShoeString;", "resources", "Landroid/content/res/Resources;", "lib-shoestring_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class StringsKt {
    public static final ShoeString toShoeString(String str, TagHandlers handlers, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(handlers, "handlers");
        composer.startReplaceGroup(1720207379);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1720207379, i, -1, "com.robinhood.android.shoestring.toShoeString (Strings.kt:10)");
        }
        ShoeString shoeString = toShoeString(StringResource.INSTANCE.invoke(str), handlers, composer, (i & 112) | StringResource.$stable);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return shoeString;
    }

    public static final ShoeString toShoeString(StringResource stringResource, TagHandlers handlers, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(stringResource, "<this>");
        Intrinsics.checkNotNullParameter(handlers, "handlers");
        composer.startReplaceGroup(1756384933);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1756384933, i, -1, "com.robinhood.android.shoestring.toShoeString (Strings.kt:15)");
        }
        Resources resources = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        ShoeString shoeString = toShoeString(stringResource, resources, handlers);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return shoeString;
    }

    public static final ShoeString toShoeString(String str, TagHandler handler, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(handler, "handler");
        composer.startReplaceGroup(-2111582972);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2111582972, i, -1, "com.robinhood.android.shoestring.toShoeString (Strings.kt:20)");
        }
        ShoeString shoeString = toShoeString(StringResource.INSTANCE.invoke(str), new TagHandlers(handler), composer, StringResource.$stable);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return shoeString;
    }

    public static final ShoeString toShoeString(StringResource stringResource, TagHandler handler, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(stringResource, "<this>");
        Intrinsics.checkNotNullParameter(handler, "handler");
        composer.startReplaceGroup(-1971868622);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1971868622, i, -1, "com.robinhood.android.shoestring.toShoeString (Strings.kt:25)");
        }
        Resources resources = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        ShoeString shoeString = toShoeString(stringResource, resources, new TagHandlers(handler));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return shoeString;
    }

    public static final ShoeString toShoeString(String str, Resources resources, TagHandlers handlers) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(handlers, "handlers");
        return toShoeString(StringResource.INSTANCE.invoke(str), resources, handlers);
    }

    public static final ShoeString toShoeString(StringResource stringResource, Resources resources, TagHandlers handlers) {
        Intrinsics.checkNotNullParameter(stringResource, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(handlers, "handlers");
        return new RealShoeString(resources, stringResource, handlers);
    }
}
