package com.robinhood.android.inbox.p156ui.thread;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.common.p088ui.BindViewDelegate2;
import com.robinhood.android.inbox.C18721R;
import com.robinhood.android.inbox.p156ui.thread.ThreadDetailViewState4;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: ThreadMetadataRowView.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u001d2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002\u001c\u001dB\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u0003H\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0017\u0010\u0013R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/thread/ThreadMetadataRowView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/inbox/ui/thread/ViewType$Metadata;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "callbacks", "Lcom/robinhood/android/inbox/ui/thread/ThreadMetadataRowView$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/inbox/ui/thread/ThreadMetadataRowView$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/inbox/ui/thread/ThreadMetadataRowView$Callbacks;)V", "metadataTxt", "Landroid/widget/TextView;", "getMetadataTxt", "()Landroid/widget/TextView;", "metadataTxt$delegate", "Lkotlin/properties/ReadOnlyProperty;", "actionTxt", "getActionTxt", "actionTxt$delegate", "state", "bind", "", "Callbacks", "Companion", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class ThreadMetadataRowView extends ConstraintLayout implements Bindable<ThreadDetailViewState4.Metadata> {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ThreadMetadataRowView.class, "metadataTxt", "getMetadataTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(ThreadMetadataRowView.class, "actionTxt", "getActionTxt()Landroid/widget/TextView;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: actionTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 actionTxt;
    private Callbacks callbacks;

    /* renamed from: metadataTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 metadataTxt;
    private ThreadDetailViewState4.Metadata state;

    /* compiled from: ThreadMetadataRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/thread/ThreadMetadataRowView$Callbacks;", "", "onInternalActionClick", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/inbox/ui/thread/ViewType$Metadata;", "onExternalActionClick", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onExternalActionClick(ThreadDetailViewState4.Metadata item);

        void onInternalActionClick(ThreadDetailViewState4.Metadata item);
    }

    public /* synthetic */ ThreadMetadataRowView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadMetadataRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C18721R.layout.merge_thread_metadata_row_view, true);
        this.metadataTxt = BindViewDelegate2.bindView$default(this, C18721R.id.inbox_thread_metadata_txt, null, 2, null);
        this.actionTxt = BindViewDelegate2.bindView$default(this, C18721R.id.inbox_thread_metadata_action_txt, null, 2, null);
        OnClickListeners.onClick(getActionTxt(), new Function0() { // from class: com.robinhood.android.inbox.ui.thread.ThreadMetadataRowView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ThreadMetadataRowView._init_$lambda$0(this.f$0);
            }
        });
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    private final TextView getMetadataTxt() {
        return (TextView) this.metadataTxt.getValue(this, $$delegatedProperties[0]);
    }

    private final TextView getActionTxt() {
        return (TextView) this.actionTxt.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(ThreadMetadataRowView threadMetadataRowView) {
        ThreadDetailViewState4.Metadata metadata = threadMetadataRowView.state;
        if (metadata == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (metadata.getInternalAction() != null) {
            Callbacks callbacks = threadMetadataRowView.callbacks;
            if (callbacks != null) {
                callbacks.onInternalActionClick(metadata);
            }
        } else {
            if (metadata.getExternalAction() == null) {
                throw new IllegalStateException("View should not be clickable when both actions are null");
            }
            Callbacks callbacks2 = threadMetadataRowView.callbacks;
            if (callbacks2 != null) {
                callbacks2.onExternalActionClick(metadata);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(ThreadDetailViewState4.Metadata state) {
        CharSequence text;
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        getMetadataTxt().setText(state.getText());
        InternalAction internalAction = state.getInternalAction();
        if (internalAction == null || (text = internalAction.getText()) == null) {
            ExternalAction externalAction = state.getExternalAction();
            text = externalAction != null ? externalAction.getText() : null;
        }
        getActionTxt().setVisibility(text != null ? 0 : 8);
        if (getActionTxt().getVisibility() == 0) {
            getActionTxt().setText(text);
        }
    }

    /* compiled from: ThreadMetadataRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/thread/ThreadMetadataRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/inbox/ui/thread/ThreadMetadataRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<ThreadMetadataRowView> {
        private final /* synthetic */ Inflater<ThreadMetadataRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public ThreadMetadataRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (ThreadMetadataRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C18721R.layout.include_thread_metadata_row_view);
        }
    }
}
