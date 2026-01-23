package com.squareup.workflow1.p415ui;

import com.robinhood.android.eventcontracts.analytics.EventAnalyticsString;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ViewEnvironment.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ4\u0010\r\u001a\u00020\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00012\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00028\u00000\u000bH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R'\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m3636d2 = {"Lcom/squareup/workflow1/ui/ViewEnvironment;", "", "", "Lcom/squareup/workflow1/ui/ViewEnvironmentKey;", "map", "<init>", "(Ljava/util/Map;)V", "T", "key", "get", "(Lcom/squareup/workflow1/ui/ViewEnvironmentKey;)Ljava/lang/Object;", "Lkotlin/Pair;", EventAnalyticsString.CONTROL_CONTRACT_SELECTOR_PAIR_MODE, "plus", "(Lkotlin/Pair;)Lcom/squareup/workflow1/ui/ViewEnvironment;", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/util/Map;", "getMap", "()Ljava/util/Map;", "wf1-core-android"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ViewEnvironment {
    private final Map<ViewEnvironmentKey<?>, Object> map;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewEnvironment() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ViewEnvironment(Map<ViewEnvironmentKey<?>, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.map = map;
    }

    public /* synthetic */ ViewEnvironment(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MapsKt.emptyMap() : map);
    }

    public final Map<ViewEnvironmentKey<?>, Object> getMap() {
        return this.map;
    }

    public final <T> T get(ViewEnvironmentKey<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        T t = (T) this.map.get(key);
        if (t == null) {
            t = null;
        }
        return t == null ? key.getDefault() : t;
    }

    public final <T> ViewEnvironment plus(Tuples2<? extends ViewEnvironmentKey<T>, ? extends T> pair) {
        Intrinsics.checkNotNullParameter(pair, "pair");
        return new ViewEnvironment(MapsKt.plus(this.map, pair));
    }

    public String toString() {
        return "ViewEnvironment(" + this.map + ')';
    }

    public boolean equals(Object other) {
        ViewEnvironment viewEnvironment = other instanceof ViewEnvironment ? (ViewEnvironment) other : null;
        if (viewEnvironment == null) {
            return false;
        }
        return Intrinsics.areEqual(viewEnvironment.getMap(), getMap());
    }

    public int hashCode() {
        return this.map.hashCode();
    }
}
