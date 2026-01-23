package com.robinhood.scarlet.registry;

import android.view.View;
import android.view.ViewGroup;
import com.robinhood.scarlet.ScarletManager2;
import io.github.inflationx.viewpump.InflateRequest;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExclusionRegistry.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0002\f\rB\u001f\b\u0002\u0012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u001c\u0010\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/scarlet/registry/ExclusionRegistry;", "", "excludedParentViewTypes", "", "Ljava/lang/Class;", "Landroid/view/View;", "<init>", "(Ljava/util/Set;)V", "shouldBeExcluded", "", "request", "Lio/github/inflationx/viewpump/InflateRequest;", "Builder", "Companion", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class ExclusionRegistry {
    private final Set<Class<? extends View>> excludedParentViewTypes;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ ExclusionRegistry(Set set, DefaultConstructorMarker defaultConstructorMarker) {
        this(set);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ExclusionRegistry(Set<? extends Class<? extends View>> set) {
        this.excludedParentViewTypes = set;
    }

    public final boolean shouldBeExcluded(InflateRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        View parent = request.getParent();
        if (parent == null) {
            return false;
        }
        return ScarletManager2.getElementProperties(parent).getIsExcluded() || this.excludedParentViewTypes.contains(parent.getClass());
    }

    /* compiled from: ExclusionRegistry.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\u00002\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006J\u0015\u0010\b\u001a\u00020\u0000\"\n\b\u0000\u0010\n\u0018\u0001*\u00020\u0007H\u0086\bJ\u0006\u0010\u000b\u001a\u00020\fR\u001c\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/scarlet/registry/ExclusionRegistry$Builder;", "", "<init>", "()V", "excludedParentViewTypes", "", "Ljava/lang/Class;", "Landroid/view/ViewGroup;", "excludeDescendantsOf", "viewType", "V", "build", "Lcom/robinhood/scarlet/registry/ExclusionRegistry;", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private final Set<Class<? extends ViewGroup>> excludedParentViewTypes = new LinkedHashSet();

        public final Builder excludeDescendantsOf(Class<? extends ViewGroup> viewType) {
            Intrinsics.checkNotNullParameter(viewType, "viewType");
            this.excludedParentViewTypes.add(viewType);
            return this;
        }

        public final /* synthetic */ <V extends ViewGroup> Builder excludeDescendantsOf() {
            Intrinsics.reifiedOperationMarker(4, "V");
            return excludeDescendantsOf(ViewGroup.class);
        }

        public final ExclusionRegistry build() {
            return new ExclusionRegistry(this.excludedParentViewTypes, null);
        }
    }

    /* compiled from: ExclusionRegistry.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0086\bø\u0001\u0000J\u0006\u0010\u000b\u001a\u00020\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/scarlet/registry/ExclusionRegistry$Companion;", "", "<init>", "()V", "buildWith", "Lcom/robinhood/scarlet/registry/ExclusionRegistry;", "block", "Lkotlin/Function1;", "Lcom/robinhood/scarlet/registry/ExclusionRegistry$Builder;", "", "Lkotlin/ExtensionFunctionType;", "empty", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ExclusionRegistry buildWith(Function1<? super Builder, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            Builder builder = new Builder();
            block.invoke(builder);
            return builder.build();
        }

        public final ExclusionRegistry empty() {
            return new ExclusionRegistry(SetsKt.emptySet(), null);
        }
    }
}
