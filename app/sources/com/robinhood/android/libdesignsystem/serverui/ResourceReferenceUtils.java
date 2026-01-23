package com.robinhood.android.libdesignsystem.serverui;

import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.SelectorResource;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResourceReferenceUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a,\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¨\u0006\u0007"}, m3636d2 = {"dayNightColorSelector", "Lcom/robinhood/scarlet/util/resource/SelectorResource;", "", "Lcom/robinhood/scarlet/util/resource/SelectorResource$Companion;", "dayReference", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "nightReference", "lib-sdui-legacy_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.libdesignsystem.serverui.ResourceReferenceUtilsKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class ResourceReferenceUtils {
    public static final SelectorResource<Integer> dayNightColorSelector(SelectorResource.Companion companion, ResourceReferences4<Integer> dayReference, ResourceReferences4<Integer> nightReference) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(dayReference, "dayReference");
        Intrinsics.checkNotNullParameter(nightReference, "nightReference");
        return new SelectorResource<>(ResourceType.COLOR.INSTANCE, new ThemedResourceReference(ResourceType.BOOLEAN.INSTANCE, C20690R.attr.isDay), dayReference, nightReference);
    }
}
