package com.robinhood.android.equitydetail.p123ui.leveltwo;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.databinding.IncludeLevel2HeaderBinding;
import com.robinhood.android.equitydetail.p123ui.leveltwo.Level2Graph;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p355ui.Pricebook;
import com.robinhood.models.util.Money;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: Level2HeaderView.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u0011H\u0014J\u0010\u0010\u0013\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\b\u0010\u0014\u001a\u00020\u0011H\u0002J\u0012\u0010\u0015\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/leveltwo/Level2HeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/equitydetail/databinding/IncludeLevel2HeaderBinding;", "getBinding", "()Lcom/robinhood/android/equitydetail/databinding/IncludeLevel2HeaderBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "state", "Lcom/robinhood/android/equitydetail/ui/leveltwo/Level2ViewState;", "onFinishInflate", "", "onAttachedToWindow", "bindData", "updateAxes", "onScrubEvent", "event", "Lcom/robinhood/android/equitydetail/ui/leveltwo/Level2Graph$ScrubEvent;", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class Level2HeaderView extends ConstraintLayout {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private Level2ViewState state;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Level2HeaderView.class, "binding", "getBinding()Lcom/robinhood/android/equitydetail/databinding/IncludeLevel2HeaderBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Level2HeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewBinding5.viewBinding(this, Level2HeaderView2.INSTANCE);
    }

    public /* synthetic */ Level2HeaderView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final IncludeLevel2HeaderBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IncludeLevel2HeaderBinding) value;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        final Resources resources = getResources();
        RhTextView bestBidLabelTxt = getBinding().bestBidLabelTxt;
        Intrinsics.checkNotNullExpressionValue(bestBidLabelTxt, "bestBidLabelTxt");
        OnClickListeners.onClick(bestBidLabelTxt, new Function0() { // from class: com.robinhood.android.equitydetail.ui.leveltwo.Level2HeaderView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Level2HeaderView.onFinishInflate$lambda$0(this.f$0, resources);
            }
        });
        RhTextView bestAskLabelTxt = getBinding().bestAskLabelTxt;
        Intrinsics.checkNotNullExpressionValue(bestAskLabelTxt, "bestAskLabelTxt");
        OnClickListeners.onClick(bestAskLabelTxt, new Function0() { // from class: com.robinhood.android.equitydetail.ui.leveltwo.Level2HeaderView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Level2HeaderView.onFinishInflate$lambda$1(this.f$0, resources);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFinishInflate$lambda$0(Level2HeaderView level2HeaderView, Resources resources) {
        Instrument instrument;
        Context context = level2HeaderView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        BaseActivity baseActivityRequireBaseActivityBaseContext = Contexts7.requireBaseActivityBaseContext(context);
        Level2ViewState level2ViewState = level2HeaderView.state;
        String displaySymbol = (level2ViewState == null || (instrument = level2ViewState.getInstrument()) == null) ? null : instrument.getDisplaySymbol();
        if (displaySymbol != null) {
            RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
            Context context2 = level2HeaderView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            RhDialogFragment.Builder positiveButton = companion.create(context2).setTitle(C15314R.string.level_2_best_bid, new Object[0]).setMessage(resources.getString(C15314R.string.level_2_best_bid_dialog_message, displaySymbol)).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]);
            FragmentManager supportFragmentManager = baseActivityRequireBaseActivityBaseContext.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(positiveButton, supportFragmentManager, "bestBid", false, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFinishInflate$lambda$1(Level2HeaderView level2HeaderView, Resources resources) {
        Instrument instrument;
        Context context = level2HeaderView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        BaseActivity baseActivityRequireBaseActivityBaseContext = Contexts7.requireBaseActivityBaseContext(context);
        Level2ViewState level2ViewState = level2HeaderView.state;
        String displaySymbol = (level2ViewState == null || (instrument = level2ViewState.getInstrument()) == null) ? null : instrument.getDisplaySymbol();
        if (displaySymbol != null) {
            RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
            Context context2 = level2HeaderView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            RhDialogFragment.Builder positiveButton = companion.create(context2).setTitle(C15314R.string.level_2_best_ask, new Object[0]).setMessage(resources.getString(C15314R.string.level_2_best_ask_dialog_message, displaySymbol)).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]);
            FragmentManager supportFragmentManager = baseActivityRequireBaseActivityBaseContext.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(positiveButton, supportFragmentManager, "bestAsk", false, 4, null);
        }
        return Unit.INSTANCE;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(getBinding().level2Graph.getScrubEvents()), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.leveltwo.Level2HeaderView$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Level2HeaderView.onAttachedToWindow$lambda$2(this.f$0, (Optional) obj);
            }
        });
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(getBinding().level2Graph.getZoomFractionEvents()), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.leveltwo.Level2HeaderView$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Level2HeaderView.onAttachedToWindow$lambda$3(this.f$0, ((Float) obj).floatValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$2(Level2HeaderView level2HeaderView, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        level2HeaderView.onScrubEvent((Level2Graph.ScrubEvent) optional.component1());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$3(Level2HeaderView level2HeaderView, float f) {
        level2HeaderView.updateAxes();
        return Unit.INSTANCE;
    }

    public final void bindData(Level2ViewState state) {
        IncludeLevel2HeaderBinding binding = getBinding();
        this.state = state;
        if (state == null) {
            return;
        }
        Resources resources = getResources();
        Pricebook.Entry bestBid = state.getBestBid();
        if (bestBid != null) {
            binding.bestBidPriceTxt.setText(Money.format$default(bestBid.getPrice(), null, false, null, false, 0, null, false, null, false, false, 1023, null));
            binding.bestBidQuantityTxt.setText(resources.getString(C15314R.string.level_2_best_bid_quantity_format, bestBid.getQuantity().toString()));
        }
        Pricebook.Entry bestAsk = state.getBestAsk();
        if (bestAsk != null) {
            binding.bestAskPriceTxt.setText(Money.format$default(bestAsk.getPrice(), null, false, null, false, 0, null, false, null, false, false, 1023, null));
            binding.bestAskQuantityTxt.setText(resources.getString(C15314R.string.level_2_best_ask_quantity_format, bestAsk.getQuantity().toString()));
        }
        binding.level2Graph.bind(state.getPricebook());
        updateAxes();
    }

    private final void updateAxes() {
        Money boundsLeft;
        Money boundsRight;
        IncludeLevel2HeaderBinding binding = getBinding();
        Money boundsCenter = binding.level2Graph.getBoundsCenter();
        if (boundsCenter == null || (boundsLeft = binding.level2Graph.getBoundsLeft()) == null || (boundsRight = binding.level2Graph.getBoundsRight()) == null) {
            return;
        }
        binding.level2Axes.bind(boundsLeft, boundsCenter, boundsRight);
    }

    private final void onScrubEvent(Level2Graph.ScrubEvent event) {
        int i;
        IncludeLevel2HeaderBinding binding = getBinding();
        boolean z = event != null;
        Group staticGroup = binding.staticGroup;
        Intrinsics.checkNotNullExpressionValue(staticGroup, "staticGroup");
        staticGroup.setVisibility(z ? 4 : 0);
        Group scrubGroup = binding.scrubGroup;
        Intrinsics.checkNotNullExpressionValue(scrubGroup, "scrubGroup");
        scrubGroup.setVisibility(z ? 0 : 4);
        if (event != null) {
            RhTextView rhTextView = binding.bidsAsksLabelTxt;
            if (event.isBid()) {
                i = C15314R.string.level_2_bids;
            } else {
                i = C15314R.string.level_2_asks;
            }
            rhTextView.setText(i);
            binding.priceTxt.setText(Money.format$default(event.getPrice(), null, false, null, false, 0, null, false, null, false, false, 1023, null));
            binding.sharesTxt.setText(Formats.getIntegerFormat().format(event.getCumulativeShares()));
            binding.totalValueTxt.setText(Money.format$default(event.getCumulativeValue(), null, false, null, false, 0, null, false, null, false, false, 1023, null));
            return;
        }
        binding.scrubGroup.requestLayout();
    }

    /* compiled from: Level2HeaderView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/leveltwo/Level2HeaderView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/equitydetail/ui/leveltwo/Level2HeaderView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<Level2HeaderView> {
        private final /* synthetic */ Inflater<Level2HeaderView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public Level2HeaderView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (Level2HeaderView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C15314R.layout.include_level_2_header);
        }
    }
}
