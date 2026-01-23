package com.robinhood.android.options.optionsdb;

import com.robinhood.database.InjectedTypeConverter;
import com.robinhood.models.p320db.OptionChainSettingsTableMetric;
import com.robinhood.models.p320db.OptionChainSettingsTableMetricsUpdate;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionsRoomConverter.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\bH\u0007J\u0014\u0010\u0015\u001a\u0004\u0018\u00010\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013H\u0007J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00132\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0007J\u001a\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013H\u0007R!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR'\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0010\u0010\n¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/options/optionsdb/OptionsRoomConverter;", "Lcom/robinhood/database/InjectedTypeConverter;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "<init>", "(Lcom/robinhood/utils/moshi/LazyMoshi;)V", "optionChainSettingsTableMetricsUpdateJsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/models/db/OptionChainSettingsTableMetricsUpdate;", "getOptionChainSettingsTableMetricsUpdateJsonAdapter", "()Lcom/squareup/moshi/JsonAdapter;", "optionChainSettingsTableMetricsUpdateJsonAdapter$delegate", "Lkotlin/Lazy;", "optionChainSettingsTableMetricListJsonAdapter", "", "Lcom/robinhood/models/db/OptionChainSettingsTableMetric;", "getOptionChainSettingsTableMetricListJsonAdapter", "optionChainSettingsTableMetricListJsonAdapter$delegate", "optionChainSettingsTableMetricsUpdateToString", "", "items", "stringToOptionChainSettingsTableMetricsUpdate", "string", "optionChainSettingsTableMetricListToString", "stringToOptionChainSettingsTableMetricList", "lib-options-db_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionsRoomConverter implements InjectedTypeConverter {

    /* renamed from: optionChainSettingsTableMetricListJsonAdapter$delegate, reason: from kotlin metadata */
    private final Lazy optionChainSettingsTableMetricListJsonAdapter;

    /* renamed from: optionChainSettingsTableMetricsUpdateJsonAdapter$delegate, reason: from kotlin metadata */
    private final Lazy optionChainSettingsTableMetricsUpdateJsonAdapter;

    public OptionsRoomConverter(final LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.optionChainSettingsTableMetricsUpdateJsonAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.options.optionsdb.OptionsRoomConverter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionsRoomConverter.m2238xb10cdcad(moshi);
            }
        });
        this.optionChainSettingsTableMetricListJsonAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.options.optionsdb.OptionsRoomConverter$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionsRoomConverter.optionChainSettingsTableMetricListJsonAdapter_delegate$lambda$1(moshi);
            }
        });
    }

    private final JsonAdapter<OptionChainSettingsTableMetricsUpdate> getOptionChainSettingsTableMetricsUpdateJsonAdapter() {
        return (JsonAdapter) this.optionChainSettingsTableMetricsUpdateJsonAdapter.getValue();
    }

    private final JsonAdapter<List<OptionChainSettingsTableMetric>> getOptionChainSettingsTableMetricListJsonAdapter() {
        return (JsonAdapter) this.optionChainSettingsTableMetricListJsonAdapter.getValue();
    }

    public final String optionChainSettingsTableMetricsUpdateToString(OptionChainSettingsTableMetricsUpdate items) {
        if (items != null) {
            return getOptionChainSettingsTableMetricsUpdateJsonAdapter().toJson(items);
        }
        return null;
    }

    public final OptionChainSettingsTableMetricsUpdate stringToOptionChainSettingsTableMetricsUpdate(String string2) {
        if (string2 != null) {
            return getOptionChainSettingsTableMetricsUpdateJsonAdapter().fromJson(string2);
        }
        return null;
    }

    public final String optionChainSettingsTableMetricListToString(List<OptionChainSettingsTableMetric> items) {
        if (items != null) {
            return getOptionChainSettingsTableMetricListJsonAdapter().toJson(items);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonAdapter optionChainSettingsTableMetricListJsonAdapter_delegate$lambda$1(LazyMoshi lazyMoshi) {
        Types types = Types.INSTANCE;
        return lazyMoshi.adapter(new TypeToken<List<? extends OptionChainSettingsTableMetric>>() { // from class: com.robinhood.android.options.optionsdb.OptionsRoomConverter$optionChainSettingsTableMetricListJsonAdapter_delegate$lambda$1$$inlined$getAdapter$1
        }.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: optionChainSettingsTableMetricsUpdateJsonAdapter_delegate$lambda$0 */
    public static final JsonAdapter m2238xb10cdcad(LazyMoshi lazyMoshi) {
        Types types = Types.INSTANCE;
        return lazyMoshi.adapter(new TypeToken<OptionChainSettingsTableMetricsUpdate>() { // from class: com.robinhood.android.options.optionsdb.OptionsRoomConverter$optionChainSettingsTableMetricsUpdateJsonAdapter_delegate$lambda$0$$inlined$getAdapter$1
        }.getType());
    }

    public final List<OptionChainSettingsTableMetric> stringToOptionChainSettingsTableMetricList(String string2) {
        if (string2 != null) {
            return getOptionChainSettingsTableMetricListJsonAdapter().fromJson(string2);
        }
        return null;
    }
}
