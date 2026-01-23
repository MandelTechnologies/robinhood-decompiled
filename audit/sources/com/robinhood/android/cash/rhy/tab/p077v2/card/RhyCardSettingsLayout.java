package com.robinhood.android.cash.rhy.tab.p077v2.card;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.cash.rhy.tab.databinding.MergeRhyCardSettingsLayoutBinding;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.selectioncontrol.RdsToggleView;
import com.robinhood.utils.extensions.ViewGroups;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RhyCardSettingsLayout.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011R\u0011\u0010\u001e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0011R\u0011\u0010 \u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0011\u0010\"\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/card/RhyCardSettingsLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/cash/rhy/tab/databinding/MergeRhyCardSettingsLayoutBinding;", "getBinding", "()Lcom/robinhood/android/cash/rhy/tab/databinding/MergeRhyCardSettingsLayoutBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "showCardNumberToggle", "Lcom/robinhood/android/designsystem/selectioncontrol/RdsToggleView;", "getShowCardNumberToggle", "()Lcom/robinhood/android/designsystem/selectioncontrol/RdsToggleView;", "spendAlertToggle", "getSpendAlertToggle", "cashCushionToggle", "getCashCushionToggle", "googlePayRow", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "getGooglePayRow", "()Lcom/robinhood/android/designsystem/row/RdsRowView;", "mailCardRow", "getMailCardRow", "settingsLockCardToggle", "getSettingsLockCardToggle", "locationProtectionToggle", "getLocationProtectionToggle", "changePinRow", "getChangePinRow", "reportProblemRow", "getReportProblemRow", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class RhyCardSettingsLayout extends ConstraintLayout {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RhyCardSettingsLayout.class, "binding", "getBinding()Lcom/robinhood/android/cash/rhy/tab/databinding/MergeRhyCardSettingsLayoutBinding;", 0))};
    public static final int $stable = 8;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final RdsToggleView cashCushionToggle;
    private final RdsRowView changePinRow;
    private final RdsRowView googlePayRow;
    private final RdsToggleView locationProtectionToggle;
    private final RdsRowView mailCardRow;
    private final RdsRowView reportProblemRow;
    private final RdsToggleView settingsLockCardToggle;
    private final RdsToggleView showCardNumberToggle;
    private final RdsToggleView spendAlertToggle;

    public /* synthetic */ RhyCardSettingsLayout(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhyCardSettingsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C10285R.layout.merge_rhy_card_settings_layout, true);
        this.binding = ViewBinding5.viewBinding(this, RhyCardSettingsLayout2.INSTANCE);
        RdsToggleView rhyCardSettingsShowCardNumberToggle = getBinding().rhyCardSettingsShowCardNumberToggle;
        Intrinsics.checkNotNullExpressionValue(rhyCardSettingsShowCardNumberToggle, "rhyCardSettingsShowCardNumberToggle");
        this.showCardNumberToggle = rhyCardSettingsShowCardNumberToggle;
        RdsToggleView rhyCardSettingsSpendAlertToggle = getBinding().rhyCardSettingsSpendAlertToggle;
        Intrinsics.checkNotNullExpressionValue(rhyCardSettingsSpendAlertToggle, "rhyCardSettingsSpendAlertToggle");
        this.spendAlertToggle = rhyCardSettingsSpendAlertToggle;
        RdsToggleView rhyCardSettingsCashCushionToggle = getBinding().rhyCardSettingsCashCushionToggle;
        Intrinsics.checkNotNullExpressionValue(rhyCardSettingsCashCushionToggle, "rhyCardSettingsCashCushionToggle");
        this.cashCushionToggle = rhyCardSettingsCashCushionToggle;
        RdsRowView rhyCardSettingsGooglePayRow = getBinding().rhyCardSettingsGooglePayRow;
        Intrinsics.checkNotNullExpressionValue(rhyCardSettingsGooglePayRow, "rhyCardSettingsGooglePayRow");
        this.googlePayRow = rhyCardSettingsGooglePayRow;
        RdsRowView rhyCardSettingsMailCardRow = getBinding().rhyCardSettingsMailCardRow;
        Intrinsics.checkNotNullExpressionValue(rhyCardSettingsMailCardRow, "rhyCardSettingsMailCardRow");
        this.mailCardRow = rhyCardSettingsMailCardRow;
        RdsToggleView rhyCardSettingsLockCardToggle = getBinding().rhyCardSettingsLockCardToggle;
        Intrinsics.checkNotNullExpressionValue(rhyCardSettingsLockCardToggle, "rhyCardSettingsLockCardToggle");
        this.settingsLockCardToggle = rhyCardSettingsLockCardToggle;
        RdsToggleView rhyCardSettingsLocationProtectionToggle = getBinding().rhyCardSettingsLocationProtectionToggle;
        Intrinsics.checkNotNullExpressionValue(rhyCardSettingsLocationProtectionToggle, "rhyCardSettingsLocationProtectionToggle");
        this.locationProtectionToggle = rhyCardSettingsLocationProtectionToggle;
        RdsRowView rhyCardSettingsChangePinRow = getBinding().rhyCardSettingsChangePinRow;
        Intrinsics.checkNotNullExpressionValue(rhyCardSettingsChangePinRow, "rhyCardSettingsChangePinRow");
        this.changePinRow = rhyCardSettingsChangePinRow;
        RdsRowView rhyCardSettingsReportProblemRow = getBinding().rhyCardSettingsReportProblemRow;
        Intrinsics.checkNotNullExpressionValue(rhyCardSettingsReportProblemRow, "rhyCardSettingsReportProblemRow");
        this.reportProblemRow = rhyCardSettingsReportProblemRow;
    }

    private final MergeRhyCardSettingsLayoutBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeRhyCardSettingsLayoutBinding) value;
    }

    public final RdsToggleView getShowCardNumberToggle() {
        return this.showCardNumberToggle;
    }

    public final RdsToggleView getSpendAlertToggle() {
        return this.spendAlertToggle;
    }

    public final RdsToggleView getCashCushionToggle() {
        return this.cashCushionToggle;
    }

    public final RdsRowView getGooglePayRow() {
        return this.googlePayRow;
    }

    public final RdsRowView getMailCardRow() {
        return this.mailCardRow;
    }

    public final RdsToggleView getSettingsLockCardToggle() {
        return this.settingsLockCardToggle;
    }

    public final RdsToggleView getLocationProtectionToggle() {
        return this.locationProtectionToggle;
    }

    public final RdsRowView getChangePinRow() {
        return this.changePinRow;
    }

    public final RdsRowView getReportProblemRow() {
        return this.reportProblemRow;
    }
}
