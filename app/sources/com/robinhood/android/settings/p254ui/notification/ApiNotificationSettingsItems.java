package com.robinhood.android.settings.p254ui.notification;

import com.robinhood.android.settings.C28315R;
import com.robinhood.android.settings.models.api.ApiTypedSettingsItem;
import com.robinhood.models.api.ApiNotificationSettingsItem;
import com.robinhood.models.api.ApiNotificationSettingsMultipleChoiceItem;
import com.robinhood.models.api.ApiNotificationSettingsSection;
import com.robinhood.models.api.ApiNotificationSettingsToggleSettingsItem;
import com.robinhood.models.api.ApiNotificationSettingsV4BottomSheetMultipleChoiceItem;
import com.robinhood.models.api.ApiNotificationSettingsV4BottomSheetMultipleChoiceItemOption;
import com.robinhood.models.api.ApiNotificationSettingsV4CompositeConfigurableSettingsItem;
import com.robinhood.models.api.ApiNotificationSettingsV4ConfigurableSettingsItem;
import com.robinhood.models.api.ApiNotificationSettingsV4MultipleChoiceOption;
import com.robinhood.models.api.ApiNotificationSettingsV4RichTextSettingsItem;
import com.robinhood.models.api.ApiNotificationSettingsV4SnoozeBottomSheetMultipleChoiceItem;
import com.robinhood.models.api.ApiNotificationSettingsV4SnoozeBottomSheetMultipleChoiceItemOption;
import com.robinhood.models.serverdriven.api.ApiGenericAction;
import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey3;
import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ApiNotificationSettingsItems.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a2\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0000\u001a2\u0010\u0000\u001a\u00020\u0001*\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002\u001a2\u0010\u0000\u001a\u00020\u0001*\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002\u001a2\u0010\u0000\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u000f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00102\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002\u001a\f\u0010\u0011\u001a\u00020\u0012*\u00020\u0013H\u0003\u001a\f\u0010\u0014\u001a\u00020\u0012*\u00020\u0007H\u0003¨\u0006\u0015"}, m3636d2 = {"toViewType", "", "Lcom/robinhood/models/api/ApiNotificationSettingsItem;", "rootSettingsId", "", "sectionId", "isFromConfigurableTypePage", "", "list", "", "Lcom/robinhood/shared/settings/contracts/ViewType;", "Lcom/robinhood/models/api/ApiNotificationSettingsToggleSettingsItem;", "id", "Lcom/robinhood/models/api/ApiNotificationSettingsV4CompositeConfigurableSettingsItem;", "Lcom/robinhood/models/api/ApiNotificationSettingsV4ConfigurableSettingsItem;", "Lcom/robinhood/models/api/ApiNotificationSettingsV4RichTextSettingsItem;", "Lcom/robinhood/android/settings/models/api/ApiTypedSettingsItem$TitleSubtitleItem$Data;", "displayNameRes", "", "Lcom/robinhood/models/api/ApiNotificationSettingsToggleSettingsItem$Status;", "displayStatusNameRes", "feature-settings_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.settings.ui.notification.ApiNotificationSettingsItemsKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class ApiNotificationSettingsItems {
    public static final void toViewType(ApiNotificationSettingsItem apiNotificationSettingsItem, String rootSettingsId, String sectionId, boolean z, List<NotificationSettings4FragmentKey4> list) {
        Intrinsics.checkNotNullParameter(apiNotificationSettingsItem, "<this>");
        Intrinsics.checkNotNullParameter(rootSettingsId, "rootSettingsId");
        Intrinsics.checkNotNullParameter(sectionId, "sectionId");
        Intrinsics.checkNotNullParameter(list, "list");
        if (apiNotificationSettingsItem instanceof ApiNotificationSettingsItem.ToggleSettingsItem) {
            ApiNotificationSettingsItem.ToggleSettingsItem toggleSettingsItem = (ApiNotificationSettingsItem.ToggleSettingsItem) apiNotificationSettingsItem;
            toViewType(toggleSettingsItem.getData(), sectionId, toggleSettingsItem.getId(), z, list);
            return;
        }
        if (apiNotificationSettingsItem instanceof ApiNotificationSettingsItem.CompositeConfigurableSettingsItem) {
            ApiNotificationSettingsItem.CompositeConfigurableSettingsItem compositeConfigurableSettingsItem = (ApiNotificationSettingsItem.CompositeConfigurableSettingsItem) apiNotificationSettingsItem;
            toViewType(compositeConfigurableSettingsItem.getData(), rootSettingsId, sectionId, compositeConfigurableSettingsItem.getId(), list);
            return;
        }
        if (apiNotificationSettingsItem instanceof ApiNotificationSettingsItem.ConfigurableSettingsItem) {
            ApiNotificationSettingsItem.ConfigurableSettingsItem configurableSettingsItem = (ApiNotificationSettingsItem.ConfigurableSettingsItem) apiNotificationSettingsItem;
            toViewType(configurableSettingsItem.getData(), rootSettingsId, sectionId, configurableSettingsItem.getId(), list);
        } else if (apiNotificationSettingsItem instanceof ApiNotificationSettingsItem.RichTextSettingsItem) {
            toViewType(((ApiNotificationSettingsItem.RichTextSettingsItem) apiNotificationSettingsItem).getData(), list);
        } else if (apiNotificationSettingsItem instanceof ApiNotificationSettingsItem.DeeplinkItem) {
            toViewType(((ApiNotificationSettingsItem.DeeplinkItem) apiNotificationSettingsItem).getData(), list);
        } else if (!(apiNotificationSettingsItem instanceof ApiNotificationSettingsItem.Unknown)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0102 A[EDGE_INSN: B:72:0x0102->B:38:0x0102 BREAK  A[LOOP:0: B:5:0x001c->B:76:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[LOOP:0: B:5:0x001c->B:76:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void toViewType(ApiNotificationSettingsToggleSettingsItem apiNotificationSettingsToggleSettingsItem, String str, String str2, boolean z, List<NotificationSettings4FragmentKey4> list) {
        NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.BottomSheetMultipleChoiceRow bottomSheetMultipleChoiceRow;
        NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow snoozeBottomSheetMultipleChoiceRow;
        NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow snoozeBottomSheetMultipleChoiceRow2;
        Iterator it;
        NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow snoozeBottomSheetMultipleChoiceRow3;
        String display_title = apiNotificationSettingsToggleSettingsItem.getDisplay_title();
        String display_subtitle = apiNotificationSettingsToggleSettingsItem.getDisplay_subtitle();
        ApiNotificationSettingsToggleSettingsItem.Status status = apiNotificationSettingsToggleSettingsItem.getStatus();
        List<ApiNotificationSettingsSection> sections = apiNotificationSettingsToggleSettingsItem.getSections();
        int i = 10;
        if (sections != null) {
            for (ApiNotificationSettingsSection apiNotificationSettingsSection : sections) {
                if (apiNotificationSettingsSection instanceof ApiNotificationSettingsSection.MultipleChoiceItem) {
                    ApiNotificationSettingsMultipleChoiceItem data = ((ApiNotificationSettingsSection.MultipleChoiceItem) apiNotificationSettingsSection).getData();
                    String display_title2 = data.getDisplay_title();
                    if (!data.getShow_as_bottom_sheet() || display_title2 == null) {
                        bottomSheetMultipleChoiceRow = null;
                    } else {
                        String id = data.getId();
                        String display_header = data.getDisplay_header();
                        List<ApiNotificationSettingsV4MultipleChoiceOption> available_choices = data.getAvailable_choices();
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(available_choices, 10));
                        for (ApiNotificationSettingsV4MultipleChoiceOption apiNotificationSettingsV4MultipleChoiceOption : available_choices) {
                            arrayList.add(new NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.BottomSheetMultipleChoiceRow.OptionItem(apiNotificationSettingsV4MultipleChoiceOption.getValue(), apiNotificationSettingsV4MultipleChoiceOption.getDisplay_title()));
                        }
                        bottomSheetMultipleChoiceRow = new NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.BottomSheetMultipleChoiceRow(str2, id, display_title2, new NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.BottomSheetMultipleChoiceRow.BottomSheetData(display_header, CollectionsKt.toSet(data.getSelected_choices()), arrayList, data.getCan_select_multiple()));
                    }
                    if (bottomSheetMultipleChoiceRow != null) {
                        break;
                    }
                } else if (apiNotificationSettingsSection instanceof ApiNotificationSettingsSection.MultipleChoiceBottomSheetItem) {
                    ApiNotificationSettingsV4BottomSheetMultipleChoiceItem data2 = ((ApiNotificationSettingsSection.MultipleChoiceBottomSheetItem) apiNotificationSettingsSection).getData();
                    String id2 = data2.getId();
                    String display_title3 = data2.getDisplay_title();
                    String display_header2 = data2.getDisplay_header();
                    List<ApiNotificationSettingsV4BottomSheetMultipleChoiceItemOption> available_choices2 = data2.getAvailable_choices();
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(available_choices2, 10));
                    for (ApiNotificationSettingsV4BottomSheetMultipleChoiceItemOption apiNotificationSettingsV4BottomSheetMultipleChoiceItemOption : available_choices2) {
                        arrayList2.add(new NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.BottomSheetMultipleChoiceRow.OptionItem(apiNotificationSettingsV4BottomSheetMultipleChoiceItemOption.getValue(), apiNotificationSettingsV4BottomSheetMultipleChoiceItemOption.getDisplay_title()));
                    }
                    bottomSheetMultipleChoiceRow = new NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.BottomSheetMultipleChoiceRow(str2, id2, display_title3, new NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.BottomSheetMultipleChoiceRow.BottomSheetData(display_header2, data2.getSelected_choices(), arrayList2, data2.getCan_select_multiple()));
                    if (bottomSheetMultipleChoiceRow != null) {
                    }
                } else {
                    if (!(apiNotificationSettingsSection instanceof ApiNotificationSettingsSection.ItemCollection) && !(apiNotificationSettingsSection instanceof ApiNotificationSettingsSection.SnoozeMultipleChoiceBottomSheetItem) && !(apiNotificationSettingsSection instanceof ApiNotificationSettingsSection.Unknown)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bottomSheetMultipleChoiceRow = null;
                    if (bottomSheetMultipleChoiceRow != null) {
                    }
                }
            }
            bottomSheetMultipleChoiceRow = null;
        } else {
            bottomSheetMultipleChoiceRow = null;
        }
        List<ApiNotificationSettingsSection> sections_when_disabled = apiNotificationSettingsToggleSettingsItem.getSections_when_disabled();
        if (sections_when_disabled != null) {
            Iterator it2 = sections_when_disabled.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    snoozeBottomSheetMultipleChoiceRow2 = null;
                    break;
                }
                ApiNotificationSettingsSection apiNotificationSettingsSection2 = (ApiNotificationSettingsSection) it2.next();
                if (apiNotificationSettingsSection2 instanceof ApiNotificationSettingsSection.SnoozeMultipleChoiceBottomSheetItem) {
                    ApiNotificationSettingsV4SnoozeBottomSheetMultipleChoiceItem data3 = ((ApiNotificationSettingsSection.SnoozeMultipleChoiceBottomSheetItem) apiNotificationSettingsSection2).getData();
                    String id3 = data3.getId();
                    String display_title4 = data3.getDisplay_title();
                    String display_header3 = data3.getDisplay_header();
                    String display_subheader = data3.getDisplay_subheader();
                    String adjust_snooze_display_header = data3.getAdjust_snooze_display_header();
                    String adjust_snooze_display_subheader = data3.getAdjust_snooze_display_subheader();
                    List<ApiNotificationSettingsV4SnoozeBottomSheetMultipleChoiceItemOption> available_choices3 = data3.getAvailable_choices();
                    it = it2;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(available_choices3, i));
                    for (ApiNotificationSettingsV4SnoozeBottomSheetMultipleChoiceItemOption apiNotificationSettingsV4SnoozeBottomSheetMultipleChoiceItemOption : available_choices3) {
                        arrayList3.add(new NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow.SnoozeOptionItem(apiNotificationSettingsV4SnoozeBottomSheetMultipleChoiceItemOption.getValue(), apiNotificationSettingsV4SnoozeBottomSheetMultipleChoiceItemOption.getDisplay_title(), apiNotificationSettingsV4SnoozeBottomSheetMultipleChoiceItemOption.getSnooze_duration_seconds(), apiNotificationSettingsV4SnoozeBottomSheetMultipleChoiceItemOption.getUse_snooze_display_headers(), apiNotificationSettingsV4SnoozeBottomSheetMultipleChoiceItemOption.getIf_selected_include_keep_current_snooze_option(), apiNotificationSettingsV4SnoozeBottomSheetMultipleChoiceItemOption.getPreselect_value(), apiNotificationSettingsV4SnoozeBottomSheetMultipleChoiceItemOption.getHide_when_selected()));
                    }
                    snoozeBottomSheetMultipleChoiceRow3 = new NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow(str2, id3, display_title4, new NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow.SnoozeBottomSheetData(display_header3, display_subheader, adjust_snooze_display_header, adjust_snooze_display_subheader, data3.getSelected_choices(), arrayList3, new NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow.KeepCurrentOptionItem(data3.getKeep_current_snooze_option().getValue(), data3.getKeep_current_snooze_option().getDisplay_title()), data3.getLast_selected_at_seconds(), data3.getDefault_value()));
                } else {
                    it = it2;
                    if (!(apiNotificationSettingsSection2 instanceof ApiNotificationSettingsSection.ItemCollection) && !(apiNotificationSettingsSection2 instanceof ApiNotificationSettingsSection.MultipleChoiceItem) && !(apiNotificationSettingsSection2 instanceof ApiNotificationSettingsSection.MultipleChoiceBottomSheetItem) && !(apiNotificationSettingsSection2 instanceof ApiNotificationSettingsSection.Unknown)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    snoozeBottomSheetMultipleChoiceRow3 = null;
                }
                if (snoozeBottomSheetMultipleChoiceRow3 != null) {
                    snoozeBottomSheetMultipleChoiceRow2 = snoozeBottomSheetMultipleChoiceRow3;
                    break;
                } else {
                    it2 = it;
                    i = 10;
                }
            }
            snoozeBottomSheetMultipleChoiceRow = snoozeBottomSheetMultipleChoiceRow2;
        } else {
            snoozeBottomSheetMultipleChoiceRow = null;
        }
        list.add(new NotificationSettings4FragmentKey4.Toggle(str, str2, display_title, display_subtitle, status, z, bottomSheetMultipleChoiceRow, snoozeBottomSheetMultipleChoiceRow));
    }

    private static final void toViewType(ApiNotificationSettingsV4CompositeConfigurableSettingsItem apiNotificationSettingsV4CompositeConfigurableSettingsItem, String str, String str2, String str3, List<NotificationSettings4FragmentKey4> list) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        String key_section_display_title = apiNotificationSettingsV4CompositeConfigurableSettingsItem.getKey_section_display_title();
        if (key_section_display_title != null) {
            arrayList.add(new NotificationSettings4FragmentKey4.SectionTitle(key_section_display_title, null, false, 6, null));
        }
        Iterator<T> it = apiNotificationSettingsV4CompositeConfigurableSettingsItem.getKey_items().iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            ApiNotificationSettingsItem.ToggleSettingsItem toggleSettingsItem = (ApiNotificationSettingsItem.ToggleSettingsItem) it.next();
            toViewType(toggleSettingsItem.getData(), str2, toggleSettingsItem.getId(), true, (List<NotificationSettings4FragmentKey4>) arrayList);
        }
        for (ApiNotificationSettingsSection apiNotificationSettingsSection : apiNotificationSettingsV4CompositeConfigurableSettingsItem.getSections()) {
            ApiNotificationSettingsSections.toViewType(apiNotificationSettingsSection, str, apiNotificationSettingsSection.getId(), str3, true, arrayList);
        }
        String display_title = apiNotificationSettingsV4CompositeConfigurableSettingsItem.getDisplay_title();
        List<ApiNotificationSettingsItem.ToggleSettingsItem> key_items = apiNotificationSettingsV4CompositeConfigurableSettingsItem.getKey_items();
        if ((key_items instanceof Collection) && key_items.isEmpty()) {
            z = false;
        } else {
            Iterator<T> it2 = key_items.iterator();
            while (it2.hasNext()) {
                if (((ApiNotificationSettingsItem.ToggleSettingsItem) it2.next()).getData().getStatus() != ApiNotificationSettingsToggleSettingsItem.Status.OFF) {
                    break;
                }
            }
            z = false;
        }
        list.add(new NotificationSettings4FragmentKey4.SubPageEntry(display_title, Integer.valueOf(displayStatusNameRes(z)), new NotificationSettings4FragmentKey3.FromViews(str3, str, apiNotificationSettingsV4CompositeConfigurableSettingsItem.getDisplay_title(), arrayList)));
    }

    private static final void toViewType(ApiNotificationSettingsV4ConfigurableSettingsItem apiNotificationSettingsV4ConfigurableSettingsItem, String str, String str2, String str3, List<NotificationSettings4FragmentKey4> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(NotificationSettings4FragmentKey4.Padding.INSTANCE);
        toViewType(apiNotificationSettingsV4ConfigurableSettingsItem.getToggle_item(), str2, str3, true, (List<NotificationSettings4FragmentKey4>) arrayList);
        for (ApiNotificationSettingsSection apiNotificationSettingsSection : apiNotificationSettingsV4ConfigurableSettingsItem.getSections()) {
            ApiNotificationSettingsSections.toViewType(apiNotificationSettingsSection, str, apiNotificationSettingsSection.getId(), str3, true, arrayList);
        }
        list.add(new NotificationSettings4FragmentKey4.SubPageEntry(apiNotificationSettingsV4ConfigurableSettingsItem.getDisplay_title(), Integer.valueOf(displayNameRes(apiNotificationSettingsV4ConfigurableSettingsItem.getToggle_item().getStatus())), new NotificationSettings4FragmentKey3.FromViews(str3, str, apiNotificationSettingsV4ConfigurableSettingsItem.getDisplay_title(), arrayList)));
    }

    private static final void toViewType(ApiNotificationSettingsV4RichTextSettingsItem apiNotificationSettingsV4RichTextSettingsItem, List<NotificationSettings4FragmentKey4> list) {
        list.add(new NotificationSettings4FragmentKey4.SubtitleRichText(apiNotificationSettingsV4RichTextSettingsItem.getRich_text().toDbModel()));
    }

    private static final void toViewType(ApiTypedSettingsItem.TitleSubtitleItem.Data data, List<NotificationSettings4FragmentKey4> list) {
        String subtitle = data.getSubtitle();
        ApiGenericAction action = data.getAction();
        if (subtitle == null || action == null) {
            return;
        }
        list.add(new NotificationSettings4FragmentKey4.TitleSubtitle(data.getTitle(), subtitle, action));
    }

    private static final int displayNameRes(ApiNotificationSettingsToggleSettingsItem.Status status) {
        if (status == ApiNotificationSettingsToggleSettingsItem.Status.OFF) {
            return C28315R.string.setting_notifications_subsetting_disabled;
        }
        return C28315R.string.setting_notifications_subsetting_enabled;
    }

    private static final int displayStatusNameRes(boolean z) {
        if (z) {
            return C28315R.string.setting_notifications_subsetting_enabled;
        }
        return C28315R.string.setting_notifications_subsetting_disabled;
    }
}
