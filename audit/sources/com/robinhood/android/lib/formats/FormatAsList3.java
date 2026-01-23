package com.robinhood.android.lib.formats;

import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: FormatAsList.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nH&\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/lib/formats/ListFormatter;", "", "<init>", "()V", "format", "Lcom/robinhood/utils/resource/StringResource;", "items", "", "", "or", "", "Lcom/robinhood/android/lib/formats/CustomListFormatter;", "Lcom/robinhood/android/lib/formats/OreoIcuListFormatter;", "Lcom/robinhood/android/lib/formats/TiramisuIcuListFormatter;", "lib-formats_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.formats.ListFormatter, reason: use source file name */
/* loaded from: classes8.dex */
abstract class FormatAsList3 {
    public /* synthetic */ FormatAsList3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract StringResource format(List<String> items, boolean or);

    private FormatAsList3() {
    }

    public static /* synthetic */ StringResource format$default(FormatAsList3 formatAsList3, List list, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: format");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return formatAsList3.format(list, z);
    }
}
