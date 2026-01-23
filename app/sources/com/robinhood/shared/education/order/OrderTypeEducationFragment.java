package com.robinhood.shared.education.order;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.KeyEventDispatcher;
import androidx.view.result.ActivityResultCaller;
import com.airbnb.lottie.FontAssetDelegate;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.TextDelegate;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.SimpleLottieValueCallback;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.NoTitleToolbarFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.common.util.extensions.TextViewsKt;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.crypto.lib.UiCurrencyPairs;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.font.C16915R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.util.extensions.LottieAnimationViewsKt;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Order;
import com.robinhood.rosetta.converters.orders.Orders2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.CryptoOrderContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.education.contracts.OrderTypeEducationFragmentKey;
import com.robinhood.shared.education.order.OrderTypeEducation;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.color.GammaEvaluator;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import io.reactivex.Observable;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.Interfaces2;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import rosetta.order.Side;

/* compiled from: OrderTypeEducationFragment.kt */
@Metadata(m3635d1 = {"\u0000±\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001L\b\u0007\u0018\u0000 i2\u00020\u00012\u00020\u0002:\u0001iB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020_2\b\u0010`\u001a\u0004\u0018\u00010aH\u0016J\u0010\u0010b\u001a\u00020]2\u0006\u0010c\u001a\u00020dH\u0016J\b\u0010e\u001a\u00020]H\u0016J\b\u0010f\u001a\u00020]H\u0016J\b\u0010g\u001a\u00020]H\u0002J\u0010\u0010h\u001a\u00020]2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0016\u0010#\u001a\u0004\u0018\u00010$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u001b\u0010+\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b-\u0010.R\u001b\u00101\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b2\u0010.R\u001b\u00104\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00100\u001a\u0004\b6\u00107R\u001b\u00109\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u00100\u001a\u0004\b;\u0010<R\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u00100\u001a\u0004\b?\u0010<R\u001b\u0010A\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u00100\u001a\u0004\bC\u0010DR\u001b\u0010F\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u00100\u001a\u0004\bH\u0010IR\u0010\u0010K\u001a\u00020LX\u0082\u0004¢\u0006\u0004\n\u0002\u0010MR\u0016\u0010N\u001a\u0004\u0018\u00010O8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0012\u0010R\u001a\u00020S8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010T\u001a\u00020S8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010U\u001a\u00020S8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020S0W8\u0002@\u0002X\u0083\u000e¢\u0006\u0004\n\u0002\u0010XR\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020S0W8\u0002@\u0002X\u0083\u000e¢\u0006\u0004\n\u0002\u0010XR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020S0W8\u0002@\u0002X\u0083\u000e¢\u0006\u0004\n\u0002\u0010XR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020S0W8\u0002@\u0002X\u0083\u000e¢\u0006\u0004\n\u0002\u0010X¨\u0006j"}, m3636d2 = {"Lcom/robinhood/shared/education/order/OrderTypeEducationFragment;", "Lcom/robinhood/android/common/ui/NoTitleToolbarFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "getInstrumentStore", "()Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "setInstrumentStore", "(Lcom/robinhood/librobinhood/data/store/InstrumentStore;)V", "currencyPairV2Store", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "getCurrencyPairV2Store", "()Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "setCurrencyPairV2Store", "(Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;)V", "orderTypeEducationManager", "Lcom/robinhood/shared/education/order/OrderTypeEducationManager;", "getOrderTypeEducationManager", "()Lcom/robinhood/shared/education/order/OrderTypeEducationManager;", "setOrderTypeEducationManager", "(Lcom/robinhood/shared/education/order/OrderTypeEducationManager;)V", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$OrderTypeEducationConfiguration;", "getConfiguration", "()Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$OrderTypeEducationConfiguration;", "configuration$delegate", "Lkotlin/Lazy;", "originalToolbarNavIcon", "Landroid/graphics/drawable/Drawable;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "orderTypeEducation", "Lcom/robinhood/shared/education/order/OrderTypeEducation;", "getOrderTypeEducation", "()Lcom/robinhood/shared/education/order/OrderTypeEducation;", "title", "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "title$delegate", "Lkotlin/properties/ReadOnlyProperty;", "prompt", "getPrompt", "prompt$delegate", "animation", "Lcom/airbnb/lottie/LottieAnimationView;", "getAnimation", "()Lcom/airbnb/lottie/LottieAnimationView;", "animation$delegate", "continueBtn", "Landroid/widget/Button;", "getContinueBtn", "()Landroid/widget/Button;", "continueBtn$delegate", "dismissBtn", "getDismissBtn", "dismissBtn$delegate", "constraintLayoutContainer", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getConstraintLayoutContainer", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "constraintLayoutContainer$delegate", "disclaimerTxt", "Lcom/robinhood/android/designsystem/text/RhTextView;", "getDisclaimerTxt", "()Lcom/robinhood/android/designsystem/text/RhTextView;", "disclaimerTxt$delegate", "fontAssetDelegate", "com/robinhood/shared/education/order/OrderTypeEducationFragment$fontAssetDelegate$1", "Lcom/robinhood/shared/education/order/OrderTypeEducationFragment$fontAssetDelegate$1;", "callbacks", "Lcom/robinhood/shared/education/order/OrderTypeEducationFragmentCallbacks;", "getCallbacks", "()Lcom/robinhood/shared/education/order/OrderTypeEducationFragmentCallbacks;", "foregroundColor", "", "primaryColor", "primaryColorLight", "primaryGradient", "", "[Ljava/lang/Integer;", "foregroundGradient", "primaryGradientStopLimit", "foregroundGradientStopLimit", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onResume", "onStop", "refreshColors", "finish", "Companion", "lib-order-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class OrderTypeEducationFragment extends NoTitleToolbarFragment implements AutoLoggableFragment {
    public static final String EXTRA_ORDER_TYPE_EDUCATION_CONFIGURATION = "orderTypeEducationConfiguration";
    public static final String FONT_REGULAR = "Capsule Sans";

    /* renamed from: animation$delegate, reason: from kotlin metadata */
    private final Interfaces2 animation;

    /* renamed from: configuration$delegate, reason: from kotlin metadata */
    private final Lazy configuration;

    /* renamed from: constraintLayoutContainer$delegate, reason: from kotlin metadata */
    private final Interfaces2 constraintLayoutContainer;

    /* renamed from: continueBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 continueBtn;
    public CurrencyPairV2Store currencyPairV2Store;

    /* renamed from: disclaimerTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 disclaimerTxt;

    /* renamed from: dismissBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 dismissBtn;
    private final OrderTypeEducationFragment2 fontAssetDelegate;
    private int foregroundColor;
    private Integer[] foregroundGradient;
    private Integer[] foregroundGradientStopLimit;
    public InstrumentStore instrumentStore;
    public OrderTypeEducationManager orderTypeEducationManager;
    private Drawable originalToolbarNavIcon;
    private int primaryColor;
    private int primaryColorLight;
    private Integer[] primaryGradient;
    private Integer[] primaryGradientStopLimit;

    /* renamed from: prompt$delegate, reason: from kotlin metadata */
    private final Interfaces2 prompt;

    /* renamed from: title$delegate, reason: from kotlin metadata */
    private final Interfaces2 title;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OrderTypeEducationFragment.class, "title", "getTitle()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OrderTypeEducationFragment.class, "prompt", "getPrompt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OrderTypeEducationFragment.class, "animation", "getAnimation()Lcom/airbnb/lottie/LottieAnimationView;", 0)), Reflection.property1(new PropertyReference1Impl(OrderTypeEducationFragment.class, "continueBtn", "getContinueBtn()Landroid/widget/Button;", 0)), Reflection.property1(new PropertyReference1Impl(OrderTypeEducationFragment.class, "dismissBtn", "getDismissBtn()Landroid/widget/Button;", 0)), Reflection.property1(new PropertyReference1Impl(OrderTypeEducationFragment.class, "constraintLayoutContainer", "getConstraintLayoutContainer()Landroidx/constraintlayout/widget/ConstraintLayout;", 0)), Reflection.property1(new PropertyReference1Impl(OrderTypeEducationFragment.class, "disclaimerTxt", "getDisclaimerTxt()Lcom/robinhood/android/designsystem/text/RhTextView;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OrderTypeEducationFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[Order.Configuration.values().length];
            try {
                iArr[Order.Configuration.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Order.Configuration.LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Order.Configuration.STOP_LOSS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Order.Configuration.STOP_LIMIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Order.Configuration.SIMPLE_LIMIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Order.Configuration.TRAILING_STOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OrderTypeEducationFragmentKey.NavIconType.values().length];
            try {
                iArr2[OrderTypeEducationFragmentKey.NavIconType.CLOSE_BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[OrderTypeEducationFragmentKey.NavIconType.BACK_BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[DayNightOverlay.values().length];
            try {
                iArr3[DayNightOverlay.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[DayNightOverlay.NIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [com.robinhood.shared.education.order.OrderTypeEducationFragment$fontAssetDelegate$1] */
    public OrderTypeEducationFragment() {
        super(C38811R.layout.fragment_order_type_education);
        this.configuration = Fragments2.argument(this, EXTRA_ORDER_TYPE_EDUCATION_CONFIGURATION);
        this.title = bindView(C38811R.id.order_type_title);
        this.prompt = bindView(C38811R.id.order_type_prompt);
        this.animation = bindView(C38811R.id.order_type_animation);
        this.continueBtn = bindView(C38811R.id.continue_btn);
        this.dismissBtn = bindView(C38811R.id.dismiss_btn);
        this.constraintLayoutContainer = bindView(C38811R.id.constraint_layout);
        this.disclaimerTxt = bindView(C38811R.id.disclaimer_txt);
        this.fontAssetDelegate = new FontAssetDelegate() { // from class: com.robinhood.shared.education.order.OrderTypeEducationFragment$fontAssetDelegate$1
            @Override // com.airbnb.lottie.FontAssetDelegate
            public Typeface fetchFont(String fontFamily) {
                if (!Intrinsics.areEqual(fontFamily, OrderTypeEducationFragment.FONT_REGULAR)) {
                    Preconditions.INSTANCE.failUnexpectedItemKotlin(fontFamily);
                    throw new ExceptionsH();
                }
                int i = C16915R.font.capsule_sans_text_book;
                Context contextRequireContext = this.this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                return ContextsUiExtensions.requireFont(contextRequireContext, i);
            }
        };
        Integer[] numArr = new Integer[3];
        for (int i = 0; i < 3; i++) {
            numArr[i] = 0;
        }
        this.primaryGradient = numArr;
        Integer[] numArr2 = new Integer[3];
        for (int i2 = 0; i2 < 3; i2++) {
            numArr2[i2] = 0;
        }
        this.foregroundGradient = numArr2;
        Integer[] numArr3 = new Integer[4];
        for (int i3 = 0; i3 < 4; i3++) {
            numArr3[i3] = 0;
        }
        this.primaryGradientStopLimit = numArr3;
        Integer[] numArr4 = new Integer[4];
        for (int i4 = 0; i4 < 4; i4++) {
            numArr4[i4] = 0;
        }
        this.foregroundGradientStopLimit = numArr4;
    }

    public final InstrumentStore getInstrumentStore() {
        InstrumentStore instrumentStore = this.instrumentStore;
        if (instrumentStore != null) {
            return instrumentStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("instrumentStore");
        return null;
    }

    public final void setInstrumentStore(InstrumentStore instrumentStore) {
        Intrinsics.checkNotNullParameter(instrumentStore, "<set-?>");
        this.instrumentStore = instrumentStore;
    }

    public final CurrencyPairV2Store getCurrencyPairV2Store() {
        CurrencyPairV2Store currencyPairV2Store = this.currencyPairV2Store;
        if (currencyPairV2Store != null) {
            return currencyPairV2Store;
        }
        Intrinsics.throwUninitializedPropertyAccessException("currencyPairV2Store");
        return null;
    }

    public final void setCurrencyPairV2Store(CurrencyPairV2Store currencyPairV2Store) {
        Intrinsics.checkNotNullParameter(currencyPairV2Store, "<set-?>");
        this.currencyPairV2Store = currencyPairV2Store;
    }

    public final OrderTypeEducationManager getOrderTypeEducationManager() {
        OrderTypeEducationManager orderTypeEducationManager = this.orderTypeEducationManager;
        if (orderTypeEducationManager != null) {
            return orderTypeEducationManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("orderTypeEducationManager");
        return null;
    }

    public final void setOrderTypeEducationManager(OrderTypeEducationManager orderTypeEducationManager) {
        Intrinsics.checkNotNullParameter(orderTypeEducationManager, "<set-?>");
        this.orderTypeEducationManager = orderTypeEducationManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration getConfiguration() {
        return (OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration) this.configuration.getValue();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration configuration = getConfiguration();
        if (configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder) {
            return new Screen(Screen.Name.CRYPTO_ORDER_INFORMATION, null, null, null, 14, null);
        }
        if (!(configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.PerpetualContract) && !(configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.EquityOrder) && !(configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.Recurring) && !(configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.TokenizedStocks)) {
            throw new NoWhenBranchMatchedException();
        }
        return new Screen(Screen.Name.NAME_UNSPECIFIED, null, null, null, 14, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        CryptoOrderContext.CryptoOrderType cryptoOrderType;
        CryptoOrderContext.CryptoOrderType cryptoOrderType2;
        OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration configuration = getConfiguration();
        if (configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder) {
            OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder cryptoOrder = (OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder) configuration;
            switch (WhenMappings.$EnumSwitchMapping$0[cryptoOrder.getOrderConfiguration().ordinal()]) {
                case 1:
                    cryptoOrderType2 = CryptoOrderContext.CryptoOrderType.MARKET;
                    break;
                case 2:
                    cryptoOrderType2 = CryptoOrderContext.CryptoOrderType.LIMIT;
                    break;
                case 3:
                    cryptoOrderType2 = CryptoOrderContext.CryptoOrderType.STOP_LOSS;
                    break;
                case 4:
                    cryptoOrderType2 = CryptoOrderContext.CryptoOrderType.STOP_LIMIT;
                    break;
                case 5:
                    throw new IllegalStateException("Simple limit not supported");
                case 6:
                    throw new IllegalStateException("Trailing stop not supported");
                default:
                    throw new NoWhenBranchMatchedException();
            }
            CryptoOrderContext.CryptoOrderType cryptoOrderType3 = cryptoOrderType2;
            Side protobuf = Orders2.toProtobuf(cryptoOrder.getSide());
            String strValueOf = String.valueOf(cryptoOrder.getInstrumentId());
            String string2 = cryptoOrder.getOrderUuid().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            return new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new CryptoOrderContext(cryptoOrderType3, protobuf, strValueOf, string2, 0.0d, null, null, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, null, null, 0.0d, null, 1048560, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -2049, -1, -1, 16383, null);
        }
        if (configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.PerpetualContract) {
            OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.PerpetualContract perpetualContract = (OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.PerpetualContract) configuration;
            switch (WhenMappings.$EnumSwitchMapping$0[perpetualContract.getOrderConfiguration().ordinal()]) {
                case 1:
                    cryptoOrderType = CryptoOrderContext.CryptoOrderType.MARKET;
                    break;
                case 2:
                    cryptoOrderType = CryptoOrderContext.CryptoOrderType.LIMIT;
                    break;
                case 3:
                    cryptoOrderType = CryptoOrderContext.CryptoOrderType.STOP_LOSS;
                    break;
                case 4:
                    cryptoOrderType = CryptoOrderContext.CryptoOrderType.STOP_LIMIT;
                    break;
                case 5:
                    throw new IllegalStateException("Simple limit not supported");
                case 6:
                    throw new IllegalStateException("Trailing stop not supported");
                default:
                    throw new NoWhenBranchMatchedException();
            }
            CryptoOrderContext.CryptoOrderType cryptoOrderType4 = cryptoOrderType;
            Side protobuf2 = Orders2.toProtobuf(perpetualContract.getSide());
            String strValueOf2 = String.valueOf(perpetualContract.getInstrumentId());
            String string3 = perpetualContract.getOrderUuid().toString();
            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
            return new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new CryptoOrderContext(cryptoOrderType4, protobuf2, strValueOf2, string3, 0.0d, null, null, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, null, null, 0.0d, null, 1048560, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -2049, -1, -1, 16383, null);
        }
        if ((configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.EquityOrder) || (configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.Recurring) || (configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.TokenizedStocks)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final OrderTypeEducation getOrderTypeEducation() {
        return OrderTypeEducationConfiguration2.toOrderTypeEducation(getConfiguration());
    }

    private final TextView getTitle() {
        return (TextView) this.title.getValue(this, $$delegatedProperties[0]);
    }

    private final TextView getPrompt() {
        return (TextView) this.prompt.getValue(this, $$delegatedProperties[1]);
    }

    private final LottieAnimationView getAnimation() {
        return (LottieAnimationView) this.animation.getValue(this, $$delegatedProperties[2]);
    }

    private final Button getContinueBtn() {
        return (Button) this.continueBtn.getValue(this, $$delegatedProperties[3]);
    }

    private final Button getDismissBtn() {
        return (Button) this.dismissBtn.getValue(this, $$delegatedProperties[4]);
    }

    private final ConstraintLayout getConstraintLayoutContainer() {
        return (ConstraintLayout) this.constraintLayoutContainer.getValue(this, $$delegatedProperties[5]);
    }

    private final RhTextView getDisclaimerTxt() {
        return (RhTextView) this.disclaimerTxt.getValue(this, $$delegatedProperties[6]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OrderTypeEducationFragmentCallbacks getCallbacks() {
        ActivityResultCaller parentFragment = getParentFragment();
        OrderTypeEducationFragmentCallbacks orderTypeEducationFragmentCallbacks = parentFragment instanceof OrderTypeEducationFragmentCallbacks ? (OrderTypeEducationFragmentCallbacks) parentFragment : null;
        if (orderTypeEducationFragmentCallbacks != null) {
            return orderTypeEducationFragmentCallbacks;
        }
        KeyEventDispatcher.Component activity = getActivity();
        if (activity instanceof OrderTypeEducationFragmentCallbacks) {
            return (OrderTypeEducationFragmentCallbacks) activity;
        }
        return null;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        List<KeyPath> listEmptyList;
        List<KeyPath> listEmptyList2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (!isInTabFragment()) {
            ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        }
        OrderTypeEducation orderTypeEducation = getOrderTypeEducation();
        getTitle().setText(orderTypeEducation.getTitleRes());
        getPrompt().setText(orderTypeEducation.getPromptRes());
        getDismissBtn().setVisibility(getConfiguration().getShowDismissBtn() ? 0 : 8);
        getContinueBtn().setVisibility(getConfiguration().getShowContinueBtn() ? 0 : 8);
        if (getConfiguration() instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder) {
            Button continueBtn = getContinueBtn();
            if (getOrderTypeEducation() == OrderTypeEducation.LIMIT_BUY_CRYPTO || getOrderTypeEducation() == OrderTypeEducation.LIMIT_SELL_CRYPTO) {
                continueBtn.setText(getString(C11048R.string.general_label_ok));
            }
        }
        final OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration configuration = getConfiguration();
        if (configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.Recurring) {
            if (getOrderTypeEducationManager().hasSeenRecurringEducation()) {
                OnClickListeners.onClick(getContinueBtn(), new Function0() { // from class: com.robinhood.shared.education.order.OrderTypeEducationFragment$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OrderTypeEducationFragment.onViewCreated$lambda$1(this.f$0);
                    }
                });
                getDismissBtn().setVisibility(8);
            } else {
                OnClickListeners.onClick(getContinueBtn(), new Function0() { // from class: com.robinhood.shared.education.order.OrderTypeEducationFragment$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OrderTypeEducationFragment.onViewCreated$lambda$2(this.f$0, configuration);
                    }
                });
                OnClickListeners.onClick(getDismissBtn(), new Function0() { // from class: com.robinhood.shared.education.order.OrderTypeEducationFragment$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OrderTypeEducationFragment.onViewCreated$lambda$3(this.f$0, configuration);
                    }
                });
            }
        } else if (configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.EquityOrder) {
            OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.EquityOrder equityOrder = (OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.EquityOrder) configuration;
            final Order.Configuration orderConfiguration = equityOrder.getDirectOrder().getOrderConfiguration();
            final EquityOrderSide side = equityOrder.getSide();
            if (getOrderTypeEducationManager().hasSeenEducation(orderConfiguration, side)) {
                OnClickListeners.onClick(getContinueBtn(), new Function0() { // from class: com.robinhood.shared.education.order.OrderTypeEducationFragment$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OrderTypeEducationFragment.onViewCreated$lambda$4(this.f$0);
                    }
                });
                getDismissBtn().setVisibility(8);
            } else {
                OnClickListeners.onClick(getContinueBtn(), new Function0() { // from class: com.robinhood.shared.education.order.OrderTypeEducationFragment$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OrderTypeEducationFragment.onViewCreated$lambda$5(this.f$0, configuration);
                    }
                });
                OnClickListeners.onClick(getDismissBtn(), new Function0() { // from class: com.robinhood.shared.education.order.OrderTypeEducationFragment$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OrderTypeEducationFragment.onViewCreated$lambda$6(this.f$0, orderConfiguration, side, configuration);
                    }
                });
            }
        } else if (configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder) {
            OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder cryptoOrder = (OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder) configuration;
            final Order.Configuration orderConfiguration2 = cryptoOrder.getOrderConfiguration();
            if (getOrderTypeEducationManager().hasSeenEducation(orderConfiguration2, cryptoOrder.getSide())) {
                OnClickListeners.onClick(getContinueBtn(), new Function0() { // from class: com.robinhood.shared.education.order.OrderTypeEducationFragment$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OrderTypeEducationFragment.onViewCreated$lambda$7(this.f$0, orderConfiguration2, configuration);
                    }
                });
                getDismissBtn().setVisibility(8);
            } else {
                OnClickListeners.onClick(getContinueBtn(), new Function0() { // from class: com.robinhood.shared.education.order.OrderTypeEducationFragment$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OrderTypeEducationFragment.onViewCreated$lambda$8(this.f$0, orderConfiguration2, configuration);
                    }
                });
                OnClickListeners.onClick(getDismissBtn(), new Function0() { // from class: com.robinhood.shared.education.order.OrderTypeEducationFragment$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OrderTypeEducationFragment.onViewCreated$lambda$9(this.f$0, orderConfiguration2, configuration);
                    }
                });
            }
        } else if (configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.PerpetualContract) {
            OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.PerpetualContract perpetualContract = (OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.PerpetualContract) configuration;
            final Order.Configuration orderConfiguration3 = perpetualContract.getOrderConfiguration();
            if (getOrderTypeEducationManager().hasSeenEducation(orderConfiguration3, perpetualContract.getSide())) {
                OnClickListeners.onClick(getContinueBtn(), new Function0() { // from class: com.robinhood.shared.education.order.OrderTypeEducationFragment$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OrderTypeEducationFragment.onViewCreated$lambda$10(this.f$0, orderConfiguration3, configuration);
                    }
                });
                getDismissBtn().setVisibility(8);
            } else {
                OnClickListeners.onClick(getContinueBtn(), new Function0() { // from class: com.robinhood.shared.education.order.OrderTypeEducationFragment$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OrderTypeEducationFragment.onViewCreated$lambda$11(this.f$0, orderConfiguration3, configuration);
                    }
                });
                OnClickListeners.onClick(getDismissBtn(), new Function0() { // from class: com.robinhood.shared.education.order.OrderTypeEducationFragment$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OrderTypeEducationFragment.onViewCreated$lambda$12(this.f$0, orderConfiguration3, configuration);
                    }
                });
            }
        } else {
            if (!(configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.TokenizedStocks)) {
                throw new NoWhenBranchMatchedException();
            }
            OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.TokenizedStocks tokenizedStocks = (OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.TokenizedStocks) configuration;
            final Order.Configuration orderConfiguration4 = tokenizedStocks.getOrderConfiguration();
            if (getOrderTypeEducationManager().hasSeenEducation(orderConfiguration4, tokenizedStocks.getSide())) {
                OnClickListeners.onClick(getContinueBtn(), new Function0() { // from class: com.robinhood.shared.education.order.OrderTypeEducationFragment$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OrderTypeEducationFragment.onViewCreated$lambda$13(this.f$0, orderConfiguration4, configuration);
                    }
                });
                getDismissBtn().setVisibility(8);
            } else {
                OnClickListeners.onClick(getContinueBtn(), new Function0() { // from class: com.robinhood.shared.education.order.OrderTypeEducationFragment$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OrderTypeEducationFragment.onViewCreated$lambda$14(this.f$0, orderConfiguration4, configuration);
                    }
                });
                OnClickListeners.onClick(getDismissBtn(), new Function0() { // from class: com.robinhood.shared.education.order.OrderTypeEducationFragment$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OrderTypeEducationFragment.onViewCreated$lambda$15(this.f$0, orderConfiguration4, configuration);
                    }
                });
            }
        }
        getAnimation().setAnimation(getOrderTypeEducation().getAnimationRes().getPrimaryRes());
        if (getOrderTypeEducation().getRepeatMarker() != null) {
            LottieAnimationViewsKt.addEndingInfiniteLoop$default(getAnimation(), getOrderTypeEducation().getRepeatMarker(), null, null, 6, null);
        }
        getAnimation().setFontAssetDelegate(this.fontAssetDelegate);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(getConstraintLayoutContainer());
        constraintSet.setDimensionRatio(getAnimation().getId(), getOrderTypeEducation().getDimensionRatio());
        constraintSet.applyTo(getConstraintLayoutContainer());
        Integer disclaimerRes = getOrderTypeEducation().getDisclaimerRes();
        if (disclaimerRes != null) {
            int iIntValue = disclaimerRes.intValue();
            Integer disclaimerAlertTitleRes = getOrderTypeEducation().getDisclaimerAlertTitleRes();
            if (disclaimerAlertTitleRes == null) {
                throw new IllegalStateException("disclaimerAlertTitleRes must be non-null when disclaimerRes is non-null");
            }
            final int iIntValue2 = disclaimerAlertTitleRes.intValue();
            Integer disclaimerAlertMessageRes = getOrderTypeEducation().getDisclaimerAlertMessageRes();
            if (disclaimerAlertMessageRes == null) {
                throw new IllegalStateException("disclaimerAlertMessageRes must be non-null when disclaimerRes is non-null");
            }
            final int iIntValue3 = disclaimerAlertMessageRes.intValue();
            getDisclaimerTxt().setVisibility(0);
            RhTextView disclaimerTxt = getDisclaimerTxt();
            String string2 = ViewsKt.getString(disclaimerTxt, iIntValue);
            num = num.intValue() == 0 ? null : 0;
            TextViewsKt.setTextWithLearnMore((TextView) disclaimerTxt, (CharSequence) string2, false, true, num != null ? ViewsKt.getString(disclaimerTxt, num.intValue()) : null, (ClickableSpan) new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.shared.education.order.OrderTypeEducationFragment$onViewCreated$lambda$20$$inlined$setTextWithLearnMore$default$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    OrderTypeEducationFragmentCallbacks callbacks = this.this$0.getCallbacks();
                    if (callbacks != null) {
                        callbacks.onLearnMoreClicked(iIntValue2, iIntValue3);
                    }
                }
            }, 1, (DefaultConstructorMarker) null));
        }
        OrderTypeEducation.KeyPaths keyPaths = getOrderTypeEducation().getKeyPaths();
        LottieAnimationView animation = getAnimation();
        List<KeyPath> foregroundColor = keyPaths.getForegroundColor();
        Iterable iterableAsIterable = ArraysKt.asIterable(new Integer[]{LottieProperty.COLOR, LottieProperty.STROKE_COLOR});
        for (KeyPath keyPath : foregroundColor) {
            Iterator it = iterableAsIterable.iterator();
            while (it.hasNext()) {
                animation.addValueCallback(keyPath, (KeyPath) it.next(), (SimpleLottieValueCallback<KeyPath>) new SimpleLottieValueCallback() { // from class: com.robinhood.shared.education.order.OrderTypeEducationFragment$onViewCreated$$inlined$addValueCallbacks$1
                    @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
                    public final T getValue(LottieFrameInfo<T> lottieFrameInfo) {
                        Intrinsics.checkNotNull(lottieFrameInfo);
                        return (T) Integer.valueOf(this.this$0.foregroundColor);
                    }
                });
            }
        }
        LottieAnimationView animation2 = getAnimation();
        List<KeyPath> primaryColor = keyPaths.getPrimaryColor();
        Iterable iterableAsIterable2 = ArraysKt.asIterable(new Integer[]{LottieProperty.COLOR, LottieProperty.STROKE_COLOR});
        for (KeyPath keyPath2 : primaryColor) {
            Iterator it2 = iterableAsIterable2.iterator();
            while (it2.hasNext()) {
                animation2.addValueCallback(keyPath2, (KeyPath) it2.next(), (SimpleLottieValueCallback<KeyPath>) new SimpleLottieValueCallback() { // from class: com.robinhood.shared.education.order.OrderTypeEducationFragment$onViewCreated$$inlined$addValueCallbacks$2
                    @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
                    public final T getValue(LottieFrameInfo<T> lottieFrameInfo) {
                        Intrinsics.checkNotNull(lottieFrameInfo);
                        return (T) Integer.valueOf(this.this$0.primaryColor);
                    }
                });
            }
        }
        LottieAnimationView animation3 = getAnimation();
        List<KeyPath> primaryColorLight = keyPaths.getPrimaryColorLight();
        Iterable iterableAsIterable3 = ArraysKt.asIterable(new Integer[]{LottieProperty.COLOR, LottieProperty.STROKE_COLOR});
        for (KeyPath keyPath3 : primaryColorLight) {
            Iterator it3 = iterableAsIterable3.iterator();
            while (it3.hasNext()) {
                animation3.addValueCallback(keyPath3, (KeyPath) it3.next(), (SimpleLottieValueCallback<KeyPath>) new SimpleLottieValueCallback() { // from class: com.robinhood.shared.education.order.OrderTypeEducationFragment$onViewCreated$$inlined$addValueCallbacks$3
                    @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
                    public final T getValue(LottieFrameInfo<T> lottieFrameInfo) {
                        Intrinsics.checkNotNull(lottieFrameInfo);
                        return (T) Integer.valueOf(this.this$0.primaryColorLight);
                    }
                });
            }
        }
        LottieAnimationView animation4 = getAnimation();
        OrderTypeEducation.Gradient primaryGradient = keyPaths.getPrimaryGradient();
        if (primaryGradient == null || (listEmptyList = primaryGradient.getPaths()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List<KeyPath> list = listEmptyList;
        Iterable iterableAsIterable4 = ArraysKt.asIterable(new Integer[][]{LottieProperty.GRADIENT_COLOR});
        for (KeyPath keyPath4 : list) {
            Iterator it4 = iterableAsIterable4.iterator();
            while (it4.hasNext()) {
                animation4.addValueCallback(keyPath4, (KeyPath) it4.next(), (SimpleLottieValueCallback<KeyPath>) new SimpleLottieValueCallback() { // from class: com.robinhood.shared.education.order.OrderTypeEducationFragment$onViewCreated$$inlined$addValueCallbacks$4
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
                    public final T getValue(LottieFrameInfo<T> lottieFrameInfo) {
                        Intrinsics.checkNotNull(lottieFrameInfo);
                        OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration configuration2 = this.this$0.getConfiguration();
                        if ((configuration2 instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.EquityOrder) && ((OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.EquityOrder) configuration2).getDirectOrder().getOrderConfiguration() == Order.Configuration.STOP_LIMIT) {
                            return (T) this.this$0.primaryGradientStopLimit;
                        }
                        return ((configuration2 instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder) && ((OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder) configuration2).getOrderConfiguration() == Order.Configuration.STOP_LIMIT) ? (T) this.this$0.primaryGradientStopLimit : (T) this.this$0.primaryGradient;
                    }
                });
            }
        }
        LottieAnimationView animation5 = getAnimation();
        OrderTypeEducation.Gradient foregroundGradient = keyPaths.getForegroundGradient();
        if (foregroundGradient == null || (listEmptyList2 = foregroundGradient.getPaths()) == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        List<KeyPath> list2 = listEmptyList2;
        Iterable iterableAsIterable5 = ArraysKt.asIterable(new Integer[][]{LottieProperty.GRADIENT_COLOR});
        for (KeyPath keyPath5 : list2) {
            Iterator it5 = iterableAsIterable5.iterator();
            while (it5.hasNext()) {
                animation5.addValueCallback(keyPath5, (KeyPath) it5.next(), (SimpleLottieValueCallback<KeyPath>) new SimpleLottieValueCallback() { // from class: com.robinhood.shared.education.order.OrderTypeEducationFragment$onViewCreated$$inlined$addValueCallbacks$5
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
                    public final T getValue(LottieFrameInfo<T> lottieFrameInfo) {
                        Intrinsics.checkNotNull(lottieFrameInfo);
                        OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration configuration2 = this.this$0.getConfiguration();
                        if ((configuration2 instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.EquityOrder) && ((OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.EquityOrder) configuration2).getDirectOrder().getOrderConfiguration() == Order.Configuration.STOP_LIMIT) {
                            return (T) this.this$0.foregroundGradientStopLimit;
                        }
                        return ((configuration2 instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder) && ((OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder) configuration2).getOrderConfiguration() == Order.Configuration.STOP_LIMIT) ? (T) this.this$0.foregroundGradientStopLimit : (T) this.this$0.foregroundGradient;
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(OrderTypeEducationFragment orderTypeEducationFragment) {
        orderTypeEducationFragment.requireActivity().onBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(OrderTypeEducationFragment orderTypeEducationFragment, OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration orderTypeEducationConfiguration) {
        orderTypeEducationFragment.finish(orderTypeEducationConfiguration);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(OrderTypeEducationFragment orderTypeEducationFragment, OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration orderTypeEducationConfiguration) {
        orderTypeEducationFragment.getOrderTypeEducationManager().hideRecurringEducation();
        orderTypeEducationFragment.finish(orderTypeEducationConfiguration);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(OrderTypeEducationFragment orderTypeEducationFragment) {
        orderTypeEducationFragment.requireActivity().onBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5(OrderTypeEducationFragment orderTypeEducationFragment, OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration orderTypeEducationConfiguration) {
        orderTypeEducationFragment.finish(orderTypeEducationConfiguration);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6(OrderTypeEducationFragment orderTypeEducationFragment, Order.Configuration configuration, EquityOrderSide equityOrderSide, OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration orderTypeEducationConfiguration) {
        orderTypeEducationFragment.getOrderTypeEducationManager().hideEducation(configuration, equityOrderSide);
        orderTypeEducationFragment.finish(orderTypeEducationConfiguration);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7(OrderTypeEducationFragment orderTypeEducationFragment, Order.Configuration configuration, OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration orderTypeEducationConfiguration) {
        orderTypeEducationFragment.getOrderTypeEducationManager().hideEducation(configuration, ((OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder) orderTypeEducationConfiguration).getSide());
        orderTypeEducationFragment.requireActivity().onBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$8(OrderTypeEducationFragment orderTypeEducationFragment, Order.Configuration configuration, OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration orderTypeEducationConfiguration) {
        orderTypeEducationFragment.getOrderTypeEducationManager().hideEducation(configuration, ((OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder) orderTypeEducationConfiguration).getSide());
        orderTypeEducationFragment.finish(orderTypeEducationConfiguration);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$9(OrderTypeEducationFragment orderTypeEducationFragment, Order.Configuration configuration, OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration orderTypeEducationConfiguration) {
        orderTypeEducationFragment.getOrderTypeEducationManager().hideEducation(configuration, ((OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder) orderTypeEducationConfiguration).getSide());
        orderTypeEducationFragment.finish(orderTypeEducationConfiguration);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$10(OrderTypeEducationFragment orderTypeEducationFragment, Order.Configuration configuration, OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration orderTypeEducationConfiguration) {
        orderTypeEducationFragment.getOrderTypeEducationManager().hideEducation(configuration, ((OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.PerpetualContract) orderTypeEducationConfiguration).getSide());
        orderTypeEducationFragment.requireActivity().onBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$11(OrderTypeEducationFragment orderTypeEducationFragment, Order.Configuration configuration, OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration orderTypeEducationConfiguration) {
        orderTypeEducationFragment.getOrderTypeEducationManager().hideEducation(configuration, ((OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.PerpetualContract) orderTypeEducationConfiguration).getSide());
        orderTypeEducationFragment.finish(orderTypeEducationConfiguration);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$12(OrderTypeEducationFragment orderTypeEducationFragment, Order.Configuration configuration, OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration orderTypeEducationConfiguration) {
        orderTypeEducationFragment.getOrderTypeEducationManager().hideEducation(configuration, ((OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.PerpetualContract) orderTypeEducationConfiguration).getSide());
        orderTypeEducationFragment.finish(orderTypeEducationConfiguration);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$13(OrderTypeEducationFragment orderTypeEducationFragment, Order.Configuration configuration, OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration orderTypeEducationConfiguration) {
        orderTypeEducationFragment.getOrderTypeEducationManager().hideEducation(configuration, ((OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.TokenizedStocks) orderTypeEducationConfiguration).getSide());
        orderTypeEducationFragment.requireActivity().onBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$14(OrderTypeEducationFragment orderTypeEducationFragment, Order.Configuration configuration, OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration orderTypeEducationConfiguration) {
        orderTypeEducationFragment.getOrderTypeEducationManager().hideEducation(configuration, ((OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.TokenizedStocks) orderTypeEducationConfiguration).getSide());
        orderTypeEducationFragment.finish(orderTypeEducationConfiguration);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$15(OrderTypeEducationFragment orderTypeEducationFragment, Order.Configuration configuration, OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration orderTypeEducationConfiguration) {
        orderTypeEducationFragment.getOrderTypeEducationManager().hideEducation(configuration, ((OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.TokenizedStocks) orderTypeEducationConfiguration).getSide());
        orderTypeEducationFragment.finish(orderTypeEducationConfiguration);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.NoTitleToolbarFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        Toolbar toolbar2 = toolbar.getToolbar();
        this.originalToolbarNavIcon = toolbar.getToolbar().getNavigationIcon();
        int i = WhenMappings.$EnumSwitchMapping$1[getConfiguration().getToolbarNavIconType().ordinal()];
        if (i == 1) {
            Drawable drawable = ViewsKt.getDrawable(toolbar2, C20690R.drawable.ic_rds_close_24dp);
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            drawable.setTint(ThemeColors.getThemeColor(contextRequireContext, C20690R.attr.colorForeground1));
            toolbar2.setNavigationIcon(drawable);
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        Drawable drawable2 = ViewsKt.getDrawable(toolbar2, C20690R.drawable.ic_rds_arrow_left_24dp);
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        drawable2.setTint(ThemeColors.getThemeColor(contextRequireContext2, C20690R.attr.colorForeground1));
        toolbar2.setNavigationIcon(drawable2);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        UUID instrumentId = getConfiguration().getInstrumentId();
        OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration configuration = getConfiguration();
        if ((configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder) || (configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.TokenizedStocks)) {
            if (instrumentId != null) {
                LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getCurrencyPairV2Store().streamCurrencyPair(instrumentId)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.education.order.OrderTypeEducationFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OrderTypeEducationFragment.onResume$lambda$29(this.f$0, (UiCurrencyPair) obj);
                    }
                });
            }
        } else if ((configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.EquityOrder) || (configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.Recurring)) {
            if (instrumentId != null) {
                getInstrumentStore().refresh(false, instrumentId);
                Observable<Instrument> observableTake = getInstrumentStore().getInstrument(instrumentId).take(1L);
                Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
                LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.education.order.OrderTypeEducationFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OrderTypeEducationFragment.onResume$lambda$30(this.f$0, (Instrument) obj);
                    }
                });
            }
        } else {
            if (!(configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.PerpetualContract)) {
                throw new NoWhenBranchMatchedException();
            }
            getPrompt().setText(getResources().getString(getOrderTypeEducation().getPromptRes(), ((OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.PerpetualContract) configuration).getInstrumentSymbol()));
        }
        TextDelegate textDelegate = new TextDelegate(getAnimation());
        List<Tuples2<String, Integer>> animationCopy = getOrderTypeEducation().getAnimationCopy();
        if (animationCopy != null) {
            Iterator<T> it = animationCopy.iterator();
            while (it.hasNext()) {
                Tuples2 tuples2 = (Tuples2) it.next();
                textDelegate.setText((String) tuples2.component1(), getResources().getString(((Number) tuples2.component2()).intValue()));
            }
        }
        getAnimation().setTextDelegate(textDelegate);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnFastPath(requireBaseActivity().getDayNightStyleChanges()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.education.order.OrderTypeEducationFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderTypeEducationFragment.onResume$lambda$35(this.f$0, (DayNightOverlay) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$29(OrderTypeEducationFragment orderTypeEducationFragment, UiCurrencyPair currencyPair) {
        String code;
        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
        int promptRes = orderTypeEducationFragment.getOrderTypeEducation().getPromptRes();
        TextView prompt = orderTypeEducationFragment.getPrompt();
        Resources resources = orderTypeEducationFragment.getResources();
        if (currencyPair.isTokenizedStock()) {
            StringResource symbolWithType = UiCurrencyPairs.getSymbolWithType(currencyPair);
            Resources resources2 = orderTypeEducationFragment.getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            code = symbolWithType.getText(resources2).toString();
        } else {
            code = currencyPair.getAssetCurrency().getCode();
        }
        prompt.setText(resources.getString(promptRes, code));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$30(OrderTypeEducationFragment orderTypeEducationFragment, Instrument instrument) {
        orderTypeEducationFragment.getPrompt().setText(orderTypeEducationFragment.getResources().getString(orderTypeEducationFragment.getOrderTypeEducation().getPromptRes(), instrument.getSymbol()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$35(OrderTypeEducationFragment orderTypeEducationFragment, DayNightOverlay dayNightOverlay) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        if (orderTypeEducationFragment.getOrderTypeEducation().getAnimationRes() instanceof OrderTypeEducation.AnimationRes.DayNightRes) {
            OrderTypeEducation.AnimationRes animationRes = orderTypeEducationFragment.getOrderTypeEducation().getAnimationRes();
            Intrinsics.checkNotNull(animationRes, "null cannot be cast to non-null type com.robinhood.shared.education.order.OrderTypeEducation.AnimationRes.DayNightRes");
            OrderTypeEducation.AnimationRes.DayNightRes dayNightRes = (OrderTypeEducation.AnimationRes.DayNightRes) animationRes;
            int i = WhenMappings.$EnumSwitchMapping$2[dayNightOverlay.ordinal()];
            if (i == 1) {
                orderTypeEducationFragment.getAnimation().setAnimation(dayNightRes.getDayRes());
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                orderTypeEducationFragment.getAnimation().setAnimation(dayNightRes.getNightRes());
            }
        }
        Toolbar toolbar = orderTypeEducationFragment.requireToolbar().getToolbar();
        int i2 = WhenMappings.$EnumSwitchMapping$1[orderTypeEducationFragment.getConfiguration().getToolbarNavIconType().ordinal()];
        if (i2 == 1) {
            Drawable drawable = ViewsKt.getDrawable(toolbar, C20690R.drawable.ic_rds_close_24dp);
            Context contextRequireContext = orderTypeEducationFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            drawable.setTint(ThemeColors.getThemeColor(contextRequireContext, C20690R.attr.colorForeground1));
            toolbar.setNavigationIcon(drawable);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Drawable drawable2 = ViewsKt.getDrawable(toolbar, C20690R.drawable.ic_rds_arrow_left_24dp);
            Context contextRequireContext2 = orderTypeEducationFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            drawable2.setTint(ThemeColors.getThemeColor(contextRequireContext2, C20690R.attr.colorForeground1));
            toolbar.setNavigationIcon(drawable2);
        }
        orderTypeEducationFragment.refreshColors();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        requireToolbar().getToolbar().setNavigationIcon(this.originalToolbarNavIcon);
    }

    private final void refreshColors() throws Resources.NotFoundException {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        int themeColor = ThemeColors.getThemeColor(contextRequireContext, C20690R.attr.colorBackground1);
        OrderTypeEducation.Gradient primaryGradient = getOrderTypeEducation().getKeyPaths().getPrimaryGradient();
        float alpha = primaryGradient != null ? primaryGradient.getAlpha() : 1.0f;
        OrderTypeEducation.Gradient foregroundGradient = getOrderTypeEducation().getKeyPaths().getForegroundGradient();
        float alpha2 = foregroundGradient != null ? foregroundGradient.getAlpha() : 1.0f;
        this.foregroundColor = ThemeColors.getThemeColor(contextRequireContext, C20690R.attr.colorForeground1);
        int themeColor2 = ThemeColors.getThemeColor(contextRequireContext, C20690R.attr.colorPositive);
        this.primaryColor = themeColor2;
        float f = 255;
        this.primaryColorLight = (themeColor2 & 16777215) | (RangesKt.coerceIn(MathKt.roundToInt(0.4f * f), 0, 255) << 24);
        int i = themeColor & 16777215;
        float f2 = 0.0f * f;
        Integer numValueOf = Integer.valueOf((RangesKt.coerceIn(MathKt.roundToInt(f2), 0, 255) << 24) | i);
        GammaEvaluator gammaEvaluator = GammaEvaluator.INSTANCE;
        float f3 = alpha * f;
        this.primaryGradient = new Integer[]{numValueOf, Integer.valueOf((gammaEvaluator.evaluate(0.5f, this.primaryColor, themeColor).intValue() & 16777215) | (RangesKt.coerceIn(MathKt.roundToInt((alpha / 2.0f) * f), 0, 255) << 24)), Integer.valueOf((RangesKt.coerceIn(MathKt.roundToInt(f3), 0, 255) << 24) | (this.primaryColor & 16777215))};
        float f4 = alpha2 * f;
        this.foregroundGradient = new Integer[]{Integer.valueOf((RangesKt.coerceIn(MathKt.roundToInt(f2), 0, 255) << 24) | i), Integer.valueOf((gammaEvaluator.evaluate(0.5f, this.foregroundColor, themeColor).intValue() & 16777215) | (RangesKt.coerceIn(MathKt.roundToInt((alpha2 / 2.0f) * f), 0, 255) << 24)), Integer.valueOf((this.foregroundColor & 16777215) | (RangesKt.coerceIn(MathKt.roundToInt(f4), 0, 255) << 24))};
        float f5 = 2;
        this.primaryGradientStopLimit = new Integer[]{Integer.valueOf((RangesKt.coerceIn(MathKt.roundToInt(f2), 0, 255) << 24) | i), Integer.valueOf((gammaEvaluator.evaluate(0.5f, this.primaryColor, themeColor).intValue() & 16777215) | (RangesKt.coerceIn(MathKt.roundToInt((alpha / 3.0f) * f), 0, 255) << 24)), Integer.valueOf((RangesKt.coerceIn(MathKt.roundToInt(((alpha * f5) / 3.0f) * f), 0, 255) << 24) | (gammaEvaluator.evaluate(0.5f, this.primaryColor, themeColor).intValue() & 16777215)), Integer.valueOf((RangesKt.coerceIn(MathKt.roundToInt(f3), 0, 255) << 24) | (this.primaryColor & 16777215))};
        this.foregroundGradientStopLimit = new Integer[]{Integer.valueOf(i | (RangesKt.coerceIn(MathKt.roundToInt(f2), 0, 255) << 24)), Integer.valueOf((gammaEvaluator.evaluate(0.5f, this.foregroundColor, themeColor).intValue() & 16777215) | (RangesKt.coerceIn(MathKt.roundToInt((alpha2 / 3.0f) * f), 0, 255) << 24)), Integer.valueOf((gammaEvaluator.evaluate(0.5f, this.foregroundColor, themeColor).intValue() & 16777215) | (RangesKt.coerceIn(MathKt.roundToInt(((f5 * alpha2) / 3.0f) * f), 0, 255) << 24)), Integer.valueOf((this.foregroundColor & 16777215) | (RangesKt.coerceIn(MathKt.roundToInt(f4), 0, 255) << 24))};
        getAnimation().invalidate();
    }

    private final void finish(OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration configuration) {
        OrderTypeEducationFragmentCallbacks callbacks = getCallbacks();
        if (callbacks != null) {
            callbacks.onOrderTypeEducationFinished(configuration);
        } else {
            requireActivity().onBackPressed();
        }
    }

    /* compiled from: OrderTypeEducationFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/education/order/OrderTypeEducationFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey;", "<init>", "()V", "FONT_REGULAR", "", "EXTRA_ORDER_TYPE_EDUCATION_CONFIGURATION", "createFragment", "Lcom/robinhood/shared/education/order/OrderTypeEducationFragment;", "key", "lib-order-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements FragmentResolver<OrderTypeEducationFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public OrderTypeEducationFragment createFragment(OrderTypeEducationFragmentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            OrderTypeEducationFragment orderTypeEducationFragment = new OrderTypeEducationFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable(OrderTypeEducationFragment.EXTRA_ORDER_TYPE_EDUCATION_CONFIGURATION, key.getConfig());
            orderTypeEducationFragment.setArguments(bundle);
            return orderTypeEducationFragment;
        }
    }
}
