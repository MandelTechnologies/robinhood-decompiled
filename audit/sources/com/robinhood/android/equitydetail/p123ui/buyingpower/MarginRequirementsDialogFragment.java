package com.robinhood.android.equitydetail.p123ui.buyingpower;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.robinhood.android.common.p088ui.BaseDialogFragment;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.util.resource.DirectResourceReference;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: MarginRequirementsDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u001a\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0011\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0014\u0010\rR\u001b\u0010\u0016\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0017\u0010\rR\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u000f\u001a\u0004\b\u001b\u0010\u001c¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/buyingpower/MarginRequirementsDialogFragment;", "Lcom/robinhood/android/common/ui/BaseDialogFragment;", "<init>", "()V", MarginRequirementsDialogFragment.KEY_INSTRUMENT, "Lcom/robinhood/models/db/Instrument;", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "instrument$delegate", "Lkotlin/Lazy;", "initialMarginLabelText", "Landroid/widget/TextView;", "getInitialMarginLabelText", "()Landroid/widget/TextView;", "initialMarginLabelText$delegate", "Lkotlin/properties/ReadOnlyProperty;", "initialMarginValueText", "getInitialMarginValueText", "initialMarginValueText$delegate", "maintenanceMarginLabelText", "getMaintenanceMarginLabelText", "maintenanceMarginLabelText$delegate", "maintenanceMarginValueText", "getMaintenanceMarginValueText", "maintenanceMarginValueText$delegate", "doneButton", "Landroid/widget/Button;", "getDoneButton", "()Landroid/widget/Button;", "doneButton$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class MarginRequirementsDialogFragment extends BaseDialogFragment {
    private static final String KEY_INSTRUMENT = "instrument";
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MarginRequirementsDialogFragment.class, "initialMarginLabelText", "getInitialMarginLabelText()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(MarginRequirementsDialogFragment.class, "initialMarginValueText", "getInitialMarginValueText()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(MarginRequirementsDialogFragment.class, "maintenanceMarginLabelText", "getMaintenanceMarginLabelText()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(MarginRequirementsDialogFragment.class, "maintenanceMarginValueText", "getMaintenanceMarginValueText()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(MarginRequirementsDialogFragment.class, "doneButton", "getDoneButton()Landroid/widget/Button;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: instrument$delegate, reason: from kotlin metadata */
    private final Lazy instrument = Fragments2.argument(this, KEY_INSTRUMENT);

    /* renamed from: initialMarginLabelText$delegate, reason: from kotlin metadata */
    private final Interfaces2 initialMarginLabelText = bindView(C15314R.id.dialog_margin_requirements_initial_margin_label);

    /* renamed from: initialMarginValueText$delegate, reason: from kotlin metadata */
    private final Interfaces2 initialMarginValueText = bindView(C15314R.id.dialog_margin_requirements_initial_margin_value);

    /* renamed from: maintenanceMarginLabelText$delegate, reason: from kotlin metadata */
    private final Interfaces2 maintenanceMarginLabelText = bindView(C15314R.id.dialog_margin_requirements_maintenance_margin_label);

    /* renamed from: maintenanceMarginValueText$delegate, reason: from kotlin metadata */
    private final Interfaces2 maintenanceMarginValueText = bindView(C15314R.id.dialog_margin_requirements_maintenance_margin_value);

    /* renamed from: doneButton$delegate, reason: from kotlin metadata */
    private final Interfaces2 doneButton = bindView(C15314R.id.dialog_margin_requirements_done);

    private final Instrument getInstrument() {
        return (Instrument) this.instrument.getValue();
    }

    private final TextView getInitialMarginLabelText() {
        return (TextView) this.initialMarginLabelText.getValue(this, $$delegatedProperties[0]);
    }

    private final TextView getInitialMarginValueText() {
        return (TextView) this.initialMarginValueText.getValue(this, $$delegatedProperties[1]);
    }

    private final TextView getMaintenanceMarginLabelText() {
        return (TextView) this.maintenanceMarginLabelText.getValue(this, $$delegatedProperties[2]);
    }

    private final TextView getMaintenanceMarginValueText() {
        return (TextView) this.maintenanceMarginValueText.getValue(this, $$delegatedProperties[3]);
    }

    private final Button getDoneButton() {
        return (Button) this.doneButton.getValue(this, $$delegatedProperties[4]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
        int i = typedValue.resourceId;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        View viewInflate = LayoutInflater.from(new ScarletContextWrapper(contextRequireContext, ScarletManager.AnimationMode.ANIMATED_AND_INHERIT, new DirectResourceReference(ResourceType.STYLE.INSTANCE, i))).inflate(C15314R.layout.dialog_margin_requirements, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        String symbol = getInstrument().getSymbol();
        getInitialMarginLabelText().setText(getResources().getString(C15314R.string.dialog_margin_requirements_initial_ratio, symbol));
        getInitialMarginValueText().setText(Formats.getPercentFormat().format(getInstrument().getMarginInitialRatio()));
        getMaintenanceMarginLabelText().setText(getResources().getString(C15314R.string.dialog_margin_requirements_maintenance_ratio, symbol));
        getMaintenanceMarginValueText().setText(Formats.getPercentFormat().format(getInstrument().getMaintenanceRatio()));
        OnClickListeners.onClick(getDoneButton(), new Function0() { // from class: com.robinhood.android.equitydetail.ui.buyingpower.MarginRequirementsDialogFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginRequirementsDialogFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(MarginRequirementsDialogFragment marginRequirementsDialogFragment) {
        marginRequirementsDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* compiled from: MarginRequirementsDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/buyingpower/MarginRequirementsDialogFragment$Companion;", "", "<init>", "()V", "KEY_INSTRUMENT", "", "newInstance", "Lcom/robinhood/android/equitydetail/ui/buyingpower/MarginRequirementsDialogFragment;", MarginRequirementsDialogFragment.KEY_INSTRUMENT, "Lcom/robinhood/models/db/Instrument;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final MarginRequirementsDialogFragment newInstance(Instrument instrument) {
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            MarginRequirementsDialogFragment marginRequirementsDialogFragment = new MarginRequirementsDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable(MarginRequirementsDialogFragment.KEY_INSTRUMENT, instrument);
            marginRequirementsDialogFragment.setArguments(bundle);
            return marginRequirementsDialogFragment;
        }
    }
}
