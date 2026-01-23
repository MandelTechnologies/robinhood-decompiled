package io.sentry.metrics;

import com.robinhood.models.api.pathfinder.userview.ApiRenderablePlatforms;
import io.sentry.MeasurementUnit;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes14.dex */
public final class MetricsHelper {
    private static final Pattern UNIT_PATTERN = Pattern.compile("\\W+");
    private static final Pattern NAME_PATTERN = Pattern.compile("[^\\w\\-.]+");
    private static final Pattern TAG_KEY_PATTERN = Pattern.compile("[^\\w\\-./]+");
    private static long FLUSH_SHIFT_MS = (long) (new SecureRandom().nextFloat() * 10000.0f);

    public static long getTimeBucketKey(long j) {
        long j2 = ((j / 1000) / 10) * 10;
        return j >= 0 ? j2 : j2 - 1;
    }

    public static long getCutoffTimestampMs(long j) {
        return (j - 10000) - FLUSH_SHIFT_MS;
    }

    public static String sanitizeUnit(String str) {
        return UNIT_PATTERN.matcher(str).replaceAll("");
    }

    public static String sanitizeName(String str) {
        return NAME_PATTERN.matcher(str).replaceAll("_");
    }

    public static String sanitizeTagKey(String str) {
        return TAG_KEY_PATTERN.matcher(str).replaceAll("");
    }

    public static String sanitizeTagValue(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\n') {
                sb.append("\\n");
            } else if (cCharAt == '\r') {
                sb.append("\\r");
            } else if (cCharAt == '\t') {
                sb.append("\\t");
            } else if (cCharAt == '\\') {
                sb.append("\\\\");
            } else if (cCharAt == '|') {
                sb.append("\\u{7c}");
            } else if (cCharAt == ',') {
                sb.append("\\u{2c}");
            } else {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    private static String getUnitName(MeasurementUnit measurementUnit) {
        return measurementUnit != null ? measurementUnit.apiName() : ApiRenderablePlatforms.VERSIONS_NONE;
    }

    public static void encodeMetrics(long j, Collection<Metric> collection, StringBuilder sb) {
        for (Metric metric : collection) {
            sb.append(sanitizeName(metric.getKey()));
            sb.append("@");
            sb.append(sanitizeUnit(getUnitName(metric.getUnit())));
            for (Object obj : metric.serialize()) {
                sb.append(":");
                sb.append(obj);
            }
            sb.append("|");
            sb.append(metric.getType().statsdCode);
            Map<String, String> tags = metric.getTags();
            if (tags != null) {
                sb.append("|#");
                boolean z = true;
                for (Map.Entry<String, String> entry : tags.entrySet()) {
                    String strSanitizeTagKey = sanitizeTagKey(entry.getKey());
                    if (z) {
                        z = false;
                    } else {
                        sb.append(",");
                    }
                    sb.append(strSanitizeTagKey);
                    sb.append(":");
                    sb.append(sanitizeTagValue(entry.getValue()));
                }
            }
            sb.append("|T");
            sb.append(j);
            sb.append("\n");
        }
    }
}
