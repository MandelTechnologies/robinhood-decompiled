package com.robinhood.android.gdpr.consent;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.gdpr.GdprConsent;
import com.robinhood.android.gdpr.consent.PrivacySettingsFragmentUiEvent;
import com.robinhood.android.gdpr.manager.GdprManager;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.gdpr.contracts.PrivacySettingsFragmentKey;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* compiled from: PrivacySettingsFragmentDuxo.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 .2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0003,-.B9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0006\u0010\u001b\u001a\u00020\u001aJ\u000e\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010 \u001a\u00020\u001aJ\u0006\u0010!\u001a\u00020\u001aJ\u0010\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$H\u0002J\u0006\u0010%\u001a\u00020\u001aJ\u0010\u0010&\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020(H\u0002J\u000e\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020+R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/gdpr/consent/PrivacySettingsFragmentDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/gdpr/consent/PrivacySettingsFragmentViewState;", "Lcom/robinhood/android/gdpr/consent/PrivacySettingsFragmentUiEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "gdprManager", "Lcom/robinhood/android/gdpr/manager/GdprManager;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/gdpr/manager/GdprManager;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "onStart", "", "onDismiss", "toggleExpanded", "setting", "Lcom/robinhood/android/gdpr/consent/PrivacySetting;", "toggleEnabled", "onAcceptAllButtonTapped", "onRejectAllButtonTapped", "logTapAndSetConsent", "buttonIdentifier", "", "onSaveAndContinueButtonTapped", "setConsent", "autoDismiss", "Lcom/robinhood/android/gdpr/consent/PrivacySettingsFragmentDuxo$AutoDismiss;", "onLinkClicked", "linkType", "Lcom/robinhood/android/gdpr/consent/PrivacySettingsFragmentDuxo$LinkType;", "LinkType", "AutoDismiss", "Companion", "feature-gdpr-consent_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class PrivacySettingsFragmentDuxo extends BaseDuxo5<PrivacySettingsFragmentViewState, PrivacySettingsFragmentUiEvent> implements HasSavedState {
    private final AppType appType;
    private final EventLogger eventLogger;
    private final GdprManager gdprManager;
    private final SavedStateHandle savedStateHandle;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final String ACCEPT_ALL_BUTTON_IDENTIFIER = "GDPR_ACCEPT_ALL";
    private static final String REJECT_ALL_BUTTON_IDENTIFIER = "GDPR_REJECT_ALL";
    private static final String SAVE_AND_CONTINUE_BUTTON_IDENTIFIER = "GDPR_SAVE_AND_CONTINUE";
    private static final String PRIVACY_POLICY_BUTTON_IDENTIFIER = "GDPR_PRIVACY_POLICY";
    private static final String COOKIE_POLICY_BUTTON_IDENTIFIER = "GDPR_COOKIE_POLICY";

    /* compiled from: PrivacySettingsFragmentDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LinkType.values().length];
            try {
                iArr[LinkType.PRIVACY_POLICY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LinkType.COOKIE_POLICY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PrivacySettingsFragmentDuxo(EventLogger eventLogger, GdprManager gdprManager, UserStore userStore, AppType appType, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(gdprManager, "gdprManager");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        GdprConsent currentConsent = gdprManager.getCurrentConsent();
        super(new PrivacySettingsFragmentViewState(SetsKt.setOfNotNull((Object[]) new PrivacySetting[]{PrivacySetting.STRICTLY_NECESSARY, currentConsent.getFunctional().getIsEnabled() ? PrivacySetting.FUNCTIONAL : null, currentConsent.getMarketing().getIsEnabled() ? PrivacySetting.MARKETING : null, currentConsent.getPerformance().getIsEnabled() ? PrivacySetting.PERFORMANCE : null}), null, PrivacySettingsFragmentDuxo4.getPrivacyPolicyLink(appType), PrivacySettingsFragmentDuxo4.getCookiePolicyLink(appType), 2, null), duxoBundle);
        this.eventLogger = eventLogger;
        this.gdprManager = gdprManager;
        this.userStore = userStore;
        this.appType = appType;
        this.savedStateHandle = savedStateHandle;
    }

    public final Screen getEventScreen() {
        return new Screen(Screen.Name.APP_PRIVACY_SETTINGS, null, ((PrivacySettingsFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getEntryPoint().getAnalyticsIdentifier(), null, 10, null);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        Observable<R> map = this.userStore.getUser().map(new Function() { // from class: com.robinhood.android.gdpr.consent.PrivacySettingsFragmentDuxo.onStart.1
            @Override // io.reactivex.functions.Function
            public final CountryCode.Supported apply(User it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getOrigin().getLocality();
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.gdpr.consent.PrivacySettingsFragmentDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PrivacySettingsFragmentDuxo.onStart$lambda$4(this.f$0, (CountryCode.Supported) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$4(PrivacySettingsFragmentDuxo privacySettingsFragmentDuxo, CountryCode.Supported supported) {
        privacySettingsFragmentDuxo.applyMutation(new PrivacySettingsFragmentDuxo2(supported, null));
        return Unit.INSTANCE;
    }

    public final void onDismiss() {
        withDataState(new Function1() { // from class: com.robinhood.android.gdpr.consent.PrivacySettingsFragmentDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PrivacySettingsFragmentDuxo.onDismiss$lambda$5(this.f$0, (PrivacySettingsFragmentViewState) obj);
            }
        });
        if (!((PrivacySettingsFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getEntryPoint().getShouldImplicitlyDeclineOnClose() || this.gdprManager.getCurrentConsent().getHasCollectedConsent()) {
            return;
        }
        this.gdprManager.setConsent(GdprConsent.INSTANCE.getALL_REJECTED());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDismiss$lambda$5(PrivacySettingsFragmentDuxo privacySettingsFragmentDuxo, PrivacySettingsFragmentViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        EventLogger.DefaultImpls.logTap$default(privacySettingsFragmentDuxo.eventLogger, null, privacySettingsFragmentDuxo.getEventScreen(), new Component(Component.ComponentType.CLOSE_BUTTON, null, null, 6, null), null, null, false, 57, null);
        return Unit.INSTANCE;
    }

    /* compiled from: PrivacySettingsFragmentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/gdpr/consent/PrivacySettingsFragmentViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gdpr.consent.PrivacySettingsFragmentDuxo$toggleExpanded$1", m3645f = "PrivacySettingsFragmentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.gdpr.consent.PrivacySettingsFragmentDuxo$toggleExpanded$1 */
    static final class C176651 extends ContinuationImpl7 implements Function2<PrivacySettingsFragmentViewState, Continuation<? super PrivacySettingsFragmentViewState>, Object> {
        final /* synthetic */ PrivacySetting $setting;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ PrivacySettingsFragmentDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C176651(PrivacySetting privacySetting, PrivacySettingsFragmentDuxo privacySettingsFragmentDuxo, Continuation<? super C176651> continuation) {
            super(2, continuation);
            this.$setting = privacySetting;
            this.this$0 = privacySettingsFragmentDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C176651 c176651 = new C176651(this.$setting, this.this$0, continuation);
            c176651.L$0 = obj;
            return c176651;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PrivacySettingsFragmentViewState privacySettingsFragmentViewState, Continuation<? super PrivacySettingsFragmentViewState> continuation) {
            return ((C176651) create(privacySettingsFragmentViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            UserInteractionEventData.Action action;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PrivacySettingsFragmentViewState privacySettingsFragmentViewState = (PrivacySettingsFragmentViewState) this.L$0;
            boolean zContains = privacySettingsFragmentViewState.getExpandedSet().contains(this.$setting);
            EventLogger eventLogger = this.this$0.eventLogger;
            Screen eventScreen = this.this$0.getEventScreen();
            Component component = new Component(Component.ComponentType.ROW, this.$setting.getAnalyticsIdentifier(), null, 4, null);
            if (zContains) {
                action = UserInteractionEventData.Action.COLLAPSE;
            } else {
                if (zContains) {
                    throw new NoWhenBranchMatchedException();
                }
                action = UserInteractionEventData.Action.EXPAND;
            }
            EventLogger.DefaultImpls.logTap$default(eventLogger, action, eventScreen, component, null, null, false, 56, null);
            if (zContains) {
                return PrivacySettingsFragmentViewState.copy$default(privacySettingsFragmentViewState, null, SetsKt.minus(privacySettingsFragmentViewState.getExpandedSet(), this.$setting), null, null, 13, null);
            }
            if (zContains) {
                throw new NoWhenBranchMatchedException();
            }
            return PrivacySettingsFragmentViewState.copy$default(privacySettingsFragmentViewState, null, SetsKt.plus(privacySettingsFragmentViewState.getExpandedSet(), this.$setting), null, null, 13, null);
        }
    }

    public final void toggleExpanded(PrivacySetting setting) {
        Intrinsics.checkNotNullParameter(setting, "setting");
        applyMutation(new C176651(setting, this, null));
    }

    /* compiled from: PrivacySettingsFragmentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/gdpr/consent/PrivacySettingsFragmentViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gdpr.consent.PrivacySettingsFragmentDuxo$toggleEnabled$1", m3645f = "PrivacySettingsFragmentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.gdpr.consent.PrivacySettingsFragmentDuxo$toggleEnabled$1 */
    static final class C176641 extends ContinuationImpl7 implements Function2<PrivacySettingsFragmentViewState, Continuation<? super PrivacySettingsFragmentViewState>, Object> {
        final /* synthetic */ PrivacySetting $setting;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ PrivacySettingsFragmentDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C176641(PrivacySetting privacySetting, PrivacySettingsFragmentDuxo privacySettingsFragmentDuxo, Continuation<? super C176641> continuation) {
            super(2, continuation);
            this.$setting = privacySetting;
            this.this$0 = privacySettingsFragmentDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C176641 c176641 = new C176641(this.$setting, this.this$0, continuation);
            c176641.L$0 = obj;
            return c176641;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PrivacySettingsFragmentViewState privacySettingsFragmentViewState, Continuation<? super PrivacySettingsFragmentViewState> continuation) {
            return ((C176641) create(privacySettingsFragmentViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Set setPlus;
            UserInteractionEventData.Action action;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PrivacySettingsFragmentViewState privacySettingsFragmentViewState = (PrivacySettingsFragmentViewState) this.L$0;
            boolean zContains = privacySettingsFragmentViewState.getEnabledSet().contains(this.$setting);
            if (zContains) {
                setPlus = SetsKt.minus(privacySettingsFragmentViewState.getEnabledSet(), this.$setting);
            } else {
                if (zContains) {
                    throw new NoWhenBranchMatchedException();
                }
                setPlus = SetsKt.plus(privacySettingsFragmentViewState.getEnabledSet(), this.$setting);
            }
            PrivacySettingsFragmentViewState privacySettingsFragmentViewStateCopy$default = PrivacySettingsFragmentViewState.copy$default(privacySettingsFragmentViewState, setPlus, null, null, null, 14, null);
            EventLogger eventLogger = this.this$0.eventLogger;
            Screen eventScreen = this.this$0.getEventScreen();
            Component component = new Component(Component.ComponentType.ROW, this.$setting.getAnalyticsIdentifier(), null, 4, null);
            if (zContains) {
                action = UserInteractionEventData.Action.TOGGLE_OFF;
            } else {
                if (zContains) {
                    throw new NoWhenBranchMatchedException();
                }
                action = UserInteractionEventData.Action.TOGGLE_ON;
            }
            EventLogger.DefaultImpls.logTap$default(eventLogger, action, eventScreen, component, null, null, false, 56, null);
            if (!((PrivacySettingsFragmentKey) PrivacySettingsFragmentDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getEntryPoint().getShouldShowSaveAndContinue()) {
                this.this$0.setConsent(AutoDismiss.None.INSTANCE);
            }
            return privacySettingsFragmentViewStateCopy$default;
        }
    }

    public final void toggleEnabled(PrivacySetting setting) {
        Intrinsics.checkNotNullParameter(setting, "setting");
        if (setting == PrivacySetting.STRICTLY_NECESSARY) {
            return;
        }
        applyMutation(new C176641(setting, this, null));
    }

    /* compiled from: PrivacySettingsFragmentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/gdpr/consent/PrivacySettingsFragmentViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gdpr.consent.PrivacySettingsFragmentDuxo$onAcceptAllButtonTapped$1", m3645f = "PrivacySettingsFragmentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.gdpr.consent.PrivacySettingsFragmentDuxo$onAcceptAllButtonTapped$1 */
    static final class C176611 extends ContinuationImpl7 implements Function2<PrivacySettingsFragmentViewState, Continuation<? super PrivacySettingsFragmentViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C176611(Continuation<? super C176611> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C176611 c176611 = PrivacySettingsFragmentDuxo.this.new C176611(continuation);
            c176611.L$0 = obj;
            return c176611;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PrivacySettingsFragmentViewState privacySettingsFragmentViewState, Continuation<? super PrivacySettingsFragmentViewState> continuation) {
            return ((C176611) create(privacySettingsFragmentViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                PrivacySettingsFragmentViewState privacySettingsFragmentViewState = (PrivacySettingsFragmentViewState) this.L$0;
                PrivacySettingsFragmentDuxo.this.logTapAndSetConsent(PrivacySettingsFragmentDuxo.INSTANCE.m2035x3c820cf9());
                return PrivacySettingsFragmentViewState.copy$default(privacySettingsFragmentViewState, CollectionsKt.toSet(PrivacySetting.getEntries()), null, null, null, 14, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onAcceptAllButtonTapped() {
        applyMutation(new C176611(null));
    }

    /* compiled from: PrivacySettingsFragmentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/gdpr/consent/PrivacySettingsFragmentViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gdpr.consent.PrivacySettingsFragmentDuxo$onRejectAllButtonTapped$1", m3645f = "PrivacySettingsFragmentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.gdpr.consent.PrivacySettingsFragmentDuxo$onRejectAllButtonTapped$1 */
    static final class C176621 extends ContinuationImpl7 implements Function2<PrivacySettingsFragmentViewState, Continuation<? super PrivacySettingsFragmentViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C176621(Continuation<? super C176621> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C176621 c176621 = PrivacySettingsFragmentDuxo.this.new C176621(continuation);
            c176621.L$0 = obj;
            return c176621;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PrivacySettingsFragmentViewState privacySettingsFragmentViewState, Continuation<? super PrivacySettingsFragmentViewState> continuation) {
            return ((C176621) create(privacySettingsFragmentViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                PrivacySettingsFragmentViewState privacySettingsFragmentViewState = (PrivacySettingsFragmentViewState) this.L$0;
                PrivacySettingsFragmentDuxo.this.logTapAndSetConsent(PrivacySettingsFragmentDuxo.INSTANCE.m2038xd182b242());
                return PrivacySettingsFragmentViewState.copy$default(privacySettingsFragmentViewState, SetsKt.setOf(PrivacySetting.STRICTLY_NECESSARY), null, null, null, 14, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onRejectAllButtonTapped() {
        applyMutation(new C176621(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logTapAndSetConsent(String buttonIdentifier) {
        AutoDismiss withDelay;
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, null, getEventScreen(), new Component(Component.ComponentType.BUTTON, buttonIdentifier, null, 4, null), null, null, false, 57, null);
        if (((PrivacySettingsFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getEntryPoint().getShouldAutoDismissWithDelayOnAcceptAll()) {
            withDelay = new AutoDismiss.WithDelay(0L, 1, null);
        } else {
            withDelay = AutoDismiss.None.INSTANCE;
        }
        setConsent(withDelay);
    }

    public final void onSaveAndContinueButtonTapped() {
        withDataState(new Function1() { // from class: com.robinhood.android.gdpr.consent.PrivacySettingsFragmentDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PrivacySettingsFragmentDuxo.onSaveAndContinueButtonTapped$lambda$6(this.f$0, (PrivacySettingsFragmentViewState) obj);
            }
        });
        setConsent(AutoDismiss.Immediate.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSaveAndContinueButtonTapped$lambda$6(PrivacySettingsFragmentDuxo privacySettingsFragmentDuxo, PrivacySettingsFragmentViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        EventLogger.DefaultImpls.logTap$default(privacySettingsFragmentDuxo.eventLogger, null, privacySettingsFragmentDuxo.getEventScreen(), new Component(Component.ComponentType.BUTTON, SAVE_AND_CONTINUE_BUTTON_IDENTIFIER, null, 4, null), null, null, false, 57, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setConsent(final AutoDismiss autoDismiss) {
        withDataState(new Function1() { // from class: com.robinhood.android.gdpr.consent.PrivacySettingsFragmentDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PrivacySettingsFragmentDuxo.setConsent$lambda$8(this.f$0, autoDismiss, (PrivacySettingsFragmentViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setConsent$lambda$8(PrivacySettingsFragmentDuxo privacySettingsFragmentDuxo, AutoDismiss autoDismiss, PrivacySettingsFragmentViewState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        privacySettingsFragmentDuxo.gdprManager.setConsent(PrivacySettingsFragmentViewState2.getGdprConsent(dataState));
        Unit unit = Unit.INSTANCE;
        if (autoDismiss instanceof AutoDismiss.Immediate) {
            privacySettingsFragmentDuxo.submit(PrivacySettingsFragmentUiEvent.Dismiss.INSTANCE);
        } else if (!(autoDismiss instanceof AutoDismiss.None)) {
            if (autoDismiss instanceof AutoDismiss.WithDelay) {
                BuildersKt__Builders_commonKt.launch$default(privacySettingsFragmentDuxo.getLifecycleScope(), null, null, new PrivacySettingsFragmentDuxo3(autoDismiss, privacySettingsFragmentDuxo, null), 3, null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.INSTANCE;
    }

    public final void onLinkClicked(final LinkType linkType) {
        Intrinsics.checkNotNullParameter(linkType, "linkType");
        withDataState(new Function1() { // from class: com.robinhood.android.gdpr.consent.PrivacySettingsFragmentDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PrivacySettingsFragmentDuxo.onLinkClicked$lambda$9(this.f$0, linkType, (PrivacySettingsFragmentViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onLinkClicked$lambda$9(PrivacySettingsFragmentDuxo privacySettingsFragmentDuxo, LinkType linkType, PrivacySettingsFragmentViewState viewState) {
        StringResource privacyPolicyLink;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        EventLogger.DefaultImpls.logTap$default(privacySettingsFragmentDuxo.eventLogger, null, privacySettingsFragmentDuxo.getEventScreen(), new Component(Component.ComponentType.LINK_BUTTON, linkType.getAnalyticsIdentifier(), null, 4, null), null, null, false, 57, null);
        int i = WhenMappings.$EnumSwitchMapping$0[linkType.ordinal()];
        if (i == 1) {
            privacyPolicyLink = viewState.getPrivacyPolicyLink();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            privacyPolicyLink = viewState.getCookiePolicyLink();
        }
        privacySettingsFragmentDuxo.submit(new PrivacySettingsFragmentUiEvent.OpenLink(privacyPolicyLink));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PrivacySettingsFragmentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/gdpr/consent/PrivacySettingsFragmentDuxo$LinkType;", "", "analyticsIdentifier", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getAnalyticsIdentifier", "()Ljava/lang/String;", "PRIVACY_POLICY", "COOKIE_POLICY", "feature-gdpr-consent_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class LinkType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ LinkType[] $VALUES;
        public static final LinkType COOKIE_POLICY;
        public static final LinkType PRIVACY_POLICY;
        private final String analyticsIdentifier;

        private static final /* synthetic */ LinkType[] $values() {
            return new LinkType[]{PRIVACY_POLICY, COOKIE_POLICY};
        }

        public static EnumEntries<LinkType> getEntries() {
            return $ENTRIES;
        }

        private LinkType(String str, int i, String str2) {
            this.analyticsIdentifier = str2;
        }

        public final String getAnalyticsIdentifier() {
            return this.analyticsIdentifier;
        }

        static {
            Companion companion = PrivacySettingsFragmentDuxo.INSTANCE;
            PRIVACY_POLICY = new LinkType("PRIVACY_POLICY", 0, companion.m2037xdd0f2d3a());
            COOKIE_POLICY = new LinkType("COOKIE_POLICY", 1, companion.m2036x2b1d0322());
            LinkType[] linkTypeArr$values = $values();
            $VALUES = linkTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(linkTypeArr$values);
        }

        public static LinkType valueOf(String str) {
            return (LinkType) Enum.valueOf(LinkType.class, str);
        }

        public static LinkType[] values() {
            return (LinkType[]) $VALUES.clone();
        }
    }

    /* compiled from: PrivacySettingsFragmentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/gdpr/consent/PrivacySettingsFragmentDuxo$AutoDismiss;", "", "<init>", "()V", "Immediate", "None", "WithDelay", "Lcom/robinhood/android/gdpr/consent/PrivacySettingsFragmentDuxo$AutoDismiss$Immediate;", "Lcom/robinhood/android/gdpr/consent/PrivacySettingsFragmentDuxo$AutoDismiss$None;", "Lcom/robinhood/android/gdpr/consent/PrivacySettingsFragmentDuxo$AutoDismiss$WithDelay;", "feature-gdpr-consent_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class AutoDismiss {
        public static final int $stable = 0;

        public /* synthetic */ AutoDismiss(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: PrivacySettingsFragmentDuxo.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/gdpr/consent/PrivacySettingsFragmentDuxo$AutoDismiss$Immediate;", "Lcom/robinhood/android/gdpr/consent/PrivacySettingsFragmentDuxo$AutoDismiss;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-gdpr-consent_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Immediate extends AutoDismiss {
            public static final int $stable = 0;
            public static final Immediate INSTANCE = new Immediate();

            public boolean equals(Object other) {
                return this == other || (other instanceof Immediate);
            }

            public int hashCode() {
                return -696823964;
            }

            public String toString() {
                return "Immediate";
            }

            private Immediate() {
                super(null);
            }
        }

        private AutoDismiss() {
        }

        /* compiled from: PrivacySettingsFragmentDuxo.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/gdpr/consent/PrivacySettingsFragmentDuxo$AutoDismiss$None;", "Lcom/robinhood/android/gdpr/consent/PrivacySettingsFragmentDuxo$AutoDismiss;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-gdpr-consent_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class None extends AutoDismiss {
            public static final int $stable = 0;
            public static final None INSTANCE = new None();

            public boolean equals(Object other) {
                return this == other || (other instanceof None);
            }

            public int hashCode() {
                return -1481124955;
            }

            public String toString() {
                return "None";
            }

            private None() {
                super(null);
            }
        }

        /* compiled from: PrivacySettingsFragmentDuxo.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/gdpr/consent/PrivacySettingsFragmentDuxo$AutoDismiss$WithDelay;", "Lcom/robinhood/android/gdpr/consent/PrivacySettingsFragmentDuxo$AutoDismiss;", "delayMillis", "", "<init>", "(J)V", "getDelayMillis", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-gdpr-consent_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class WithDelay extends AutoDismiss {
            public static final int $stable = 0;
            private final long delayMillis;

            public WithDelay() {
                this(0L, 1, null);
            }

            public static /* synthetic */ WithDelay copy$default(WithDelay withDelay, long j, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = withDelay.delayMillis;
                }
                return withDelay.copy(j);
            }

            /* renamed from: component1, reason: from getter */
            public final long getDelayMillis() {
                return this.delayMillis;
            }

            public final WithDelay copy(long delayMillis) {
                return new WithDelay(delayMillis);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof WithDelay) && this.delayMillis == ((WithDelay) other).delayMillis;
            }

            public int hashCode() {
                return Long.hashCode(this.delayMillis);
            }

            public String toString() {
                return "WithDelay(delayMillis=" + this.delayMillis + ")";
            }

            public WithDelay(long j) {
                super(null);
                this.delayMillis = j;
            }

            public /* synthetic */ WithDelay(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? 330L : j);
            }

            public final long getDelayMillis() {
                return this.delayMillis;
            }
        }
    }

    /* compiled from: PrivacySettingsFragmentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0006\u001a\u00020\u00078\u0000X\u0081D¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u00020\u00078\u0000X\u0081D¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\nR\u001c\u0010\u000e\u001a\u00020\u00078\u0000X\u0081D¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\nR\u001c\u0010\u0011\u001a\u00020\u00078\u0000X\u0081D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0005\u001a\u0004\b\u0013\u0010\nR\u001c\u0010\u0014\u001a\u00020\u00078\u0000X\u0081D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0005\u001a\u0004\b\u0016\u0010\n¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/gdpr/consent/PrivacySettingsFragmentDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/gdpr/consent/PrivacySettingsFragmentDuxo;", "Lcom/robinhood/shared/gdpr/contracts/PrivacySettingsFragmentKey;", "<init>", "()V", "ACCEPT_ALL_BUTTON_IDENTIFIER", "", "getACCEPT_ALL_BUTTON_IDENTIFIER$feature_gdpr_consent_externalDebug$annotations", "getACCEPT_ALL_BUTTON_IDENTIFIER$feature_gdpr_consent_externalDebug", "()Ljava/lang/String;", "REJECT_ALL_BUTTON_IDENTIFIER", "getREJECT_ALL_BUTTON_IDENTIFIER$feature_gdpr_consent_externalDebug$annotations", "getREJECT_ALL_BUTTON_IDENTIFIER$feature_gdpr_consent_externalDebug", "SAVE_AND_CONTINUE_BUTTON_IDENTIFIER", "getSAVE_AND_CONTINUE_BUTTON_IDENTIFIER$feature_gdpr_consent_externalDebug$annotations", "getSAVE_AND_CONTINUE_BUTTON_IDENTIFIER$feature_gdpr_consent_externalDebug", "PRIVACY_POLICY_BUTTON_IDENTIFIER", "getPRIVACY_POLICY_BUTTON_IDENTIFIER$feature_gdpr_consent_externalDebug$annotations", "getPRIVACY_POLICY_BUTTON_IDENTIFIER$feature_gdpr_consent_externalDebug", "COOKIE_POLICY_BUTTON_IDENTIFIER", "getCOOKIE_POLICY_BUTTON_IDENTIFIER$feature_gdpr_consent_externalDebug$annotations", "getCOOKIE_POLICY_BUTTON_IDENTIFIER$feature_gdpr_consent_externalDebug", "feature-gdpr-consent_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<PrivacySettingsFragmentDuxo, PrivacySettingsFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getACCEPT_ALL_BUTTON_IDENTIFIER$feature_gdpr_consent_externalDebug$annotations */
        public static /* synthetic */ void m2030x86ea1bf9() {
        }

        /* renamed from: getCOOKIE_POLICY_BUTTON_IDENTIFIER$feature_gdpr_consent_externalDebug$annotations */
        public static /* synthetic */ void m2031x79c01ca2() {
        }

        /* renamed from: getPRIVACY_POLICY_BUTTON_IDENTIFIER$feature_gdpr_consent_externalDebug$annotations */
        public static /* synthetic */ void m2032xac0be2ba() {
        }

        /* renamed from: getREJECT_ALL_BUTTON_IDENTIFIER$feature_gdpr_consent_externalDebug$annotations */
        public static /* synthetic */ void m2033x12781bc2() {
        }

        /* renamed from: getSAVE_AND_CONTINUE_BUTTON_IDENTIFIER$feature_gdpr_consent_externalDebug$annotations */
        public static /* synthetic */ void m2034x958ef7de() {
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PrivacySettingsFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (PrivacySettingsFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PrivacySettingsFragmentKey getArgs(PrivacySettingsFragmentDuxo privacySettingsFragmentDuxo) {
            return (PrivacySettingsFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, privacySettingsFragmentDuxo);
        }

        /* renamed from: getACCEPT_ALL_BUTTON_IDENTIFIER$feature_gdpr_consent_externalDebug */
        public final String m2035x3c820cf9() {
            return PrivacySettingsFragmentDuxo.ACCEPT_ALL_BUTTON_IDENTIFIER;
        }

        /* renamed from: getREJECT_ALL_BUTTON_IDENTIFIER$feature_gdpr_consent_externalDebug */
        public final String m2038xd182b242() {
            return PrivacySettingsFragmentDuxo.REJECT_ALL_BUTTON_IDENTIFIER;
        }

        /* renamed from: getSAVE_AND_CONTINUE_BUTTON_IDENTIFIER$feature_gdpr_consent_externalDebug */
        public final String m2039xe3cdd85e() {
            return PrivacySettingsFragmentDuxo.SAVE_AND_CONTINUE_BUTTON_IDENTIFIER;
        }

        /* renamed from: getPRIVACY_POLICY_BUTTON_IDENTIFIER$feature_gdpr_consent_externalDebug */
        public final String m2037xdd0f2d3a() {
            return PrivacySettingsFragmentDuxo.PRIVACY_POLICY_BUTTON_IDENTIFIER;
        }

        /* renamed from: getCOOKIE_POLICY_BUTTON_IDENTIFIER$feature_gdpr_consent_externalDebug */
        public final String m2036x2b1d0322() {
            return PrivacySettingsFragmentDuxo.COOKIE_POLICY_BUTTON_IDENTIFIER;
        }
    }
}
