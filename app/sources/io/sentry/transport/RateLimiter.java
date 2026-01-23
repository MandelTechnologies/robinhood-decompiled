package io.sentry.transport;

import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import io.sentry.DataCategory;
import io.sentry.Hint;
import io.sentry.SentryEnvelope;
import io.sentry.SentryEnvelopeItem;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.clientreport.DiscardReason;
import io.sentry.hints.Retryable;
import io.sentry.hints.SubmissionResult;
import io.sentry.util.CollectionUtils;
import io.sentry.util.HintUtils;
import io.sentry.util.StringUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes21.dex */
public final class RateLimiter {
    private final ICurrentDateProvider currentDateProvider;
    private final SentryOptions options;
    private final Map<DataCategory, Date> sentryRetryAfterLimit;

    public RateLimiter(ICurrentDateProvider iCurrentDateProvider, SentryOptions sentryOptions) {
        this.sentryRetryAfterLimit = new ConcurrentHashMap();
        this.currentDateProvider = iCurrentDateProvider;
        this.options = sentryOptions;
    }

    public RateLimiter(SentryOptions sentryOptions) {
        this(CurrentDateProvider.getInstance(), sentryOptions);
    }

    public SentryEnvelope filter(SentryEnvelope sentryEnvelope, Hint hint) {
        ArrayList arrayList = null;
        for (SentryEnvelopeItem sentryEnvelopeItem : sentryEnvelope.getItems()) {
            if (isRetryAfter(sentryEnvelopeItem.getHeader().getType().getItemType())) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(sentryEnvelopeItem);
                this.options.getClientReportRecorder().recordLostEnvelopeItem(DiscardReason.RATELIMIT_BACKOFF, sentryEnvelopeItem);
            }
        }
        if (arrayList == null) {
            return sentryEnvelope;
        }
        this.options.getLogger().log(SentryLevel.INFO, "%d items will be dropped due rate limiting.", Integer.valueOf(arrayList.size()));
        ArrayList arrayList2 = new ArrayList();
        for (SentryEnvelopeItem sentryEnvelopeItem2 : sentryEnvelope.getItems()) {
            if (!arrayList.contains(sentryEnvelopeItem2)) {
                arrayList2.add(sentryEnvelopeItem2);
            }
        }
        if (arrayList2.isEmpty()) {
            this.options.getLogger().log(SentryLevel.INFO, "Envelope discarded due all items rate limited.", new Object[0]);
            markHintWhenSendingFailed(hint, false);
            return null;
        }
        return new SentryEnvelope(sentryEnvelope.getHeader(), arrayList2);
    }

    public boolean isActiveForCategory(DataCategory dataCategory) {
        Date date;
        Date date2 = new Date(this.currentDateProvider.getCurrentTimeMillis());
        Date date3 = this.sentryRetryAfterLimit.get(DataCategory.All);
        if (date3 != null && !date2.after(date3)) {
            return true;
        }
        if (DataCategory.Unknown.equals(dataCategory) || (date = this.sentryRetryAfterLimit.get(dataCategory)) == null) {
            return false;
        }
        return !date2.after(date);
    }

    public boolean isAnyRateLimitActive() {
        Date date = new Date(this.currentDateProvider.getCurrentTimeMillis());
        Iterator<DataCategory> it = this.sentryRetryAfterLimit.keySet().iterator();
        while (it.hasNext()) {
            Date date2 = this.sentryRetryAfterLimit.get(it.next());
            if (date2 != null && !date.after(date2)) {
                return true;
            }
        }
        return false;
    }

    private static void markHintWhenSendingFailed(Hint hint, final boolean z) {
        HintUtils.runIfHasType(hint, SubmissionResult.class, new HintUtils.SentryConsumer() { // from class: io.sentry.transport.RateLimiter$$ExternalSyntheticLambda0
            @Override // io.sentry.util.HintUtils.SentryConsumer
            public final void accept(Object obj) {
                ((SubmissionResult) obj).setResult(false);
            }
        });
        HintUtils.runIfHasType(hint, Retryable.class, new HintUtils.SentryConsumer() { // from class: io.sentry.transport.RateLimiter$$ExternalSyntheticLambda1
            @Override // io.sentry.util.HintUtils.SentryConsumer
            public final void accept(Object obj) {
                ((Retryable) obj).setRetry(z);
            }
        });
    }

    private boolean isRetryAfter(String str) {
        return isActiveForCategory(getCategoryFromItemType(str));
    }

    private DataCategory getCategoryFromItemType(String str) {
        str.getClass();
        switch (str) {
            case "attachment":
                return DataCategory.Attachment;
            case "statsd":
                return DataCategory.MetricBucket;
            case "profile":
                return DataCategory.Profile;
            case "event":
                return DataCategory.Error;
            case "check_in":
                return DataCategory.Monitor;
            case "session":
                return DataCategory.Session;
            case "transaction":
                return DataCategory.Transaction;
            default:
                return DataCategory.Unknown;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c8 A[PHI: r2 r3
      0x00c8: PHI (r2v6 java.lang.String[]) = (r2v5 java.lang.String[]), (r2v5 java.lang.String[]), (r2v11 java.lang.String[]) binds: [B:11:0x002b, B:13:0x0035, B:62:0x00c8] A[DONT_GENERATE, DONT_INLINE]
      0x00c8: PHI (r3v2 int) = (r3v1 int), (r3v1 int), (r3v4 int) binds: [B:11:0x002b, B:13:0x0035, B:62:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void updateRetryAfterLimits(String str, String str2, int i) {
        String[] strArr;
        int i2;
        String[] strArr2;
        int i3;
        if (str == null) {
            if (i == 429) {
                applyRetryAfterOnlyIfLonger(DataCategory.All, new Date(this.currentDateProvider.getCurrentTimeMillis() + parseRetryAfterOrDefault(str2)));
                return;
            }
            return;
        }
        int i4 = -1;
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        int i5 = 0;
        int i6 = 0;
        while (i6 < length) {
            String[] strArrSplit2 = strArrSplit[i6].replace(PlaceholderUtils.XXShortPlaceholderText, "").split(":", i4);
            String str3 = strArrSplit2.length > 4 ? strArrSplit2[4] : null;
            if (strArrSplit2.length > 0) {
                long retryAfterOrDefault = parseRetryAfterOrDefault(strArrSplit2[i5]);
                if (strArrSplit2.length > 1) {
                    String str4 = strArrSplit2[1];
                    Date date = new Date(this.currentDateProvider.getCurrentTimeMillis() + retryAfterOrDefault);
                    if (str4 != null && !str4.isEmpty()) {
                        String[] strArrSplit3 = str4.split(";", i4);
                        int length2 = strArrSplit3.length;
                        int i7 = i5;
                        while (i7 < length2) {
                            String str5 = strArrSplit3[i7];
                            DataCategory dataCategoryValueOf = DataCategory.Unknown;
                            try {
                                String strCamelCase = StringUtils.camelCase(str5);
                                if (strCamelCase != null) {
                                    dataCategoryValueOf = DataCategory.valueOf(strCamelCase);
                                    strArr2 = strArrSplit;
                                } else {
                                    strArr2 = strArrSplit;
                                    try {
                                        this.options.getLogger().log(SentryLevel.ERROR, "Couldn't capitalize: %s", str5);
                                    } catch (IllegalArgumentException e) {
                                        e = e;
                                        this.options.getLogger().log(SentryLevel.INFO, e, "Unknown category: %s", str5);
                                        if (DataCategory.Unknown.equals(dataCategoryValueOf)) {
                                        }
                                        i7++;
                                        i4 = i3;
                                        strArrSplit = strArr2;
                                    }
                                }
                            } catch (IllegalArgumentException e2) {
                                e = e2;
                                strArr2 = strArrSplit;
                            }
                            if (DataCategory.Unknown.equals(dataCategoryValueOf)) {
                                if (!DataCategory.MetricBucket.equals(dataCategoryValueOf) || str3 == null || str3.equals("")) {
                                    i3 = -1;
                                } else {
                                    i3 = -1;
                                    String[] strArrSplit4 = str3.split(";", -1);
                                    if (strArrSplit4.length <= 0 || CollectionUtils.contains(strArrSplit4, "custom")) {
                                    }
                                }
                                applyRetryAfterOnlyIfLonger(dataCategoryValueOf, date);
                            } else {
                                i3 = -1;
                            }
                            i7++;
                            i4 = i3;
                            strArrSplit = strArr2;
                        }
                        strArr = strArrSplit;
                        i2 = i4;
                    } else {
                        strArr = strArrSplit;
                        i2 = i4;
                        applyRetryAfterOnlyIfLonger(DataCategory.All, date);
                    }
                } else {
                    strArr = strArrSplit;
                    i2 = i4;
                }
            }
            i6++;
            i4 = i2;
            i5 = 0;
            strArrSplit = strArr;
        }
    }

    private void applyRetryAfterOnlyIfLonger(DataCategory dataCategory, Date date) {
        Date date2 = this.sentryRetryAfterLimit.get(dataCategory);
        if (date2 == null || date.after(date2)) {
            this.sentryRetryAfterLimit.put(dataCategory, date);
        }
    }

    private long parseRetryAfterOrDefault(String str) {
        if (str == null) {
            return 60000L;
        }
        try {
            return (long) (Double.parseDouble(str) * 1000.0d);
        } catch (NumberFormatException unused) {
            return 60000L;
        }
    }
}
