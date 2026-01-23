package io.github.inflationx.viewpump;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InflateRequest.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u0000 #2\u00020\u0001:\u0002$#B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u0003\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u0005\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u0007\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b\t\u0010 R\u0017\u0010\u000b\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\u000b\u0010\"¨\u0006%"}, m3636d2 = {"Lio/github/inflationx/viewpump/InflateRequest;", "", "", "name", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "Landroid/view/View;", "parent", "Lio/github/inflationx/viewpump/FallbackViewCreator;", "fallbackViewCreator", "<init>", "(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;Landroid/view/View;Lio/github/inflationx/viewpump/FallbackViewCreator;)V", "Lio/github/inflationx/viewpump/InflateRequest$Builder;", "toBuilder", "()Lio/github/inflationx/viewpump/InflateRequest$Builder;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "Landroid/content/Context;", "()Landroid/content/Context;", "Landroid/util/AttributeSet;", "()Landroid/util/AttributeSet;", "Landroid/view/View;", "()Landroid/view/View;", "Lio/github/inflationx/viewpump/FallbackViewCreator;", "()Lio/github/inflationx/viewpump/FallbackViewCreator;", "Companion", "Builder", "viewpump_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class InflateRequest {
    private final AttributeSet attrs;
    private final Context context;
    private final FallbackViewCreator fallbackViewCreator;
    private final String name;
    private final View parent;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InflateRequest)) {
            return false;
        }
        InflateRequest inflateRequest = (InflateRequest) other;
        return Intrinsics.areEqual(this.name, inflateRequest.name) && Intrinsics.areEqual(this.context, inflateRequest.context) && Intrinsics.areEqual(this.attrs, inflateRequest.attrs) && Intrinsics.areEqual(this.parent, inflateRequest.parent) && Intrinsics.areEqual(this.fallbackViewCreator, inflateRequest.fallbackViewCreator);
    }

    public int hashCode() {
        int iHashCode = ((this.name.hashCode() * 31) + this.context.hashCode()) * 31;
        AttributeSet attributeSet = this.attrs;
        int iHashCode2 = (iHashCode + (attributeSet == null ? 0 : attributeSet.hashCode())) * 31;
        View view = this.parent;
        return ((iHashCode2 + (view != null ? view.hashCode() : 0)) * 31) + this.fallbackViewCreator.hashCode();
    }

    public String toString() {
        return "InflateRequest(name=" + this.name + ", context=" + this.context + ", attrs=" + this.attrs + ", parent=" + this.parent + ", fallbackViewCreator=" + this.fallbackViewCreator + ')';
    }

    public InflateRequest(String name, Context context, AttributeSet attributeSet, View view, FallbackViewCreator fallbackViewCreator) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fallbackViewCreator, "fallbackViewCreator");
        this.name = name;
        this.context = context;
        this.attrs = attributeSet;
        this.parent = view;
        this.fallbackViewCreator = fallbackViewCreator;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ InflateRequest(String str, Context context, AttributeSet attributeSet, View view, FallbackViewCreator fallbackViewCreator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        FallbackViewCreator fallbackViewCreator2;
        View view2;
        attributeSet = (i & 4) != 0 ? null : attributeSet;
        if ((i & 8) != 0) {
            fallbackViewCreator2 = fallbackViewCreator;
            view2 = null;
        } else {
            fallbackViewCreator2 = fallbackViewCreator;
            view2 = view;
        }
        this(str, context, attributeSet, view2, fallbackViewCreator2);
    }

    @JvmName
    /* renamed from: name, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @JvmName
    /* renamed from: context, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    @JvmName
    /* renamed from: attrs, reason: from getter */
    public final AttributeSet getAttrs() {
        return this.attrs;
    }

    @JvmName
    /* renamed from: parent, reason: from getter */
    public final View getParent() {
        return this.parent;
    }

    @JvmName
    /* renamed from: fallbackViewCreator, reason: from getter */
    public final FallbackViewCreator getFallbackViewCreator() {
        return this.fallbackViewCreator;
    }

    public final Builder toBuilder() {
        return new Builder(this);
    }

    /* compiled from: InflateRequest.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"Lio/github/inflationx/viewpump/InflateRequest$Builder;", "", "Lio/github/inflationx/viewpump/InflateRequest;", "request", "<init>", "(Lio/github/inflationx/viewpump/InflateRequest;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)Lio/github/inflationx/viewpump/InflateRequest$Builder;", "build", "()Lio/github/inflationx/viewpump/InflateRequest;", "", "name", "Ljava/lang/String;", "Landroid/content/Context;", "Landroid/util/AttributeSet;", "attrs", "Landroid/util/AttributeSet;", "Landroid/view/View;", "parent", "Landroid/view/View;", "Lio/github/inflationx/viewpump/FallbackViewCreator;", "fallbackViewCreator", "Lio/github/inflationx/viewpump/FallbackViewCreator;", "viewpump_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class Builder {
        private AttributeSet attrs;
        private Context context;
        private FallbackViewCreator fallbackViewCreator;
        private String name;
        private View parent;

        public Builder(InflateRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.name = request.getName();
            this.context = request.getContext();
            this.attrs = request.getAttrs();
            this.parent = request.getParent();
            this.fallbackViewCreator = request.getFallbackViewCreator();
        }

        public final Builder context(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.context = context;
            return this;
        }

        public final InflateRequest build() {
            String str = this.name;
            if (str == null) {
                throw new IllegalStateException("name == null");
            }
            Context context = this.context;
            if (context == null) {
                throw new IllegalStateException("context == null");
            }
            AttributeSet attributeSet = this.attrs;
            View view = this.parent;
            FallbackViewCreator fallbackViewCreator = this.fallbackViewCreator;
            if (fallbackViewCreator != null) {
                return new InflateRequest(str, context, attributeSet, view, fallbackViewCreator);
            }
            throw new IllegalStateException("fallbackViewCreator == null");
        }
    }
}
