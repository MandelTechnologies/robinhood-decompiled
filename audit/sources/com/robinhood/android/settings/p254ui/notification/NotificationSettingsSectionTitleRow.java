package com.robinhood.android.settings.p254ui.notification;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.settings.C28315R;
import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey4;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.p409ui.view.Bindable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NotificationSettingsSectionTitleRow.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\rB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0016¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/NotificationSettingsSectionTitleRow;", "Lcom/robinhood/android/designsystem/text/RhTextView;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/shared/settings/contracts/ViewType$SectionTitle;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bind", "", "state", "Companion", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class NotificationSettingsSectionTitleRow extends RhTextView implements Bindable<NotificationSettings4FragmentKey4.SectionTitle> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationSettingsSectionTitleRow(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(NotificationSettings4FragmentKey4.SectionTitle state) {
        Intrinsics.checkNotNullParameter(state, "state");
        setText(state.getTitle());
        if (state.getShowInfoIcon()) {
            return;
        }
        TextViewsKt.setDrawables$default((TextView) this, 0, 0, 0, 0, false, 27, (Object) null);
    }

    /* compiled from: NotificationSettingsSectionTitleRow.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/NotificationSettingsSectionTitleRow$Companion;", "", "<init>", "()V", "inflate", "Lcom/robinhood/android/settings/ui/notification/NotificationSettingsSectionTitleRow;", "parent", "Landroid/view/ViewGroup;", "isTop", "", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ NotificationSettingsSectionTitleRow inflate$default(Companion companion, ViewGroup viewGroup, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.inflate(viewGroup, z);
        }

        public final NotificationSettingsSectionTitleRow inflate(ViewGroup parent, boolean isTop) {
            int i;
            Intrinsics.checkNotNullParameter(parent, "parent");
            if (isTop) {
                i = C28315R.layout.include_notification_settings_top_section_title_row;
            } else {
                i = C28315R.layout.include_notification_settings_section_title_row;
            }
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            View viewInflate = ContextSystemServices.getLayoutInflater(context).inflate(i, parent, false);
            Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type com.robinhood.android.settings.ui.notification.NotificationSettingsSectionTitleRow");
            return (NotificationSettingsSectionTitleRow) viewInflate;
        }
    }
}
