package com.robinhood.android.doc.p109ui.assistant;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.doc.C14254R;
import com.robinhood.android.doc.p109ui.UtilKt;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.models.p355ui.DocumentRequest;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MultiDocUploadAssistantRowView.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000e2\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002:\u0001\u000eB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/assistant/MultiDocUploadAssistantRowView;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lcom/robinhood/utils/ui/view/Bindable;", "", "Lcom/robinhood/models/ui/DocumentRequest;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bind", "", "state", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class MultiDocUploadAssistantRowView extends RdsRowView implements Bindable<List<? extends DocumentRequest>> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiDocUploadAssistantRowView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public /* bridge */ /* synthetic */ void bind(List<? extends DocumentRequest> list) {
        bind2((List<DocumentRequest>) list);
    }

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(List<DocumentRequest> state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        setPrimaryText(UtilKt.getDisplayNameTitleCase(state, resources));
        if (UtilKt.isPending(state)) {
            setMetadataPrimaryText(ViewsKt.getString(this, C14254R.string.multi_doc_upload_assistant_row_take_photo));
            setTrailingIconDrawable(null);
        } else {
            setMetadataPrimaryText(null);
            setTrailingIconDrawable(ViewsKt.getDrawable(this, C20690R.drawable.ic_rds_checkmark_16dp));
        }
    }

    /* compiled from: MultiDocUploadAssistantRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/assistant/MultiDocUploadAssistantRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/doc/ui/assistant/MultiDocUploadAssistantRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<MultiDocUploadAssistantRowView> {
        private final /* synthetic */ Inflater<MultiDocUploadAssistantRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public MultiDocUploadAssistantRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (MultiDocUploadAssistantRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C14254R.layout.row_multi_doc_upload_assistant);
        }
    }
}
