package com.robinhood.android.common.util.extensions;

import androidx.appcompat.R$attr;
import com.robinhood.android.account.p060ui.AccountNavigationViewState;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.models.serverdriven.p347db.ThemedColor;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ResourceValue;
import com.robinhood.scarlet.util.resource.SelectorResource;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TemporaryServerToBentoColorMapper.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006J\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u000eR \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/common/util/extensions/TemporaryServerToBentoColorMapper;", "", "<init>", "()V", "supportedColors", "", "", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "", "mapDayNightSelectorServerColor", "valueFromServerDay", "valueFromServerNight", "mapColor", "themedColor", "Lcom/robinhood/models/serverdriven/db/ThemedColor;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class TemporaryServerToBentoColorMapper {
    public static final TemporaryServerToBentoColorMapper INSTANCE = new TemporaryServerToBentoColorMapper();
    private static final Map<String, ResourceReferences4<Integer>> supportedColors = MapsKt.mapOf(Tuples4.m3642to("accent", new ResourceValue(ResourceType.COLOR.INSTANCE, Integer.valueOf(R$attr.colorAccent))), Tuples4.m3642to(AccountNavigationViewState.LOG_OUT_TEXT_COLOR, TemporaryServerToBentoColorMapper2.colorResourceValue(C20690R.attr.colorPositive)), Tuples4.m3642to("negative", TemporaryServerToBentoColorMapper2.colorResourceValue(C20690R.attr.colorNegative)), Tuples4.m3642to("fg", TemporaryServerToBentoColorMapper2.colorResourceValue(C20690R.attr.colorForeground1)));
    public static final int $stable = 8;

    private TemporaryServerToBentoColorMapper() {
    }

    public final ResourceReferences4<Integer> mapDayNightSelectorServerColor(String valueFromServerDay, String valueFromServerNight) {
        ResourceReferences4<Integer> resourceReferences4;
        Intrinsics.checkNotNullParameter(valueFromServerDay, "valueFromServerDay");
        Intrinsics.checkNotNullParameter(valueFromServerNight, "valueFromServerNight");
        Map<String, ResourceReferences4<Integer>> map = supportedColors;
        ResourceReferences4<Integer> resourceReferences42 = map.get(valueFromServerDay);
        if (resourceReferences42 == null || (resourceReferences4 = map.get(valueFromServerNight)) == null) {
            return null;
        }
        return TemporaryServerToBentoColorMapper2.dayNightColorSelector(SelectorResource.INSTANCE, resourceReferences42, resourceReferences4);
    }

    public final ResourceReferences4<Integer> mapColor(ThemedColor themedColor) {
        Intrinsics.checkNotNullParameter(themedColor, "themedColor");
        return mapDayNightSelectorServerColor(themedColor.getLight(), themedColor.getDark());
    }
}
