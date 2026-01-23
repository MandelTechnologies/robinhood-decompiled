package com.robinhood.android.lib.formats;

import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FormatAsList.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/lib/formats/CustomListFormatter;", "Lcom/robinhood/android/lib/formats/ListFormatter;", "<init>", "()V", "format", "Lcom/robinhood/utils/resource/StringResource;", "items", "", "", "or", "", "lib-formats_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.formats.CustomListFormatter, reason: use source file name */
/* loaded from: classes8.dex */
final class FormatAsList extends FormatAsList3 {
    public static final FormatAsList INSTANCE = new FormatAsList();

    private FormatAsList() {
        super(null);
    }

    @Override // com.robinhood.android.lib.formats.FormatAsList3
    public StringResource format(List<String> items, boolean or) {
        Intrinsics.checkNotNullParameter(items, "items");
        int size = items.size();
        if (size == 0) {
            return StringResource.INSTANCE.invoke("");
        }
        if (size == 1) {
            return StringResource.INSTANCE.invoke(items.get(0));
        }
        if (size == 2) {
            return StringResource.INSTANCE.invoke(or ? C20282R.string.or_joiner : C20282R.string.and_joiner, items.get(0), items.get(1));
        }
        return StringResource.INSTANCE.invoke(or ? C20282R.string.general_item_list_many_or : C20282R.string.general_item_list_many, CollectionsKt.joinToString$default(items.subList(0, items.size() - 2), ", ", null, null, 0, null, null, 62, null), items.get(items.size() - 2), items.get(items.size() - 1));
    }
}
