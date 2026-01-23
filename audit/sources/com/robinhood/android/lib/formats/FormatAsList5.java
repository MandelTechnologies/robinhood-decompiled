package com.robinhood.android.lib.formats;

import android.icu.text.ListFormatter;
import com.robinhood.utils.resource.StringResource;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FormatAsList.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/lib/formats/TiramisuIcuListFormatter;", "Lcom/robinhood/android/lib/formats/ListFormatter;", "<init>", "()V", "format", "Lcom/robinhood/utils/resource/StringResource;", "items", "", "", "or", "", "lib-formats_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.formats.TiramisuIcuListFormatter, reason: use source file name */
/* loaded from: classes8.dex */
final class FormatAsList5 extends FormatAsList3 {
    public static final FormatAsList5 INSTANCE = new FormatAsList5();

    private FormatAsList5() {
        super(null);
    }

    @Override // com.robinhood.android.lib.formats.FormatAsList3
    public StringResource format(List<String> items, boolean or) {
        Intrinsics.checkNotNullParameter(items, "items");
        StringResource.Companion companion = StringResource.INSTANCE;
        String str = android.icu.text.ListFormatter.getInstance(Locale.getDefault(Locale.Category.FORMAT), or ? ListFormatter.Type.OR : ListFormatter.Type.AND, ListFormatter.Width.WIDE).format((Collection<?>) items);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return companion.invoke(str);
    }
}
