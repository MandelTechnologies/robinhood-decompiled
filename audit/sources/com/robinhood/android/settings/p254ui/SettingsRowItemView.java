package com.robinhood.android.settings.p254ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.robinhood.android.designsystem.row.RdsSettingsRowView;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoColorMapper;
import com.robinhood.android.settings.models.p253ui.TypedSettingsItem;
import com.robinhood.android.settings.p254ui.SettingsAdapter;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SettingsRowItemView.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0002\u0014\u0015B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003H\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/SettingsRowItemView;", "Lcom/robinhood/android/designsystem/row/RdsSettingsRowView;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/settings/models/ui/TypedSettingsItem$SettingsRowItem;", "Lcom/robinhood/android/settings/ui/BaseSettingsView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "callbacks", "Lcom/robinhood/android/settings/ui/SettingsAdapter$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/settings/ui/SettingsAdapter$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/settings/ui/SettingsAdapter$Callbacks;)V", "bind", "", "state", "Stacked", "Condensed", "feature-lib-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SettingsRowItemView extends RdsSettingsRowView implements Bindable<TypedSettingsItem.SettingsRowItem>, BaseSettingsView {
    public static final int $stable = 8;
    private SettingsAdapter.Callbacks callbacks;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsRowItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.robinhood.android.settings.p254ui.BaseSettingsView
    public SettingsAdapter.Callbacks getCallbacks() {
        return this.callbacks;
    }

    @Override // com.robinhood.android.settings.p254ui.BaseSettingsView
    public void setCallbacks(SettingsAdapter.Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(final TypedSettingsItem.SettingsRowItem state) {
        Intrinsics.checkNotNullParameter(state, "state");
        setLabelText(state.getTitle());
        setValueText(state.getValue());
        String colorOverride = state.getColorOverride();
        overrideLabelAndValueTextColor(colorOverride != null ? ServerToBentoColorMapper.INSTANCE.mapSimpleServerColor(colorOverride) : null);
        if (state instanceof TypedSettingsItem.CondensedSettingsRowItem) {
            setMetadataText(null);
            setMetadataTextColorStateList(null);
        } else {
            if (!(state instanceof TypedSettingsItem.StackedSettingsRowItem)) {
                throw new NoWhenBranchMatchedException();
            }
            TypedSettingsItem.StackedSettingsRowItem stackedSettingsRowItem = (TypedSettingsItem.StackedSettingsRowItem) state;
            setMetadataText(stackedSettingsRowItem.getMetadata());
            String metadataColor = stackedSettingsRowItem.getMetadataColor();
            setMetadataTextColor(metadataColor != null ? ServerToBentoColorMapper.INSTANCE.mapSimpleServerColor(metadataColor) : null);
        }
        final GenericAction action = state.getAction();
        OnClickListeners.onClick(this, new Function0() { // from class: com.robinhood.android.settings.ui.SettingsRowItemView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SettingsRowItemView.bind$lambda$1(this.f$0, action, state);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$1(SettingsRowItemView settingsRowItemView, GenericAction genericAction, TypedSettingsItem.SettingsRowItem settingsRowItem) {
        SettingsAdapter.Callbacks callbacks = settingsRowItemView.getCallbacks();
        if (callbacks == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (genericAction != null) {
            callbacks.onSettingsActionTriggered(genericAction, settingsRowItem);
        } else {
            callbacks.onValueItemClicked(settingsRowItem, settingsRowItemView);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: SettingsRowItemView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/SettingsRowItemView$Stacked;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/settings/ui/SettingsRowItemView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Stacked implements Inflater<SettingsRowItemView> {
        private final /* synthetic */ Inflater<SettingsRowItemView> $$delegate_0 = Inflater.INSTANCE.include(C28356R.layout.include_settings_row_item_view_stacked);
        public static final Stacked INSTANCE = new Stacked();
        public static final int $stable = 8;

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public SettingsRowItemView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (SettingsRowItemView) this.$$delegate_0.inflate(parent);
        }

        private Stacked() {
        }
    }

    /* compiled from: SettingsRowItemView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/SettingsRowItemView$Condensed;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/settings/ui/SettingsRowItemView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Condensed implements Inflater<SettingsRowItemView> {
        private final /* synthetic */ Inflater<SettingsRowItemView> $$delegate_0 = Inflater.INSTANCE.include(C28356R.layout.include_settings_row_item_view_condensed);
        public static final Condensed INSTANCE = new Condensed();
        public static final int $stable = 8;

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public SettingsRowItemView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (SettingsRowItemView) this.$$delegate_0.inflate(parent);
        }

        private Condensed() {
        }
    }
}
