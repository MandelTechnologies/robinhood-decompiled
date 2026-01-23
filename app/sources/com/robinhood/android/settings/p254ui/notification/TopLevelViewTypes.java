package com.robinhood.android.settings.p254ui.notification;

import android.content.res.Resources;
import com.robinhood.android.settings.C28315R;
import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey;
import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey3;
import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey4;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TopLevelViewTypes.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, m3636d2 = {"topLevelViewTypes", "", "Lcom/robinhood/shared/settings/contracts/ViewType;", "resources", "Landroid/content/res/Resources;", "feature-settings_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.settings.ui.notification.TopLevelViewTypesKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class TopLevelViewTypes {
    public static final List<NotificationSettings4FragmentKey4> topLevelViewTypes(Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        String string2 = resources.getString(C28315R.string.setting_notifications_label_push_notifications);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        NotificationSettings4FragmentKey4.SubPageEntry subPageEntry = new NotificationSettings4FragmentKey4.SubPageEntry(string2, null, new NotificationSettings4FragmentKey3.FromId("push", null, 2, null));
        String string3 = resources.getString(C28315R.string.setting_notifications_label_email_notifications);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        NotificationSettings4FragmentKey4.SubPageEntry subPageEntry2 = new NotificationSettings4FragmentKey4.SubPageEntry(string3, null, new NotificationSettings4FragmentKey3.FromId("email", null, 2, null));
        String string4 = resources.getString(C28315R.string.setting_notifications_label_messages);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        NotificationSettings4FragmentKey4.SubPageEntry subPageEntry3 = new NotificationSettings4FragmentKey4.SubPageEntry(string4, null, new NotificationSettings4FragmentKey3.FromId(NotificationSettings4FragmentKey.SETTINGS_MESSAGES, null, 2, null));
        String string5 = resources.getString(C28315R.string.setting_notifications_label_muted);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        return CollectionsKt.listOf((Object[]) new NotificationSettings4FragmentKey4[]{NotificationSettings4FragmentKey4.Padding.INSTANCE, subPageEntry, subPageEntry2, subPageEntry3, new NotificationSettings4FragmentKey4.SubPageEntry(string5, null, new NotificationSettings4FragmentKey3.FromId(NotificationSettings4FragmentKey.SETTINGS_MUTED, null, 2, null))});
    }
}
