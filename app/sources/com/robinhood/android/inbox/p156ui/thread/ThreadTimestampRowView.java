package com.robinhood.android.inbox.p156ui.thread;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.robinhood.android.common.p088ui.BindViewDelegate2;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.inbox.C18721R;
import com.robinhood.android.inbox.p156ui.thread.ThreadDetailViewState4;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: ThreadTimestampRowView.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0013B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0016R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/thread/ThreadTimestampRowView;", "Landroid/widget/FrameLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/inbox/ui/thread/ViewType$Timestamp;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "timestampTxt", "Landroid/widget/TextView;", "getTimestampTxt", "()Landroid/widget/TextView;", "timestampTxt$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", "state", "Companion", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class ThreadTimestampRowView extends FrameLayout implements Bindable<ThreadDetailViewState4.Timestamp> {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ThreadTimestampRowView.class, "timestampTxt", "getTimestampTxt()Landroid/widget/TextView;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: timestampTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 timestampTxt;

    public /* synthetic */ ThreadTimestampRowView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadTimestampRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C18721R.layout.merge_thread_timestamp_row_view, true);
        this.timestampTxt = BindViewDelegate2.bindView$default(this, C18721R.id.inbox_thread_timestamp_txt, null, 2, null);
    }

    private final TextView getTimestampTxt() {
        return (TextView) this.timestampTxt.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(ThreadDetailViewState4.Timestamp state) {
        Intrinsics.checkNotNullParameter(state, "state");
        getTimestampTxt().setText(state.getText());
        ViewGroup.LayoutParams layoutParams = getTimestampTxt().getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (state.getFromUser()) {
            TextView timestampTxt = getTimestampTxt();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            TextViewsKt.setDrawables$default(timestampTxt, (Drawable) null, (Drawable) null, Contexts7.getThemeDrawable(context, C20690R.attr.iconCheckmark12dp), (Drawable) null, true, 11, (Object) null);
            layoutParams2.gravity = 8388613;
            return;
        }
        TextViewsKt.setDrawables$default(getTimestampTxt(), (Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null, false, 27, (Object) null);
        layoutParams2.gravity = 8388611;
    }

    /* compiled from: ThreadTimestampRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/thread/ThreadTimestampRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/inbox/ui/thread/ThreadTimestampRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<ThreadTimestampRowView> {
        private final /* synthetic */ Inflater<ThreadTimestampRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public ThreadTimestampRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (ThreadTimestampRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C18721R.layout.include_thread_timestamp_row_view);
        }
    }
}
