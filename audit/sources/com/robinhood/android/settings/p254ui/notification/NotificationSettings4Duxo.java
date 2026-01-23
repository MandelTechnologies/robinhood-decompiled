package com.robinhood.android.settings.p254ui.notification;

import android.content.res.Resources;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.NotificationSettingStore;
import com.robinhood.models.api.ApiNotificationSettings;
import com.robinhood.models.api.ApiNotificationSettingsItem;
import com.robinhood.models.api.ApiNotificationSettingsToggleSettingsItem;
import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey;
import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey3;
import com.robinhood.udf.UiEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NotificationSettings4Duxo.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0007\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001cB!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0016\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017J\u001c\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001aJ\b\u0010\u001b\u001a\u00020\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/NotificationSettings4Duxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "notificationSettingStore", "Lcom/robinhood/librobinhood/data/store/NotificationSettingStore;", "resources", "Landroid/content/res/Resources;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/NotificationSettingStore;Landroid/content/res/Resources;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "settingsId", "", "getSettingsId", "()Ljava/lang/String;", "onResume", "", "toggleItem", "itemId", "status", "Lcom/robinhood/models/api/ApiNotificationSettingsToggleSettingsItem$Status;", "selectItem", "values", "", "refreshUI", "Companion", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class NotificationSettings4Duxo extends OldBaseDuxo<NotificationSettings4ViewState> implements HasSavedState {
    private final NotificationSettingStore notificationSettingStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NotificationSettings4Duxo(NotificationSettingStore notificationSettingStore, Resources resources, SavedStateHandle savedStateHandle) {
        super(new NotificationSettings4ViewState(null, null, ((NotificationSettings4FragmentKey) INSTANCE.getArgs(savedStateHandle)).getSubPageReference(), resources, 3, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(notificationSettingStore, "notificationSettingStore");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.notificationSettingStore = notificationSettingStore;
        this.savedStateHandle = savedStateHandle;
    }

    private final String getSettingsId() {
        NotificationSettings4FragmentKey3 subPageReference = ((NotificationSettings4FragmentKey) INSTANCE.getArgs((HasSavedState) this)).getSubPageReference();
        if (subPageReference != null) {
            return subPageReference.getId();
        }
        return null;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        NotificationSettings4FragmentKey3 subPageReference = ((NotificationSettings4FragmentKey) INSTANCE.getArgs((HasSavedState) this)).getSubPageReference();
        NotificationSettings4FragmentKey3.FromId fromId = subPageReference instanceof NotificationSettings4FragmentKey3.FromId ? (NotificationSettings4FragmentKey3.FromId) subPageReference : null;
        if (fromId != null) {
            LifecycleHost.DefaultImpls.bind$default(this, this.notificationSettingStore.streamNotificationSettings(fromId.getId()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4Duxo$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NotificationSettings4Duxo.onResume$lambda$1(this.f$0, (ApiNotificationSettings) obj);
                }
            });
            refreshUI();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(NotificationSettings4Duxo notificationSettings4Duxo, final ApiNotificationSettings notificationSettings) {
        Intrinsics.checkNotNullParameter(notificationSettings, "notificationSettings");
        notificationSettings4Duxo.applyMutation(new Function1() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4Duxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NotificationSettings4Duxo.onResume$lambda$1$lambda$0(notificationSettings, (NotificationSettings4ViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NotificationSettings4ViewState onResume$lambda$1$lambda$0(ApiNotificationSettings apiNotificationSettings, NotificationSettings4ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return NotificationSettings4ViewState.copy$default(applyMutation, apiNotificationSettings, null, null, null, 14, null);
    }

    public final void toggleItem(String itemId, ApiNotificationSettingsToggleSettingsItem.Status status) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(status, "status");
        NotificationSettingStore notificationSettingStore = this.notificationSettingStore;
        String settingsId = getSettingsId();
        Intrinsics.checkNotNull(settingsId);
        LifecycleHost.DefaultImpls.bind$default(this, notificationSettingStore.toggleNotificationSettings(settingsId, itemId, status), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4Duxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NotificationSettings4Duxo.toggleItem$lambda$2((ApiNotificationSettingsItem) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4Duxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NotificationSettings4Duxo.toggleItem$lambda$4(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toggleItem$lambda$2(ApiNotificationSettingsItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toggleItem$lambda$4(NotificationSettings4Duxo notificationSettings4Duxo, final Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        notificationSettings4Duxo.applyMutation(new Function1() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4Duxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NotificationSettings4Duxo.toggleItem$lambda$4$lambda$3(it, (NotificationSettings4ViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NotificationSettings4ViewState toggleItem$lambda$4$lambda$3(Throwable th, NotificationSettings4ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return NotificationSettings4ViewState.copy$default(applyMutation, null, new UiEvent(th), null, null, 13, null);
    }

    public final void selectItem(String itemId, List<String> values) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(values, "values");
        NotificationSettingStore notificationSettingStore = this.notificationSettingStore;
        String settingsId = getSettingsId();
        Intrinsics.checkNotNull(settingsId);
        LifecycleHost.DefaultImpls.bind$default(this, notificationSettingStore.selectNotificationSettings(settingsId, itemId, values), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4Duxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NotificationSettings4Duxo.selectItem$lambda$5((Unit) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4Duxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NotificationSettings4Duxo.selectItem$lambda$7(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit selectItem$lambda$5(Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit selectItem$lambda$7(NotificationSettings4Duxo notificationSettings4Duxo, final Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        notificationSettings4Duxo.applyMutation(new Function1() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4Duxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NotificationSettings4Duxo.selectItem$lambda$7$lambda$6(it, (NotificationSettings4ViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NotificationSettings4ViewState selectItem$lambda$7$lambda$6(Throwable th, NotificationSettings4ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return NotificationSettings4ViewState.copy$default(applyMutation, null, new UiEvent(th), null, null, 13, null);
    }

    private final void refreshUI() {
        if (getSettingsId() != null) {
            NotificationSettingStore notificationSettingStore = this.notificationSettingStore;
            String settingsId = getSettingsId();
            Intrinsics.checkNotNull(settingsId);
            LifecycleHost.DefaultImpls.bind$default(this, notificationSettingStore.refreshNotifications(settingsId), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4Duxo$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            }, new Function1() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4Duxo$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NotificationSettings4Duxo.refreshUI$lambda$10(this.f$0, (Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshUI$lambda$10(NotificationSettings4Duxo notificationSettings4Duxo, final Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        notificationSettings4Duxo.applyMutation(new Function1() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4Duxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NotificationSettings4Duxo.refreshUI$lambda$10$lambda$9(it, (NotificationSettings4ViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NotificationSettings4ViewState refreshUI$lambda$10$lambda$9(Throwable th, NotificationSettings4ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return NotificationSettings4ViewState.copy$default(applyMutation, null, new UiEvent(th), null, null, 13, null);
    }

    /* compiled from: NotificationSettings4Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/NotificationSettings4Duxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/settings/ui/notification/NotificationSettings4Duxo;", "Lcom/robinhood/shared/settings/contracts/NotificationSettings4FragmentKey;", "<init>", "()V", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<NotificationSettings4Duxo, NotificationSettings4FragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public NotificationSettings4FragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (NotificationSettings4FragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public NotificationSettings4FragmentKey getArgs(NotificationSettings4Duxo notificationSettings4Duxo) {
            return (NotificationSettings4FragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, notificationSettings4Duxo);
        }
    }
}
