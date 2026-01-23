package com.robinhood.android.account.p060ui.documents;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.robinhood.android.account.overview.C8159R;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyStatementPlaceholderView.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/account/ui/documents/RhyStatementPlaceholderView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class RhyStatementPlaceholderView extends LinearLayout {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhyStatementPlaceholderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* compiled from: RhyStatementPlaceholderView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/account/ui/documents/RhyStatementPlaceholderView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/account/ui/documents/RhyStatementPlaceholderView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<RhyStatementPlaceholderView> {
        private final /* synthetic */ Inflater<RhyStatementPlaceholderView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public RhyStatementPlaceholderView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (RhyStatementPlaceholderView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C8159R.layout.include_rhy_statement_placeholder_view);
        }
    }
}
