package com.robinhood.api.utils;

import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.SimpleVariant;

/* compiled from: ThrowableTransformers.kt */
@kotlin.Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/api/utils/NonFatalDeserializationFailureExperiment;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.api.utils.NonFatalDeserializationFailureExperiment, reason: use source file name */
/* loaded from: classes20.dex */
public final class ThrowableTransformers2 extends Experiment<SimpleVariant> {
    public static final ThrowableTransformers2 INSTANCE = new ThrowableTransformers2();

    private ThrowableTransformers2() {
        super("android-non-fatal-response-deserialization-failure", null, 2, null);
    }
}
