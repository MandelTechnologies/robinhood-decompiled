package com.robinhood.android.lib.formats;

import com.robinhood.utils.resource.StringResource;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FormatAsList.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/lib/formats/OreoIcuListFormatter;", "Lcom/robinhood/android/lib/formats/ListFormatter;", "<init>", "()V", "formatter", "Landroid/icu/text/ListFormatter;", "kotlin.jvm.PlatformType", "format", "Lcom/robinhood/utils/resource/StringResource;", "items", "", "", "or", "", "lib-formats_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.formats.OreoIcuListFormatter, reason: use source file name */
/* loaded from: classes8.dex */
final class FormatAsList4 extends FormatAsList3 {
    public static final FormatAsList4 INSTANCE = new FormatAsList4();
    private static final android.icu.text.ListFormatter formatter = android.icu.text.ListFormatter.getInstance();

    private FormatAsList4() {
        super(null);
    }

    @Override // com.robinhood.android.lib.formats.FormatAsList3
    public StringResource format(List<String> items, boolean or) {
        Intrinsics.checkNotNullParameter(items, "items");
        if (or) {
            return FormatAsList.INSTANCE.format(items, true);
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        String str = formatter.format((Collection<?>) items);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return companion.invoke(str);
    }
}
