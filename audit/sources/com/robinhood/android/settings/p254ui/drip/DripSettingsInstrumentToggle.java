package com.robinhood.android.settings.p254ui.drip;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.robinhood.android.common.p088ui.BindViewDelegate2;
import com.robinhood.android.designsystem.selectioncontrol.RdsToggleView;
import com.robinhood.android.settings.p254ui.drip.DripSettingsAdapter;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: DripSettingsInstrumentToggle.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0017B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0016J\u001c\u0010\u0013\u001a\u00020\u00112\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0015R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/drip/DripSettingsInstrumentToggle;", "Landroid/widget/LinearLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/settings/ui/drip/DripSettingsAdapter$DripSettingsRowType$DripInstrumentToggle;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "toggleView", "Lcom/robinhood/android/designsystem/selectioncontrol/RdsToggleView;", "getToggleView", "()Lcom/robinhood/android/designsystem/selectioncontrol/RdsToggleView;", "toggleView$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", "state", "onCheckChanged", "listener", "Lkotlin/Function1;", "", "Companion", "feature-drip-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class DripSettingsInstrumentToggle extends LinearLayout implements Bindable<DripSettingsAdapter.DripSettingsRowType.DripInstrumentToggle> {

    /* renamed from: toggleView$delegate, reason: from kotlin metadata */
    private final Interfaces2 toggleView;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DripSettingsInstrumentToggle.class, "toggleView", "getToggleView()Lcom/robinhood/android/designsystem/selectioncontrol/RdsToggleView;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DripSettingsInstrumentToggle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.toggleView = BindViewDelegate2.bindView$default(this, C28363R.id.instrument_checkbox, null, 2, null);
        ViewGroups.inflate(this, C28363R.layout.merge_drip_settings_instrument_toggle, true);
    }

    private final RdsToggleView getToggleView() {
        return (RdsToggleView) this.toggleView.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(DripSettingsAdapter.DripSettingsRowType.DripInstrumentToggle state) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(state, "state");
        getToggleView().setCheckedProgrammatically(state.getSelected());
        getToggleView().setPrimaryText(state.getInstrument().getSymbol());
    }

    public final void onCheckChanged(Function1<? super Boolean, Unit> listener) {
        getToggleView().onCheckedChanged(listener);
    }

    /* compiled from: DripSettingsInstrumentToggle.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/drip/DripSettingsInstrumentToggle$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/settings/ui/drip/DripSettingsInstrumentToggle;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-drip-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<DripSettingsInstrumentToggle> {
        private final /* synthetic */ Inflater<DripSettingsInstrumentToggle> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public DripSettingsInstrumentToggle inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (DripSettingsInstrumentToggle) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C28363R.layout.include_drip_settings_instrument_toggle);
        }
    }
}
