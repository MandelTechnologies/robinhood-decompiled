package com.robinhood.android.tradingtrends.microgram;

import com.robinhood.models.serverdriven.experimental.api.ChartGroup;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KType;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.modules.SerializersModule;
import microgram.p507ui.sdui.SduiChartGroup;
import microgram.p507ui.sdui.SduiComponent;

/* compiled from: TradingTrendsMicrogramSduiConverters.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\r0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/tradingtrends/microgram/RealTradingTrendsMicrogramSduiConverters;", "Lcom/robinhood/android/tradingtrends/microgram/TradingTrendsMicrogramSduiConverters;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcom/robinhood/utils/moshi/LazyMoshi;Lkotlinx/serialization/json/Json;)V", "chartGroupJsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/models/serverdriven/experimental/api/ChartGroup;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "chartUiComponentAdapter", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "convertChartGroup", "chartGroup", "Lmicrogram/ui/sdui/SduiChartGroup;", "convertUiComponent", "component", "Lmicrogram/ui/sdui/SduiComponent;", "lib-trading-trends-microgram_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.tradingtrends.microgram.RealTradingTrendsMicrogramSduiConverters, reason: use source file name */
/* loaded from: classes9.dex */
public final class TradingTrendsMicrogramSduiConverters2 implements TradingTrendsMicrogramSduiConverters {
    private final JsonAdapter<ChartGroup<GenericAction>> chartGroupJsonAdapter;
    private final JsonAdapter<UIComponent<GenericAction>> chartUiComponentAdapter;
    private final Json json;

    public TradingTrendsMicrogramSduiConverters2(LazyMoshi moshi, Json json) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(json, "json");
        this.json = json;
        Types types = Types.INSTANCE;
        this.chartGroupJsonAdapter = moshi.adapter(new TypeToken<ChartGroup<? extends GenericAction>>() { // from class: com.robinhood.android.tradingtrends.microgram.RealTradingTrendsMicrogramSduiConverters$special$$inlined$getAdapter$1
        }.getType());
        this.chartUiComponentAdapter = moshi.adapter(new TypeToken<UIComponent<? extends GenericAction>>() { // from class: com.robinhood.android.tradingtrends.microgram.RealTradingTrendsMicrogramSduiConverters$special$$inlined$getAdapter$2
        }.getType());
    }

    @Override // com.robinhood.android.tradingtrends.microgram.TradingTrendsMicrogramSduiConverters
    public ChartGroup<GenericAction> convertChartGroup(SduiChartGroup chartGroup) {
        Intrinsics.checkNotNullParameter(chartGroup, "chartGroup");
        JsonAdapter<ChartGroup<GenericAction>> jsonAdapter = this.chartGroupJsonAdapter;
        Json json = this.json;
        SerializersModule serializersModule = json.getSerializersModule();
        KType kTypeTypeOf = Reflection.typeOf(SduiChartGroup.class);
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return jsonAdapter.fromJson(json.encodeToString(SerializersKt.serializer(serializersModule, kTypeTypeOf), chartGroup));
    }

    @Override // com.robinhood.android.tradingtrends.microgram.TradingTrendsMicrogramSduiConverters
    public UIComponent<?> convertUiComponent(SduiComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        JsonAdapter<UIComponent<GenericAction>> jsonAdapter = this.chartUiComponentAdapter;
        Json json = this.json;
        SerializersModule serializersModule = json.getSerializersModule();
        KType kTypeTypeOf = Reflection.typeOf(SduiComponent.class);
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return jsonAdapter.fromJson(json.encodeToString(SerializersKt.serializer(serializersModule, kTypeTypeOf), component));
    }
}
