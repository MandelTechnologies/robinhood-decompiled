package com.robinhood.android.event.gamedetail.builders.tradebottomsheet;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.event.gamedetail.C16283R;
import com.robinhood.android.eventcontracts.contracts.EventTradeOrderContext;
import com.robinhood.android.eventcontracts.models.event.ContractSide;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import com.robinhood.android.optionchain.chainsettings.logging.OptionChainCustomizationLogging;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: BuildTradeButton.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u0000 22\u00020\u0001:\u0004/012B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003JI\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010*\u001a\u00020\u00052\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u00020\u0005¢\u0006\n\n\u0002\b\u0018\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u001f\u001a\u0004\u0018\u00010 8G¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton;", "", AnnotatedPrivateKey.LABEL, "Lcom/robinhood/utils/resource/StringResource;", "enabled", "", ResourceTypes.STYLE, "Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton$Style;", "action", "Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton$Action;", "loading", "loggingIdentifier", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;ZLcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton$Style;Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton$Action;ZLjava/lang/String;)V", "getLabel", "()Lcom/robinhood/utils/resource/StringResource;", "getEnabled", "()Z", "getStyle", "()Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton$Style;", "getAction", "()Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton$Action;", "getLoading", "loading$1", "getLoggingIdentifier", "()Ljava/lang/String;", "buttonType", "Lcom/robinhood/compose/bento/component/BentoButtons$Type;", "getButtonType", "()Lcom/robinhood/compose/bento/component/BentoButtons$Type;", "buttonColorOverrides", "Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton$ButtonColorOverrides;", "getButtonColorOverrides", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton$ButtonColorOverrides;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "Action", "ButtonColorOverrides", "Style", "Companion", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TradeButton {
    private static final TradeButton loading;
    private static final TradeButton unavailable;
    private final Action action;
    private final boolean enabled;
    private final StringResource label;

    /* renamed from: loading$1, reason: from kotlin metadata and from toString */
    private final boolean loading;
    private final String loggingIdentifier;
    private final Style style;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = StringResource.$stable;

    public static /* synthetic */ TradeButton copy$default(TradeButton tradeButton, StringResource stringResource, boolean z, Style style, Action action, boolean z2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = tradeButton.label;
        }
        if ((i & 2) != 0) {
            z = tradeButton.enabled;
        }
        if ((i & 4) != 0) {
            style = tradeButton.style;
        }
        if ((i & 8) != 0) {
            action = tradeButton.action;
        }
        if ((i & 16) != 0) {
            z2 = tradeButton.loading;
        }
        if ((i & 32) != 0) {
            str = tradeButton.loggingIdentifier;
        }
        boolean z3 = z2;
        String str2 = str;
        return tradeButton.copy(stringResource, z, style, action, z3, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getLabel() {
        return this.label;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component3, reason: from getter */
    public final Style getStyle() {
        return this.style;
    }

    /* renamed from: component4, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    /* renamed from: component6, reason: from getter */
    public final String getLoggingIdentifier() {
        return this.loggingIdentifier;
    }

    public final TradeButton copy(StringResource label, boolean enabled, Style style, Action action, boolean loading2, String loggingIdentifier) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(style, "style");
        return new TradeButton(label, enabled, style, action, loading2, loggingIdentifier);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TradeButton)) {
            return false;
        }
        TradeButton tradeButton = (TradeButton) other;
        return Intrinsics.areEqual(this.label, tradeButton.label) && this.enabled == tradeButton.enabled && Intrinsics.areEqual(this.style, tradeButton.style) && Intrinsics.areEqual(this.action, tradeButton.action) && this.loading == tradeButton.loading && Intrinsics.areEqual(this.loggingIdentifier, tradeButton.loggingIdentifier);
    }

    public int hashCode() {
        int iHashCode = ((((this.label.hashCode() * 31) + Boolean.hashCode(this.enabled)) * 31) + this.style.hashCode()) * 31;
        Action action = this.action;
        int iHashCode2 = (((iHashCode + (action == null ? 0 : action.hashCode())) * 31) + Boolean.hashCode(this.loading)) * 31;
        String str = this.loggingIdentifier;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "TradeButton(label=" + this.label + ", enabled=" + this.enabled + ", style=" + this.style + ", action=" + this.action + ", loading=" + this.loading + ", loggingIdentifier=" + this.loggingIdentifier + ")";
    }

    public TradeButton(StringResource label, boolean z, Style style, Action action, boolean z2, String str) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(style, "style");
        this.label = label;
        this.enabled = z;
        this.style = style;
        this.action = action;
        this.loading = z2;
        this.loggingIdentifier = str;
    }

    public /* synthetic */ TradeButton(StringResource stringResource, boolean z, Style style, Action action, boolean z2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(stringResource, z, style, action, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : str);
    }

    public final StringResource getLabel() {
        return this.label;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final Style getStyle() {
        return this.style;
    }

    public final Action getAction() {
        return this.action;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final String getLoggingIdentifier() {
        return this.loggingIdentifier;
    }

    public final BentoButtons.Type getButtonType() {
        Style style = this.style;
        if (!(style instanceof Style.ContractBasedStyle) && !Intrinsics.areEqual(style, Style.Primary.INSTANCE)) {
            if (!Intrinsics.areEqual(style, Style.Secondary.INSTANCE) && !Intrinsics.areEqual(style, Style.GettingPriceLoading.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            return BentoButtons.Type.Secondary;
        }
        return BentoButtons.Type.Primary;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0131  */
    @JvmName
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ButtonColorOverrides getButtonColorOverrides(Composer composer, int i) {
        ButtonColorOverrides buttonColorOverrides;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1394853090, i, -1, "com.robinhood.android.event.gamedetail.builders.tradebottomsheet.TradeButton.<get-buttonColorOverrides> (BuildTradeButton.kt:61)");
        }
        boolean z = this.enabled;
        ButtonColorOverrides buttonColorOverrides2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        if (!z && (this.style instanceof Style.ContractBasedStyle)) {
            composer.startReplaceGroup(-259691574);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            buttonColorOverrides = new ButtonColorOverrides(Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU()), Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU()), objArr10 == true ? 1 : 0, objArr9 == true ? 1 : 0);
            composer.endReplaceGroup();
        } else {
            Style style = this.style;
            if (style instanceof Style.ContractBasedStyle) {
                composer.startReplaceGroup(-259392858);
                buttonColorOverrides = new ButtonColorOverrides(Color.m6701boximpl(((Style.ContractBasedStyle) this.style).getDayNightColor().getColor(composer, 0)), Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU()), objArr8 == true ? 1 : 0, objArr7 == true ? 1 : 0);
                composer.endReplaceGroup();
            } else if (!z && Intrinsics.areEqual(style, Style.Primary.INSTANCE)) {
                composer.startReplaceGroup(-259089430);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                buttonColorOverrides = new ButtonColorOverrides(Color.m6701boximpl(bentoTheme2.getColors(composer, i3).m21373getBg30d7_KjU()), Color.m6701boximpl(bentoTheme2.getColors(composer, i3).m21371getBg0d7_KjU()), objArr6 == true ? 1 : 0, objArr5 == true ? 1 : 0);
                composer.endReplaceGroup();
            } else if (!this.enabled && Intrinsics.areEqual(this.style, Style.Secondary.INSTANCE)) {
                composer.startReplaceGroup(-258787831);
                BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                int i4 = BentoTheme.$stable;
                buttonColorOverrides = new ButtonColorOverrides(objArr4 == true ? 1 : 0, Color.m6701boximpl(bentoTheme3.getColors(composer, i4).m21427getFg30d7_KjU()), Color.m6701boximpl(bentoTheme3.getColors(composer, i4).m21427getFg30d7_KjU()), objArr3 == true ? 1 : 0);
                composer.endReplaceGroup();
            } else if (Intrinsics.areEqual(this.style, Style.GettingPriceLoading.INSTANCE)) {
                composer.startReplaceGroup(-258487255);
                BentoTheme bentoTheme4 = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                buttonColorOverrides = new ButtonColorOverrides(objArr2 == true ? 1 : 0, Color.m6701boximpl(bentoTheme4.getColors(composer, i5).m21427getFg30d7_KjU()), Color.m6701boximpl(bentoTheme4.getColors(composer, i5).m21427getFg30d7_KjU()), objArr == true ? 1 : 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-258224097);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return buttonColorOverrides2;
            }
        }
        buttonColorOverrides2 = buttonColorOverrides;
        if (ComposerKt.isTraceInProgress()) {
        }
        return buttonColorOverrides2;
    }

    /* compiled from: BuildTradeButton.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton$Action;", "", "OpenOrderForm", "SelectContract", "ConfirmWheelPickerSelection", "DismissWheelPicker", "StartOnboarding", "SignAttestation", "Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton$Action$ConfirmWheelPickerSelection;", "Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton$Action$DismissWheelPicker;", "Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton$Action$OpenOrderForm;", "Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton$Action$SelectContract;", "Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton$Action$SignAttestation;", "Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton$Action$StartOnboarding;", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Action {

        /* compiled from: BuildTradeButton.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton$Action$OpenOrderForm;", "Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton$Action;", "orderContext", "Lcom/robinhood/android/eventcontracts/contracts/EventTradeOrderContext;", "<init>", "(Lcom/robinhood/android/eventcontracts/contracts/EventTradeOrderContext;)V", "getOrderContext", "()Lcom/robinhood/android/eventcontracts/contracts/EventTradeOrderContext;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class OpenOrderForm implements Action {
            public static final int $stable = 8;
            private final EventTradeOrderContext orderContext;

            public static /* synthetic */ OpenOrderForm copy$default(OpenOrderForm openOrderForm, EventTradeOrderContext eventTradeOrderContext, int i, Object obj) {
                if ((i & 1) != 0) {
                    eventTradeOrderContext = openOrderForm.orderContext;
                }
                return openOrderForm.copy(eventTradeOrderContext);
            }

            /* renamed from: component1, reason: from getter */
            public final EventTradeOrderContext getOrderContext() {
                return this.orderContext;
            }

            public final OpenOrderForm copy(EventTradeOrderContext orderContext) {
                Intrinsics.checkNotNullParameter(orderContext, "orderContext");
                return new OpenOrderForm(orderContext);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OpenOrderForm) && Intrinsics.areEqual(this.orderContext, ((OpenOrderForm) other).orderContext);
            }

            public int hashCode() {
                return this.orderContext.hashCode();
            }

            public String toString() {
                return "OpenOrderForm(orderContext=" + this.orderContext + ")";
            }

            public OpenOrderForm(EventTradeOrderContext orderContext) {
                Intrinsics.checkNotNullParameter(orderContext, "orderContext");
                this.orderContext = orderContext;
            }

            public final EventTradeOrderContext getOrderContext() {
                return this.orderContext;
            }
        }

        /* compiled from: BuildTradeButton.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton$Action$SelectContract;", "Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton$Action;", "contractId", "Ljava/util/UUID;", "side", "Lcom/robinhood/android/eventcontracts/models/event/ContractSide;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/android/eventcontracts/models/event/ContractSide;)V", "getContractId", "()Ljava/util/UUID;", "getSide", "()Lcom/robinhood/android/eventcontracts/models/event/ContractSide;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SelectContract implements Action {
            public static final int $stable = 8;
            private final UUID contractId;
            private final ContractSide side;

            public static /* synthetic */ SelectContract copy$default(SelectContract selectContract, UUID uuid, ContractSide contractSide, int i, Object obj) {
                if ((i & 1) != 0) {
                    uuid = selectContract.contractId;
                }
                if ((i & 2) != 0) {
                    contractSide = selectContract.side;
                }
                return selectContract.copy(uuid, contractSide);
            }

            /* renamed from: component1, reason: from getter */
            public final UUID getContractId() {
                return this.contractId;
            }

            /* renamed from: component2, reason: from getter */
            public final ContractSide getSide() {
                return this.side;
            }

            public final SelectContract copy(UUID contractId, ContractSide side) {
                Intrinsics.checkNotNullParameter(contractId, "contractId");
                Intrinsics.checkNotNullParameter(side, "side");
                return new SelectContract(contractId, side);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SelectContract)) {
                    return false;
                }
                SelectContract selectContract = (SelectContract) other;
                return Intrinsics.areEqual(this.contractId, selectContract.contractId) && this.side == selectContract.side;
            }

            public int hashCode() {
                return (this.contractId.hashCode() * 31) + this.side.hashCode();
            }

            public String toString() {
                return "SelectContract(contractId=" + this.contractId + ", side=" + this.side + ")";
            }

            public SelectContract(UUID contractId, ContractSide side) {
                Intrinsics.checkNotNullParameter(contractId, "contractId");
                Intrinsics.checkNotNullParameter(side, "side");
                this.contractId = contractId;
                this.side = side;
            }

            public final UUID getContractId() {
                return this.contractId;
            }

            public final ContractSide getSide() {
                return this.side;
            }
        }

        /* compiled from: BuildTradeButton.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton$Action$ConfirmWheelPickerSelection;", "Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton$Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ConfirmWheelPickerSelection implements Action {
            public static final int $stable = 0;
            public static final ConfirmWheelPickerSelection INSTANCE = new ConfirmWheelPickerSelection();

            public boolean equals(Object other) {
                return this == other || (other instanceof ConfirmWheelPickerSelection);
            }

            public int hashCode() {
                return -1479566418;
            }

            public String toString() {
                return "ConfirmWheelPickerSelection";
            }

            private ConfirmWheelPickerSelection() {
            }
        }

        /* compiled from: BuildTradeButton.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton$Action$DismissWheelPicker;", "Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton$Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class DismissWheelPicker implements Action {
            public static final int $stable = 0;
            public static final DismissWheelPicker INSTANCE = new DismissWheelPicker();

            public boolean equals(Object other) {
                return this == other || (other instanceof DismissWheelPicker);
            }

            public int hashCode() {
                return 2054215028;
            }

            public String toString() {
                return "DismissWheelPicker";
            }

            private DismissWheelPicker() {
            }
        }

        /* compiled from: BuildTradeButton.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton$Action$StartOnboarding;", "Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton$Action;", "eventId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getEventId", "()Ljava/util/UUID;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class StartOnboarding implements Action {
            public static final int $stable = 8;
            private final UUID eventId;

            public static /* synthetic */ StartOnboarding copy$default(StartOnboarding startOnboarding, UUID uuid, int i, Object obj) {
                if ((i & 1) != 0) {
                    uuid = startOnboarding.eventId;
                }
                return startOnboarding.copy(uuid);
            }

            /* renamed from: component1, reason: from getter */
            public final UUID getEventId() {
                return this.eventId;
            }

            public final StartOnboarding copy(UUID eventId) {
                return new StartOnboarding(eventId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof StartOnboarding) && Intrinsics.areEqual(this.eventId, ((StartOnboarding) other).eventId);
            }

            public int hashCode() {
                UUID uuid = this.eventId;
                if (uuid == null) {
                    return 0;
                }
                return uuid.hashCode();
            }

            public String toString() {
                return "StartOnboarding(eventId=" + this.eventId + ")";
            }

            public StartOnboarding(UUID uuid) {
                this.eventId = uuid;
            }

            public final UUID getEventId() {
                return this.eventId;
            }
        }

        /* compiled from: BuildTradeButton.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton$Action$SignAttestation;", "Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton$Action;", "attestationType", "", "orderContext", "Lcom/robinhood/android/eventcontracts/contracts/EventTradeOrderContext;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/eventcontracts/contracts/EventTradeOrderContext;)V", "getAttestationType", "()Ljava/lang/String;", "getOrderContext", "()Lcom/robinhood/android/eventcontracts/contracts/EventTradeOrderContext;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SignAttestation implements Action {
            public static final int $stable = 8;
            private final String attestationType;
            private final EventTradeOrderContext orderContext;

            public static /* synthetic */ SignAttestation copy$default(SignAttestation signAttestation, String str, EventTradeOrderContext eventTradeOrderContext, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = signAttestation.attestationType;
                }
                if ((i & 2) != 0) {
                    eventTradeOrderContext = signAttestation.orderContext;
                }
                return signAttestation.copy(str, eventTradeOrderContext);
            }

            /* renamed from: component1, reason: from getter */
            public final String getAttestationType() {
                return this.attestationType;
            }

            /* renamed from: component2, reason: from getter */
            public final EventTradeOrderContext getOrderContext() {
                return this.orderContext;
            }

            public final SignAttestation copy(String attestationType, EventTradeOrderContext orderContext) {
                Intrinsics.checkNotNullParameter(attestationType, "attestationType");
                Intrinsics.checkNotNullParameter(orderContext, "orderContext");
                return new SignAttestation(attestationType, orderContext);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SignAttestation)) {
                    return false;
                }
                SignAttestation signAttestation = (SignAttestation) other;
                return Intrinsics.areEqual(this.attestationType, signAttestation.attestationType) && Intrinsics.areEqual(this.orderContext, signAttestation.orderContext);
            }

            public int hashCode() {
                return (this.attestationType.hashCode() * 31) + this.orderContext.hashCode();
            }

            public String toString() {
                return "SignAttestation(attestationType=" + this.attestationType + ", orderContext=" + this.orderContext + ")";
            }

            public SignAttestation(String attestationType, EventTradeOrderContext orderContext) {
                Intrinsics.checkNotNullParameter(attestationType, "attestationType");
                Intrinsics.checkNotNullParameter(orderContext, "orderContext");
                this.attestationType = attestationType;
                this.orderContext = orderContext;
            }

            public final String getAttestationType() {
                return this.attestationType;
            }

            public final EventTradeOrderContext getOrderContext() {
                return this.orderContext;
            }
        }
    }

    /* compiled from: BuildTradeButton.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\b\rJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\b\u000fJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\b\u0011J2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\b\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton$ButtonColorOverrides;", "", "backgroundColorOverride", "Landroidx/compose/ui/graphics/Color;", "textColorOverride", "borderColorOverride", "<init>", "(Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBackgroundColorOverride-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "getTextColorOverride-QN2ZGVo", "getBorderColorOverride-QN2ZGVo", "component1", "component1-QN2ZGVo", "component2", "component2-QN2ZGVo", "component3", "component3-QN2ZGVo", "copy", "copy-362bZIc", "equals", "", "other", "hashCode", "", "toString", "", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ButtonColorOverrides {
        public static final int $stable = 0;
        private final Color backgroundColorOverride;
        private final Color borderColorOverride;
        private final Color textColorOverride;

        public /* synthetic */ ButtonColorOverrides(Color color, Color color2, Color color3, DefaultConstructorMarker defaultConstructorMarker) {
            this(color, color2, color3);
        }

        /* renamed from: copy-362bZIc$default, reason: not valid java name */
        public static /* synthetic */ ButtonColorOverrides m14169copy362bZIc$default(ButtonColorOverrides buttonColorOverrides, Color color, Color color2, Color color3, int i, Object obj) {
            if ((i & 1) != 0) {
                color = buttonColorOverrides.backgroundColorOverride;
            }
            if ((i & 2) != 0) {
                color2 = buttonColorOverrides.textColorOverride;
            }
            if ((i & 4) != 0) {
                color3 = buttonColorOverrides.borderColorOverride;
            }
            return buttonColorOverrides.m14173copy362bZIc(color, color2, color3);
        }

        /* renamed from: component1-QN2ZGVo, reason: not valid java name and from getter */
        public final Color getBackgroundColorOverride() {
            return this.backgroundColorOverride;
        }

        /* renamed from: component2-QN2ZGVo, reason: not valid java name and from getter */
        public final Color getTextColorOverride() {
            return this.textColorOverride;
        }

        /* renamed from: component3-QN2ZGVo, reason: not valid java name and from getter */
        public final Color getBorderColorOverride() {
            return this.borderColorOverride;
        }

        /* renamed from: copy-362bZIc, reason: not valid java name */
        public final ButtonColorOverrides m14173copy362bZIc(Color backgroundColorOverride, Color textColorOverride, Color borderColorOverride) {
            return new ButtonColorOverrides(backgroundColorOverride, textColorOverride, borderColorOverride, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonColorOverrides)) {
                return false;
            }
            ButtonColorOverrides buttonColorOverrides = (ButtonColorOverrides) other;
            return Intrinsics.areEqual(this.backgroundColorOverride, buttonColorOverrides.backgroundColorOverride) && Intrinsics.areEqual(this.textColorOverride, buttonColorOverrides.textColorOverride) && Intrinsics.areEqual(this.borderColorOverride, buttonColorOverrides.borderColorOverride);
        }

        public int hashCode() {
            Color color = this.backgroundColorOverride;
            int iM6713hashCodeimpl = (color == null ? 0 : Color.m6713hashCodeimpl(color.getValue())) * 31;
            Color color2 = this.textColorOverride;
            int iM6713hashCodeimpl2 = (iM6713hashCodeimpl + (color2 == null ? 0 : Color.m6713hashCodeimpl(color2.getValue()))) * 31;
            Color color3 = this.borderColorOverride;
            return iM6713hashCodeimpl2 + (color3 != null ? Color.m6713hashCodeimpl(color3.getValue()) : 0);
        }

        public String toString() {
            return "ButtonColorOverrides(backgroundColorOverride=" + this.backgroundColorOverride + ", textColorOverride=" + this.textColorOverride + ", borderColorOverride=" + this.borderColorOverride + ")";
        }

        private ButtonColorOverrides(Color color, Color color2, Color color3) {
            this.backgroundColorOverride = color;
            this.textColorOverride = color2;
            this.borderColorOverride = color3;
        }

        /* renamed from: getBackgroundColorOverride-QN2ZGVo, reason: not valid java name */
        public final Color m14174getBackgroundColorOverrideQN2ZGVo() {
            return this.backgroundColorOverride;
        }

        /* renamed from: getTextColorOverride-QN2ZGVo, reason: not valid java name */
        public final Color m14176getTextColorOverrideQN2ZGVo() {
            return this.textColorOverride;
        }

        /* renamed from: getBorderColorOverride-QN2ZGVo, reason: not valid java name */
        public final Color m14175getBorderColorOverrideQN2ZGVo() {
            return this.borderColorOverride;
        }
    }

    /* compiled from: BuildTradeButton.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton$Style;", "", "ContractBasedStyle", "Primary", "Secondary", "GettingPriceLoading", "Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton$Style$ContractBasedStyle;", "Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton$Style$GettingPriceLoading;", "Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton$Style$Primary;", "Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton$Style$Secondary;", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Style {

        /* compiled from: BuildTradeButton.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton$Style$ContractBasedStyle;", "Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton$Style;", "dayNightColor", "Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;", "<init>", "(Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;)V", "getDayNightColor", "()Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ContractBasedStyle implements Style {
            public static final int $stable = 0;
            private final DayNightColor dayNightColor;

            public static /* synthetic */ ContractBasedStyle copy$default(ContractBasedStyle contractBasedStyle, DayNightColor dayNightColor, int i, Object obj) {
                if ((i & 1) != 0) {
                    dayNightColor = contractBasedStyle.dayNightColor;
                }
                return contractBasedStyle.copy(dayNightColor);
            }

            /* renamed from: component1, reason: from getter */
            public final DayNightColor getDayNightColor() {
                return this.dayNightColor;
            }

            public final ContractBasedStyle copy(DayNightColor dayNightColor) {
                Intrinsics.checkNotNullParameter(dayNightColor, "dayNightColor");
                return new ContractBasedStyle(dayNightColor);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ContractBasedStyle) && Intrinsics.areEqual(this.dayNightColor, ((ContractBasedStyle) other).dayNightColor);
            }

            public int hashCode() {
                return this.dayNightColor.hashCode();
            }

            public String toString() {
                return "ContractBasedStyle(dayNightColor=" + this.dayNightColor + ")";
            }

            public ContractBasedStyle(DayNightColor dayNightColor) {
                Intrinsics.checkNotNullParameter(dayNightColor, "dayNightColor");
                this.dayNightColor = dayNightColor;
            }

            public final DayNightColor getDayNightColor() {
                return this.dayNightColor;
            }
        }

        /* compiled from: BuildTradeButton.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton$Style$Primary;", "Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton$Style;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Primary implements Style {
            public static final int $stable = 0;
            public static final Primary INSTANCE = new Primary();

            public boolean equals(Object other) {
                return this == other || (other instanceof Primary);
            }

            public int hashCode() {
                return 920697314;
            }

            public String toString() {
                return "Primary";
            }

            private Primary() {
            }
        }

        /* compiled from: BuildTradeButton.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton$Style$Secondary;", "Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton$Style;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Secondary implements Style {
            public static final int $stable = 0;
            public static final Secondary INSTANCE = new Secondary();

            public boolean equals(Object other) {
                return this == other || (other instanceof Secondary);
            }

            public int hashCode() {
                return 1051501908;
            }

            public String toString() {
                return "Secondary";
            }

            private Secondary() {
            }
        }

        /* compiled from: BuildTradeButton.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton$Style$GettingPriceLoading;", "Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton$Style;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class GettingPriceLoading implements Style {
            public static final int $stable = 0;
            public static final GettingPriceLoading INSTANCE = new GettingPriceLoading();

            public boolean equals(Object other) {
                return this == other || (other instanceof GettingPriceLoading);
            }

            public int hashCode() {
                return -983423753;
            }

            public String toString() {
                return "GettingPriceLoading";
            }

            private GettingPriceLoading() {
            }
        }
    }

    /* compiled from: BuildTradeButton.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton$Companion;", "", "<init>", "()V", "loading", "Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton;", "getLoading", "()Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton;", OptionChainCustomizationLogging.UNAVAILABLE_TOAST_IDENTIFIER, "getUnavailable", "gettingPriceLoading", AnnotatedPrivateKey.LABEL, "Lcom/robinhood/utils/resource/StringResource;", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TradeButton getLoading() {
            return TradeButton.loading;
        }

        public final TradeButton getUnavailable() {
            return TradeButton.unavailable;
        }

        public final TradeButton gettingPriceLoading(StringResource label) {
            Intrinsics.checkNotNullParameter(label, "label");
            return new TradeButton(label, false, Style.GettingPriceLoading.INSTANCE, null, true, null, 32, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke = companion.invoke("-");
        Style.Primary primary = Style.Primary.INSTANCE;
        loading = new TradeButton(stringResourceInvoke, false, primary, Action.DismissWheelPicker.INSTANCE, true, null, 32, null);
        Object[] objArr = 0 == true ? 1 : 0;
        unavailable = new TradeButton(companion.invoke(C16283R.string.combo_bottom_sheet_trade_button_unavailable_label, new Object[0]), false, primary, 0 == true ? 1 : 0, false, objArr, 48, null);
    }
}
