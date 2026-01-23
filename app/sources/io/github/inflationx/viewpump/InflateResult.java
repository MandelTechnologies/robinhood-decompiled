package io.github.inflationx.viewpump;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InflateResult.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0003\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0005\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0007\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\t\u0010\u001b¨\u0006\u001d"}, m3636d2 = {"Lio/github/inflationx/viewpump/InflateResult;", "", "Landroid/view/View;", "view", "", "name", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/view/View;", "()Landroid/view/View;", "Ljava/lang/String;", "Landroid/content/Context;", "()Landroid/content/Context;", "Landroid/util/AttributeSet;", "()Landroid/util/AttributeSet;", "Companion", "viewpump_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class InflateResult {
    private final AttributeSet attrs;
    private final Context context;
    private final String name;
    private final View view;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InflateResult)) {
            return false;
        }
        InflateResult inflateResult = (InflateResult) other;
        return Intrinsics.areEqual(this.view, inflateResult.view) && Intrinsics.areEqual(this.name, inflateResult.name) && Intrinsics.areEqual(this.context, inflateResult.context) && Intrinsics.areEqual(this.attrs, inflateResult.attrs);
    }

    public int hashCode() {
        View view = this.view;
        int iHashCode = (((((view == null ? 0 : view.hashCode()) * 31) + this.name.hashCode()) * 31) + this.context.hashCode()) * 31;
        AttributeSet attributeSet = this.attrs;
        return iHashCode + (attributeSet != null ? attributeSet.hashCode() : 0);
    }

    public String toString() {
        return "InflateResult(view=" + this.view + ", name=" + this.name + ", context=" + this.context + ", attrs=" + this.attrs + ')';
    }

    public InflateResult(View view, String name, Context context, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(context, "context");
        this.view = view;
        this.name = name;
        this.context = context;
        this.attrs = attributeSet;
    }

    @JvmName
    /* renamed from: view, reason: from getter */
    public final View getView() {
        return this.view;
    }

    @JvmName
    /* renamed from: attrs, reason: from getter */
    public final AttributeSet getAttrs() {
        return this.attrs;
    }
}
