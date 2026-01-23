package com.robinhood.android.lib.pathfinder.extensions;

import com.robinhood.utils.ReleaseVersion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: ReleaseVersions.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0004H\u0002¨\u0006\u0007"}, m3636d2 = {"compareVersionName", "", "Lcom/robinhood/utils/ReleaseVersion;", "other", "", "versionSegments", "", "lib-pathfinder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.pathfinder.extensions.ReleaseVersionsKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class ReleaseVersions {
    public static final int compareVersionName(ReleaseVersion releaseVersion, String other) throws NumberFormatException {
        Intrinsics.checkNotNullParameter(releaseVersion, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Iterator<T> it = ArraysKt.zip(versionSegments(releaseVersion.getVersionName()), versionSegments(other)).iterator();
        while (it.hasNext()) {
            Tuples2 tuples2 = (Tuples2) it.next();
            int iIntValue = ((Number) tuples2.getFirst()).intValue() - ((Number) tuples2.getSecond()).intValue();
            if (iIntValue != 0) {
                return iIntValue;
            }
        }
        return 0;
    }

    private static final int[] versionSegments(String str) {
        List listSplit$default = StringsKt.split$default((CharSequence) StringsKt.split$default((CharSequence) str, new String[]{"-"}, false, 0, 6, (Object) null).get(0), new String[]{"."}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
        }
        return CollectionsKt.toIntArray(arrayList);
    }
}
