package com.robinhood.android.common.util.extensions;

import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.SelectorResource;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TemporaryServerToBentoColorMapper.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a,\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u001a\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u0002H\u0002¨\u0006\n"}, m3636d2 = {"dayNightColorSelector", "Lcom/robinhood/scarlet/util/resource/SelectorResource;", "", "Lcom/robinhood/scarlet/util/resource/SelectorResource$Companion;", "dayReference", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "nightReference", "colorResourceValue", "Lcom/robinhood/scarlet/util/resource/ThemedResourceReference;", "attrId", "lib-common_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.util.extensions.TemporaryServerToBentoColorMapperKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class TemporaryServerToBentoColorMapper2 {
    public static final SelectorResource<Integer> dayNightColorSelector(SelectorResource.Companion companion, ResourceReferences4<Integer> dayReference, ResourceReferences4<Integer> nightReference) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(dayReference, "dayReference");
        Intrinsics.checkNotNullParameter(nightReference, "nightReference");
        return new SelectorResource<>(ResourceType.COLOR.INSTANCE, new ThemedResourceReference(ResourceType.BOOLEAN.INSTANCE, C20690R.attr.isDay), dayReference, nightReference);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ThemedResourceReference<Integer> colorResourceValue(int i) {
        return new ThemedResourceReference<>(ResourceType.COLOR.INSTANCE, i);
    }
}
