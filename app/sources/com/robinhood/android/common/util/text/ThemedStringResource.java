package com.robinhood.android.common.util.text;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import com.robinhood.android.designsystem.text.ThemableColorSpans3;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ThemedStringResource.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/common/util/text/ThemedStringResource;", "", "colorTheme", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "", "stringResource", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/scarlet/util/resource/ResourceReference;Lcom/robinhood/utils/resource/StringResource;)V", "toCharSequence", "", "resources", "Landroid/content/res/Resources;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ThemedStringResource {
    public static final int $stable = StringResource.$stable | ResourceReferences4.$stable;
    private final ResourceReferences4<Integer> colorTheme;
    private final StringResource stringResource;

    public ThemedStringResource(ResourceReferences4<Integer> colorTheme, StringResource stringResource) {
        Intrinsics.checkNotNullParameter(colorTheme, "colorTheme");
        Intrinsics.checkNotNullParameter(stringResource, "stringResource");
        this.colorTheme = colorTheme;
        this.stringResource = stringResource;
    }

    public final CharSequence toCharSequence(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ThemableColorSpans3 themableColorSpans3 = new ThemableColorSpans3(this.colorTheme);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(this.stringResource.getText(resources));
        spannableStringBuilder.setSpan(themableColorSpans3, length, spannableStringBuilder.length(), 17);
        return new SpannedString(spannableStringBuilder);
    }
}
