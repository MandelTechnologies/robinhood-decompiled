package io.sentry;

import io.sentry.SentryOptions;
import io.sentry.metrics.EncodedMetrics;
import io.sentry.metrics.IMetricsClient;
import io.sentry.metrics.Metric;
import io.sentry.metrics.MetricsHelper;
import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes14.dex */
public final class MetricsAggregator implements IMetricsAggregator, Runnable, Closeable {
    private static final Charset UTF8 = Charset.forName("UTF-8");
    private final NavigableMap<Long, Map<String, Metric>> buckets;
    private final IMetricsClient client;
    private final SentryDateProvider dateProvider;
    private volatile ISentryExecutorService executorService;
    private volatile boolean flushScheduled;
    private volatile boolean isClosed;
    private final ILogger logger;
    private final int maxWeight;
    private final AtomicInteger totalBucketsWeight;

    /* JADX WARN: Illegal instructions before constructor call */
    public MetricsAggregator(SentryOptions sentryOptions, IMetricsClient iMetricsClient) {
        ILogger logger = sentryOptions.getLogger();
        SentryDateProvider dateProvider = sentryOptions.getDateProvider();
        sentryOptions.getBeforeEmitMetricCallback();
        this(iMetricsClient, logger, dateProvider, 100000, null, NoOpSentryExecutorService.getInstance());
    }

    public MetricsAggregator(IMetricsClient iMetricsClient, ILogger iLogger, SentryDateProvider sentryDateProvider, int i, SentryOptions.BeforeEmitMetricCallback beforeEmitMetricCallback, ISentryExecutorService iSentryExecutorService) {
        this.isClosed = false;
        this.flushScheduled = false;
        this.buckets = new ConcurrentSkipListMap();
        this.totalBucketsWeight = new AtomicInteger();
        this.client = iMetricsClient;
        this.logger = iLogger;
        this.dateProvider = sentryDateProvider;
        this.maxWeight = i;
        this.executorService = iSentryExecutorService;
    }

    public void flush(boolean z) {
        if (!z && isOverWeight()) {
            this.logger.log(SentryLevel.INFO, "Metrics: total weight exceeded, flushing all buckets", new Object[0]);
            z = true;
        }
        this.flushScheduled = false;
        Set<Long> flushableBuckets = getFlushableBuckets(z);
        if (flushableBuckets.isEmpty()) {
            this.logger.log(SentryLevel.DEBUG, "Metrics: nothing to flush", new Object[0]);
            return;
        }
        this.logger.log(SentryLevel.DEBUG, "Metrics: flushing " + flushableBuckets.size() + " buckets", new Object[0]);
        HashMap map = new HashMap();
        int size = 0;
        for (Long l : flushableBuckets) {
            l.longValue();
            Map<String, Metric> mapRemove = this.buckets.remove(l);
            if (mapRemove != null) {
                synchronized (mapRemove) {
                    this.totalBucketsWeight.addAndGet(-getBucketWeight(mapRemove));
                    size += mapRemove.size();
                    map.put(l, mapRemove);
                }
            }
        }
        if (size == 0) {
            this.logger.log(SentryLevel.DEBUG, "Metrics: only empty buckets found", new Object[0]);
        } else {
            this.logger.log(SentryLevel.DEBUG, "Metrics: capturing metrics", new Object[0]);
            this.client.captureMetrics(new EncodedMetrics(map));
        }
    }

    private boolean isOverWeight() {
        return this.buckets.size() + this.totalBucketsWeight.get() >= this.maxWeight;
    }

    private static int getBucketWeight(Map<String, Metric> map) {
        Iterator<Metric> it = map.values().iterator();
        int weight = 0;
        while (it.hasNext()) {
            weight += it.next().getWeight();
        }
        return weight;
    }

    private Set<Long> getFlushableBuckets(boolean z) {
        if (z) {
            return this.buckets.keySet();
        }
        return this.buckets.headMap(Long.valueOf(MetricsHelper.getTimeBucketKey(MetricsHelper.getCutoffTimestampMs(nowMillis()))), true).keySet();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this) {
            this.isClosed = true;
            this.executorService.close(0L);
        }
        flush(true);
    }

    @Override // java.lang.Runnable
    public void run() {
        flush(false);
        synchronized (this) {
            try {
                if (!this.isClosed && !this.buckets.isEmpty()) {
                    this.executorService.schedule(this, 5000L);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private long nowMillis() {
        return TimeUnit.NANOSECONDS.toMillis(this.dateProvider.now().nanoTimestamp());
    }
}
