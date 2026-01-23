package com.robinhood.android.matcha.p177ui.amount;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.font.C16915R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.matcha.databinding.FragmentMatchaAmountInputBinding;
import com.robinhood.android.matcha.models.p176ui.Transactor;
import com.robinhood.android.matcha.p177ui.amount.MatchaAmountInputFragment;
import com.robinhood.android.matcha.p177ui.common.RosettaConverters;
import com.robinhood.android.matcha.p177ui.models.Direction;
import com.robinhood.android.matcha.p177ui.sourceoffunds.SourceOfFundsBottomSheet;
import com.robinhood.android.models.matcha.api.SourceOfFunds;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.social.contracts.matcha.MatchaTransaction;
import com.robinhood.android.tickerinputview.TickerInputView;
import com.robinhood.android.transfers.contracts.Transfer;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.serverdriven.p347db.GenericAlert;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.P2PContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: MatchaAmountInputFragment.kt */
@Metadata(m3635d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 Y2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003WXYB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u00108\u001a\u000209H\u0016J\u0012\u0010:\u001a\u0002092\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\u001a\u0010=\u001a\u0002092\u0006\u0010>\u001a\u00020?2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\u0010\u0010@\u001a\u0002092\u0006\u0010A\u001a\u00020BH\u0016J\u0018\u0010C\u001a\u0002092\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020GH\u0014J\u0010\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020KH\u0016J\u0010\u0010L\u001a\u0002092\u0006\u0010M\u001a\u00020NH\u0002J\u001a\u0010O\u001a\u00020I2\u0006\u0010P\u001a\u00020Q2\b\u0010R\u001a\u0004\u0018\u00010<H\u0016J\u0010\u0010S\u001a\u0002092\u0006\u0010T\u001a\u00020UH\u0016J\b\u0010V\u001a\u000209H\u0002R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u000b\u001a\u0004\b\u0019\u0010\u001aR/\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010%\u001a\u00020&8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u0010/\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u001b\u00103\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\u000b\u001a\u0004\b5\u00106¨\u0006Z"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/amount/MatchaAmountInputFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/matcha/ui/sourceoffunds/SourceOfFundsBottomSheet$Callbacks;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/matcha/ui/amount/MatchaAmountInputDuxo;", "getDuxo", "()Lcom/robinhood/android/matcha/ui/amount/MatchaAmountInputDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/matcha/ui/amount/MatchaAmountInputFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/matcha/ui/amount/MatchaAmountInputFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "binding", "Lcom/robinhood/android/matcha/databinding/FragmentMatchaAmountInputBinding;", "getBinding", "()Lcom/robinhood/android/matcha/databinding/FragmentMatchaAmountInputBinding;", "binding$delegate", "caretDrawable", "Landroid/graphics/drawable/Drawable;", "getCaretDrawable", "()Landroid/graphics/drawable/Drawable;", "caretDrawable$delegate", "<set-?>", "Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "sourceOfFundsType", "getSourceOfFundsType", "()Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "setSourceOfFundsType", "(Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;)V", "sourceOfFundsType$delegate", "Lkotlin/properties/ReadWriteProperty;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/P2PContext;", "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/P2PContext;", "loggingContext$delegate", "onStart", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "createOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Landroid/view/MenuItem;", "bind", "state", "Lcom/robinhood/android/matcha/ui/amount/MatchaAmountInputViewState;", "onPositiveButtonClicked", "id", "", "passthroughArgs", "onSourceOfFundsSelected", "sourceOfFunds", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "launchTransfers", "Callbacks", "Args", "Companion", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MatchaAmountInputFragment extends BaseFragment implements SourceOfFundsBottomSheet.Callbacks, AutoLoggableFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: caretDrawable$delegate, reason: from kotlin metadata */
    private final Lazy caretDrawable;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;

    /* renamed from: loggingContext$delegate, reason: from kotlin metadata */
    private final Lazy loggingContext;

    /* renamed from: sourceOfFundsType$delegate, reason: from kotlin metadata */
    private final Interfaces3 sourceOfFundsType;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MatchaAmountInputFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/matcha/ui/amount/MatchaAmountInputFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(MatchaAmountInputFragment.class, "binding", "getBinding()Lcom/robinhood/android/matcha/databinding/FragmentMatchaAmountInputBinding;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(MatchaAmountInputFragment.class, "sourceOfFundsType", "getSourceOfFundsType()Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: MatchaAmountInputFragment.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH&¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/amount/MatchaAmountInputFragment$Callbacks;", "", "onAddTransactors", "", "existingTransactor", "Lcom/robinhood/android/matcha/models/ui/Transactor;", "onAmountEntered", "amount", "Lcom/robinhood/models/util/Money;", "sourceOfFunds", "Lcom/robinhood/android/models/matcha/api/SourceOfFunds;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAddTransactors(Transactor existingTransactor);

        void onAmountEntered(Money amount, SourceOfFunds sourceOfFunds);
    }

    /* compiled from: MatchaAmountInputFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.SEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
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

    public MatchaAmountInputFragment() {
        super(C21284R.layout.fragment_matcha_amount_input);
        this.duxo = OldDuxos.oldDuxo(this, MatchaAmountInputDuxo.class);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.matcha.ui.amount.MatchaAmountInputFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof MatchaAmountInputFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.binding = ViewBinding5.viewBinding(this, MatchaAmountInputFragment2.INSTANCE);
        this.caretDrawable = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.robinhood.android.matcha.ui.amount.MatchaAmountInputFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MatchaAmountInputFragment.caretDrawable_delegate$lambda$1(this.f$0);
            }
        });
        this.sourceOfFundsType = (Interfaces3) BindSavedState2.savedSerializable(this).provideDelegate(this, $$delegatedProperties[2]);
        this.loggingContext = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.matcha.ui.amount.MatchaAmountInputFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MatchaAmountInputFragment.loggingContext_delegate$lambda$3(this.f$0);
            }
        });
    }

    private final MatchaAmountInputDuxo getDuxo() {
        return (MatchaAmountInputDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentMatchaAmountInputBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentMatchaAmountInputBinding) value;
    }

    private final Drawable getCaretDrawable() {
        return (Drawable) this.caretDrawable.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Drawable caretDrawable_delegate$lambda$1(MatchaAmountInputFragment matchaAmountInputFragment) {
        Context contextRequireContext = matchaAmountInputFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Drawable drawable = contextRequireContext.getDrawable(C20690R.drawable.ic_rds_caret_down_12dp);
        Intrinsics.checkNotNull(drawable);
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setBounds(0, 0, drawableMutate.getIntrinsicWidth(), drawableMutate.getIntrinsicHeight());
        drawableMutate.setTint(ThemeColors.getThemeColor(contextRequireContext, C20690R.attr.colorForeground2));
        Intrinsics.checkNotNullExpressionValue(drawableMutate, "apply(...)");
        return drawableMutate;
    }

    private final ApiTransferAccount.TransferAccountType getSourceOfFundsType() {
        return (ApiTransferAccount.TransferAccountType) this.sourceOfFundsType.getValue(this, $$delegatedProperties[2]);
    }

    private final void setSourceOfFundsType(ApiTransferAccount.TransferAccountType transferAccountType) {
        this.sourceOfFundsType.setValue(this, $$delegatedProperties[2], transferAccountType);
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.P2P_CREATE_TRANSACTION, null, null, null, 14, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, Context.ProductTag.PEER_TO_PEER, 0, null, ((Args) INSTANCE.getArgs((Fragment) this)).getEntryPoint().getIdentifier(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, getLoggingContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1153, -1, -1, -268435457, -1, -1, 16383, null);
    }

    private final P2PContext getLoggingContext() {
        return (P2PContext) this.loggingContext.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final P2PContext loggingContext_delegate$lambda$3(MatchaAmountInputFragment matchaAmountInputFragment) {
        Companion companion = INSTANCE;
        P2PContext.Direction protobuf = RosettaConverters.toProtobuf(((Args) companion.getArgs((Fragment) matchaAmountInputFragment)).getDirection());
        List<Transactor> transactors = ((Args) companion.getArgs((Fragment) matchaAmountInputFragment)).getTransactors();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(transactors, 10));
        Iterator<T> it = transactors.iterator();
        while (it.hasNext()) {
            arrayList.add(RosettaConverters.toTargetType((Transactor) it.next()));
        }
        return new P2PContext(protobuf, null, 0.0f, null, arrayList, null, 46, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C213021(this));
    }

    /* compiled from: MatchaAmountInputFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.matcha.ui.amount.MatchaAmountInputFragment$onStart$1 */
    /* synthetic */ class C213021 extends FunctionReferenceImpl implements Function1<MatchaAmountInputViewState, Unit> {
        C213021(Object obj) {
            super(1, obj, MatchaAmountInputFragment.class, "bind", "bind(Lcom/robinhood/android/matcha/ui/amount/MatchaAmountInputViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MatchaAmountInputViewState matchaAmountInputViewState) {
            invoke2(matchaAmountInputViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(MatchaAmountInputViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((MatchaAmountInputFragment) this.receiver).bind(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        TickerInputView tickerInputView = getBinding().inputView;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        tickerInputView.setTypeface(ContextsUiExtensions.getFont(contextRequireContext, C16915R.font.capsule_sans_medium));
        RhTextView inputSubtitleText = getBinding().inputSubtitleText;
        Intrinsics.checkNotNullExpressionValue(inputSubtitleText, "inputSubtitleText");
        Companion companion = INSTANCE;
        inputSubtitleText.setVisibility(((Args) companion.getArgs((Fragment) this)).getIsMultiuserUi() ? 0 : 8);
        RhTextView inputTotalAmount = getBinding().inputTotalAmount;
        Intrinsics.checkNotNullExpressionValue(inputTotalAmount, "inputTotalAmount");
        inputTotalAmount.setVisibility(((Args) companion.getArgs((Fragment) this)).getIsMultiuserUi() ? 0 : 8);
        RdsButton continueButton = getBinding().continueButton;
        Intrinsics.checkNotNullExpressionValue(continueButton, "continueButton");
        OnClickListeners.onClick(continueButton, new C213031(getDuxo()));
        LifecycleHost.DefaultImpls.bind$default(this, getBinding().numpad.getKeyEvents(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C213042(getDuxo()));
    }

    /* compiled from: MatchaAmountInputFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.matcha.ui.amount.MatchaAmountInputFragment$onViewCreated$1 */
    /* synthetic */ class C213031 extends FunctionReferenceImpl implements Function0<Unit> {
        C213031(Object obj) {
            super(0, obj, MatchaAmountInputDuxo.class, "onContinueButtonClick", "onContinueButtonClick()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((MatchaAmountInputDuxo) this.receiver).onContinueButtonClick();
        }
    }

    /* compiled from: MatchaAmountInputFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.matcha.ui.amount.MatchaAmountInputFragment$onViewCreated$2 */
    /* synthetic */ class C213042 extends FunctionReferenceImpl implements Function1<KeyEvent, Unit> {
        C213042(Object obj) {
            super(1, obj, MatchaAmountInputDuxo.class, "consumeKeyEvent", "consumeKeyEvent(Landroid/view/KeyEvent;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(KeyEvent keyEvent) {
            invoke2(keyEvent);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(KeyEvent p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((MatchaAmountInputDuxo) this.receiver).consumeKeyEvent(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle(getString(((Args) INSTANCE.getArgs((Fragment) this)).getDirection().getLabelResId()));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    protected void createOptionsMenu(Menu menu, MenuInflater inflater) {
        int i;
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.createOptionsMenu(menu, inflater);
        int i2 = WhenMappings.$EnumSwitchMapping$0[((Args) INSTANCE.getArgs((Fragment) this)).getDirection().ordinal()];
        if (i2 == 1) {
            i = C21284R.menu.menu_matcha_transfer;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C21284R.menu.menu_matcha_request;
        }
        inflater.inflate(i, menu);
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem item) {
        Tuples2 tuples2M3642to;
        Intrinsics.checkNotNullParameter(item, "item");
        int itemId = item.getItemId();
        if (itemId == C21284R.id.action_scan_code) {
            tuples2M3642to = Tuples4.m3642to(LegacyFragmentKey.MatchaQrCode.Scan.INSTANCE, "scan_qr_code");
        } else {
            if (itemId != C21284R.id.action_view_qr) {
                return super.onOptionsItemSelected(item);
            }
            tuples2M3642to = Tuples4.m3642to(LegacyFragmentKey.MatchaQrCode.View.INSTANCE, "view_qr_code");
        }
        LegacyFragmentKey.MatchaQrCode matchaQrCode = (LegacyFragmentKey.MatchaQrCode) tuples2M3642to.component1();
        String str = (String) tuples2M3642to.component2();
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), null, getEventScreen(), new Component(Component.ComponentType.BUTTON, str, null, 4, null), null, getScreenEventContext(), false, 41, null);
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, matchaQrCode, false, false, false, false, null, false, null, null, 1020, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(final MatchaAmountInputViewState state) {
        TransferAccount sourceOfFunds = state.getSourceOfFunds();
        setSourceOfFundsType(sourceOfFunds != null ? sourceOfFunds.getType() : null);
        RhToolbar rhToolbarRequireToolbar = requireToolbar();
        Resources resources = rhToolbarRequireToolbar.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rhToolbarRequireToolbar.setSubtitle(state.getToolbarSubtitle(resources, getCaretDrawable()));
        if (state.getDirection() == Direction.SEND) {
            OnClickListeners.onClick(rhToolbarRequireToolbar.getToolbar(), new Function0() { // from class: com.robinhood.android.matcha.ui.amount.MatchaAmountInputFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MatchaAmountInputFragment.bind$lambda$5$lambda$4(this.f$0, state);
                }
            });
        }
        getBinding().avatarComposeView.setContent(ComposableLambda3.composableLambdaInstance(1293066015, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.amount.MatchaAmountInputFragment.bind.2

            /* compiled from: MatchaAmountInputFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.matcha.ui.amount.MatchaAmountInputFragment$bind$2$1, reason: invalid class name */
            static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ MatchaAmountInputViewState $state;
                final /* synthetic */ MatchaAmountInputFragment this$0;

                AnonymousClass1(MatchaAmountInputViewState matchaAmountInputViewState, MatchaAmountInputFragment matchaAmountInputFragment) {
                    this.$state = matchaAmountInputViewState;
                    this.this$0 = matchaAmountInputFragment;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    if ((i & 3) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1718532177, i, -1, "com.robinhood.android.matcha.ui.amount.MatchaAmountInputFragment.bind.<anonymous>.<anonymous> (MatchaAmountInputFragment.kt:205)");
                    }
                    ImmutableList immutableList = extensions2.toImmutableList(this.$state.getProfileAvatarStates());
                    boolean zIsAddTransactorIconVisible = this.$state.isAddTransactorIconVisible();
                    Modifier.Companion companion = Modifier.INSTANCE;
                    composer.startReplaceGroup(5004770);
                    boolean zChangedInstance = composer.changedInstance(this.this$0);
                    final MatchaAmountInputFragment matchaAmountInputFragment = this.this$0;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.matcha.ui.amount.MatchaAmountInputFragment$bind$2$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MatchaAmountInputFragment.C213012.AnonymousClass1.invoke$lambda$1$lambda$0(matchaAmountInputFragment);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    Function0 function0 = (Function0) objRememberedValue;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(5004770);
                    boolean zChangedInstance2 = composer.changedInstance(this.this$0);
                    final MatchaAmountInputFragment matchaAmountInputFragment2 = this.this$0;
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.matcha.ui.amount.MatchaAmountInputFragment$bind$2$1$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MatchaAmountInputFragment.C213012.AnonymousClass1.invoke$lambda$3$lambda$2(matchaAmountInputFragment2);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    composer.endReplaceGroup();
                    ProfileBubbles.ProfileBubbles(immutableList, companion, function0, zIsAddTransactorIconVisible, (Function0) objRememberedValue2, composer, 48, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$1$lambda$0(MatchaAmountInputFragment matchaAmountInputFragment) {
                    EventLogger eventLogger = matchaAmountInputFragment.getEventLogger();
                    Screen eventScreen = matchaAmountInputFragment.getEventScreen();
                    com.robinhood.rosetta.eventlogging.Context screenEventContext = matchaAmountInputFragment.getScreenEventContext();
                    EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.EDIT, eventScreen, new Component(Component.ComponentType.ROW, "profile_bubbles", null, 4, null), null, screenEventContext, false, 40, null);
                    matchaAmountInputFragment.requireActivity().onBackPressed();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$3$lambda$2(MatchaAmountInputFragment matchaAmountInputFragment) {
                    EventLogger eventLogger = matchaAmountInputFragment.getEventLogger();
                    Screen eventScreen = matchaAmountInputFragment.getEventScreen();
                    com.robinhood.rosetta.eventlogging.Context screenEventContext = matchaAmountInputFragment.getScreenEventContext();
                    EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.ADD_TO_LIST, eventScreen, new Component(Component.ComponentType.ROW, "profile_bubbles", null, 4, null), null, screenEventContext, false, 40, null);
                    matchaAmountInputFragment.getCallbacks().onAddTransactors((Transactor) CollectionsKt.first((List) ((Args) MatchaAmountInputFragment.INSTANCE.getArgs((Fragment) matchaAmountInputFragment)).getTransactors()));
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1293066015, i, -1, "com.robinhood.android.matcha.ui.amount.MatchaAmountInputFragment.bind.<anonymous> (MatchaAmountInputFragment.kt:204)");
                }
                ComposeView avatarComposeView = MatchaAmountInputFragment.this.getBinding().avatarComposeView;
                Intrinsics.checkNotNullExpressionValue(avatarComposeView, "avatarComposeView");
                BentoTheme2.BentoTheme(ScarletComposeInterop.themeChangesForCompose(ScarletManager2.getScarletManager(avatarComposeView)), null, ComposableLambda3.rememberComposableLambda(1718532177, true, new AnonymousClass1(state, MatchaAmountInputFragment.this), composer, 54), composer, 384, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        TickerInputView tickerInputView = getBinding().inputView;
        UiEvent<Unit> animateInput = state.getAnimateInput();
        if ((animateInput != null ? animateInput.consume() : null) != null) {
            tickerInputView.transitionTo(state.getInputChars());
        } else {
            tickerInputView.setValue(state.getInputChars());
        }
        RhTextView rhTextView = getBinding().inputErrorText;
        Intrinsics.checkNotNull(rhTextView);
        rhTextView.setVisibility(state.getInputErrorText() != null ? 0 : 8);
        TextViewsKt.setText(rhTextView, state.getInputErrorText());
        RhTextView rhTextView2 = getBinding().inputTotalAmount;
        Intrinsics.checkNotNull(rhTextView2);
        Companion companion = INSTANCE;
        rhTextView2.setVisibility(((Args) companion.getArgs((Fragment) this)).getIsMultiuserUi() ? 0 : 8);
        StringResource stringResourceInvoke = StringResource.INSTANCE.invoke(C21284R.string.matcha_amount_input_multi_user_total_amount, Money.format$default(Money3.toMoney(BigDecimals7.times(state.getAmount(), ((Args) companion.getArgs((Fragment) this)).getTransactors().size()), Currencies.USD), null, false, null, false, 0, null, false, null, false, false, 1023, null));
        Resources resources2 = rhTextView2.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        rhTextView2.setText(stringResourceInvoke.getText(resources2).toString());
        getBinding().continueButton.setEnabled(state.isContinueButtonEnabled());
        UiEvent<Tuples2<Money, SourceOfFunds>> continueEvent = state.getContinueEvent();
        if (continueEvent != null) {
            continueEvent.consumeWith(new Function1() { // from class: com.robinhood.android.matcha.ui.amount.MatchaAmountInputFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MatchaAmountInputFragment.bind$lambda$9(this.f$0, (Tuples2) obj);
                }
            });
        }
        UiEvent<Unit> showInsufficientFundsError = state.getShowInsufficientFundsError();
        if (showInsufficientFundsError != null) {
            showInsufficientFundsError.consumeWith(new Function1() { // from class: com.robinhood.android.matcha.ui.amount.MatchaAmountInputFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MatchaAmountInputFragment.bind$lambda$10(this.f$0, (Unit) obj);
                }
            });
        }
        UiEvent<GenericAlert> restrictionAlert = state.getRestrictionAlert();
        if (restrictionAlert != null) {
            restrictionAlert.consumeWith(new Function1() { // from class: com.robinhood.android.matcha.ui.amount.MatchaAmountInputFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MatchaAmountInputFragment.bind$lambda$11(this.f$0, (GenericAlert) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$5$lambda$4(MatchaAmountInputFragment matchaAmountInputFragment, MatchaAmountInputViewState matchaAmountInputViewState) {
        EventLogger.DefaultImpls.logTap$default(matchaAmountInputFragment.getEventLogger(), null, matchaAmountInputFragment.getEventScreen(), new Component(Component.ComponentType.BUTTON, "change_source_of_funds", null, 4, null), null, matchaAmountInputFragment.getScreenEventContext(), false, 41, null);
        SourceOfFundsBottomSheet sourceOfFundsBottomSheet = (SourceOfFundsBottomSheet) SourceOfFundsBottomSheet.INSTANCE.newInstance((Parcelable) new SourceOfFundsBottomSheet.Args(matchaAmountInputViewState.getSourceOfFunds()));
        FragmentManager childFragmentManager = matchaAmountInputFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        sourceOfFundsBottomSheet.show(childFragmentManager, "source-of-funds-sheet");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$9(MatchaAmountInputFragment matchaAmountInputFragment, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        Money money = (Money) tuples2.component1();
        SourceOfFunds sourceOfFunds = (SourceOfFunds) tuples2.component2();
        EventLogger eventLogger = matchaAmountInputFragment.getEventLogger();
        Screen eventScreen = matchaAmountInputFragment.getEventScreen();
        com.robinhood.rosetta.eventlogging.Context context = new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, P2PContext.copy$default(matchaAmountInputFragment.getLoggingContext(), null, null, money.getDecimalValue().floatValue(), null, null, null, 59, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -268435457, -1, -1, 16383, null);
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.CONTINUE, eventScreen, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, context, false, 40, null);
        matchaAmountInputFragment.getCallbacks().onAmountEntered(money, sourceOfFunds);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$10(MatchaAmountInputFragment matchaAmountInputFragment, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        android.content.Context contextRequireContext = matchaAmountInputFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder theme = companion.create(contextRequireContext).setId(C21284R.id.dialog_id_matcha_transaction_error).setTitle(C21284R.string.matcha_transfer_insufficient_funds_title, new Object[0]).setMessage(C21284R.string.matcha_transfer_insufficient_funds_detail, new Object[0]).setPositiveButton(C21284R.string.matcha_transfer_insufficient_funds_action, new Object[0]).setNegativeButton(C11048R.string.general_label_cancel, new Object[0]).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome);
        FragmentManager childFragmentManager = matchaAmountInputFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(theme, childFragmentManager, "insufficient-funds-error", false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$11(MatchaAmountInputFragment matchaAmountInputFragment, GenericAlert it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Navigator.DefaultImpls.createDialogFragment$default(matchaAmountInputFragment.getNavigator(), new LegacyDialogFragmentKey.ClientComponentAlert(it, false, true, C21284R.id.dialog_id_matcha_restriction_error, 2, (DefaultConstructorMarker) null), null, 2, null).show(matchaAmountInputFragment.getChildFragmentManager(), "restriction-error");
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C21284R.id.dialog_id_matcha_transaction_error) {
            launchTransfers();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.matcha.ui.sourceoffunds.SourceOfFundsBottomSheet.Callbacks
    public void onSourceOfFundsSelected(TransferAccount sourceOfFunds) {
        Intrinsics.checkNotNullParameter(sourceOfFunds, "sourceOfFunds");
        getDuxo().setSourceOfFunds(sourceOfFunds);
    }

    private final void launchTransfers() {
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ApiTransferAccount.TransferAccountType sourceOfFundsType = getSourceOfFundsType();
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new Transfer(new TransferConfiguration.Standard(null, null, false, null, sourceOfFundsType != null ? new TransferConfiguration.TransferAccountSelection(null, false, sourceOfFundsType, 3, null) : null, null, null, null, false, false, null, null, false, 8175, null)), null, false, null, null, 60, null);
    }

    /* compiled from: MatchaAmountInputFragment.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/amount/MatchaAmountInputFragment$Args;", "Landroid/os/Parcelable;", "isMultiuserUi", "", "transactors", "", "Lcom/robinhood/android/matcha/models/ui/Transactor;", "direction", "Lcom/robinhood/android/matcha/ui/models/Direction;", "entryPoint", "Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$EntryPoint;", "<init>", "(ZLjava/util/List;Lcom/robinhood/android/matcha/ui/models/Direction;Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$EntryPoint;)V", "()Z", "getTransactors", "()Ljava/util/List;", "getDirection", "()Lcom/robinhood/android/matcha/ui/models/Direction;", "getEntryPoint", "()Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$EntryPoint;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final Direction direction;
        private final MatchaTransaction.EntryPoint entryPoint;
        private final boolean isMultiuserUi;
        private final List<Transactor> transactors;

        /* compiled from: MatchaAmountInputFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z = parcel.readInt() != 0;
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(Args.class.getClassLoader()));
                }
                return new Args(z, arrayList, Direction.CREATOR.createFromParcel(parcel), MatchaTransaction.EntryPoint.valueOf(parcel.readString()));
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
            dest.writeInt(this.isMultiuserUi ? 1 : 0);
            List<Transactor> list = this.transactors;
            dest.writeInt(list.size());
            Iterator<Transactor> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            this.direction.writeToParcel(dest, flags);
            dest.writeString(this.entryPoint.name());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Args(boolean z, List<? extends Transactor> transactors, Direction direction, MatchaTransaction.EntryPoint entryPoint) {
            Intrinsics.checkNotNullParameter(transactors, "transactors");
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            this.isMultiuserUi = z;
            this.transactors = transactors;
            this.direction = direction;
            this.entryPoint = entryPoint;
        }

        /* renamed from: isMultiuserUi, reason: from getter */
        public final boolean getIsMultiuserUi() {
            return this.isMultiuserUi;
        }

        public /* synthetic */ Args(boolean z, List list, Direction direction, MatchaTransaction.EntryPoint entryPoint, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? CollectionsKt.emptyList() : list, direction, entryPoint);
        }

        public final List<Transactor> getTransactors() {
            return this.transactors;
        }

        public final Direction getDirection() {
            return this.direction;
        }

        public final MatchaTransaction.EntryPoint getEntryPoint() {
            return this.entryPoint;
        }
    }

    /* compiled from: MatchaAmountInputFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/amount/MatchaAmountInputFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/matcha/ui/amount/MatchaAmountInputFragment;", "Lcom/robinhood/android/matcha/ui/amount/MatchaAmountInputFragment$Args;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<MatchaAmountInputFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(MatchaAmountInputFragment matchaAmountInputFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, matchaAmountInputFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MatchaAmountInputFragment newInstance(Args args) {
            return (MatchaAmountInputFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MatchaAmountInputFragment matchaAmountInputFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, matchaAmountInputFragment, args);
        }
    }
}
