package com.squareup.workflow1.p415ui;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* compiled from: ViewEnvironment.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0086\u0002J\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0012\u0010\u0006\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/squareup/workflow1/ui/ViewEnvironmentKey;", "T", "", "type", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;)V", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "getDefault", "()Ljava/lang/Object;", "equals", "", "other", "hashCode", "", "toString", "", "wf1-core-android"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class ViewEnvironmentKey<T> {
    private final KClass<T> type;

    public abstract T getDefault();

    public ViewEnvironmentKey(KClass<T> type2) {
        Intrinsics.checkNotNullParameter(type2, "type");
        this.type = type2;
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && !Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(getClass()), Reflection.getOrCreateKotlinClass(other.getClass()))) {
            return false;
        }
        KClass<T> kClass = this.type;
        if (other != null) {
            return Intrinsics.areEqual(kClass, ((ViewEnvironmentKey) other).type);
        }
        throw new NullPointerException("null cannot be cast to non-null type com.squareup.workflow1.ui.ViewEnvironmentKey<*>");
    }

    public final int hashCode() {
        return this.type.hashCode();
    }

    public String toString() {
        return "ViewEnvironmentKey(" + this.type + ")-" + super.toString();
    }
}
