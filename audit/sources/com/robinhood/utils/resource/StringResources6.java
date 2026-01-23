package com.robinhood.utils.resource;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.view.View;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.fragment.app.Fragment;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: StringResources.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0005*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0006\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u001a$\u0010\u000b\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u001a\u0018\u0010\u0010\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0005¨\u0006\u0011"}, m3636d2 = {"getText", "", "Lcom/robinhood/utils/resource/StringResource;", "(Lcom/robinhood/utils/resource/StringResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/CharSequence;", "getTextAsString", "", "(Lcom/robinhood/utils/resource/StringResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "Landroidx/fragment/app/Fragment;", "stringResource", "Landroid/content/res/Resources;", "Landroid/view/View;", "toSpannedString", "Landroid/text/Spannable;", "", "resources", "separator", "join", "lib-utils-resource_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.utils.resource.StringResourcesKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class StringResources6 {
    public static final CharSequence getText(StringResource stringResource, Composer composer, int i) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(stringResource, "<this>");
        composer.startReplaceGroup(1116544891);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1116544891, i, -1, "com.robinhood.utils.resource.getText (StringResources.kt:12)");
        }
        Resources resources = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        CharSequence text = stringResource.getText(resources);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return text;
    }

    public static final String getTextAsString(StringResource stringResource, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(stringResource, "<this>");
        composer.startReplaceGroup(-838996226);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-838996226, i, -1, "com.robinhood.utils.resource.getTextAsString (StringResources.kt:17)");
        }
        String string2 = getText(stringResource, composer, i & 14).toString();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return string2;
    }

    public static final CharSequence getText(Fragment fragment, StringResource stringResource) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        if (stringResource == null) {
            return null;
        }
        Resources resources = fragment.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return stringResource.getText(resources);
    }

    public static final CharSequence getText(Resources resources, StringResource stringResource) {
        Intrinsics.checkNotNullParameter(resources, "<this>");
        if (stringResource != null) {
            return stringResource.getText(resources);
        }
        return null;
    }

    public static final CharSequence getText(View view, StringResource stringResource) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (stringResource == null) {
            return null;
        }
        Resources resources = view.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return stringResource.getText(resources);
    }

    public static /* synthetic */ Spannable toSpannedString$default(List list, Resources resources, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return toSpannedString(list, resources, str);
    }

    public static final Spannable toSpannedString(List<? extends StringResource> list, Resources resources, String str) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            spannableStringBuilder.append(((StringResource) obj).getText(resources));
            if (i != list.size() - 1 && str != null) {
                spannableStringBuilder.append((CharSequence) str);
            }
            i = i2;
        }
        return SpannableString.valueOf(new SpannedString(spannableStringBuilder));
    }

    public static final StringResource join(List<? extends StringResource> list, String separator) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        return new StringResource.Join(list, separator);
    }
}
