package com.google.android.libraries.places.api.net;

import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.internal.zznx;
import java.util.List;

/* compiled from: com.google.android.libraries.places:places@@3.5.0 */
/* loaded from: classes27.dex */
public abstract class SearchByTextResponse {
    @RecentlyNonNull
    public static SearchByTextResponse newInstance(@RecentlyNonNull List<Place> list) {
        return new zzab(zznx.zzj(list));
    }

    @RecentlyNonNull
    public abstract List<Place> getPlaces();
}
