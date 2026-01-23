package com.robinhood.hammer.android;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.Repeatable;
import kotlin.jvm.internal.RepeatableContainer;

/* compiled from: GenerateMockLoadingState.kt */
@Target({ElementType.TYPE})
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0005R\u000f\u0010\u0004\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/hammer/android/MockOverride;", "", "parameterName", "", "parameterValue", "()Ljava/lang/String;", "common"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Repeatable
@kotlin.annotation.Target
@java.lang.annotation.Repeatable(Container.class)
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.robinhood.hammer.android.MockOverride, reason: use source file name */
/* loaded from: classes15.dex */
public @interface GenerateMockLoadingState2 {

    /* compiled from: GenerateMockLoadingState.kt */
    @Target({ElementType.TYPE})
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @kotlin.annotation.Target
    @Retention(RetentionPolicy.RUNTIME)
    @RepeatableContainer
    /* renamed from: com.robinhood.hammer.android.MockOverride$Container */
    public @interface Container {
        GenerateMockLoadingState2[] value();
    }

    String parameterName();

    String parameterValue();
}
