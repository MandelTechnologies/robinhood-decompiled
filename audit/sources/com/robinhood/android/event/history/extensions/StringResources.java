package com.robinhood.android.event.history.extensions;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: StringResources.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"getText", "", "Lcom/robinhood/utils/resource/StringResource;", "(Lcom/robinhood/utils/resource/StringResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "feature-event-history_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.history.extensions.StringResourcesKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class StringResources {
    public static final String getText(StringResource stringResource, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(stringResource, "<this>");
        composer.startReplaceGroup(-910849321);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-910849321, i, -1, "com.robinhood.android.event.history.extensions.getText (StringResources.kt:7)");
        }
        Resources resources = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        String string2 = stringResource.getText(resources).toString();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return string2;
    }
}
