package com.robinhood.android.settings.p254ui.notification;

import com.robinhood.models.api.ApiNotificationSettingsItem;
import com.robinhood.models.api.ApiNotificationSettingsMultipleChoiceItem;
import com.robinhood.models.api.ApiNotificationSettingsSection;
import com.robinhood.models.api.ApiNotificationSettingsV4ItemCollection;
import com.robinhood.models.api.ApiNotificationSettingsV4MultipleChoiceOption;
import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ApiNotificationSettingsSections.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a<\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0000\u001a2\u0010\u0000\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¨\u0006\u000e"}, m3636d2 = {"toViewType", "", "Lcom/robinhood/models/api/ApiNotificationSettingsSection;", "rootSettingsId", "", "sectionId", "parentId", "isFromConfigurableTypePage", "", "list", "", "Lcom/robinhood/shared/settings/contracts/ViewType;", "Lcom/robinhood/models/api/ApiNotificationSettingsV4ItemCollection;", "Lcom/robinhood/models/api/ApiNotificationSettingsMultipleChoiceItem;", "feature-settings_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.settings.ui.notification.ApiNotificationSettingsSectionsKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class ApiNotificationSettingsSections {
    public static final void toViewType(ApiNotificationSettingsSection apiNotificationSettingsSection, String rootSettingsId, String sectionId, String str, boolean z, List<NotificationSettings4FragmentKey4> list) {
        Intrinsics.checkNotNullParameter(apiNotificationSettingsSection, "<this>");
        Intrinsics.checkNotNullParameter(rootSettingsId, "rootSettingsId");
        Intrinsics.checkNotNullParameter(sectionId, "sectionId");
        Intrinsics.checkNotNullParameter(list, "list");
        if (apiNotificationSettingsSection instanceof ApiNotificationSettingsSection.ItemCollection) {
            toViewType(((ApiNotificationSettingsSection.ItemCollection) apiNotificationSettingsSection).getData(), rootSettingsId, sectionId, z, list);
            return;
        }
        if (apiNotificationSettingsSection instanceof ApiNotificationSettingsSection.MultipleChoiceItem) {
            toViewType(((ApiNotificationSettingsSection.MultipleChoiceItem) apiNotificationSettingsSection).getData(), str, list);
        } else if (!(apiNotificationSettingsSection instanceof ApiNotificationSettingsSection.MultipleChoiceBottomSheetItem) && !(apiNotificationSettingsSection instanceof ApiNotificationSettingsSection.SnoozeMultipleChoiceBottomSheetItem) && !(apiNotificationSettingsSection instanceof ApiNotificationSettingsSection.Unknown)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    private static final void toViewType(ApiNotificationSettingsV4ItemCollection apiNotificationSettingsV4ItemCollection, String str, String str2, boolean z, List<NotificationSettings4FragmentKey4> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<ApiNotificationSettingsItem> it = apiNotificationSettingsV4ItemCollection.getItems().iterator();
        while (it.hasNext()) {
            ApiNotificationSettingsItems.toViewType(it.next(), str, str2, z, arrayList);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        list.add(new NotificationSettings4FragmentKey4.SectionTitle(apiNotificationSettingsV4ItemCollection.getDisplay_header(), null, false, 6, null));
        list.addAll(arrayList);
    }

    private static final void toViewType(ApiNotificationSettingsMultipleChoiceItem apiNotificationSettingsMultipleChoiceItem, String str, List<NotificationSettings4FragmentKey4> list) {
        list.add(new NotificationSettings4FragmentKey4.SectionTitle(apiNotificationSettingsMultipleChoiceItem.getDisplay_header(), apiNotificationSettingsMultipleChoiceItem.getDisplay_subheader(), false, 4, null));
        String str2 = str == null ? "" : str;
        String id = apiNotificationSettingsMultipleChoiceItem.getId();
        List<ApiNotificationSettingsV4MultipleChoiceOption> available_choices = apiNotificationSettingsMultipleChoiceItem.getAvailable_choices();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(available_choices, 10));
        Iterator<T> it = available_choices.iterator();
        while (it.hasNext()) {
            arrayList.add(((ApiNotificationSettingsV4MultipleChoiceOption) it.next()).getDisplay_title());
        }
        List<ApiNotificationSettingsV4MultipleChoiceOption> available_choices2 = apiNotificationSettingsMultipleChoiceItem.getAvailable_choices();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(available_choices2, 10));
        Iterator<T> it2 = available_choices2.iterator();
        while (it2.hasNext()) {
            String display_subtitle = ((ApiNotificationSettingsV4MultipleChoiceOption) it2.next()).getDisplay_subtitle();
            if (display_subtitle == null) {
                display_subtitle = "";
            }
            arrayList2.add(display_subtitle);
        }
        List<ApiNotificationSettingsV4MultipleChoiceOption> available_choices3 = apiNotificationSettingsMultipleChoiceItem.getAvailable_choices();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(available_choices3, 10));
        Iterator<T> it3 = available_choices3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((ApiNotificationSettingsV4MultipleChoiceOption) it3.next()).getValue());
        }
        list.add(new NotificationSettings4FragmentKey4.RadioGroup(str2, id, arrayList, arrayList2, arrayList3, apiNotificationSettingsMultipleChoiceItem.getSelected_choices().get(0)));
    }
}
