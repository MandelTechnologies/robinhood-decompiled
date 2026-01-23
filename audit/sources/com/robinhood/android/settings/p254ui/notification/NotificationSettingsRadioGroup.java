package com.robinhood.android.settings.p254ui.notification;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroup2;
import com.robinhood.android.designsystem.selectioncontrol.LegacyRdsRadioButton;
import com.robinhood.android.designsystem.selectioncontrol.LegacyRdsRadioGroup;
import com.robinhood.android.linking.MobileLinkingDeeplinkConstants;
import com.robinhood.android.settings.C28315R;
import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey4;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: NotificationSettingsRadioGroup.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0001\u001eB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0003H\u0016J\u0018\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0018H\u0016R7\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/NotificationSettingsRadioGroup;", "Lcom/robinhood/android/designsystem/selectioncontrol/LegacyRdsRadioGroup;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/shared/settings/contracts/ViewType$RadioGroup;", "Lcom/robinhood/android/designsystem/selectioncontrol/LegacyRdsRadioGroup$OnCheckedChangeListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "onSelectionChangedListener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "value", "", "getOnSelectionChangedListener", "()Lkotlin/jvm/functions/Function1;", "setOnSelectionChangedListener", "(Lkotlin/jvm/functions/Function1;)V", "radioButtonIdToOptionValueMap", "", "", "bind", "state", "onCheckedChanged", MobileLinkingDeeplinkConstants.group_id_param, "checkedId", "Companion", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class NotificationSettingsRadioGroup extends LegacyRdsRadioGroup implements Bindable<NotificationSettings4FragmentKey4.RadioGroup>, LegacyRdsRadioGroup.OnCheckedChangeListener {
    private Function1<? super String, Unit> onSelectionChangedListener;
    private final Map<Integer, String> radioButtonIdToOptionValueMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationSettingsRadioGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.radioButtonIdToOptionValueMap = new LinkedHashMap();
        setOnCheckedChangeListener(this);
    }

    public final Function1<String, Unit> getOnSelectionChangedListener() {
        return this.onSelectionChangedListener;
    }

    public final void setOnSelectionChangedListener(Function1<? super String, Unit> function1) {
        this.onSelectionChangedListener = function1;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(NotificationSettings4FragmentKey4.RadioGroup state) {
        Intrinsics.checkNotNullParameter(state, "state");
        setOnCheckedChangeListener(null);
        removeAllViews();
        this.radioButtonIdToOptionValueMap.clear();
        int size = state.getOptions().size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            ViewGroups.inflate(this, C28315R.layout.merge_notification_settings_radio_group, true);
        }
        Sequence sequenceFilter = SequencesKt.filter(ViewGroup2.getChildren(this), new Function1<Object, Boolean>() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettingsRadioGroup$bind$$inlined$filterIsInstance$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof LegacyRdsRadioButton);
            }
        });
        Intrinsics.checkNotNull(sequenceFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        for (Object obj : sequenceFilter) {
            int i3 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            LegacyRdsRadioButton legacyRdsRadioButton = (LegacyRdsRadioButton) obj;
            legacyRdsRadioButton.setPrimaryText(state.getOptions().get(i));
            legacyRdsRadioButton.setSecondaryText((CharSequence) CollectionsKt.getOrNull(state.getOptionsSubtitle(), i));
            legacyRdsRadioButton.setId(View.generateViewId());
            this.radioButtonIdToOptionValueMap.put(Integer.valueOf(legacyRdsRadioButton.getId()), state.getOptionValues().get(i));
            if (Intrinsics.areEqual(state.getSelectedValue(), state.getOptionValues().get(i))) {
                check(legacyRdsRadioButton.getId());
            }
            i = i3;
        }
        setOnCheckedChangeListener(this);
    }

    @Override // com.robinhood.android.designsystem.selectioncontrol.LegacyRdsRadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(LegacyRdsRadioGroup group, int checkedId) {
        Intrinsics.checkNotNullParameter(group, "group");
        Function1<? super String, Unit> function1 = this.onSelectionChangedListener;
        if (function1 != null) {
            String str = this.radioButtonIdToOptionValueMap.get(Integer.valueOf(checkedId));
            Intrinsics.checkNotNull(str);
            function1.invoke(str);
        }
    }

    /* compiled from: NotificationSettingsRadioGroup.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/NotificationSettingsRadioGroup$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/settings/ui/notification/NotificationSettingsRadioGroup;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<NotificationSettingsRadioGroup> {
        private final /* synthetic */ Inflater<NotificationSettingsRadioGroup> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public NotificationSettingsRadioGroup inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (NotificationSettingsRadioGroup) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C28315R.layout.include_notification_settings_radio_group);
        }
    }
}
