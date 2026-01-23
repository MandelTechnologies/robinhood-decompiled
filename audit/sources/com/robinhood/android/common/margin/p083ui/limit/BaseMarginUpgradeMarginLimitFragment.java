package com.robinhood.android.common.margin.p083ui.limit;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.margin.C11223R;
import com.robinhood.android.common.margin.p083ui.MarginUpgradeEventLogger;
import com.robinhood.android.common.margin.p083ui.limit.BaseMarginUpgradeMarginLimitFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.font.CustomTypefaceSpan;
import com.robinhood.android.font.RhTypeface;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.margin.api.ApiMarginInvestingInfo;
import com.robinhood.android.margin.contracts.MarginLimitActivityKey;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.ReturnedData;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.time.annotation.ElapsedRealtime;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.AbstractFragmentCompanion;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.math.BigDecimal;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: BaseMarginUpgradeMarginLimitFragment.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b'\u0018\u0000 W2\u00020\u0001:\u0003XYWB\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001aJ)\u0010!\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010.\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001b\u00103\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010%\u001a\u0004\b1\u00102R\"\u00105\u001a\u0002048\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010<\u001a\u00020;8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010F\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010K\u001a\u00020H8$X¤\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0014\u0010N\u001a\u00020\u00138$X¤\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0014\u0010P\u001a\u00020\u00138$X¤\u0004¢\u0006\u0006\u001a\u0004\bO\u0010MR\u0014\u0010R\u001a\u00020H8$X¤\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010JR\u0014\u0010T\u001a\u00020H8$X¤\u0004¢\u0006\u0006\u001a\u0004\bS\u0010JR\u0014\u0010V\u001a\u00020H8$X¤\u0004¢\u0006\u0006\u001a\u0004\bU\u0010J¨\u0006Z"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/limit/BaseMarginUpgradeMarginLimitFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "", "layoutResId", "<init>", "(I)V", "", "forceShowRemoveLimitButton", "", "setLimitBtnOnClick", "(Z)V", "Lcom/robinhood/android/common/margin/ui/limit/MarginUpgradeMarginLimitViewState;", "state", "refreshUi", "(Lcom/robinhood/android/common/margin/ui/limit/MarginUpgradeMarginLimitViewState;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "()V", "onStop", "onResume", "requestCode", "resultCode", "Landroid/content/Intent;", WebsocketGatewayConstants.DATA_KEY, "onActivityResult", "(IILandroid/content/Intent;)V", "Lcom/robinhood/android/common/margin/ui/limit/MarginUpgradeMarginLimitDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "getDuxo", "()Lcom/robinhood/android/common/margin/ui/limit/MarginUpgradeMarginLimitDuxo;", "duxo", "Lcom/robinhood/android/common/margin/ui/limit/BaseMarginUpgradeMarginLimitFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getCallbacks", "()Lcom/robinhood/android/common/margin/ui/limit/BaseMarginUpgradeMarginLimitFragment$Callbacks;", "callbacks", "Landroid/graphics/Typeface;", "boldTypeface$delegate", "getBoldTypeface", "()Landroid/graphics/Typeface;", "boldTypeface", "Lcom/robinhood/android/common/margin/ui/MarginUpgradeEventLogger;", "marginUpgradeEventLogger", "Lcom/robinhood/android/common/margin/ui/MarginUpgradeEventLogger;", "getMarginUpgradeEventLogger", "()Lcom/robinhood/android/common/margin/ui/MarginUpgradeEventLogger;", "setMarginUpgradeEventLogger", "(Lcom/robinhood/android/common/margin/ui/MarginUpgradeEventLogger;)V", "j$/time/Clock", Card.Icon.CLOCK, "Lj$/time/Clock;", "getClock", "()Lj$/time/Clock;", "setClock", "(Lj$/time/Clock;)V", "Lcom/robinhood/rosetta/eventlogging/Screen;", "analyticsScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "j$/time/Instant", "screenAppearTime", "Lj$/time/Instant;", "Landroid/widget/TextView;", "getSetLimitBtn", "()Landroid/widget/TextView;", "setLimitBtn", "getRemoveLimitBtn", "()Landroid/view/View;", "removeLimitBtn", "getConfirmBtn", "confirmBtn", "getMarginBuyingPowerTxt", "marginBuyingPowerTxt", "getTotalTxt", "totalTxt", "getDisclosureTxt", "disclosureTxt", "Companion", "Callbacks", "Args", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public abstract class BaseMarginUpgradeMarginLimitFragment extends BaseFragment {
    private static final int REQUEST_CODE = 6723;
    private final Screen analyticsScreen;

    /* renamed from: boldTypeface$delegate, reason: from kotlin metadata */
    private final Lazy boldTypeface;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    @ElapsedRealtime
    public Clock clock;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public MarginUpgradeEventLogger marginUpgradeEventLogger;
    private Instant screenAppearTime;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(BaseMarginUpgradeMarginLimitFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/common/margin/ui/limit/BaseMarginUpgradeMarginLimitFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(BaseMarginUpgradeMarginLimitFragment.class, "boldTypeface", "getBoldTypeface()Landroid/graphics/Typeface;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: BaseMarginUpgradeMarginLimitFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/limit/BaseMarginUpgradeMarginLimitFragment$Callbacks;", "", "onMarginLimitConfirmed", "", "marginLimit", "Lcom/robinhood/models/util/Money;", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onMarginLimitConfirmed(Money marginLimit);
    }

    protected abstract View getConfirmBtn();

    protected abstract TextView getDisclosureTxt();

    protected abstract TextView getMarginBuyingPowerTxt();

    protected abstract View getRemoveLimitBtn();

    protected abstract TextView getSetLimitBtn();

    protected abstract TextView getTotalTxt();

    public BaseMarginUpgradeMarginLimitFragment(int i) {
        super(i);
        this.duxo = OldDuxos.oldDuxo(this, MarginUpgradeMarginLimitDuxo.class);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.common.margin.ui.limit.BaseMarginUpgradeMarginLimitFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof BaseMarginUpgradeMarginLimitFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.boldTypeface = RhTypeface.BOLD.provideDelegate(this, $$delegatedProperties[1]);
        this.analyticsScreen = new Screen(Screen.Name.MARGIN_UPGRADE_MARGIN_LIMIT_SET, null, null, null, 14, null);
    }

    private final MarginUpgradeMarginLimitDuxo getDuxo() {
        return (MarginUpgradeMarginLimitDuxo) this.duxo.getValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final Typeface getBoldTypeface() {
        return (Typeface) this.boldTypeface.getValue();
    }

    public final MarginUpgradeEventLogger getMarginUpgradeEventLogger() {
        MarginUpgradeEventLogger marginUpgradeEventLogger = this.marginUpgradeEventLogger;
        if (marginUpgradeEventLogger != null) {
            return marginUpgradeEventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("marginUpgradeEventLogger");
        return null;
    }

    public final void setMarginUpgradeEventLogger(MarginUpgradeEventLogger marginUpgradeEventLogger) {
        Intrinsics.checkNotNullParameter(marginUpgradeEventLogger, "<set-?>");
        this.marginUpgradeEventLogger = marginUpgradeEventLogger;
    }

    public final Clock getClock() {
        Clock clock = this.clock;
        if (clock != null) {
            return clock;
        }
        Intrinsics.throwUninitializedPropertyAccessException(Card.Icon.CLOCK);
        return null;
    }

    public final void setClock(Clock clock) {
        Intrinsics.checkNotNullParameter(clock, "<set-?>");
        this.clock = clock;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (context instanceof Callbacks) {
            return;
        }
        throw new IllegalArgumentException((context + " must implement " + Callbacks.class.getName()).toString());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setLimitBtnOnClick$default(this, false, 1, null);
        OnClickListeners.onClick(getRemoveLimitBtn(), new Function0() { // from class: com.robinhood.android.common.margin.ui.limit.BaseMarginUpgradeMarginLimitFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseMarginUpgradeMarginLimitFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(BaseMarginUpgradeMarginLimitFragment baseMarginUpgradeMarginLimitFragment) {
        baseMarginUpgradeMarginLimitFragment.getDuxo().setUserSetLimit(null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (((Args) INSTANCE.getArgs((Fragment) this)).getFromMarginUpgrade()) {
            this.screenAppearTime = Instant.now(getClock());
            getMarginUpgradeEventLogger().logScreenAppear(this.analyticsScreen);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        if (((Args) INSTANCE.getArgs((Fragment) this)).getFromMarginUpgrade()) {
            getMarginUpgradeEventLogger().logScreenDisappear(this.analyticsScreen);
        }
        super.onStop();
    }

    static /* synthetic */ void setLimitBtnOnClick$default(BaseMarginUpgradeMarginLimitFragment baseMarginUpgradeMarginLimitFragment, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setLimitBtnOnClick");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        baseMarginUpgradeMarginLimitFragment.setLimitBtnOnClick(z);
    }

    private final void setLimitBtnOnClick(final boolean forceShowRemoveLimitButton) {
        OnClickListeners.onClick(getSetLimitBtn(), new Function0() { // from class: com.robinhood.android.common.margin.ui.limit.BaseMarginUpgradeMarginLimitFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseMarginUpgradeMarginLimitFragment.setLimitBtnOnClick$lambda$1(this.f$0, forceShowRemoveLimitButton);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setLimitBtnOnClick$lambda$1(BaseMarginUpgradeMarginLimitFragment baseMarginUpgradeMarginLimitFragment, boolean z) {
        Companion companion = INSTANCE;
        if (((Args) companion.getArgs((Fragment) baseMarginUpgradeMarginLimitFragment)).getFromMarginUpgrade()) {
            MarginUpgradeEventLogger.logTap$default(baseMarginUpgradeMarginLimitFragment.getMarginUpgradeEventLogger(), new Screen(Screen.Name.MARGIN_UPGRADE_MARGIN_LIMIT_SET, null, null, null, 14, null), Component.ComponentType.BUTTON, null, UserInteractionEventData.Action.SET_MARGIN_LIMIT, 4, null);
        }
        Navigator navigator = baseMarginUpgradeMarginLimitFragment.getNavigator();
        FragmentActivity fragmentActivityRequireActivity = baseMarginUpgradeMarginLimitFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        baseMarginUpgradeMarginLimitFragment.startActivityForResult(Navigator.DefaultImpls.createIntent$default(navigator, fragmentActivityRequireActivity, new MarginLimitActivityKey(((Args) companion.getArgs((Fragment) baseMarginUpgradeMarginLimitFragment)).getMarginInvestingInfo().getAccountNumber(), false, z, null, 8, null), null, false, 12, null), REQUEST_CODE);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C112451(this));
        Observable observableDistinctUntilChanged = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.common.margin.ui.limit.BaseMarginUpgradeMarginLimitFragment.onResume.2
            @Override // io.reactivex.functions.Function
            public final Optional<Money> apply(MarginUpgradeMarginLimitViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(it.getUserSetMarginLimit());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.margin.ui.limit.BaseMarginUpgradeMarginLimitFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseMarginUpgradeMarginLimitFragment.onResume$lambda$3(this.f$0, (Optional) obj);
            }
        });
    }

    /* compiled from: BaseMarginUpgradeMarginLimitFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.margin.ui.limit.BaseMarginUpgradeMarginLimitFragment$onResume$1 */
    /* synthetic */ class C112451 extends FunctionReferenceImpl implements Function1<MarginUpgradeMarginLimitViewState, Unit> {
        C112451(Object obj) {
            super(1, obj, BaseMarginUpgradeMarginLimitFragment.class, "refreshUi", "refreshUi(Lcom/robinhood/android/common/margin/ui/limit/MarginUpgradeMarginLimitViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MarginUpgradeMarginLimitViewState marginUpgradeMarginLimitViewState) {
            invoke2(marginUpgradeMarginLimitViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(MarginUpgradeMarginLimitViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((BaseMarginUpgradeMarginLimitFragment) this.receiver).refreshUi(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$3(final BaseMarginUpgradeMarginLimitFragment baseMarginUpgradeMarginLimitFragment, Optional optional) {
        final Money money = (Money) optional.component1();
        OnClickListeners.onClick(baseMarginUpgradeMarginLimitFragment.getConfirmBtn(), new Function0() { // from class: com.robinhood.android.common.margin.ui.limit.BaseMarginUpgradeMarginLimitFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseMarginUpgradeMarginLimitFragment.onResume$lambda$3$lambda$2(this.f$0, money);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$3$lambda$2(BaseMarginUpgradeMarginLimitFragment baseMarginUpgradeMarginLimitFragment, Money money) {
        baseMarginUpgradeMarginLimitFragment.getCallbacks().onMarginLimitConfirmed(money);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshUi(MarginUpgradeMarginLimitViewState state) {
        int i;
        int i2;
        BigDecimal marginBuyingPower = state.getMarginBuyingPower();
        BigDecimal totalBuyingPower = state.getTotalBuyingPower();
        getMarginBuyingPowerTxt().setText(Formats.getCurrencyFormat().format(marginBuyingPower));
        TextView totalTxt = getTotalTxt();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan(getBoldTypeface());
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) Formats.getCurrencyFormat().format(totalBuyingPower));
        spannableStringBuilder.setSpan(customTypefaceSpan, length, spannableStringBuilder.length(), 17);
        spannableStringBuilder.append((CharSequence) PlaceholderUtils.XXShortPlaceholderText);
        spannableStringBuilder.append((CharSequence) getString(C11223R.string.margin_upgrade_margin_limit_total));
        totalTxt.setText(new SpannedString(spannableStringBuilder));
        setLimitBtnOnClick(state.getUserSetMarginLimit() != null);
        TextView setLimitBtn = getSetLimitBtn();
        if (state.getUserSetMarginLimit() == null) {
            i = C11223R.string.margin_upgrade_margin_limit_set;
        } else {
            i = C11223R.string.margin_upgrade_margin_limit_change;
        }
        setLimitBtn.setText(getString(i));
        TextView disclosureTxt = getDisclosureTxt();
        if (state.isInSlipRegionGate()) {
            i2 = C11223R.string.margin_upgrade_margin_limit_disclosure_decoupled;
        } else {
            i2 = C11223R.string.margin_upgrade_margin_limit_disclosure_decoupled_without_slip;
        }
        disclosureTxt.setText(getString(i2));
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode != REQUEST_CODE) {
            super.onActivityResult(requestCode, resultCode, data);
        } else if (resultCode == -1) {
            ReturnedData.SetMarginLimit setMarginLimit = data != null ? (ReturnedData.SetMarginLimit) data.getParcelableExtra(ReturnedData.EXTRA_RETURNED_DATA) : null;
            Intrinsics.checkNotNull(setMarginLimit);
            getDuxo().setUserSetLimit(setMarginLimit.getMarginLimit());
        }
    }

    /* compiled from: BaseMarginUpgradeMarginLimitFragment.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/limit/BaseMarginUpgradeMarginLimitFragment$Args;", "Landroid/os/Parcelable;", "marginInvestingInfo", "Lcom/robinhood/android/lib/margin/api/ApiMarginInvestingInfo;", "fromMarginUpgrade", "", "isGold", "<init>", "(Lcom/robinhood/android/lib/margin/api/ApiMarginInvestingInfo;ZZ)V", "getMarginInvestingInfo", "()Lcom/robinhood/android/lib/margin/api/ApiMarginInvestingInfo;", "getFromMarginUpgrade", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean fromMarginUpgrade;
        private final boolean isGold;
        private final ApiMarginInvestingInfo marginInvestingInfo;

        /* compiled from: BaseMarginUpgradeMarginLimitFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((ApiMarginInvestingInfo) parcel.readParcelable(Args.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, ApiMarginInvestingInfo apiMarginInvestingInfo, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                apiMarginInvestingInfo = args.marginInvestingInfo;
            }
            if ((i & 2) != 0) {
                z = args.fromMarginUpgrade;
            }
            if ((i & 4) != 0) {
                z2 = args.isGold;
            }
            return args.copy(apiMarginInvestingInfo, z, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiMarginInvestingInfo getMarginInvestingInfo() {
            return this.marginInvestingInfo;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getFromMarginUpgrade() {
            return this.fromMarginUpgrade;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsGold() {
            return this.isGold;
        }

        public final Args copy(ApiMarginInvestingInfo marginInvestingInfo, boolean fromMarginUpgrade, boolean isGold) {
            Intrinsics.checkNotNullParameter(marginInvestingInfo, "marginInvestingInfo");
            return new Args(marginInvestingInfo, fromMarginUpgrade, isGold);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.marginInvestingInfo, args.marginInvestingInfo) && this.fromMarginUpgrade == args.fromMarginUpgrade && this.isGold == args.isGold;
        }

        public int hashCode() {
            return (((this.marginInvestingInfo.hashCode() * 31) + Boolean.hashCode(this.fromMarginUpgrade)) * 31) + Boolean.hashCode(this.isGold);
        }

        public String toString() {
            return "Args(marginInvestingInfo=" + this.marginInvestingInfo + ", fromMarginUpgrade=" + this.fromMarginUpgrade + ", isGold=" + this.isGold + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.marginInvestingInfo, flags);
            dest.writeInt(this.fromMarginUpgrade ? 1 : 0);
            dest.writeInt(this.isGold ? 1 : 0);
        }

        public Args(ApiMarginInvestingInfo marginInvestingInfo, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(marginInvestingInfo, "marginInvestingInfo");
            this.marginInvestingInfo = marginInvestingInfo;
            this.fromMarginUpgrade = z;
            this.isGold = z2;
        }

        public /* synthetic */ Args(ApiMarginInvestingInfo apiMarginInvestingInfo, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(apiMarginInvestingInfo, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
        }

        public final ApiMarginInvestingInfo getMarginInvestingInfo() {
            return this.marginInvestingInfo;
        }

        public final boolean getFromMarginUpgrade() {
            return this.fromMarginUpgrade;
        }

        public final boolean isGold() {
            return this.isGold;
        }
    }

    /* compiled from: BaseMarginUpgradeMarginLimitFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/limit/BaseMarginUpgradeMarginLimitFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/AbstractFragmentCompanion;", "Lcom/robinhood/android/common/margin/ui/limit/BaseMarginUpgradeMarginLimitFragment;", "Lcom/robinhood/android/common/margin/ui/limit/BaseMarginUpgradeMarginLimitFragment$Args;", "<init>", "()V", "REQUEST_CODE", "", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements AbstractFragmentCompanion<BaseMarginUpgradeMarginLimitFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(BaseMarginUpgradeMarginLimitFragment baseMarginUpgradeMarginLimitFragment) {
            return (Args) AbstractFragmentCompanion.DefaultImpls.getArgs(this, baseMarginUpgradeMarginLimitFragment);
        }
    }
}
