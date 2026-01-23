package com.robinhood.android.common.p088ui.daynight;

import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.SelectorResource;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DayNightReferenceUtils.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001aB\u0010\u0000\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\b¨\u0006\t"}, m3636d2 = {"getDayNightReference", "Lcom/robinhood/scarlet/util/resource/SelectorResource;", "T", "", "dayReference", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "nightReference", "type", "Lcom/robinhood/scarlet/util/resource/ResourceType;", "lib-common_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.ui.daynight.DayNightReferenceUtilsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class DayNightReferenceUtils {
    public static final <T> SelectorResource<? extends T> getDayNightReference(ResourceReferences4<? extends T> dayReference, ResourceReferences4<? extends T> nightReference, ResourceType<T> type2) {
        Intrinsics.checkNotNullParameter(dayReference, "dayReference");
        Intrinsics.checkNotNullParameter(nightReference, "nightReference");
        Intrinsics.checkNotNullParameter(type2, "type");
        return new SelectorResource<>(type2, new ThemedResourceReference(ResourceType.BOOLEAN.INSTANCE, C20690R.attr.isDay), dayReference, nightReference);
    }
}
