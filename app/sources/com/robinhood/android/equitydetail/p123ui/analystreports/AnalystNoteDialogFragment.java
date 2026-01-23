package com.robinhood.android.equitydetail.p123ui.analystreports;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.databinding.DialogAnalystNoteBinding;
import com.robinhood.models.api.ApiAnalystReport;
import com.robinhood.utils.datetime.format.InstantFormatter;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import p479j$.time.Instant;

/* compiled from: AnalystNoteDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystNoteDialogFragment;", "Lcom/robinhood/android/common/ui/RhDialogFragment;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "j$/time/Instant", "publishedAt$delegate", "Lkotlin/Lazy;", "getPublishedAt", "()Lj$/time/Instant;", AnalystNoteDialogFragment.ARG_PUBLISHED_AT, "Lcom/robinhood/android/equitydetail/databinding/DialogAnalystNoteBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getBinding", "()Lcom/robinhood/android/equitydetail/databinding/DialogAnalystNoteBinding;", "binding", "Companion", "Builder", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class AnalystNoteDialogFragment extends RhDialogFragment {
    private static final String ARG_PUBLISHED_AT = "publishedAt";
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AnalystNoteDialogFragment.class, "binding", "getBinding()Lcom/robinhood/android/equitydetail/databinding/DialogAnalystNoteBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: publishedAt$delegate, reason: from kotlin metadata */
    private final Lazy publishedAt = Fragments2.argument(this, ARG_PUBLISHED_AT);

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding = ViewBinding5.viewBinding(this, AnalystNoteDialogFragment2.INSTANCE);

    private final Instant getPublishedAt() {
        return (Instant) this.publishedAt.getValue();
    }

    private final DialogAnalystNoteBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (DialogAnalystNoteBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.RhDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getBinding().dialogFragmentSubtitle.setText(InstantFormatter.MEDIUM_DATE_IN_SYSTEM_ZONE.format(getPublishedAt()));
    }

    /* compiled from: AnalystNoteDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0014¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystNoteDialogFragment$Builder;", "Lcom/robinhood/android/common/ui/RhDialogFragment$Builder;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "createDialogFragment", "Lcom/robinhood/android/common/ui/RhDialogFragment;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Builder extends RhDialogFragment.Builder {
        public static final int $stable = RhDialogFragment.Builder.$stable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        @Override // com.robinhood.android.common.ui.RhDialogFragment.Builder
        protected RhDialogFragment createDialogFragment() {
            return new AnalystNoteDialogFragment();
        }
    }

    /* compiled from: AnalystNoteDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystNoteDialogFragment$Companion;", "", "<init>", "()V", "ARG_PUBLISHED_AT", "", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystNoteDialogFragment$Builder;", "context", "Landroid/content/Context;", "note", "Lcom/robinhood/models/api/ApiAnalystReport$Note;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Builder create(Context context, ApiAnalystReport.Note note) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(note, "note");
            Builder builder = new Builder(context);
            builder.getDialogArgs().putSerializable(AnalystNoteDialogFragment.ARG_PUBLISHED_AT, note.getPublished_at());
            builder.setLayoutRes(C15314R.layout.dialog_analyst_note);
            builder.setTitle(note.getTitle());
            builder.setMessage(note.getBody());
            builder.setPositiveButton(C11048R.string.general_label_close, new Object[0]);
            builder.setUseDesignSystemOverlay(true);
            return builder;
        }
    }
}
