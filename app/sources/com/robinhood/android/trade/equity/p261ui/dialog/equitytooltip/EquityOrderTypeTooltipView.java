package com.robinhood.android.trade.equity.p261ui.dialog.equitytooltip;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.tooltip.RdsTooltipView;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.trade.equity.p261ui.dialog.equitytooltip.EquityOrderTypeTooltipViewState;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Order;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.resource.StringResource;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EquityOrderTypeTooltipView.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001 B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0016\u001a\u00020\u0017H\u0014J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u0017J\u0006\u0010\u001f\u001a\u00020\u0017R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/dialog/equitytooltip/EquityOrderTypeTooltipView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "duxo", "Lcom/robinhood/android/trade/equity/ui/dialog/equitytooltip/EquityOrderTypeTooltipDuxo;", "getDuxo", "()Lcom/robinhood/android/trade/equity/ui/dialog/equitytooltip/EquityOrderTypeTooltipDuxo;", "setDuxo", "(Lcom/robinhood/android/trade/equity/ui/dialog/equitytooltip/EquityOrderTypeTooltipDuxo;)V", "tooltipView", "Lcom/robinhood/android/designsystem/tooltip/RdsTooltipView;", "onAttachedToWindow", "", "setState", "state", "Lcom/robinhood/android/trade/equity/ui/dialog/equitytooltip/EquityOrderTypeTooltipViewState;", "setTooltipArguments", "args", "Lcom/robinhood/android/trade/equity/ui/dialog/equitytooltip/EquityOrderTypeTooltipView$Args;", "enableAdtTooltip", "setAdtTooltipShown", "Args", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class EquityOrderTypeTooltipView extends Hammer_EquityOrderTypeTooltipView {
    public static final int $stable = 8;
    public EquityOrderTypeTooltipDuxo duxo;
    public Navigator navigator;
    private RdsTooltipView tooltipView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquityOrderTypeTooltipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final Navigator getNavigator() {
        Navigator navigator = this.navigator;
        if (navigator != null) {
            return navigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void setNavigator(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "<set-?>");
        this.navigator = navigator;
    }

    public final EquityOrderTypeTooltipDuxo getDuxo() {
        EquityOrderTypeTooltipDuxo equityOrderTypeTooltipDuxo = this.duxo;
        if (equityOrderTypeTooltipDuxo != null) {
            return equityOrderTypeTooltipDuxo;
        }
        Intrinsics.throwUninitializedPropertyAccessException("duxo");
        return null;
    }

    public final void setDuxo(EquityOrderTypeTooltipDuxo equityOrderTypeTooltipDuxo) {
        Intrinsics.checkNotNullParameter(equityOrderTypeTooltipDuxo, "<set-?>");
        this.duxo = equityOrderTypeTooltipDuxo;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RdsTooltipView rdsTooltipView = new RdsTooltipView(context, null, 2, null);
        rdsTooltipView.setId(View.generateViewId());
        rdsTooltipView.setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
        ViewsKt.setMarginStart(rdsTooltipView, rdsTooltipView.getResources().getDimensionPixelSize(C13997R.dimen.rds_spacing_small));
        this.tooltipView = rdsTooltipView;
        addView(rdsTooltipView);
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityOrderTypeTooltipView.onAttachedToWindow$lambda$1(this.f$0, (EquityOrderTypeTooltipViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$1(EquityOrderTypeTooltipView equityOrderTypeTooltipView, EquityOrderTypeTooltipViewState viewState) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        equityOrderTypeTooltipView.setState(viewState);
        return Unit.INSTANCE;
    }

    private final void setState(final EquityOrderTypeTooltipViewState state) throws Resources.NotFoundException {
        String string2;
        RdsTooltipView rdsTooltipView = null;
        EquityOrderTypeTooltipViewState.TooltipType tooltipType$default = EquityOrderTypeTooltipViewState.getTooltipType$default(state, null, 1, null);
        EquityOrderTypeTooltipViewState.TooltipType tooltipType = EquityOrderTypeTooltipViewState.TooltipType.ADT;
        if (tooltipType$default != tooltipType || state.getAdtTooltipEnabled()) {
            setOnClickListener(new View.OnClickListener() { // from class: com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipView.setState.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EquityOrderTypeTooltipView.this.setVisibility(8);
                    EquityOrderTypeTooltipView.this.removeAllViews();
                }
            });
            if (state.getTooltipText() != null && EquityOrderTypeTooltipViewState.getTooltipType$default(state, null, 1, null) == EquityOrderTypeTooltipViewState.TooltipType.BUY_SELL) {
                getDuxo().setCollaringRemovalTooltipShown();
            } else if (state.getTooltipText() != null && EquityOrderTypeTooltipViewState.getTooltipType$default(state, null, 1, null) == tooltipType) {
                getDuxo().setAdtTooltipShown();
            } else if (state.getTooltipText() != null && EquityOrderTypeTooltipViewState.getTooltipType$default(state, null, 1, null) == EquityOrderTypeTooltipViewState.TooltipType.MARKET_BUY) {
                getDuxo().setMarketBuysTooltipShown();
            } else if (state.getTooltipText() != null && EquityOrderTypeTooltipViewState.getTooltipType$default(state, null, 1, null) == EquityOrderTypeTooltipViewState.TooltipType.TAX_LOTS) {
                getDuxo().setTaxLotsTooltipShown();
            }
            final RdsTooltipView rdsTooltipView2 = this.tooltipView;
            if (rdsTooltipView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tooltipView");
                rdsTooltipView2 = null;
            }
            rdsTooltipView2.setNibHorizontalBias(state.getNibHorizontalBias());
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            StringResource tooltipText = state.getTooltipText();
            if (tooltipText != null) {
                Resources resources = rdsTooltipView2.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                CharSequence text = tooltipText.getText(resources);
                if (text != null) {
                    spannableStringBuilder.append(text);
                }
            }
            StringResource tooltipLinkText = state.getTooltipLinkText();
            if (tooltipLinkText != null) {
                Resources resources2 = rdsTooltipView2.getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                CharSequence text2 = tooltipLinkText.getText(resources2);
                if (text2 != null && (string2 = text2.toString()) != null) {
                    spannableStringBuilder.append((CharSequence) PlaceholderUtils.XXShortPlaceholderText);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    List listMutableListOf = CollectionsKt.mutableListOf(new ActionSpan(true, new Function0<Unit>() { // from class: com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipView$setState$lambda$6$lambda$5$lambda$4$$inlined$buildClickableSpannedString$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            StringResource tooltipLink = state.getTooltipLink();
                            if (tooltipLink != null) {
                                Navigator navigator = this.getNavigator();
                                Context context = rdsTooltipView2.getContext();
                                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                Resources resources3 = rdsTooltipView2.getResources();
                                Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
                                Navigators3.showHelpCenterWebViewFragment(navigator, context, tooltipLink.getText(resources3).toString());
                            }
                        }
                    }));
                    listMutableListOf.add(new StyleSpan(1));
                    Object[] array2 = listMutableListOf.toArray(new Object[0]);
                    Object[] objArrCopyOf = Arrays.copyOf(array2, array2.length);
                    int length = spannableStringBuilder2.length();
                    spannableStringBuilder2.append((CharSequence) string2);
                    for (Object obj : objArrCopyOf) {
                        spannableStringBuilder2.setSpan(obj, length, spannableStringBuilder2.length(), 17);
                    }
                    spannableStringBuilder.append((CharSequence) new SpannedString(spannableStringBuilder2));
                }
            }
            rdsTooltipView2.setText(new SpannedString(spannableStringBuilder));
            rdsTooltipView2.setMaxLines(state.getMaxLines());
            rdsTooltipView2.setMinLines(state.getMinLines());
            RdsTooltipView rdsTooltipView3 = this.tooltipView;
            if (rdsTooltipView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tooltipView");
            } else {
                rdsTooltipView = rdsTooltipView3;
            }
            rdsTooltipView.setVisibility(state.getTooltipVisible() ? 0 : 8);
        }
    }

    public final void setTooltipArguments(Args args) {
        Intrinsics.checkNotNullParameter(args, "args");
        getDuxo().setEquityTooltipArguments(args);
    }

    public final void enableAdtTooltip() {
        getDuxo().enableAdtTooltip();
    }

    public final void setAdtTooltipShown() {
        getDuxo().setAdtTooltipShown();
    }

    /* compiled from: EquityOrderTypeTooltipView.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0018R\u0019\u0010\n\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0018¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/dialog/equitytooltip/EquityOrderTypeTooltipView$Args;", "Landroid/os/Parcelable;", "accountNumber", "", "instrumentId", "Ljava/util/UUID;", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "isDollarBasedOrder", "", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/models/db/Order$Configuration;", "isOrderReplacement", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Lcom/robinhood/models/db/EquityOrderSide;ZLcom/robinhood/rosetta/eventlogging/Context;Lcom/robinhood/models/db/Order$Configuration;Z)V", "getAccountNumber", "()Ljava/lang/String;", "getInstrumentId", "()Ljava/util/UUID;", "getSide", "()Lcom/robinhood/models/db/EquityOrderSide;", "()Z", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "getConfiguration", "()Lcom/robinhood/models/db/Order$Configuration;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final Order.Configuration configuration;
        private final com.robinhood.rosetta.eventlogging.Context eventContext;
        private final UUID instrumentId;
        private final boolean isDollarBasedOrder;
        private final boolean isOrderReplacement;
        private final EquityOrderSide side;

        /* compiled from: EquityOrderTypeTooltipView.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                boolean z;
                com.robinhood.rosetta.eventlogging.Context context;
                Order.Configuration configuration;
                boolean z2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                UUID uuid = (UUID) parcel.readSerializable();
                EquityOrderSide equityOrderSideValueOf = EquityOrderSide.valueOf(parcel.readString());
                boolean z3 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                com.robinhood.rosetta.eventlogging.Context context2 = (com.robinhood.rosetta.eventlogging.Context) parcel.readSerializable();
                Order.Configuration configurationValueOf = parcel.readInt() == 0 ? null : Order.Configuration.valueOf(parcel.readString());
                if (parcel.readInt() != 0) {
                    Order.Configuration configuration2 = configurationValueOf;
                    z2 = true;
                    context = context2;
                    configuration = configuration2;
                } else {
                    context = context2;
                    configuration = configurationValueOf;
                    z2 = z;
                }
                return new Args(string2, uuid, equityOrderSideValueOf, z3, context, configuration, z2);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeSerializable(this.instrumentId);
            dest.writeString(this.side.name());
            dest.writeInt(this.isDollarBasedOrder ? 1 : 0);
            dest.writeSerializable(this.eventContext);
            Order.Configuration configuration = this.configuration;
            if (configuration == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(configuration.name());
            }
            dest.writeInt(this.isOrderReplacement ? 1 : 0);
        }

        public Args(String accountNumber, UUID instrumentId, EquityOrderSide side, boolean z, com.robinhood.rosetta.eventlogging.Context context, Order.Configuration configuration, boolean z2) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(side, "side");
            this.accountNumber = accountNumber;
            this.instrumentId = instrumentId;
            this.side = side;
            this.isDollarBasedOrder = z;
            this.eventContext = context;
            this.configuration = configuration;
            this.isOrderReplacement = z2;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final EquityOrderSide getSide() {
            return this.side;
        }

        /* renamed from: isDollarBasedOrder, reason: from getter */
        public final boolean getIsDollarBasedOrder() {
            return this.isDollarBasedOrder;
        }

        public final com.robinhood.rosetta.eventlogging.Context getEventContext() {
            return this.eventContext;
        }

        public final Order.Configuration getConfiguration() {
            return this.configuration;
        }

        /* renamed from: isOrderReplacement, reason: from getter */
        public final boolean getIsOrderReplacement() {
            return this.isOrderReplacement;
        }
    }
}
