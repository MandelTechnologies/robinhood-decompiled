package androidx.media3.common.util;

import android.os.Bundle;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class BundleCollectionUtil {
    public static <T> ImmutableList<T> fromBundleList(Function<Bundle, T> function, List<Bundle> list) {
        ImmutableList.Builder builder = ImmutableList.builder();
        for (int i = 0; i < list.size(); i++) {
            builder.add((ImmutableList.Builder) function.apply((Bundle) Assertions.checkNotNull(list.get(i))));
        }
        return builder.build();
    }

    public static <T> ArrayList<Bundle> toBundleArrayList(Collection<T> collection, Function<T, Bundle> function) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(function.apply(it.next()));
        }
        return arrayList;
    }
}
