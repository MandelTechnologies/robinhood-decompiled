package com.robinhood.android.banking.p065ui;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.jakewharton.rxrelay2.PublishRelay;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.navigation.DeepLinkOrigin;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.disposer.ViewScopedObservable;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.api.ApiIacInfoBanner;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentPermissions;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentUserStatus;
import com.robinhood.models.api.bonfire.paymentinstruments.UserStatusWithExternalProviders;
import com.robinhood.models.serverdriven.api.ApiGenericAction;
import com.robinhood.rosetta.converters.cash.PaymentInstruments2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.DcfKycContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.iac.extensions.IacInfoBanners;
import com.robinhood.store.paymentinstrument.debitcard.DebitCardInstrumentStore;
import com.robinhood.store.paymentinstrument.debitcard.DebitCardInstrumentUserStatusStore;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DebitCardUserStatusBannerView.kt */
@Metadata(m3635d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002HIB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010?\u001a\u00020@H\u0014J\f\u0010A\u001a\u00020@*\u00020BH\u0002J\u0018\u0010C\u001a\u00020@2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020GH\u0014R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R4\u0010&\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020* +*\u0010\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*\u0018\u00010(0(0'X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010,\u001a\u0010\u0012\f\u0012\n +*\u0004\u0018\u00010.0.0-X\u0082\u0004¢\u0006\u0002\n\u0000R5\u0010/\u001a&\u0012\f\u0012\n +*\u0004\u0018\u00010.0. +*\u0012\u0012\f\u0012\n +*\u0004\u0018\u00010.0.\u0018\u00010000¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u001a\u00103\u001a\u000204X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001c\u00109\u001a\u0004\u0018\u00010:X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006J"}, m3636d2 = {"Lcom/robinhood/android/banking/ui/DebitCardUserStatusBannerView;", "Lcom/robinhood/android/designsystem/banner/RdsInfoBannerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "debitCardInstrumentStore", "Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore;", "getDebitCardInstrumentStore", "()Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore;", "setDebitCardInstrumentStore", "(Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore;)V", "debitCardInstrumentUserStatusStore", "Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentUserStatusStore;", "getDebitCardInstrumentUserStatusStore", "()Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentUserStatusStore;", "setDebitCardInstrumentUserStatusStore", "(Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentUserStatusStore;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "userStatusForLoggingRelay", "Lcom/jakewharton/rxrelay2/PublishRelay;", "Lkotlin/Pair;", "Lcom/robinhood/models/api/bonfire/paymentinstruments/UserStatusWithExternalProviders;", "", "kotlin.jvm.PlatformType", "loadingStateRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/android/banking/ui/DebitCardUserStatusBannerView$State;", "loadingStateStream", "Lio/reactivex/Observable;", "getLoadingStateStream", "()Lio/reactivex/Observable;", "screenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "getScreenName", "()Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "setScreenName", "(Lcom/robinhood/rosetta/eventlogging/Screen$Name;)V", "callbacks", "Lcom/robinhood/android/banking/ui/DebitCardUserStatusBannerView$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/banking/ui/DebitCardUserStatusBannerView$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/banking/ui/DebitCardUserStatusBannerView$Callbacks;)V", "onAttachedToWindow", "", "maybeLogInfoBanner", "Lcom/robinhood/models/api/bonfire/paymentinstruments/ApiPaymentInstrumentUserStatus;", "onVisibilityChanged", "changedView", "Landroid/view/View;", "visibility", "", "Callbacks", "State", "feature-lib-banking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DebitCardUserStatusBannerView extends Hammer_DebitCardUserStatusBannerView {
    private Callbacks callbacks;
    public DebitCardInstrumentStore debitCardInstrumentStore;
    public DebitCardInstrumentUserStatusStore debitCardInstrumentUserStatusStore;
    public EventLogger eventLogger;
    public ExperimentsStore experimentsStore;
    private final BehaviorRelay<State> loadingStateRelay;
    private final Observable<State> loadingStateStream;
    public Navigator navigator;
    private Screen.Name screenName;
    private final PublishRelay<Tuples2<UserStatusWithExternalProviders, Boolean>> userStatusForLoggingRelay;

    /* compiled from: DebitCardUserStatusBannerView.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/banking/ui/DebitCardUserStatusBannerView$Callbacks;", "", "onClickInfoBanner", "", "intents", "", "Landroid/content/Intent;", "([Landroid/content/Intent;)V", "feature-lib-banking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onClickInfoBanner(Intent[] intents);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebitCardUserStatusBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, null);
        Intrinsics.checkNotNullParameter(context, "context");
        PublishRelay<Tuples2<UserStatusWithExternalProviders, Boolean>> publishRelayCreate = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate, "create(...)");
        this.userStatusForLoggingRelay = publishRelayCreate;
        BehaviorRelay<State> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.loadingStateRelay = behaviorRelayCreate;
        this.loadingStateStream = behaviorRelayCreate.hide();
        this.screenName = Screen.Name.NAME_UNSPECIFIED;
        setVisibility(8);
    }

    /* compiled from: DebitCardUserStatusBannerView.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/banking/ui/DebitCardUserStatusBannerView$State;", "", "<init>", "()V", "Loading", "Loaded", "Error", "Lcom/robinhood/android/banking/ui/DebitCardUserStatusBannerView$State$Error;", "Lcom/robinhood/android/banking/ui/DebitCardUserStatusBannerView$State$Loaded;", "Lcom/robinhood/android/banking/ui/DebitCardUserStatusBannerView$State$Loading;", "feature-lib-banking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class State {
        public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private State() {
        }

        /* compiled from: DebitCardUserStatusBannerView.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/banking/ui/DebitCardUserStatusBannerView$State$Loading;", "Lcom/robinhood/android/banking/ui/DebitCardUserStatusBannerView$State;", "<init>", "()V", "feature-lib-banking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Loading extends State {
            public static final Loading INSTANCE = new Loading();

            private Loading() {
                super(null);
            }
        }

        /* compiled from: DebitCardUserStatusBannerView.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/banking/ui/DebitCardUserStatusBannerView$State$Loaded;", "Lcom/robinhood/android/banking/ui/DebitCardUserStatusBannerView$State;", "permissions", "Lcom/robinhood/models/api/bonfire/paymentinstruments/ApiPaymentInstrumentPermissions;", "<init>", "(Lcom/robinhood/models/api/bonfire/paymentinstruments/ApiPaymentInstrumentPermissions;)V", "getPermissions", "()Lcom/robinhood/models/api/bonfire/paymentinstruments/ApiPaymentInstrumentPermissions;", "feature-lib-banking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Loaded extends State {
            private final ApiPaymentInstrumentPermissions permissions;

            public final ApiPaymentInstrumentPermissions getPermissions() {
                return this.permissions;
            }

            public Loaded(ApiPaymentInstrumentPermissions apiPaymentInstrumentPermissions) {
                super(null);
                this.permissions = apiPaymentInstrumentPermissions;
            }
        }

        /* compiled from: DebitCardUserStatusBannerView.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/banking/ui/DebitCardUserStatusBannerView$State$Error;", "Lcom/robinhood/android/banking/ui/DebitCardUserStatusBannerView$State;", "<init>", "()V", "feature-lib-banking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Error extends State {
            public static final Error INSTANCE = new Error();

            private Error() {
                super(null);
            }
        }
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

    public final DebitCardInstrumentUserStatusStore getDebitCardInstrumentUserStatusStore() {
        DebitCardInstrumentUserStatusStore debitCardInstrumentUserStatusStore = this.debitCardInstrumentUserStatusStore;
        if (debitCardInstrumentUserStatusStore != null) {
            return debitCardInstrumentUserStatusStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("debitCardInstrumentUserStatusStore");
        return null;
    }

    public final void setDebitCardInstrumentUserStatusStore(DebitCardInstrumentUserStatusStore debitCardInstrumentUserStatusStore) {
        Intrinsics.checkNotNullParameter(debitCardInstrumentUserStatusStore, "<set-?>");
        this.debitCardInstrumentUserStatusStore = debitCardInstrumentUserStatusStore;
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

    public final Observable<State> getLoadingStateStream() {
        return this.loadingStateStream;
    }

    public final Screen.Name getScreenName() {
        return this.screenName;
    }

    public final void setScreenName(Screen.Name name) {
        Intrinsics.checkNotNullParameter(name, "<set-?>");
        this.screenName = name;
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Observable<Tuples2<UserStatusWithExternalProviders, Boolean>> observableDistinctUntilChanged = this.userStatusForLoggingRelay.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        ViewDisposerKt.bindTo$default(observableDistinctUntilChanged, this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.banking.ui.DebitCardUserStatusBannerView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DebitCardUserStatusBannerView.onAttachedToWindow$lambda$0(this.f$0, (Tuples2) obj);
            }
        });
        Observable observableDoOnSubscribe = getDebitCardInstrumentUserStatusStore().forceFetchThenPoll().doOnNext(new Consumer() { // from class: com.robinhood.android.banking.ui.DebitCardUserStatusBannerView.onAttachedToWindow.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(ApiPaymentInstrumentUserStatus apiPaymentInstrumentUserStatus) {
                DebitCardUserStatusBannerView.this.getDebitCardInstrumentStore().refresh(true);
            }
        }).map(new Function() { // from class: com.robinhood.android.banking.ui.DebitCardUserStatusBannerView.onAttachedToWindow.3
            @Override // io.reactivex.functions.Function
            public final Optional<ApiPaymentInstrumentUserStatus> apply(ApiPaymentInstrumentUserStatus it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional.INSTANCE.m2972of(it);
            }
        }).doOnSubscribe(new Consumer() { // from class: com.robinhood.android.banking.ui.DebitCardUserStatusBannerView.onAttachedToWindow.4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                DebitCardUserStatusBannerView.this.loadingStateRelay.accept(State.Loading.INSTANCE);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoOnSubscribe, "doOnSubscribe(...)");
        ViewScopedObservable.subscribeKotlin$default(ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(observableDoOnSubscribe), this, false, 2, null), new Function1() { // from class: com.robinhood.android.banking.ui.DebitCardUserStatusBannerView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DebitCardUserStatusBannerView.onAttachedToWindow$lambda$3(this.f$0, (Optional) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.banking.ui.DebitCardUserStatusBannerView$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DebitCardUserStatusBannerView.onAttachedToWindow$lambda$4(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$0(DebitCardUserStatusBannerView debitCardUserStatusBannerView, Tuples2 tuples2) {
        UserStatusWithExternalProviders userStatusWithExternalProviders = (UserStatusWithExternalProviders) tuples2.component1();
        if (((Boolean) tuples2.component2()).booleanValue()) {
            DebitCardUserStatusBannerViewLogging.logBannerAppearance(debitCardUserStatusBannerView, userStatusWithExternalProviders, debitCardUserStatusBannerView.screenName);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$3(final DebitCardUserStatusBannerView debitCardUserStatusBannerView, Optional optional) {
        ApiIacInfoBanner info_banner;
        final ApiPaymentInstrumentUserStatus apiPaymentInstrumentUserStatus = (ApiPaymentInstrumentUserStatus) optional.component1();
        debitCardUserStatusBannerView.setTag(apiPaymentInstrumentUserStatus);
        if (apiPaymentInstrumentUserStatus != null) {
            debitCardUserStatusBannerView.maybeLogInfoBanner(apiPaymentInstrumentUserStatus);
        }
        IacInfoBanners.bindIacInfoBanner$default(debitCardUserStatusBannerView, (apiPaymentInstrumentUserStatus == null || (info_banner = apiPaymentInstrumentUserStatus.getInfo_banner()) == null) ? null : ApiIacInfoBanner.toDbModel$default(info_banner, null, null, null, 4, null), null, 2, null);
        OnClickListeners.onClick(debitCardUserStatusBannerView, new Function0() { // from class: com.robinhood.android.banking.ui.DebitCardUserStatusBannerView$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DebitCardUserStatusBannerView.onAttachedToWindow$lambda$3$lambda$2(apiPaymentInstrumentUserStatus, debitCardUserStatusBannerView);
            }
        });
        debitCardUserStatusBannerView.loadingStateRelay.accept(new State.Loaded(apiPaymentInstrumentUserStatus != null ? apiPaymentInstrumentUserStatus.getPermissions() : null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$3$lambda$2(ApiPaymentInstrumentUserStatus apiPaymentInstrumentUserStatus, DebitCardUserStatusBannerView debitCardUserStatusBannerView) {
        ApiIacInfoBanner info_banner;
        ApiGenericAction cta_action = (apiPaymentInstrumentUserStatus == null || (info_banner = apiPaymentInstrumentUserStatus.getInfo_banner()) == null) ? null : info_banner.getCta_action();
        ApiGenericAction.ApiDeeplinkAction apiDeeplinkAction = cta_action instanceof ApiGenericAction.ApiDeeplinkAction ? (ApiGenericAction.ApiDeeplinkAction) cta_action : null;
        if (apiDeeplinkAction != null) {
            EventLogger.DefaultImpls.logTap$default(debitCardUserStatusBannerView.getEventLogger(), null, new Screen(debitCardUserStatusBannerView.screenName, null, null, null, 14, null), new Component(Component.ComponentType.DEBIT_CARD_KYC_BANNER, null, null, 6, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new DcfKycContext(PaymentInstruments2.toProtobuf(apiPaymentInstrumentUserStatus.getUser_status_with_external_provider()), null, 2, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -8388609, -1, -1, -1, 16383, null), false, 41, null);
            Callbacks callbacks = debitCardUserStatusBannerView.callbacks;
            if (callbacks != null) {
                Navigator navigator = debitCardUserStatusBannerView.getNavigator();
                Context context = debitCardUserStatusBannerView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                callbacks.onClickInfoBanner(Navigator.DefaultImpls.resolveDeepLink$default(navigator, context, apiDeeplinkAction.getAction_data().getUri(), null, DeepLinkOrigin.Internal.INSTANCE, false, 20, null));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$4(DebitCardUserStatusBannerView debitCardUserStatusBannerView, Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        if (!Throwables.isNetworkRelated(t)) {
            throw t;
        }
        debitCardUserStatusBannerView.loadingStateRelay.accept(State.Error.INSTANCE);
        debitCardUserStatusBannerView.setVisibility(8);
        return Unit.INSTANCE;
    }

    private final void maybeLogInfoBanner(ApiPaymentInstrumentUserStatus apiPaymentInstrumentUserStatus) {
        if (apiPaymentInstrumentUserStatus.getUser_status_with_external_provider() == null || apiPaymentInstrumentUserStatus.getInfo_banner() == null) {
            return;
        }
        PublishRelay<Tuples2<UserStatusWithExternalProviders, Boolean>> publishRelay = this.userStatusForLoggingRelay;
        UserStatusWithExternalProviders user_status_with_external_provider = apiPaymentInstrumentUserStatus.getUser_status_with_external_provider();
        Intrinsics.checkNotNull(user_status_with_external_provider);
        publishRelay.accept(Tuples4.m3642to(user_status_with_external_provider, Boolean.valueOf(getVisibility() == 0)));
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View changedView, int visibility) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        super.onVisibilityChanged(changedView, visibility);
        Object tag = getTag();
        ApiPaymentInstrumentUserStatus apiPaymentInstrumentUserStatus = tag instanceof ApiPaymentInstrumentUserStatus ? (ApiPaymentInstrumentUserStatus) tag : null;
        if (apiPaymentInstrumentUserStatus != null) {
            maybeLogInfoBanner(apiPaymentInstrumentUserStatus);
        }
    }
}
