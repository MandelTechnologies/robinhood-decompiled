package com.robinhood.android.libdesignsystem.serverui;

import com.robinhood.android.account.p060ui.AccountNavigationViewState;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.color.RdsColor;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.models.serverdriven.p347db.ThemedColor;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.SelectorResource;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ServerToBentoColorMapper.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00052\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\f0\u000bH\u0002J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006J\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\u0012\u001a\u00020\u0006J\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006J0\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\b\b\u0001\u0010\u0016\u001a\u00020\b2\b\b\u0001\u0010\u0017\u001a\u00020\bJ\u0016\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\u0019\u001a\u00020\u001aR \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/ServerToBentoColorMapper;", "", "<init>", "()V", "supportedColors", "", "", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "", "expandRdsCoreColors", "colorMappings", "", "Lkotlin/Pair;", "Lcom/robinhood/android/designsystem/color/RdsColor$Core;", "canMapColor", "", ResourceTypes.COLOR, "mapSimpleServerColor", "valueFromServer", "mapDayNightSelectorServerColor", "valueFromServerDay", "valueFromServerNight", "fallbackDay", "fallbackNight", "mapColor", "themedColor", "Lcom/robinhood/models/serverdriven/db/ThemedColor;", "lib-sdui-legacy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class ServerToBentoColorMapper {
    public static final ServerToBentoColorMapper INSTANCE;
    private static final Map<String, ResourceReferences4<Integer>> supportedColors;

    private ServerToBentoColorMapper() {
    }

    static {
        ServerToBentoColorMapper serverToBentoColorMapper = new ServerToBentoColorMapper();
        INSTANCE = serverToBentoColorMapper;
        supportedColors = MapsKt.plus(MapsKt.mapOf(Tuples4.m3642to("accent", ServerToBentoColorMapper2.colorResourceValue(C20690R.attr.colorPrimary)), Tuples4.m3642to(AccountNavigationViewState.LOG_OUT_TEXT_COLOR, ServerToBentoColorMapper2.colorResourceValue(C20690R.attr.colorPositive)), Tuples4.m3642to("negative", ServerToBentoColorMapper2.colorResourceValue(C20690R.attr.colorNegative)), Tuples4.m3642to("fg", ServerToBentoColorMapper2.colorResourceValue(C20690R.attr.colorForeground1)), Tuples4.m3642to("fg2", ServerToBentoColorMapper2.colorResourceValue(C20690R.attr.colorForeground2)), Tuples4.m3642to("fg3", ServerToBentoColorMapper2.colorResourceValue(C20690R.attr.colorForeground3)), Tuples4.m3642to("bg", ServerToBentoColorMapper2.colorResourceValue(C20690R.attr.colorBackground1)), Tuples4.m3642to("bg2", ServerToBentoColorMapper2.colorResourceValue(C20690R.attr.colorBackground2)), Tuples4.m3642to("bg3", ServerToBentoColorMapper2.colorResourceValue(C20690R.attr.colorBackground3)), Tuples4.m3642to("jet", ServerToBentoColorMapper2.colorResourceValue(C13997R.attr.paletteColorJet)), Tuples4.m3642to("nova", ServerToBentoColorMapper2.colorResourceValue(C13997R.attr.paletteColorNova)), Tuples4.m3642to("mineral", ServerToBentoColorMapper2.colorResourceValue(RdsColor.Accent.Light.Mineral.INSTANCE)), Tuples4.m3642to("andros", ServerToBentoColorMapper2.colorResourceValue(RdsColor.Accent.Dark.Andros.INSTANCE)), Tuples4.m3642to("ion", ServerToBentoColorMapper2.colorResourceValue(RdsColor.Accent.Light.Ion.INSTANCE)), Tuples4.m3642to("jade", ServerToBentoColorMapper2.colorResourceValue(RdsColor.Accent.Dark.Jade.INSTANCE)), Tuples4.m3642to("stratos", ServerToBentoColorMapper2.colorResourceValue(RdsColor.Accent.Light.Stratos.INSTANCE)), Tuples4.m3642to("exos", ServerToBentoColorMapper2.colorResourceValue(RdsColor.Accent.Dark.Exos.INSTANCE)), Tuples4.m3642to("ruby", ServerToBentoColorMapper2.colorResourceValue(RdsColor.Accent.Dark.Ruby.INSTANCE)), Tuples4.m3642to("gaia", ServerToBentoColorMapper2.colorResourceValue(RdsColor.Accent.Dark.Gaia.INSTANCE))), serverToBentoColorMapper.expandRdsCoreColors(CollectionsKt.listOf((Object[]) new Tuples2[]{Tuples4.m3642to("joule", RdsColor.Core.Warm.Joule.INSTANCE), Tuples4.m3642to("sol", RdsColor.Core.Warm.Sol.INSTANCE), Tuples4.m3642to("lumen", RdsColor.Core.Warm.Lumen.INSTANCE), Tuples4.m3642to("x-ray", RdsColor.Core.Green.XRay.INSTANCE), Tuples4.m3642to("prime", RdsColor.Core.Green.Prime.INSTANCE), Tuples4.m3642to("biome", RdsColor.Core.Green.Biome.INSTANCE), Tuples4.m3642to("dot", RdsColor.Core.Cool.Dot.INSTANCE), Tuples4.m3642to("hydro", RdsColor.Core.Cool.Hydro.INSTANCE), Tuples4.m3642to("cosmonaut", RdsColor.Core.Cool.Cosmonaut.INSTANCE), Tuples4.m3642to("uv", RdsColor.Core.Violet.C14003Uv.INSTANCE), Tuples4.m3642to("iris", RdsColor.Core.Violet.Iris.INSTANCE), Tuples4.m3642to("millenium", RdsColor.Core.Violet.Millenium.INSTANCE), Tuples4.m3642to("resin", RdsColor.Core.Neutral.Resin.INSTANCE), Tuples4.m3642to("droid", RdsColor.Core.Neutral.Droid.INSTANCE), Tuples4.m3642to("clone", RdsColor.Core.Neutral.Clone.INSTANCE)})));
    }

    private final Map<String, ResourceReferences4<Integer>> expandRdsCoreColors(List<? extends Tuples2<String, ? extends RdsColor.Core>> colorMappings) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = colorMappings.iterator();
        while (it.hasNext()) {
            Tuples2 tuples2 = (Tuples2) it.next();
            String str = (String) tuples2.component1();
            RdsColor.Core core = (RdsColor.Core) tuples2.component2();
            CollectionsKt.addAll(arrayList, CollectionsKt.listOf((Object[]) new Tuples2[]{Tuples4.m3642to(str, core.getBase()), Tuples4.m3642to(str + "-light", core.getLight()), Tuples4.m3642to(str + "-dark", core.getDark())}));
        }
        return MapsKt.toMap(arrayList);
    }

    public final boolean canMapColor(String color) {
        Intrinsics.checkNotNullParameter(color, "color");
        return supportedColors.containsKey(color);
    }

    public final ResourceReferences4<Integer> mapSimpleServerColor(String valueFromServer) {
        Intrinsics.checkNotNullParameter(valueFromServer, "valueFromServer");
        return supportedColors.get(valueFromServer);
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
        return ResourceReferenceUtils.dayNightColorSelector(SelectorResource.INSTANCE, resourceReferences42, resourceReferences4);
    }

    public final ResourceReferences4<Integer> mapDayNightSelectorServerColor(String valueFromServerDay, String valueFromServerNight, int fallbackDay, int fallbackNight) {
        Intrinsics.checkNotNullParameter(valueFromServerDay, "valueFromServerDay");
        Intrinsics.checkNotNullParameter(valueFromServerNight, "valueFromServerNight");
        ResourceReferences4<Integer> resourceReferences4MapDayNightSelectorServerColor = mapDayNightSelectorServerColor(valueFromServerDay, valueFromServerNight);
        if (resourceReferences4MapDayNightSelectorServerColor != null) {
            return resourceReferences4MapDayNightSelectorServerColor;
        }
        ResourceType.COLOR color = ResourceType.COLOR.INSTANCE;
        return ResourceReferenceUtils.dayNightColorSelector(SelectorResource.INSTANCE, new ThemedResourceReference(color, fallbackDay), new ThemedResourceReference(color, fallbackNight));
    }

    public final ResourceReferences4<Integer> mapColor(ThemedColor themedColor) {
        Intrinsics.checkNotNullParameter(themedColor, "themedColor");
        return mapDayNightSelectorServerColor(themedColor.getLight(), themedColor.getDark());
    }
}
