package io.github.inflationx.viewpump;

import io.github.inflationx.viewpump.internal.FallbackViewCreationInterceptor;
import io.github.inflationx.viewpump.internal.InterceptorChain;
import io.github.inflationx.viewpump.internal.ReflectiveFallbackViewCreator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ViewPump.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00152\u00020\u0001:\u0002\u0016\u0015B/\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0004\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0006\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0007\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\b\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010¨\u0006\u0017"}, m3636d2 = {"Lio/github/inflationx/viewpump/ViewPump;", "", "", "Lio/github/inflationx/viewpump/Interceptor;", "interceptors", "", "isReflection", "isCustomViewCreation", "isStoreLayoutResId", "<init>", "(Ljava/util/List;ZZZ)V", "Lio/github/inflationx/viewpump/InflateRequest;", "originalRequest", "Lio/github/inflationx/viewpump/InflateResult;", "inflate", "(Lio/github/inflationx/viewpump/InflateRequest;)Lio/github/inflationx/viewpump/InflateResult;", "Ljava/util/List;", "()Ljava/util/List;", "Z", "()Z", "interceptorsWithFallback", "Companion", "Builder", "viewpump_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class ViewPump {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<ReflectiveFallbackViewCreator> reflectiveFallbackViewCreator$delegate = LazyKt.lazy(new Function0<ReflectiveFallbackViewCreator>() { // from class: io.github.inflationx.viewpump.ViewPump$Companion$reflectiveFallbackViewCreator$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ReflectiveFallbackViewCreator invoke() {
            return new ReflectiveFallbackViewCreator();
        }
    });
    private final List<Interceptor> interceptors;
    private final List<Interceptor> interceptorsWithFallback;
    private final boolean isCustomViewCreation;
    private final boolean isReflection;
    private final boolean isStoreLayoutResId;

    public /* synthetic */ ViewPump(List list, boolean z, boolean z2, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, z, z2, z3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ViewPump(List<? extends Interceptor> list, boolean z, boolean z2, boolean z3) {
        this.interceptors = list;
        this.isReflection = z;
        this.isCustomViewCreation = z2;
        this.isStoreLayoutResId = z3;
        this.interceptorsWithFallback = CollectionsKt.toMutableList((Collection) CollectionsKt.plus((Collection<? extends FallbackViewCreationInterceptor>) list, new FallbackViewCreationInterceptor()));
    }

    @JvmName
    /* renamed from: isReflection, reason: from getter */
    public final boolean getIsReflection() {
        return this.isReflection;
    }

    @JvmName
    /* renamed from: isCustomViewCreation, reason: from getter */
    public final boolean getIsCustomViewCreation() {
        return this.isCustomViewCreation;
    }

    @JvmName
    /* renamed from: isStoreLayoutResId, reason: from getter */
    public final boolean getIsStoreLayoutResId() {
        return this.isStoreLayoutResId;
    }

    public final InflateResult inflate(InflateRequest originalRequest) {
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        return new InterceptorChain(this.interceptorsWithFallback, 0, originalRequest).proceed(originalRequest);
    }

    /* compiled from: ViewPump.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, m3636d2 = {"Lio/github/inflationx/viewpump/ViewPump$Builder;", "", "<init>", "()V", "Lio/github/inflationx/viewpump/Interceptor;", "interceptor", "addInterceptor", "(Lio/github/inflationx/viewpump/Interceptor;)Lio/github/inflationx/viewpump/ViewPump$Builder;", "Lio/github/inflationx/viewpump/ViewPump;", "build", "()Lio/github/inflationx/viewpump/ViewPump;", "", "interceptors", "Ljava/util/List;", "", "reflection", "Z", "customViewCreation", "storeLayoutResId", "viewpump_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class Builder {
        private boolean storeLayoutResId;
        private final List<Interceptor> interceptors = new ArrayList();
        private boolean reflection = true;
        private boolean customViewCreation = true;

        public final Builder addInterceptor(Interceptor interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            this.interceptors.add(interceptor);
            return this;
        }

        public final ViewPump build() {
            return new ViewPump(CollectionsKt.toList(this.interceptors), this.reflection, this.customViewCreation, this.storeLayoutResId, null);
        }
    }

    /* compiled from: ViewPump.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lio/github/inflationx/viewpump/ViewPump$Companion;", "", "<init>", "()V", "Lio/github/inflationx/viewpump/ViewPump$Builder;", "builder", "()Lio/github/inflationx/viewpump/ViewPump$Builder;", "Lio/github/inflationx/viewpump/ViewPump;", "INSTANCE", "Lio/github/inflationx/viewpump/ViewPump;", "viewpump_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Builder builder() {
            return new Builder();
        }
    }
}
