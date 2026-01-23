package com.robinhood.shared.history.daterowview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.robinhood.android.designsystem.selectioncontrol.RdsRadioButtonRowView;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RadioButtonCustomDateRowView.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR(\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/history/daterowview/RadioButtonCustomDateRowView;", "Lcom/robinhood/android/designsystem/selectioncontrol/RdsRadioButtonRowView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "layoutRes", "", "getLayoutRes", "()I", "value", "", "metadataText", "getMetadataText", "()Ljava/lang/CharSequence;", "setMetadataText", "(Ljava/lang/CharSequence;)V", "metadataTextView", "Landroid/widget/TextView;", "Companion", "lib-history-date-row-view_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class RadioButtonCustomDateRowView extends RdsRadioButtonRowView {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final TextView metadataTextView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadioButtonCustomDateRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View viewFindViewById = findViewById(C39001R.id.selection_row_metadata);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.metadataTextView = (TextView) viewFindViewById;
    }

    @Override // com.robinhood.android.designsystem.selectioncontrol.RdsRadioButtonRowView, com.robinhood.android.designsystem.selectioncontrol.RdsSelectionRowView
    protected int getLayoutRes() {
        return C39001R.layout.merge_radio_button_custom_date_row;
    }

    public final CharSequence getMetadataText() {
        return this.metadataTextView.getText();
    }

    public final void setMetadataText(CharSequence charSequence) {
        this.metadataTextView.setText(charSequence);
        this.metadataTextView.setVisibility(charSequence != null ? 0 : 8);
    }

    /* compiled from: RadioButtonCustomDateRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/history/daterowview/RadioButtonCustomDateRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/shared/history/daterowview/RadioButtonCustomDateRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "lib-history-date-row-view_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<RadioButtonCustomDateRowView> {
        private final /* synthetic */ Inflater<RadioButtonCustomDateRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public RadioButtonCustomDateRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (RadioButtonCustomDateRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C39001R.layout.include_radio_button_custom_date_row);
        }
    }
}
