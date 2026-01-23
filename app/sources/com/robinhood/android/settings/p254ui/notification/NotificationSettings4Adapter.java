package com.robinhood.android.settings.p254ui.notification;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.settings.C28315R;
import com.robinhood.android.settings.p254ui.notification.NotificationSettingsSectionTitleRow;
import com.robinhood.models.api.ApiNotificationSettingsToggleSettingsItem;
import com.robinhood.models.serverdriven.api.ApiGenericAction;
import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey3;
import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey4;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericViewHolder;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NotificationSettings4Adapter.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00172\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0002\u0016\u0017B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001e\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000fH\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/NotificationSettings4Adapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/shared/settings/contracts/ViewType;", "Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;", "Landroid/view/View;", "callbacks", "Lcom/robinhood/android/settings/ui/notification/NotificationSettings4Adapter$Callbacks;", "<init>", "(Lcom/robinhood/android/settings/ui/notification/NotificationSettings4Adapter$Callbacks;)V", "getCallbacks", "()Lcom/robinhood/android/settings/ui/notification/NotificationSettings4Adapter$Callbacks;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "getItemViewType", "getItem", "Callbacks", "Companion", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class NotificationSettings4Adapter extends ListAdapter<NotificationSettings4FragmentKey4, GenericViewHolder<? extends View>> {
    private static final int PADDING_VIEW_TYPE = 4;
    private static final int RADIO_GROUP_VIEW_TYPE = 3;
    private static final int SECTION_TITLE_VIEW_TYPE = 0;
    private static final int SUBTITLE_RICH_TEXT_VIEW_TYPE = 6;
    private static final int SUB_PAGE_ENTRY_VIEW_TYPE = 2;
    private static final int TITLE_SUBTITLE_VIEW_TYPE = 7;
    private static final int TOGGLE_VIEW_TYPE = 1;
    private static final int TOP_SECTION_TITLE_VIEW_TYPE = 5;
    private final Callbacks callbacks;
    public static final int $stable = 8;

    /* compiled from: NotificationSettings4Adapter.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J \u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH&J \u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH&¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/NotificationSettings4Adapter$Callbacks;", "", "onSubPageClicked", "", "subPageReference", "Lcom/robinhood/shared/settings/contracts/SubPageReference;", "onActionTriggered", "action", "Lcom/robinhood/models/serverdriven/api/ApiGenericAction;", "onSettingsToggled", "sectionId", "", "itemId", "status", "Lcom/robinhood/models/api/ApiNotificationSettingsToggleSettingsItem$Status;", "onSettingsSelected", "parentId", "value", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onActionTriggered(ApiGenericAction action);

        void onSettingsSelected(String parentId, String itemId, String value);

        void onSettingsToggled(String sectionId, String itemId, ApiNotificationSettingsToggleSettingsItem.Status status);

        void onSubPageClicked(NotificationSettings4FragmentKey3 subPageReference);
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationSettings4Adapter(Callbacks callbacks) {
        super(DiffCallbacks.INSTANCE.byEquality(new Function1() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4Adapter$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NotificationSettings4Adapter._init_$lambda$0((NotificationSettings4FragmentKey4) obj);
            }
        }));
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.callbacks = callbacks;
        setStateRestorationPolicy(RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object _init_$lambda$0(NotificationSettings4FragmentKey4 notificationSettings4FragmentKey4) {
        return notificationSettings4FragmentKey4 instanceof NotificationSettings4FragmentKey4.RadioGroup ? ((NotificationSettings4FragmentKey4.RadioGroup) notificationSettings4FragmentKey4).getId() : notificationSettings4FragmentKey4 instanceof NotificationSettings4FragmentKey4.SubPageEntry ? ((NotificationSettings4FragmentKey4.SubPageEntry) notificationSettings4FragmentKey4).getSubPageReference().getId() : notificationSettings4FragmentKey4 instanceof NotificationSettings4FragmentKey4.Toggle ? ((NotificationSettings4FragmentKey4.Toggle) notificationSettings4FragmentKey4).getId() : notificationSettings4FragmentKey4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public GenericViewHolder<View> onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        switch (viewType) {
            case 0:
                return new GenericViewHolder<>(NotificationSettingsSectionTitleRow.Companion.inflate$default(NotificationSettingsSectionTitleRow.INSTANCE, parent, false, 2, null));
            case 1:
                return new GenericViewHolder<>(NotificationSettingsToggleRow.INSTANCE.inflate(parent));
            case 2:
                return new GenericViewHolder<>(NotificationSettingsSubPageEntryRow.INSTANCE.inflate(parent));
            case 3:
                return new GenericViewHolder<>(NotificationSettingsRadioGroup.INSTANCE.inflate(parent));
            case 4:
                return new GenericViewHolder<>(ViewGroups.inflate$default(parent, C28315R.layout.include_notification_settings_padding, false, 2, null));
            case 5:
                return new GenericViewHolder<>(NotificationSettingsSectionTitleRow.INSTANCE.inflate(parent, true));
            case 6:
                return new GenericViewHolder<>(NotificationSettingSubtitleRichTextRow.INSTANCE.inflate(parent));
            case 7:
                return new GenericViewHolder<>(NotificationSettingsTitleSubtitleRow.INSTANCE.inflate(parent));
            default:
                Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(viewType));
                throw new ExceptionsH();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(GenericViewHolder<? extends View> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final NotificationSettings4FragmentKey4 item = getItem(position);
        boolean z = item instanceof NotificationSettings4FragmentKey4.Padding;
        if (z) {
            return;
        }
        KeyEvent.Callback view = holder.getView();
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.utils.ui.view.Bindable<com.robinhood.shared.settings.contracts.ViewType>");
        ((Bindable) view).bind(item);
        if (item instanceof NotificationSettings4FragmentKey4.SubPageEntry) {
            OnClickListeners.onClick(holder.getView(), new Function0() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4Adapter$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NotificationSettings4Adapter.onBindViewHolder$lambda$1(this.f$0, item);
                }
            });
            return;
        }
        if (item instanceof NotificationSettings4FragmentKey4.TitleSubtitle) {
            OnClickListeners.onClick(holder.getView(), new Function0() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4Adapter$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NotificationSettings4Adapter.onBindViewHolder$lambda$2(this.f$0, item);
                }
            });
            return;
        }
        if (item instanceof NotificationSettings4FragmentKey4.Toggle) {
            View view2 = holder.getView();
            Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type com.robinhood.android.settings.ui.notification.NotificationSettingsToggleRow");
            ((NotificationSettingsToggleRow) view2).onCheckedChanged(new Function1() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4Adapter$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NotificationSettings4Adapter.onBindViewHolder$lambda$3(this.f$0, item, ((Boolean) obj).booleanValue());
                }
            });
        } else if (item instanceof NotificationSettings4FragmentKey4.RadioGroup) {
            View view3 = holder.getView();
            Intrinsics.checkNotNull(view3, "null cannot be cast to non-null type com.robinhood.android.settings.ui.notification.NotificationSettingsRadioGroup");
            ((NotificationSettingsRadioGroup) view3).setOnSelectionChangedListener(new Function1() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4Adapter$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NotificationSettings4Adapter.onBindViewHolder$lambda$4(this.f$0, item, (String) obj);
                }
            });
        } else if (!z && !(item instanceof NotificationSettings4FragmentKey4.SectionTitle) && !(item instanceof NotificationSettings4FragmentKey4.SubtitleRichText)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$1(NotificationSettings4Adapter notificationSettings4Adapter, NotificationSettings4FragmentKey4 notificationSettings4FragmentKey4) {
        notificationSettings4Adapter.callbacks.onSubPageClicked(((NotificationSettings4FragmentKey4.SubPageEntry) notificationSettings4FragmentKey4).getSubPageReference());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$2(NotificationSettings4Adapter notificationSettings4Adapter, NotificationSettings4FragmentKey4 notificationSettings4FragmentKey4) {
        notificationSettings4Adapter.callbacks.onActionTriggered(((NotificationSettings4FragmentKey4.TitleSubtitle) notificationSettings4FragmentKey4).getAction());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$3(NotificationSettings4Adapter notificationSettings4Adapter, NotificationSettings4FragmentKey4 notificationSettings4FragmentKey4, boolean z) {
        NotificationSettings4FragmentKey4.Toggle toggle = (NotificationSettings4FragmentKey4.Toggle) notificationSettings4FragmentKey4;
        notificationSettings4Adapter.callbacks.onSettingsToggled(toggle.getSectionId(), toggle.getId(), z ? ApiNotificationSettingsToggleSettingsItem.Status.f5427ON : ApiNotificationSettingsToggleSettingsItem.Status.OFF);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$4(NotificationSettings4Adapter notificationSettings4Adapter, NotificationSettings4FragmentKey4 notificationSettings4FragmentKey4, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        NotificationSettings4FragmentKey4.RadioGroup radioGroup = (NotificationSettings4FragmentKey4.RadioGroup) notificationSettings4FragmentKey4;
        notificationSettings4Adapter.callbacks.onSettingsSelected(radioGroup.getParentId(), radioGroup.getId(), value);
        return Unit.INSTANCE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        NotificationSettings4FragmentKey4 item = getItem(position);
        if (item instanceof NotificationSettings4FragmentKey4.SectionTitle) {
            return position == 0 ? 5 : 0;
        }
        if (item instanceof NotificationSettings4FragmentKey4.Toggle) {
            return 1;
        }
        if (item instanceof NotificationSettings4FragmentKey4.SubPageEntry) {
            return 2;
        }
        if (item instanceof NotificationSettings4FragmentKey4.RadioGroup) {
            return 3;
        }
        if (item instanceof NotificationSettings4FragmentKey4.Padding) {
            return 4;
        }
        if (item instanceof NotificationSettings4FragmentKey4.SubtitleRichText) {
            return 6;
        }
        if (item instanceof NotificationSettings4FragmentKey4.TitleSubtitle) {
            return 7;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.recyclerview.widget.ListAdapter
    public NotificationSettings4FragmentKey4 getItem(int position) {
        Object item = super.getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        return (NotificationSettings4FragmentKey4) item;
    }
}
