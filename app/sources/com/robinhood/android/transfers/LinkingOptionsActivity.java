package com.robinhood.android.transfers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.StyleSpan;
import android.widget.LinearLayout;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.internal.measurement.zzah$$ExternalSyntheticBackportWithForwarding0;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.api.transfers.DisclosureLocation;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.banking.p065ui.DebitCardUserStatusBannerView;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.debitcard.strings.C13932R;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.android.designsystem.text.ThemableColorSpans3;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.app.keys.data.DebitCardLinkingConfiguration;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.transfers.contracts.CreateIavRelationshipIntentKey;
import com.robinhood.android.transfers.contracts.LinkingOptionsIntentKey;
import com.robinhood.android.transfers.transferhub.C30556R;
import com.robinhood.android.transfers.transferhub.databinding.ActivityLinkingOptionsBinding;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrument;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentPermissions;
import com.robinhood.models.api.bonfire.transfer.ApiDisclosureUIResponse;
import com.robinhood.models.api.bonfire.transfer.ApiServiceFeeParams;
import com.robinhood.models.api.bonfire.transfer.limitsv1.ApiAmountLimit;
import com.robinhood.models.api.bonfire.transfer.limitsv1.ApiLimitsHubBulkResponse;
import com.robinhood.models.api.bonfire.transfer.limitsv1.ApiLimitsHubResponse;
import com.robinhood.models.api.bonfire.transfer.limitsv1.ApiLimitsHubResponseDetails;
import com.robinhood.models.api.bonfire.transfer.limitsv1.LimitsInterval;
import com.robinhood.models.api.bonfire.transfer.limitsv1.TransferProductType;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.PaymentLinkingContext;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.LocalScarletManager;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceReferences5;
import com.robinhood.shared.transfers.contracts.context.IavSource;
import com.robinhood.store.paymentinstrument.debitcard.DebitCardInstrumentStore;
import com.robinhood.transfers.api.TransferType;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.SinglesAndroid;
import com.robinhood.utils.extensions.SinglesKt;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LinkingOptionsActivity.kt */
@Metadata(m3635d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0007\u0018\u0000 Q2\u00020\u00012\u00020\u0002:\u0001QB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010=H\u0014J\b\u0010>\u001a\u00020;H\u0002J\b\u0010?\u001a\u00020;H\u0002J\b\u0010@\u001a\u00020;H\u0002J\b\u0010A\u001a\u00020;H\u0014J\b\u0010B\u001a\u00020;H\u0014J\"\u0010C\u001a\u00020;2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020E2\b\u0010G\u001a\u0004\u0018\u00010HH\u0014J\u0010\u0010I\u001a\u00020;2\u0006\u0010J\u001a\u00020KH\u0016J\u001b\u0010L\u001a\u00020;2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020H0NH\u0016¢\u0006\u0002\u0010OJ\b\u0010P\u001a\u000202H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b%\u0010&R\u000e\u0010)\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010+\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b-\u0010.R+\u00103\u001a\u0002022\u0006\u00101\u001a\u0002028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006R"}, m3636d2 = {"Lcom/robinhood/android/transfers/LinkingOptionsActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/banking/ui/DebitCardUserStatusBannerView$Callbacks;", "<init>", "()V", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "getTransfersBonfireApi", "()Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "setTransfersBonfireApi", "(Lcom/robinhood/android/api/transfers/TransfersBonfireApi;)V", "debitCardInstrumentStore", "Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore;", "getDebitCardInstrumentStore", "()Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore;", "setDebitCardInstrumentStore", "(Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "getRxFactory", "()Lcom/robinhood/coroutines/rx/RxFactory;", "setRxFactory", "(Lcom/robinhood/coroutines/rx/RxFactory;)V", "binding", "Lcom/robinhood/android/transfers/transferhub/databinding/ActivityLinkingOptionsBinding;", "getBinding", "()Lcom/robinhood/android/transfers/transferhub/databinding/ActivityLinkingOptionsBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "loggingContext$delegate", "Lkotlin/Lazy;", "<set-?>", "", "hasActiveDebitCards", "getHasActiveDebitCards", "()Z", "setHasActiveDebitCards", "(Z)V", "hasActiveDebitCards$delegate", "Lkotlin/properties/ReadWriteProperty;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "defaultBankNavigate", "closeBasedOnExtras", "disclosureFallback", "onStart", "onStop", "onActivityResult", "requestCode", "", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onClickInfoBanner", "intents", "", "([Landroid/content/Intent;)V", "requiresAuthentication", "Companion", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class LinkingOptionsActivity extends BaseActivity implements DebitCardUserStatusBannerView.Callbacks {
    public static final int REQUEST_CODE_LINKING = 50;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public DebitCardInstrumentStore debitCardInstrumentStore;
    public EventLogger eventLogger;
    public ExperimentsStore experimentsStore;

    /* renamed from: hasActiveDebitCards$delegate, reason: from kotlin metadata */
    private final Interfaces3 hasActiveDebitCards;

    /* renamed from: loggingContext$delegate, reason: from kotlin metadata */
    private final Lazy loggingContext;
    public RxFactory rxFactory;
    private final Screen screen;
    public TransfersBonfireApi transfersBonfireApi;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(LinkingOptionsActivity.class, "binding", "getBinding()Lcom/robinhood/android/transfers/transferhub/databinding/ActivityLinkingOptionsBinding;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(LinkingOptionsActivity.class, "hasActiveDebitCards", "getHasActiveDebitCards()Z", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public LinkingOptionsActivity() {
        super(C30556R.layout.activity_linking_options);
        this.binding = ViewBinding5.viewBinding(this, LinkingOptionsActivity2.INSTANCE);
        this.screen = new Screen(Screen.Name.CHOOSE_LINKING_PAYMENT_METHOD, null, null, null, 14, null);
        this.loggingContext = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.transfers.LinkingOptionsActivity$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LinkingOptionsActivity.loggingContext_delegate$lambda$0(this.f$0);
            }
        });
        this.hasActiveDebitCards = BindSavedState2.savedBoolean(this, false).provideDelegate(this, $$delegatedProperties[1]);
    }

    public final TransfersBonfireApi getTransfersBonfireApi() {
        TransfersBonfireApi transfersBonfireApi = this.transfersBonfireApi;
        if (transfersBonfireApi != null) {
            return transfersBonfireApi;
        }
        Intrinsics.throwUninitializedPropertyAccessException("transfersBonfireApi");
        return null;
    }

    public final void setTransfersBonfireApi(TransfersBonfireApi transfersBonfireApi) {
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "<set-?>");
        this.transfersBonfireApi = transfersBonfireApi;
    }

    public final DebitCardInstrumentStore getDebitCardInstrumentStore() {
        DebitCardInstrumentStore debitCardInstrumentStore = this.debitCardInstrumentStore;
        if (debitCardInstrumentStore != null) {
            return debitCardInstrumentStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("debitCardInstrumentStore");
        return null;
    }

    public final void setDebitCardInstrumentStore(DebitCardInstrumentStore debitCardInstrumentStore) {
        Intrinsics.checkNotNullParameter(debitCardInstrumentStore, "<set-?>");
        this.debitCardInstrumentStore = debitCardInstrumentStore;
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

    public final ExperimentsStore getExperimentsStore() {
        ExperimentsStore experimentsStore = this.experimentsStore;
        if (experimentsStore != null) {
            return experimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("experimentsStore");
        return null;
    }

    public final void setExperimentsStore(ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(experimentsStore, "<set-?>");
        this.experimentsStore = experimentsStore;
    }

    public final RxFactory getRxFactory() {
        RxFactory rxFactory = this.rxFactory;
        if (rxFactory != null) {
            return rxFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rxFactory");
        return null;
    }

    public final void setRxFactory(RxFactory rxFactory) {
        Intrinsics.checkNotNullParameter(rxFactory, "<set-?>");
        this.rxFactory = rxFactory;
    }

    private final ActivityLinkingOptionsBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ActivityLinkingOptionsBinding) value;
    }

    private final Context getLoggingContext() {
        return (Context) this.loggingContext.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context loggingContext_delegate$lambda$0(LinkingOptionsActivity linkingOptionsActivity) {
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new PaymentLinkingContext(((LinkingOptionsIntentKey) INSTANCE.getExtras((Activity) linkingOptionsActivity)).getEntryPoint(), null, 2, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -32769, -1, -1, -1, 16383, null);
    }

    private final boolean getHasActiveDebitCards() {
        return ((Boolean) this.hasActiveDebitCards.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    private final void setHasActiveDebitCards(boolean z) {
        this.hasActiveDebitCards.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Observable<R> map = getDebitCardInstrumentStore().getActiveDebitCardInstruments().map(new Function() { // from class: com.robinhood.android.transfers.LinkingOptionsActivity.onCreate.1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(List<ApiPaymentInstrument> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!it.isEmpty());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.LinkingOptionsActivity$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LinkingOptionsActivity.onCreate$lambda$1(this.f$0, (Boolean) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(RxFactory.DefaultImpls.rxSingle$default(getRxFactory(), null, new C300633(null), 1, null)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.LinkingOptionsActivity$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LinkingOptionsActivity.onCreate$lambda$3(this.f$0, (ApiDisclosureUIResponse) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.transfers.LinkingOptionsActivity$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LinkingOptionsActivity.onCreate$lambda$4(this.f$0, (Throwable) obj);
            }
        });
        final ActivityLinkingOptionsBinding binding = getBinding();
        final RdsRowView rdsRowView = binding.debitCardCta;
        Intrinsics.checkNotNull(rdsRowView);
        ViewsKt.eventData$default(rdsRowView, false, new Function0() { // from class: com.robinhood.android.transfers.LinkingOptionsActivity$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LinkingOptionsActivity.onCreate$lambda$18$lambda$12$lambda$5(this.f$0);
            }
        }, 1, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Object[] objArr = {new StyleSpan(1), new ThemableColorSpans3(ResourceReferences5.toColor(ThemeAttributes.INSTANCE.getCOLOR_POSITIVE()))};
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) getString(C30556R.string.gated_instant_debit_card_subtitle));
        for (int i = 0; i < 2; i++) {
            spannableStringBuilder.setSpan(objArr[i], length, spannableStringBuilder.length(), 17);
        }
        rdsRowView.setSecondaryText(new SpannedString(spannableStringBuilder));
        OnClickListeners.onClick(rdsRowView, new Function0() { // from class: com.robinhood.android.transfers.LinkingOptionsActivity$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LinkingOptionsActivity.onCreate$lambda$18$lambda$12$lambda$8(this.f$0);
            }
        });
        Single map2 = RxFactory.DefaultImpls.rxSingle$default(getRxFactory(), null, new LinkingOptionsActivity4(this, null), 1, null).map(new Function() { // from class: com.robinhood.android.transfers.LinkingOptionsActivity$onCreate$6$1$5
            @Override // io.reactivex.functions.Function
            public final Optional<BigDecimal> apply(ApiLimitsHubBulkResponse limitsHubBulkResponse) {
                BigDecimal total_amount;
                T next;
                List<ApiAmountLimit> amount_limits;
                T next2;
                Intrinsics.checkNotNullParameter(limitsHubBulkResponse, "limitsHubBulkResponse");
                Iterator<T> it = limitsHubBulkResponse.getProduct_limits().iterator();
                while (true) {
                    total_amount = null;
                    if (!it.hasNext()) {
                        next = (T) null;
                        break;
                    }
                    next = it.next();
                    ApiLimitsHubResponse apiLimitsHubResponse = (ApiLimitsHubResponse) next;
                    if (apiLimitsHubResponse.getProduct_type() == TransferProductType.DEBIT_CARD_FUNDING) {
                        ApiLimitsHubResponseDetails details = apiLimitsHubResponse.getDetails();
                        if ((details != null ? details.getDirection() : null) == TransferDirection.DEPOSIT) {
                            break;
                        }
                    }
                }
                ApiLimitsHubResponse apiLimitsHubResponse2 = next;
                if (apiLimitsHubResponse2 != null && (amount_limits = apiLimitsHubResponse2.getAmount_limits()) != null) {
                    Iterator<T> it2 = amount_limits.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next2 = (T) null;
                            break;
                        }
                        next2 = it2.next();
                        if (((ApiAmountLimit) next2).getLimits_interval() == LimitsInterval.DAILY) {
                            break;
                        }
                    }
                    ApiAmountLimit apiAmountLimit = next2;
                    if (apiAmountLimit != null) {
                        total_amount = apiAmountLimit.getTotal_amount();
                    }
                }
                return Optional3.asOptional(total_amount);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(SinglesKt.ignoreNetworkExceptions(map2)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.LinkingOptionsActivity$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LinkingOptionsActivity.onCreate$lambda$18$lambda$12$lambda$11(rdsRowView, this, (Optional) obj);
            }
        });
        RdsRowView rdsRowView2 = binding.bankAccountCta;
        Intrinsics.checkNotNull(rdsRowView2);
        ViewsKt.eventData$default(rdsRowView2, false, new Function0() { // from class: com.robinhood.android.transfers.LinkingOptionsActivity$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LinkingOptionsActivity.onCreate$lambda$18$lambda$15$lambda$13(this.f$0);
            }
        }, 1, null);
        OnClickListeners.onClick(rdsRowView2, new Function0() { // from class: com.robinhood.android.transfers.LinkingOptionsActivity$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LinkingOptionsActivity.onCreate$lambda$18$lambda$15$lambda$14(this.f$0);
            }
        });
        DebitCardUserStatusBannerView debitCardUserStatusBannerView = binding.includeDebitCardUserStatusBannerView.debitCardUserStatusBannerView;
        debitCardUserStatusBannerView.setScreenName(Screen.Name.CHOOSE_LINKING_PAYMENT_METHOD);
        debitCardUserStatusBannerView.setCallbacks(this);
        Observable<DebitCardUserStatusBannerView.State> loadingStateStream = debitCardUserStatusBannerView.getLoadingStateStream();
        Intrinsics.checkNotNullExpressionValue(loadingStateStream, "<get-loadingStateStream>(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(loadingStateStream), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.LinkingOptionsActivity$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LinkingOptionsActivity.onCreate$lambda$18$lambda$17$lambda$16(binding, (DebitCardUserStatusBannerView.State) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(LinkingOptionsActivity linkingOptionsActivity, Boolean bool) {
        Intrinsics.checkNotNull(bool);
        linkingOptionsActivity.setHasActiveDebitCards(bool.booleanValue());
        return Unit.INSTANCE;
    }

    /* compiled from: LinkingOptionsActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/transfer/ApiDisclosureUIResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.LinkingOptionsActivity$onCreate$3", m3645f = "LinkingOptionsActivity.kt", m3646l = {108}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.LinkingOptionsActivity$onCreate$3 */
    static final class C300633 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiDisclosureUIResponse>, Object> {
        int label;

        C300633(Continuation<? super C300633> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LinkingOptionsActivity.this.new C300633(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiDisclosureUIResponse> continuation) {
            return ((C300633) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            TransfersBonfireApi transfersBonfireApi = LinkingOptionsActivity.this.getTransfersBonfireApi();
            DisclosureLocation disclosureLocation = DisclosureLocation.LINK_ACCOUNT;
            this.label = 1;
            Object disclosure$default = TransfersBonfireApi.DefaultImpls.getDisclosure$default(transfersBonfireApi, disclosureLocation, null, null, null, null, null, this, 62, null);
            return disclosure$default == coroutine_suspended ? coroutine_suspended : disclosure$default;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(final LinkingOptionsActivity linkingOptionsActivity, ApiDisclosureUIResponse it) {
        Intrinsics.checkNotNullParameter(it, "it");
        final Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(ScarletManager2.getScarletManager(new ScarletContextWrapper(linkingOptionsActivity, null, null, 6, null)));
        final UIComponent<GenericAction> disclosure_text = it.getDisclosure_text();
        if (disclosure_text != null) {
            linkingOptionsActivity.getBinding().linkingOptionsDisclosure.setVisibility(8);
            linkingOptionsActivity.getBinding().linkingOptionsDisclosureComposeView.setVisibility(0);
            linkingOptionsActivity.getBinding().linkingOptionsDisclosureComposeView.setContent(ComposableLambda3.composableLambdaInstance(1762104395, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.LinkingOptionsActivity$onCreate$4$1$1
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
                        ComposerKt.traceEventStart(1762104395, i, -1, "com.robinhood.android.transfers.LinkingOptionsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (LinkingOptionsActivity.kt:117)");
                    }
                    ProvidedValue<ScarletManager> providedValueProvides = LocalScarletManager.getLocalScarletManager().provides(ScarletManager2.getScarletManager(this.this$0));
                    final Observable<ThemesFromScarlet> observable = observableThemeChangesForCompose;
                    final UIComponent<GenericAction> uIComponent = disclosure_text;
                    CompositionLocal3.CompositionLocalProvider(providedValueProvides, ComposableLambda3.rememberComposableLambda(451737483, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.LinkingOptionsActivity$onCreate$4$1$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i2) {
                            if ((i2 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(451737483, i2, -1, "com.robinhood.android.transfers.LinkingOptionsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LinkingOptionsActivity.kt:118)");
                            }
                            Observable<ThemesFromScarlet> observable2 = observable;
                            final UIComponent<GenericAction> uIComponent2 = uIComponent;
                            BentoTheme2.BentoTheme(observable2, null, ComposableLambda3.rememberComposableLambda(1544933145, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.LinkingOptionsActivity.onCreate.4.1.1.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i3) {
                                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1544933145, i3, -1, "com.robinhood.android.transfers.LinkingOptionsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LinkingOptionsActivity.kt:119)");
                                    }
                                    final UIComponent<GenericAction> uIComponent3 = uIComponent2;
                                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1701926382, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.LinkingOptionsActivity.onCreate.4.1.1.1.1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer4, int i4) {
                                            if ((i4 & 3) == 2 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1701926382, i4, -1, "com.robinhood.android.transfers.LinkingOptionsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LinkingOptionsActivity.kt:120)");
                                            }
                                            ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(uIComponent3);
                                            Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null), null, false, 3, null);
                                            composer4.startReplaceGroup(-1772220517);
                                            SduiColumns.SduiColumn(immutableList3PersistentListOf, GenericAction.class, modifierWrapContentHeight$default, null, null, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composer4, 100663680, 0);
                                            composer4.endReplaceGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer3, 54), composer3, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, 384, 2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer, 54), composer, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$4(LinkingOptionsActivity linkingOptionsActivity, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, it, false, null, 6, null);
        linkingOptionsActivity.disclosureFallback();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onCreate$lambda$18$lambda$12$lambda$5(LinkingOptionsActivity linkingOptionsActivity) {
        UserInteractionEventData.Action action = UserInteractionEventData.Action.DEBIT_CARD_LINKING;
        Component component = new Component(Component.ComponentType.BUTTON, null, null, 6, null);
        return new UserInteractionEventDescriptor(null, linkingOptionsActivity.screen, action, linkingOptionsActivity.getLoggingContext(), component, null, 33, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$18$lambda$12$lambda$8(LinkingOptionsActivity linkingOptionsActivity) {
        if (linkingOptionsActivity.getHasActiveDebitCards()) {
            RhDialogFragment.Builder positiveButton = RhDialogFragment.INSTANCE.create(linkingOptionsActivity).setId(C13932R.id.dialog_id_max_debit_cards).setTitle(C13932R.string.max_debit_card_dialog_title, new Object[0]).setMessage(C13932R.string.max_debit_card_dialog_message, new Object[0]).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]);
            FragmentManager supportFragmentManager = linkingOptionsActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(positiveButton, supportFragmentManager, "maxDebitCardsDialog", false, 4, null);
        } else {
            Navigator navigator = linkingOptionsActivity.getNavigator();
            Companion companion = INSTANCE;
            Navigator.DefaultImpls.startActivityForResult$default(navigator, (Activity) linkingOptionsActivity, (IntentKey) new LegacyIntentKey.DebitCardLinking(new DebitCardLinkingConfiguration.Standard(false, !((LinkingOptionsIntentKey) companion.getExtras((Activity) linkingOptionsActivity)).getIsFromTransfers(), ((LinkingOptionsIntentKey) companion.getExtras((Activity) linkingOptionsActivity)).getEntryPoint(), null, 9, null)), 50, (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
            if (CollectionsKt.listOf((Object[]) new PaymentLinkingContext.EntryPoint[]{PaymentLinkingContext.EntryPoint.USER_SIGN_UP, PaymentLinkingContext.EntryPoint.MENU_OF_OPTIONS}).contains(((LinkingOptionsIntentKey) companion.getExtras((Activity) linkingOptionsActivity)).getEntryPoint())) {
                linkingOptionsActivity.finish();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$18$lambda$12$lambda$11(RdsRowView rdsRowView, LinkingOptionsActivity linkingOptionsActivity, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        BigDecimal bigDecimal = (BigDecimal) optional.component1();
        if (bigDecimal != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Object[] objArr = {new StyleSpan(1), new ThemableColorSpans3(ResourceReferences5.toColor(ThemeAttributes.INSTANCE.getCOLOR_POSITIVE()))};
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) linkingOptionsActivity.getString(C30556R.string.gated_instant_debit_card_subtitle));
            for (int i = 0; i < 2; i++) {
                spannableStringBuilder.setSpan(objArr[i], length, spannableStringBuilder.length(), 17);
            }
            spannableStringBuilder.append((CharSequence) " · ");
            spannableStringBuilder.append((CharSequence) linkingOptionsActivity.getString(C30556R.string.debit_card_daily_deposit_limit, Formats.getLowPrecisionCurrencyFormat().format(bigDecimal)));
            rdsRowView.setSecondaryText(new SpannedString(spannableStringBuilder));
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onCreate$lambda$18$lambda$15$lambda$13(LinkingOptionsActivity linkingOptionsActivity) {
        UserInteractionEventData.Action action = UserInteractionEventData.Action.BANK_LINKING;
        Component component = new Component(Component.ComponentType.BUTTON, null, null, 6, null);
        return new UserInteractionEventDescriptor(null, linkingOptionsActivity.screen, action, linkingOptionsActivity.getLoggingContext(), component, null, 33, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$18$lambda$15$lambda$14(LinkingOptionsActivity linkingOptionsActivity) {
        linkingOptionsActivity.defaultBankNavigate();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$18$lambda$17$lambda$16(ActivityLinkingOptionsBinding activityLinkingOptionsBinding, DebitCardUserStatusBannerView.State state) {
        if (Intrinsics.areEqual(state, DebitCardUserStatusBannerView.State.Loading.INSTANCE)) {
            LinearLayout content = activityLinkingOptionsBinding.content;
            Intrinsics.checkNotNullExpressionValue(content, "content");
            content.setVisibility(8);
            ShimmerLoadingView loadingView = activityLinkingOptionsBinding.loadingView;
            Intrinsics.checkNotNullExpressionValue(loadingView, "loadingView");
            loadingView.setVisibility(0);
        } else if (state instanceof DebitCardUserStatusBannerView.State.Loaded) {
            LinearLayout content2 = activityLinkingOptionsBinding.content;
            Intrinsics.checkNotNullExpressionValue(content2, "content");
            content2.setVisibility(0);
            ShimmerLoadingView loadingView2 = activityLinkingOptionsBinding.loadingView;
            Intrinsics.checkNotNullExpressionValue(loadingView2, "loadingView");
            loadingView2.setVisibility(8);
            RdsRowView rdsRowView = activityLinkingOptionsBinding.debitCardCta;
            ApiPaymentInstrumentPermissions permissions = ((DebitCardUserStatusBannerView.State.Loaded) state).getPermissions();
            rdsRowView.setEnabled(permissions != null ? permissions.getLink() : true);
        } else {
            if (!Intrinsics.areEqual(state, DebitCardUserStatusBannerView.State.Error.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            LinearLayout content3 = activityLinkingOptionsBinding.content;
            Intrinsics.checkNotNullExpressionValue(content3, "content");
            content3.setVisibility(0);
            ShimmerLoadingView loadingView3 = activityLinkingOptionsBinding.loadingView;
            Intrinsics.checkNotNullExpressionValue(loadingView3, "loadingView");
            loadingView3.setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    private final void defaultBankNavigate() {
        Navigator.DefaultImpls.startActivityForResult$default(getNavigator(), (Activity) this, (IntentKey) new CreateIavRelationshipIntentKey(IavSource.TRANSFER, null, null, null, false, false, getLoggingContext().getPayment_linking_context(), null, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, null), 50, (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
        closeBasedOnExtras();
    }

    private final void closeBasedOnExtras() {
        if (CollectionsKt.listOf((Object[]) new PaymentLinkingContext.EntryPoint[]{PaymentLinkingContext.EntryPoint.USER_SIGN_UP, PaymentLinkingContext.EntryPoint.MENU_OF_OPTIONS}).contains(((LinkingOptionsIntentKey) INSTANCE.getExtras((Activity) this)).getEntryPoint())) {
            finish();
        }
    }

    /* compiled from: LinkingOptionsActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/transfer/ApiServiceFeeParams;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.LinkingOptionsActivity$disclosureFallback$1", m3645f = "LinkingOptionsActivity.kt", m3646l = {EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.LinkingOptionsActivity$disclosureFallback$1 */
    static final class C300611 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiServiceFeeParams>, Object> {
        int label;

        C300611(Continuation<? super C300611> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LinkingOptionsActivity.this.new C300611(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiServiceFeeParams> continuation) {
            return ((C300611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            TransfersBonfireApi transfersBonfireApi = LinkingOptionsActivity.this.getTransfersBonfireApi();
            TransferType transferType = TransferType.DEBIT_CARD_TRANSFER;
            this.label = 1;
            Object serviceFeeParams$default = TransfersBonfireApi.DefaultImpls.getServiceFeeParams$default(transfersBonfireApi, transferType, null, null, this, 6, null);
            return serviceFeeParams$default == coroutine_suspended ? coroutine_suspended : serviceFeeParams$default;
        }
    }

    private final void disclosureFallback() {
        LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(SinglesKt.ignoreNetworkExceptions(SinglesKt.mapToOptional(RxFactory.DefaultImpls.rxSingle$default(getRxFactory(), null, new C300611(null), 1, null)))), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.LinkingOptionsActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LinkingOptionsActivity.disclosureFallback$lambda$20(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit disclosureFallback$lambda$20(LinkingOptionsActivity linkingOptionsActivity, Optional serviceFeeParams) {
        Intrinsics.checkNotNullParameter(serviceFeeParams, "serviceFeeParams");
        linkingOptionsActivity.getBinding().linkingOptionsDisclosure.setVisibility(0);
        linkingOptionsActivity.getBinding().linkingOptionsDisclosureComposeView.setVisibility(8);
        ApiServiceFeeParams apiServiceFeeParams = (ApiServiceFeeParams) serviceFeeParams.getOrNull();
        if (apiServiceFeeParams != null) {
            linkingOptionsActivity.getBinding().linkingOptionsDisclosure.setText(linkingOptionsActivity.getString(C30556R.string.linking_options_disclosure_template, zzah$$ExternalSyntheticBackportWithForwarding0.m822m(apiServiceFeeParams.getPush().getFee_rate())));
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, this.screen, null, null, getLoggingContext(), 13, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        EventLogger.DefaultImpls.logDisappear$default(getEventLogger(), null, this.screen, null, null, getLoggingContext(), 13, null);
        super.onStop();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 50 && resultCode == -1) {
            setResult(resultCode, data);
            finish();
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle((CharSequence) null);
    }

    @Override // com.robinhood.android.banking.ui.DebitCardUserStatusBannerView.Callbacks
    public void onClickInfoBanner(Intent[] intents) {
        Intrinsics.checkNotNullParameter(intents, "intents");
        startActivity((Intent) ArraysKt.last(intents));
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    /* renamed from: requiresAuthentication */
    public boolean getShouldPromptForLockScreen() {
        return ((LinkingOptionsIntentKey) INSTANCE.getExtras((Activity) this)).getEntryPoint() != PaymentLinkingContext.EntryPoint.USER_SIGN_UP;
    }

    /* compiled from: LinkingOptionsActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/LinkingOptionsActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/transfers/LinkingOptionsActivity;", "Lcom/robinhood/android/transfers/contracts/LinkingOptionsIntentKey;", "<init>", "()V", "REQUEST_CODE_LINKING", "", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<LinkingOptionsActivity, LinkingOptionsIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public LinkingOptionsIntentKey getExtras(LinkingOptionsActivity linkingOptionsActivity) {
            return (LinkingOptionsIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, linkingOptionsActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(android.content.Context context, LinkingOptionsIntentKey linkingOptionsIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, linkingOptionsIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(android.content.Context context, LinkingOptionsIntentKey linkingOptionsIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, linkingOptionsIntentKey);
        }
    }
}
