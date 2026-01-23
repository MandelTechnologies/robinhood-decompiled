package io.sentry;

import io.sentry.util.Objects;
import java.security.SecureRandom;

/* loaded from: classes21.dex */
final class TracesSampler {
    private static final Double DEFAULT_TRACES_SAMPLE_RATE = Double.valueOf(1.0d);
    private final SentryOptions options;
    private final SecureRandom random;

    public TracesSampler(SentryOptions sentryOptions) {
        this((SentryOptions) Objects.requireNonNull(sentryOptions, "options are required"), new SecureRandom());
    }

    TracesSampler(SentryOptions sentryOptions, SecureRandom secureRandom) {
        this.options = sentryOptions;
        this.random = secureRandom;
    }

    TracesSamplingDecision sample(SamplingContext samplingContext) {
        TracesSamplingDecision samplingDecision = samplingContext.getTransactionContext().getSamplingDecision();
        if (samplingDecision != null) {
            return samplingDecision;
        }
        this.options.getProfilesSampler();
        Double profilesSampleRate = this.options.getProfilesSampleRate();
        Boolean boolValueOf = Boolean.valueOf(profilesSampleRate != null && sample(profilesSampleRate));
        this.options.getTracesSampler();
        TracesSamplingDecision parentSamplingDecision = samplingContext.getTransactionContext().getParentSamplingDecision();
        if (parentSamplingDecision != null) {
            return parentSamplingDecision;
        }
        Double tracesSampleRate = this.options.getTracesSampleRate();
        Double d = Boolean.TRUE.equals(this.options.getEnableTracing()) ? DEFAULT_TRACES_SAMPLE_RATE : null;
        if (tracesSampleRate == null) {
            tracesSampleRate = d;
        }
        Double dValueOf = tracesSampleRate == null ? null : Double.valueOf(tracesSampleRate.doubleValue() / Math.pow(2.0d, this.options.getBackpressureMonitor().getDownsampleFactor()));
        if (dValueOf != null) {
            return new TracesSamplingDecision(Boolean.valueOf(sample(dValueOf)), dValueOf, boolValueOf, profilesSampleRate);
        }
        Boolean bool = Boolean.FALSE;
        return new TracesSamplingDecision(bool, null, bool, null);
    }

    private boolean sample(Double d) {
        return d.doubleValue() >= this.random.nextDouble();
    }
}
