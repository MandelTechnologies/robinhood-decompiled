package com.robinhood.android.deeplink.targets;

import android.content.Context;
import android.content.Intent;
import com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartExperiment;
import com.robinhood.android.deeplink.DeepLinkPath;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.hammer.android.EntryPoints;
import com.robinhood.models.p355ui.Historical;
import com.robinhood.shared.chart.contracts.advancedChart.AdvancedChartFragmentKey;
import com.robinhood.shared.chart.contracts.advancedChart.BlackWidowAdvancedChartFragmentKey;
import com.robinhood.shared.chart.contracts.advancedChart.BlackWidowAdvancedChartFragmentKey2;
import com.robinhood.shared.models.advancedChart.api.ApiTechnicalIndicator;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonDataException;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import timber.log.Timber;

/* compiled from: Targets.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/deeplink/targets/EquityAdvancedChartDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "Component", "lib-deeplink-targets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class EquityAdvancedChartDeeplinkTarget extends DeeplinkTarget4 {
    public static final EquityAdvancedChartDeeplinkTarget INSTANCE = new EquityAdvancedChartDeeplinkTarget();
    public static final int $stable = 8;

    /* compiled from: Targets.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/deeplink/targets/EquityAdvancedChartDeeplinkTarget$Component;", "", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "getMoshi", "()Lcom/robinhood/utils/moshi/LazyMoshi;", "lib-deeplink-targets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public interface Component {
        LazyMoshi getMoshi();
    }

    private EquityAdvancedChartDeeplinkTarget() {
        super(DeepLinkPath.EQUITY_ADVANCED_CHART.getPath(), false, false, true, true, false, null, 102, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        UUID uuid;
        UUID uuid2;
        LazyMoshi moshi;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("instrument_id");
        if (queryParameter != null) {
            try {
                uuid = StringsKt.toUuid(queryParameter);
            } catch (IllegalArgumentException unused) {
                uuid = null;
            }
            uuid2 = uuid;
        } else {
            uuid2 = null;
        }
        if (uuid2 != null) {
            String queryParameter2 = deeplinkContext.getUri().getQueryParameter("show_in_tab");
            if (queryParameter2 == null) {
                queryParameter2 = "false";
            }
            boolean z = Boolean.parseBoolean(queryParameter2);
            Historical.Span spanFromServerValue = Historical.Span.INSTANCE.fromServerValue(deeplinkContext.getUri().getQueryParameter("chart_span"));
            String queryParameter3 = deeplinkContext.getUri().getQueryParameter("selected_indicators");
            try {
                moshi = ((Component) EntryPoints.applicationEntryPoint(deeplinkContext.getContext())).getMoshi();
                Types types = Types.INSTANCE;
            } catch (JsonDataException e) {
                Timber.INSTANCE.mo3363w(e);
            }
            List list = queryParameter3 != null ? (List) moshi.adapter(new TypeToken<List<? extends ApiTechnicalIndicator>>() { // from class: com.robinhood.android.deeplink.targets.EquityAdvancedChartDeeplinkTarget$getIntents$$inlined$getAdapter$1
            }.getType()).fromJson(queryParameter3) : null;
            String queryParameter4 = deeplinkContext.getUri().getQueryParameter("hide_extended_hours");
            boolean z2 = Boolean.parseBoolean(queryParameter4 != null ? queryParameter4 : "false");
            String queryParameter5 = deeplinkContext.getUri().getQueryParameter("source");
            if (deeplinkContext.getExperimentState(BlackWidowAdvancedChartExperiment.INSTANCE)) {
                Navigator navigator = deeplinkContext.getNavigator();
                Context context = deeplinkContext.getContext();
                BlackWidowAdvancedChartFragmentKey2 blackWidowAdvancedChartFragmentKey2 = BlackWidowAdvancedChartFragmentKey2.EQUITY;
                if (queryParameter5 == null) {
                    queryParameter5 = "deeplink";
                }
                return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(navigator, context, new BlackWidowAdvancedChartFragmentKey(uuid2, blackWidowAdvancedChartFragmentKey2, queryParameter5, false, 8, null), false, false, false, null, false, true, false, false, false, null, false, 8052, null)};
            }
            return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new AdvancedChartFragmentKey(uuid2, null, null, true, null, (spanFromServerValue == null && list == null) ? null : new AdvancedChartFragmentKey.AlertArgs(spanFromServerValue, z2, queryParameter5, list), 20, null), false, z, false, null, false, false, false, false, false, null, false, 8180, null)};
        }
        return new Intent[0];
    }
}
