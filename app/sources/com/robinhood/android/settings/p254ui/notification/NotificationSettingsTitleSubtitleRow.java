package com.robinhood.android.settings.p254ui.notification;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.settings.C28315R;
import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey4;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NotificationSettingsTitleSubtitleRow.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\rB\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0016¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/NotificationSettingsTitleSubtitleRow;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/shared/settings/contracts/ViewType$TitleSubtitle;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bind", "", "state", "Companion", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class NotificationSettingsTitleSubtitleRow extends RdsRowView implements Bindable<NotificationSettings4FragmentKey4.TitleSubtitle> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationSettingsTitleSubtitleRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(NotificationSettings4FragmentKey4.TitleSubtitle state) {
        Intrinsics.checkNotNullParameter(state, "state");
        setPrimaryText(state.getTitle());
        setSecondaryText(state.getSubtitle());
    }

    /* compiled from: NotificationSettingsTitleSubtitleRow.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/NotificationSettingsTitleSubtitleRow$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/settings/ui/notification/NotificationSettingsTitleSubtitleRow;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<NotificationSettingsTitleSubtitleRow> {
        private final /* synthetic */ Inflater<NotificationSettingsTitleSubtitleRow> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public NotificationSettingsTitleSubtitleRow inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (NotificationSettingsTitleSubtitleRow) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C28315R.layout.include_notification_settings_title_subtitle_row);
        }
    }
}
