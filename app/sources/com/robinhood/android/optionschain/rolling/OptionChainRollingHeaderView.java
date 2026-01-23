package com.robinhood.android.optionschain.rolling;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.options.contracts.OptionChainLaunchMode;
import com.robinhood.android.options.optionsstring.common.OptionInstrumentDetails2;
import com.robinhood.android.optionschain.C24135R;
import com.robinhood.android.optionschain.databinding.MergeOptionChainRollingHeaderViewBinding;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Bindable;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: OptionChainRollingHeaderView.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0013B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0016R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/optionschain/rolling/OptionChainRollingHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/optionschain/rolling/OptionChainRollingHeaderView$RollingHeaderData;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/optionschain/databinding/MergeOptionChainRollingHeaderViewBinding;", "getBinding", "()Lcom/robinhood/android/optionschain/databinding/MergeOptionChainRollingHeaderViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", "state", "RollingHeaderData", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionChainRollingHeaderView extends ConstraintLayout implements Bindable<RollingHeaderData> {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionChainRollingHeaderView.class, "binding", "getBinding()Lcom/robinhood/android/optionschain/databinding/MergeOptionChainRollingHeaderViewBinding;", 0))};
    public static final int $stable = 8;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    public /* synthetic */ OptionChainRollingHeaderView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionChainRollingHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewBinding5.viewBinding(this, OptionChainRollingHeaderView2.INSTANCE);
        ViewGroups.inflate(this, C24135R.layout.merge_option_chain_rolling_header_view, true);
        setBackground(ViewsKt.getDrawable(this, C24135R.drawable.ic_rolling_position_container));
        ScarletManager2.overrideAttribute(this, R.attr.backgroundTint, ThemeAttributes.INSTANCE.getCOLOR_BACKGROUND_3());
    }

    private final MergeOptionChainRollingHeaderViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeOptionChainRollingHeaderViewBinding) value;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(RollingHeaderData state) throws Resources.NotFoundException {
        String string2;
        Intrinsics.checkNotNullParameter(state, "state");
        RhTextView rhTextView = getBinding().rollingPositionTitle;
        OptionInstrument optionInstrumentToRoll = state.getRollingLaunchMode().getOptionInstrumentToRoll();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rhTextView.setText(OptionInstrumentDetails2.getFormattedTitleStringWithExpirationSubtitle(optionInstrumentToRoll, resources, OptionChain.UnderlyingType.EQUITY));
        RhTextView rhTextView2 = getBinding().rollingPositionSubtitle;
        OptionInstrument optionInstrumentToRoll2 = state.getRollingLaunchMode().getOptionInstrumentToRoll();
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        rhTextView2.setText(OptionInstrumentDetails2.getFormattedSubtitleString(optionInstrumentToRoll2, resources2, state.getRollingLaunchMode().getQuantity(), state.getRollingLaunchMode().getPositionType(), null, state.getRollingLaunchMode().getSettleOnOpen()));
        RhTextView rhTextView3 = getBinding().rollingPositionPrice;
        if (state.getOptionInstrumentToRollMarkPrice() != null) {
            string2 = Formats.getPriceFormat().format(state.getOptionInstrumentToRollMarkPrice());
        } else {
            string2 = getResources().getString(C11048R.string.general_label_n_a_short);
            Intrinsics.checkNotNull(string2);
        }
        rhTextView3.setText(string2);
    }

    /* compiled from: OptionChainRollingHeaderView.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/optionschain/rolling/OptionChainRollingHeaderView$RollingHeaderData;", "", "rollingLaunchMode", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$RollingContractSelector;", "optionInstrumentToRollMarkPrice", "Ljava/math/BigDecimal;", "<init>", "(Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$RollingContractSelector;Ljava/math/BigDecimal;)V", "getRollingLaunchMode", "()Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$RollingContractSelector;", "getOptionInstrumentToRollMarkPrice", "()Ljava/math/BigDecimal;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RollingHeaderData {
        public static final int $stable = 8;
        private final BigDecimal optionInstrumentToRollMarkPrice;
        private final OptionChainLaunchMode.RollingContractSelector rollingLaunchMode;

        public static /* synthetic */ RollingHeaderData copy$default(RollingHeaderData rollingHeaderData, OptionChainLaunchMode.RollingContractSelector rollingContractSelector, BigDecimal bigDecimal, int i, Object obj) {
            if ((i & 1) != 0) {
                rollingContractSelector = rollingHeaderData.rollingLaunchMode;
            }
            if ((i & 2) != 0) {
                bigDecimal = rollingHeaderData.optionInstrumentToRollMarkPrice;
            }
            return rollingHeaderData.copy(rollingContractSelector, bigDecimal);
        }

        /* renamed from: component1, reason: from getter */
        public final OptionChainLaunchMode.RollingContractSelector getRollingLaunchMode() {
            return this.rollingLaunchMode;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getOptionInstrumentToRollMarkPrice() {
            return this.optionInstrumentToRollMarkPrice;
        }

        public final RollingHeaderData copy(OptionChainLaunchMode.RollingContractSelector rollingLaunchMode, BigDecimal optionInstrumentToRollMarkPrice) {
            Intrinsics.checkNotNullParameter(rollingLaunchMode, "rollingLaunchMode");
            return new RollingHeaderData(rollingLaunchMode, optionInstrumentToRollMarkPrice);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RollingHeaderData)) {
                return false;
            }
            RollingHeaderData rollingHeaderData = (RollingHeaderData) other;
            return Intrinsics.areEqual(this.rollingLaunchMode, rollingHeaderData.rollingLaunchMode) && Intrinsics.areEqual(this.optionInstrumentToRollMarkPrice, rollingHeaderData.optionInstrumentToRollMarkPrice);
        }

        public int hashCode() {
            int iHashCode = this.rollingLaunchMode.hashCode() * 31;
            BigDecimal bigDecimal = this.optionInstrumentToRollMarkPrice;
            return iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode());
        }

        public String toString() {
            return "RollingHeaderData(rollingLaunchMode=" + this.rollingLaunchMode + ", optionInstrumentToRollMarkPrice=" + this.optionInstrumentToRollMarkPrice + ")";
        }

        public RollingHeaderData(OptionChainLaunchMode.RollingContractSelector rollingLaunchMode, BigDecimal bigDecimal) {
            Intrinsics.checkNotNullParameter(rollingLaunchMode, "rollingLaunchMode");
            this.rollingLaunchMode = rollingLaunchMode;
            this.optionInstrumentToRollMarkPrice = bigDecimal;
        }

        public final OptionChainLaunchMode.RollingContractSelector getRollingLaunchMode() {
            return this.rollingLaunchMode;
        }

        public final BigDecimal getOptionInstrumentToRollMarkPrice() {
            return this.optionInstrumentToRollMarkPrice;
        }
    }
}
