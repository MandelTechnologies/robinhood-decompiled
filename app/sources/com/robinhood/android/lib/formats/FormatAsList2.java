package com.robinhood.android.lib.formats;

import android.content.res.Resources;
import android.os.Build;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FormatAsList.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0002\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00050\u0004\u001a\u0018\u0010\u0002\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007\u001a:\u0010\u0002\u001a\u00020\u0005\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0086\bø\u0001\u0000\u001a\u0010\u0010\f\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00050\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r"}, m3636d2 = {"listFormatter", "Lcom/robinhood/android/lib/formats/ListFormatter;", "formatAsList", "Lcom/robinhood/utils/resource/StringResource;", "", "", "resources", "Landroid/content/res/Resources;", "T", "", "transform", "Lkotlin/Function1;", "formatAsOrList", "lib-formats_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.formats.FormatAsListKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class FormatAsList2 {
    private static final FormatAsList3 listFormatter;

    static {
        FormatAsList3 formatAsList3;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            formatAsList3 = FormatAsList5.INSTANCE;
        } else if (i >= 26) {
            formatAsList3 = FormatAsList4.INSTANCE;
        } else {
            formatAsList3 = FormatAsList.INSTANCE;
        }
        listFormatter = formatAsList3;
    }

    public static final StringResource formatAsList(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return FormatAsList3.format$default(listFormatter, list, false, 2, null);
    }

    public static final String formatAsList(List<String> list, Resources resources) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        return formatAsList(list).getText(resources).toString();
    }

    public static /* synthetic */ String formatAsList$default(Iterable iterable, Resources resources, Function1 transform, int i, Object obj) {
        if ((i & 2) != 0) {
            transform = new Function1() { // from class: com.robinhood.android.lib.formats.FormatAsListKt.formatAsList.1
                @Override // kotlin.jvm.functions.Function1
                public final String invoke(Object obj2) {
                    return String.valueOf(obj2);
                }
            };
        }
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(transform.invoke(it.next()));
        }
        return formatAsList(arrayList, resources);
    }

    public static final StringResource formatAsOrList(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return listFormatter.format(list, true);
    }

    public static final <T> String formatAsList(Iterable<? extends T> iterable, Resources resources, Function1<? super T, String> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(transform.invoke(it.next()));
        }
        return formatAsList(arrayList, resources);
    }
}
