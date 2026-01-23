package microgram.p507ui.sdui;

import com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo;
import com.robinhood.android.futures.charts.DisplaySpans;
import com.robinhood.models.api.pathfinder.userview.ApiRenderablePlatforms;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.Enums4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiDisplaySpan;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", DisplaySpans.ALL, "DAY", "HOUR", "MONTH", "THE_3_MONTH", "THE_4_HOUR", "THE_5_YEAR", "UNKNOWN", "WEEK", "YEAR", DisplaySpans.YTD, "Companion", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final class SduiDisplaySpan {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SduiDisplaySpan[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String value;

    @SerialName(ApiRenderablePlatforms.VERSIONS_ALL)
    public static final SduiDisplaySpan ALL = new SduiDisplaySpan(DisplaySpans.ALL, 0, ApiRenderablePlatforms.VERSIONS_ALL);

    @SerialName("day")
    public static final SduiDisplaySpan DAY = new SduiDisplaySpan("DAY", 1, "day");

    @SerialName("hour")
    public static final SduiDisplaySpan HOUR = new SduiDisplaySpan("HOUR", 2, "hour");

    @SerialName(ManagedDashboardOverviewDuxo.DEFAULT_SPAN_RETURNS)
    public static final SduiDisplaySpan MONTH = new SduiDisplaySpan("MONTH", 3, ManagedDashboardOverviewDuxo.DEFAULT_SPAN_RETURNS);

    @SerialName("3month")
    public static final SduiDisplaySpan THE_3_MONTH = new SduiDisplaySpan("THE_3_MONTH", 4, "3month");

    @SerialName("4hour")
    public static final SduiDisplaySpan THE_4_HOUR = new SduiDisplaySpan("THE_4_HOUR", 5, "4hour");

    @SerialName("5year")
    public static final SduiDisplaySpan THE_5_YEAR = new SduiDisplaySpan("THE_5_YEAR", 6, "5year");

    @SerialName("UNKNOWN")
    public static final SduiDisplaySpan UNKNOWN = new SduiDisplaySpan("UNKNOWN", 7, "UNKNOWN");

    @SerialName("week")
    public static final SduiDisplaySpan WEEK = new SduiDisplaySpan("WEEK", 8, "week");

    @SerialName("year")
    public static final SduiDisplaySpan YEAR = new SduiDisplaySpan("YEAR", 9, "year");

    @SerialName("ytd")
    public static final SduiDisplaySpan YTD = new SduiDisplaySpan(DisplaySpans.YTD, 10, "ytd");

    private static final /* synthetic */ SduiDisplaySpan[] $values() {
        return new SduiDisplaySpan[]{ALL, DAY, HOUR, MONTH, THE_3_MONTH, THE_4_HOUR, THE_5_YEAR, UNKNOWN, WEEK, YEAR, YTD};
    }

    public static EnumEntries<SduiDisplaySpan> getEntries() {
        return $ENTRIES;
    }

    public static SduiDisplaySpan valueOf(String str) {
        return (SduiDisplaySpan) Enum.valueOf(SduiDisplaySpan.class, str);
    }

    public static SduiDisplaySpan[] values() {
        return (SduiDisplaySpan[]) $VALUES.clone();
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiDisplaySpan$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiDisplaySpan;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) SduiDisplaySpan.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<SduiDisplaySpan> serializer() {
            return get$cachedSerializer();
        }
    }

    private SduiDisplaySpan(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        SduiDisplaySpan[] sduiDisplaySpanArr$values = $values();
        $VALUES = sduiDisplaySpanArr$values;
        $ENTRIES = EnumEntries2.enumEntries(sduiDisplaySpanArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: microgram.ui.sdui.SduiDisplaySpan.Companion.1
            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<Object> invoke() {
                return Enums4.createAnnotatedEnumSerializer("microgram.ui.sdui.SduiDisplaySpan", SduiDisplaySpan.values(), new String[]{ApiRenderablePlatforms.VERSIONS_ALL, "day", "hour", ManagedDashboardOverviewDuxo.DEFAULT_SPAN_RETURNS, "3month", "4hour", "5year", "UNKNOWN", "week", "year", "ytd"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null}, null);
            }
        });
    }
}
