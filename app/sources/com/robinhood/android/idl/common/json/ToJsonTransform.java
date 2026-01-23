package com.robinhood.android.idl.common.json;

import com.squareup.moshi.JsonQualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.function.UnaryOperator;
import kotlin.Metadata;

/* compiled from: ToJsonTransform.kt */
@Retention(RetentionPolicy.RUNTIME)
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0014\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003R\u001b\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/idl/common/json/ToJsonTransform;", "", "objectClass", "Lkotlin/reflect/KClass;", "Ljava/util/function/UnaryOperator;", "()Ljava/lang/Class;", "lib-serialization_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JsonQualifier
/* loaded from: classes17.dex */
public @interface ToJsonTransform {
    Class<? extends UnaryOperator<?>> objectClass();
}
