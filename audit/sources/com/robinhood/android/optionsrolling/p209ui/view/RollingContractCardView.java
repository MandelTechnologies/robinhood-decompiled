package com.robinhood.android.optionsrolling.p209ui.view;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.options.optionsstring.C23386R;
import com.robinhood.android.options.optionsstring.common.OptionInstrumentDetails2;
import com.robinhood.android.optionsrolling.C24772R;
import com.robinhood.android.optionsrolling.databinding.MergeRollingContractCardViewBinding;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionPositionType;
import com.robinhood.models.p320db.OptionQuote;
import com.robinhood.models.p320db.OrderDirection;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionStrategyDisplay;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.datetime.ZoneIds;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import p479j$.time.LocalDate;
import p479j$.time.temporal.ChronoUnit;

/* compiled from: RollingContractCardView.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002\u0016\u0017B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0003H\u0016R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/optionsrolling/ui/view/RollingContractCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/optionsrolling/ui/view/RollingContractCardView$RollingContractCardData;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bindings", "Lcom/robinhood/android/optionsrolling/databinding/MergeRollingContractCardViewBinding;", "getBindings", "()Lcom/robinhood/android/optionsrolling/databinding/MergeRollingContractCardViewBinding;", "bindings$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bindQuote", "", "quote", "Lcom/robinhood/models/db/OptionQuote;", "bind", "state", "CardType", "RollingContractCardData", "feature-options-rolling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class RollingContractCardView extends ConstraintLayout implements Bindable<RollingContractCardData> {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RollingContractCardView.class, "bindings", "getBindings()Lcom/robinhood/android/optionsrolling/databinding/MergeRollingContractCardViewBinding;", 0))};
    public static final int $stable = 8;

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RollingContractCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C24772R.layout.merge_rolling_contract_card_view, true);
        setForeground(ViewsKt.getDrawable(this, C24772R.drawable.contract_card_outline));
        ScarletManager2.overrideAttribute(this, R.attr.foregroundTint, ThemeAttributes.INSTANCE.getCOLOR_BACKGROUND_3());
        this.bindings = ViewBinding5.viewBinding(this, RollingContractCardView2.INSTANCE);
    }

    public /* synthetic */ RollingContractCardView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RollingContractCardView.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsrolling/ui/view/RollingContractCardView$CardType;", "", "<init>", "(Ljava/lang/String;I)V", "CURRENT_POSITION", "SELECTED_CONTRACT", "feature-options-rolling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CardType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CardType[] $VALUES;
        public static final CardType CURRENT_POSITION = new CardType("CURRENT_POSITION", 0);
        public static final CardType SELECTED_CONTRACT = new CardType("SELECTED_CONTRACT", 1);

        private static final /* synthetic */ CardType[] $values() {
            return new CardType[]{CURRENT_POSITION, SELECTED_CONTRACT};
        }

        public static EnumEntries<CardType> getEntries() {
            return $ENTRIES;
        }

        private CardType(String str, int i) {
        }

        static {
            CardType[] cardTypeArr$values = $values();
            $VALUES = cardTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(cardTypeArr$values);
        }

        public static CardType valueOf(String str) {
            return (CardType) Enum.valueOf(CardType.class, str);
        }

        public static CardType[] values() {
            return (CardType[]) $VALUES.clone();
        }
    }

    /* compiled from: RollingContractCardView.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\t\u0010)\u001a\u00020\rHÆ\u0003JE\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u000201HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0011\u0010\"\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001f¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/optionsrolling/ui/view/RollingContractCardView$RollingContractCardData;", "", "cardType", "Lcom/robinhood/android/optionsrolling/ui/view/RollingContractCardView$CardType;", "optionInstrument", "Lcom/robinhood/models/db/OptionInstrument;", "optionOrderPositionEffect", "Lcom/robinhood/models/ui/UiOptionStrategyDisplay$OptionOrderPositionEffect;", "positionType", "Lcom/robinhood/models/db/OptionPositionType;", "quantity", "Ljava/math/BigDecimal;", "uiOptionChain", "Lcom/robinhood/models/ui/UiOptionChain;", "<init>", "(Lcom/robinhood/android/optionsrolling/ui/view/RollingContractCardView$CardType;Lcom/robinhood/models/db/OptionInstrument;Lcom/robinhood/models/ui/UiOptionStrategyDisplay$OptionOrderPositionEffect;Lcom/robinhood/models/db/OptionPositionType;Ljava/math/BigDecimal;Lcom/robinhood/models/ui/UiOptionChain;)V", "getCardType", "()Lcom/robinhood/android/optionsrolling/ui/view/RollingContractCardView$CardType;", "getOptionInstrument", "()Lcom/robinhood/models/db/OptionInstrument;", "getOptionOrderPositionEffect", "()Lcom/robinhood/models/ui/UiOptionStrategyDisplay$OptionOrderPositionEffect;", "getPositionType", "()Lcom/robinhood/models/db/OptionPositionType;", "getQuantity", "()Ljava/math/BigDecimal;", "getUiOptionChain", "()Lcom/robinhood/models/ui/UiOptionChain;", "headerText", "Lcom/robinhood/utils/resource/StringResource;", "getHeaderText", "()Lcom/robinhood/utils/resource/StringResource;", "priceTitle", "getPriceTitle", "daysUntilExpirationString", "getDaysUntilExpirationString", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-options-rolling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class RollingContractCardData {
        public static final int $stable = 8;
        private final CardType cardType;
        private final StringResource daysUntilExpirationString;
        private final StringResource headerText;
        private final OptionInstrument optionInstrument;
        private final UiOptionStrategyDisplay.OptionOrderPositionEffect optionOrderPositionEffect;
        private final OptionPositionType positionType;
        private final StringResource priceTitle;
        private final BigDecimal quantity;
        private final UiOptionChain uiOptionChain;

        /* compiled from: RollingContractCardView.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[CardType.values().length];
                try {
                    iArr[CardType.CURRENT_POSITION.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CardType.SELECTED_CONTRACT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[OrderDirection.values().length];
                try {
                    iArr2[OrderDirection.DEBIT.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[OrderDirection.CREDIT.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        public static /* synthetic */ RollingContractCardData copy$default(RollingContractCardData rollingContractCardData, CardType cardType, OptionInstrument optionInstrument, UiOptionStrategyDisplay.OptionOrderPositionEffect optionOrderPositionEffect, OptionPositionType optionPositionType, BigDecimal bigDecimal, UiOptionChain uiOptionChain, int i, Object obj) {
            if ((i & 1) != 0) {
                cardType = rollingContractCardData.cardType;
            }
            if ((i & 2) != 0) {
                optionInstrument = rollingContractCardData.optionInstrument;
            }
            if ((i & 4) != 0) {
                optionOrderPositionEffect = rollingContractCardData.optionOrderPositionEffect;
            }
            if ((i & 8) != 0) {
                optionPositionType = rollingContractCardData.positionType;
            }
            if ((i & 16) != 0) {
                bigDecimal = rollingContractCardData.quantity;
            }
            if ((i & 32) != 0) {
                uiOptionChain = rollingContractCardData.uiOptionChain;
            }
            BigDecimal bigDecimal2 = bigDecimal;
            UiOptionChain uiOptionChain2 = uiOptionChain;
            return rollingContractCardData.copy(cardType, optionInstrument, optionOrderPositionEffect, optionPositionType, bigDecimal2, uiOptionChain2);
        }

        /* renamed from: component1, reason: from getter */
        public final CardType getCardType() {
            return this.cardType;
        }

        /* renamed from: component2, reason: from getter */
        public final OptionInstrument getOptionInstrument() {
            return this.optionInstrument;
        }

        /* renamed from: component3, reason: from getter */
        public final UiOptionStrategyDisplay.OptionOrderPositionEffect getOptionOrderPositionEffect() {
            return this.optionOrderPositionEffect;
        }

        /* renamed from: component4, reason: from getter */
        public final OptionPositionType getPositionType() {
            return this.positionType;
        }

        /* renamed from: component5, reason: from getter */
        public final BigDecimal getQuantity() {
            return this.quantity;
        }

        /* renamed from: component6, reason: from getter */
        public final UiOptionChain getUiOptionChain() {
            return this.uiOptionChain;
        }

        public final RollingContractCardData copy(CardType cardType, OptionInstrument optionInstrument, UiOptionStrategyDisplay.OptionOrderPositionEffect optionOrderPositionEffect, OptionPositionType positionType, BigDecimal quantity, UiOptionChain uiOptionChain) {
            Intrinsics.checkNotNullParameter(cardType, "cardType");
            Intrinsics.checkNotNullParameter(optionInstrument, "optionInstrument");
            Intrinsics.checkNotNullParameter(optionOrderPositionEffect, "optionOrderPositionEffect");
            Intrinsics.checkNotNullParameter(positionType, "positionType");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(uiOptionChain, "uiOptionChain");
            return new RollingContractCardData(cardType, optionInstrument, optionOrderPositionEffect, positionType, quantity, uiOptionChain);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RollingContractCardData)) {
                return false;
            }
            RollingContractCardData rollingContractCardData = (RollingContractCardData) other;
            return this.cardType == rollingContractCardData.cardType && Intrinsics.areEqual(this.optionInstrument, rollingContractCardData.optionInstrument) && this.optionOrderPositionEffect == rollingContractCardData.optionOrderPositionEffect && this.positionType == rollingContractCardData.positionType && Intrinsics.areEqual(this.quantity, rollingContractCardData.quantity) && Intrinsics.areEqual(this.uiOptionChain, rollingContractCardData.uiOptionChain);
        }

        public int hashCode() {
            return (((((((((this.cardType.hashCode() * 31) + this.optionInstrument.hashCode()) * 31) + this.optionOrderPositionEffect.hashCode()) * 31) + this.positionType.hashCode()) * 31) + this.quantity.hashCode()) * 31) + this.uiOptionChain.hashCode();
        }

        public String toString() {
            return "RollingContractCardData(cardType=" + this.cardType + ", optionInstrument=" + this.optionInstrument + ", optionOrderPositionEffect=" + this.optionOrderPositionEffect + ", positionType=" + this.positionType + ", quantity=" + this.quantity + ", uiOptionChain=" + this.uiOptionChain + ")";
        }

        public RollingContractCardData(CardType cardType, OptionInstrument optionInstrument, UiOptionStrategyDisplay.OptionOrderPositionEffect optionOrderPositionEffect, OptionPositionType positionType, BigDecimal quantity, UiOptionChain uiOptionChain) {
            int i;
            int i2;
            Intrinsics.checkNotNullParameter(cardType, "cardType");
            Intrinsics.checkNotNullParameter(optionInstrument, "optionInstrument");
            Intrinsics.checkNotNullParameter(optionOrderPositionEffect, "optionOrderPositionEffect");
            Intrinsics.checkNotNullParameter(positionType, "positionType");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(uiOptionChain, "uiOptionChain");
            this.cardType = cardType;
            this.optionInstrument = optionInstrument;
            this.optionOrderPositionEffect = optionOrderPositionEffect;
            this.positionType = positionType;
            this.quantity = quantity;
            this.uiOptionChain = uiOptionChain;
            StringResource.Companion companion = StringResource.INSTANCE;
            int i3 = WhenMappings.$EnumSwitchMapping$0[cardType.ordinal()];
            if (i3 == 1) {
                i = C24772R.string.options_rolling_current_position_text;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C24772R.string.options_rolling_new_position_text;
            }
            this.headerText = companion.invoke(i, new Object[0]);
            int i4 = WhenMappings.$EnumSwitchMapping$1[positionType.getDirection().ordinal()];
            if (i4 == 1) {
                i2 = C23386R.string.order_direction_debit;
            } else {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = C23386R.string.order_direction_credit;
            }
            this.priceTitle = companion.invoke(i2, new Object[0]);
            LocalDate localDateNow = LocalDate.now(ZoneIds.INSTANCE.getNEW_YORK());
            Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
            int iUntil = (int) localDateNow.until(optionInstrument.getExpirationDate(), ChronoUnit.DAYS);
            this.daysUntilExpirationString = companion.invoke(new StringResource.PluralsResource(C24772R.plurals.options_rolling_time_left_text, iUntil), Integer.valueOf(iUntil));
        }

        public final CardType getCardType() {
            return this.cardType;
        }

        public final OptionInstrument getOptionInstrument() {
            return this.optionInstrument;
        }

        public final UiOptionStrategyDisplay.OptionOrderPositionEffect getOptionOrderPositionEffect() {
            return this.optionOrderPositionEffect;
        }

        public final OptionPositionType getPositionType() {
            return this.positionType;
        }

        public final BigDecimal getQuantity() {
            return this.quantity;
        }

        public final UiOptionChain getUiOptionChain() {
            return this.uiOptionChain;
        }

        public final StringResource getHeaderText() {
            return this.headerText;
        }

        public final StringResource getPriceTitle() {
            return this.priceTitle;
        }

        public final StringResource getDaysUntilExpirationString() {
            return this.daysUntilExpirationString;
        }
    }

    private final MergeRollingContractCardViewBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeRollingContractCardViewBinding) value;
    }

    public final void bindQuote(OptionQuote quote) {
        Intrinsics.checkNotNullParameter(quote, "quote");
        getBindings().optionsRollingCurrentPrice.setText(Formats.getPriceFormat().format(quote.getAdjustedMarkPrice().getUnsignedValue()));
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(RollingContractCardData state) {
        Intrinsics.checkNotNullParameter(state, "state");
        MergeRollingContractCardViewBinding bindings = getBindings();
        if (state.getCardType() == CardType.CURRENT_POSITION) {
            View optionsRollingColoredBackground = bindings.optionsRollingColoredBackground;
            Intrinsics.checkNotNullExpressionValue(optionsRollingColoredBackground, "optionsRollingColoredBackground");
            optionsRollingColoredBackground.setVisibility(0);
        }
        Group optionsRollingSelectNewContractGroup = bindings.optionsRollingSelectNewContractGroup;
        Intrinsics.checkNotNullExpressionValue(optionsRollingSelectNewContractGroup, "optionsRollingSelectNewContractGroup");
        optionsRollingSelectNewContractGroup.setVisibility(4);
        Group optionsRollingContractCardGroup = bindings.optionsRollingContractCardGroup;
        Intrinsics.checkNotNullExpressionValue(optionsRollingContractCardGroup, "optionsRollingContractCardGroup");
        optionsRollingContractCardGroup.setVisibility(0);
        TextView textView = bindings.optionsRollingHeader;
        StringResource headerText = state.getHeaderText();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        textView.setText(headerText.getText(resources));
        TextView textView2 = bindings.optionsRollingCardTitle;
        OptionInstrument optionInstrument = state.getOptionInstrument();
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        textView2.setText(OptionInstrumentDetails2.getFormattedTitleStringWithExpirationSubtitle(optionInstrument, resources2, state.getUiOptionChain().getUnderlyingType()));
        TextView textView3 = bindings.optionsRollingCardSubtitle;
        OptionInstrument optionInstrument2 = state.getOptionInstrument();
        Resources resources3 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
        textView3.setText(OptionInstrumentDetails2.getFormattedSubtitleString(optionInstrument2, resources3, state.getQuantity(), state.getPositionType(), state.getOptionOrderPositionEffect(), state.getUiOptionChain().getOptionChain().getSettleOnOpen()));
        TextView textView4 = bindings.optionsRollingTimeLeft;
        StringResource daysUntilExpirationString = state.getDaysUntilExpirationString();
        Resources resources4 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
        textView4.setText(daysUntilExpirationString.getText(resources4));
        TextView textView5 = bindings.optionsRollingCurrentPriceTitle;
        StringResource priceTitle = state.getPriceTitle();
        Resources resources5 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources5, "getResources(...)");
        textView5.setText(priceTitle.getText(resources5));
    }
}
