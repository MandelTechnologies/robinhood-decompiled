package com.robinhood.android.doc.p109ui.persona.splash;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.view.compose.ComponentActivity6;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.doc.p109ui.persona.splash.PersonaSplashActivity;
import com.robinhood.android.doc.p109ui.persona.splash.PersonaSplashDuxo2;
import com.robinhood.android.maxonboarding.PostSignUpThanksComposable;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.onboarding.contracts.DocumentUpload;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.documents.contracts.PersonaSplashIntentKey;
import com.robinhood.shared.documents.lib.docupload.SplashScreenStyle;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: PersonaSplashActivity.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\"\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\rH\u0016J\u0016\u0010\u001a\u001a\u00020\r2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001f²\u0006\n\u0010 \u001a\u00020!X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/persona/splash/PersonaSplashActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "<init>", "()V", "duxo", "Lcom/robinhood/android/doc/ui/persona/splash/VerifyIdentitySplashDuxo;", "getDuxo", "()Lcom/robinhood/android/doc/ui/persona/splash/VerifyIdentitySplashDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "shouldPromptForLockscreen", "", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResult", "requestCode", "", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "onBackPressed", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/doc/ui/persona/splash/VerifyIdentitySplashEvent;", "Companion", "feature-doc-upload_externalRelease", "viewState", "Lcom/robinhood/android/doc/ui/persona/splash/VerifyIdentitySplashViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SuppressLint({"CustomSplashScreen"})
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class PersonaSplashActivity extends BaseActivity {
    private static final int REQUEST_CODE_DOC_UPLOAD = 1;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, PersonaSplashDuxo.class);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean shouldPromptForLockscreen() {
        return false;
    }

    /* compiled from: PersonaSplashActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/persona/splash/PersonaSplashActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/doc/ui/persona/splash/PersonaSplashActivity;", "Lcom/robinhood/shared/documents/contracts/PersonaSplashIntentKey;", "<init>", "()V", "REQUEST_CODE_DOC_UPLOAD", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<PersonaSplashActivity, PersonaSplashIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public PersonaSplashIntentKey getExtras(PersonaSplashActivity personaSplashActivity) {
            return (PersonaSplashIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, personaSplashActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, PersonaSplashIntentKey personaSplashIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, personaSplashIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, PersonaSplashIntentKey personaSplashIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, personaSplashIntentKey);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PersonaSplashDuxo getDuxo() {
        return (PersonaSplashDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(final Event<PersonaSplashDuxo2> event) {
        EventConsumer<PersonaSplashDuxo2> eventConsumerInvoke;
        EventConsumer<PersonaSplashDuxo2> eventConsumerInvoke2;
        if ((event.getData() instanceof PersonaSplashDuxo2.DocumentRequestLoadingFinished) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.doc.ui.persona.splash.PersonaSplashActivity$handleEvent$$inlined$consumeIfType$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m13407invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m13407invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    PersonaSplashDuxo2.DocumentRequestLoadingFinished documentRequestLoadingFinished = (PersonaSplashDuxo2.DocumentRequestLoadingFinished) event.getData();
                    PersonaSplashActivity personaSplashActivity = this;
                    personaSplashActivity.startActivityForResult(Navigator.DefaultImpls.createIntentForFragment$default(personaSplashActivity.getNavigator(), this, new DocumentUpload(documentRequestLoadingFinished.getDocumentRequests(), false, false, null, false, ((PersonaSplashIntentKey) PersonaSplashActivity.INSTANCE.getExtras((Activity) this)).getStyle().name(), true, null, false, 414, null), false, false, false, null, false, true, false, false, false, null, false, 6772, null), 1);
                }
            });
        }
        if (!(event.getData() instanceof PersonaSplashDuxo2.FinishFlow) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.doc.ui.persona.splash.PersonaSplashActivity$handleEvent$$inlined$consumeIfType$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m13408invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m13408invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.finish();
            }
        });
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        hideToolbar();
    }

    /* compiled from: PersonaSplashActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.doc.ui.persona.splash.PersonaSplashActivity$onCreate$1 */
    static final class C143811 implements Function2<Composer, Integer, Unit> {
        C143811() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(PersonaSplashActivity personaSplashActivity) {
            personaSplashActivity.finish();
            return Unit.INSTANCE;
        }

        /* compiled from: PersonaSplashActivity.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.doc.ui.persona.splash.PersonaSplashActivity$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ SnapshotState4<VerifyIdentitySplashViewState> $viewState$delegate;
            final /* synthetic */ PersonaSplashActivity this$0;

            AnonymousClass2(PersonaSplashActivity personaSplashActivity, SnapshotState4<VerifyIdentitySplashViewState> snapshotState4) {
                this.this$0 = personaSplashActivity;
                this.$viewState$delegate = snapshotState4;
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
                    ComposerKt.traceEventStart(-1656575505, i, -1, "com.robinhood.android.doc.ui.persona.splash.PersonaSplashActivity.onCreate.<anonymous>.<anonymous> (PersonaSplashActivity.kt:52)");
                }
                SplashScreenStyle splashScreenStyle = ((PersonaSplashIntentKey) PersonaSplashActivity.INSTANCE.getExtras((Activity) this.this$0)).getStyle().getSplashScreenStyle();
                boolean zIsLoading = C143811.invoke$lambda$0(this.$viewState$delegate).isLoading();
                boolean showSkipAlert = C143811.invoke$lambda$0(this.$viewState$delegate).getShowSkipAlert();
                boolean showErrorAlert = C143811.invoke$lambda$0(this.$viewState$delegate).getShowErrorAlert();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(this.this$0);
                final PersonaSplashActivity personaSplashActivity = this.this$0;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.doc.ui.persona.splash.PersonaSplashActivity$onCreate$1$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PersonaSplashActivity.C143811.AnonymousClass2.invoke$lambda$1$lambda$0(personaSplashActivity);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composer.changedInstance(this.this$0);
                final PersonaSplashActivity personaSplashActivity2 = this.this$0;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.doc.ui.persona.splash.PersonaSplashActivity$onCreate$1$2$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PersonaSplashActivity.C143811.AnonymousClass2.invoke$lambda$3$lambda$2(personaSplashActivity2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Function0 function02 = (Function0) objRememberedValue2;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance3 = composer.changedInstance(this.this$0);
                final PersonaSplashActivity personaSplashActivity3 = this.this$0;
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.doc.ui.persona.splash.PersonaSplashActivity$onCreate$1$2$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PersonaSplashActivity.C143811.AnonymousClass2.invoke$lambda$5$lambda$4(personaSplashActivity3);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                Function0 function03 = (Function0) objRememberedValue3;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance4 = composer.changedInstance(this.this$0);
                final PersonaSplashActivity personaSplashActivity4 = this.this$0;
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.doc.ui.persona.splash.PersonaSplashActivity$onCreate$1$2$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PersonaSplashActivity.C143811.AnonymousClass2.invoke$lambda$7$lambda$6(personaSplashActivity4);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                Function0 function04 = (Function0) objRememberedValue4;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance5 = composer.changedInstance(this.this$0);
                final PersonaSplashActivity personaSplashActivity5 = this.this$0;
                Object objRememberedValue5 = composer.rememberedValue();
                if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new Function0() { // from class: com.robinhood.android.doc.ui.persona.splash.PersonaSplashActivity$onCreate$1$2$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PersonaSplashActivity.C143811.AnonymousClass2.invoke$lambda$9$lambda$8(personaSplashActivity5);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue5);
                }
                composer.endReplaceGroup();
                PersonaSplashComposable.PersonaSplashComposable(splashScreenStyle, zIsLoading, showSkipAlert, showErrorAlert, function0, function02, function03, function04, (Function0) objRememberedValue5, null, composer, SplashScreenStyle.$stable, 512);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$1$lambda$0(PersonaSplashActivity personaSplashActivity) {
                personaSplashActivity.getDuxo().onErrorAlertDismissed();
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$3$lambda$2(PersonaSplashActivity personaSplashActivity) {
                personaSplashActivity.getDuxo().onAlertPrimaryCtaClicked();
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$5$lambda$4(PersonaSplashActivity personaSplashActivity) {
                personaSplashActivity.getDuxo().onAlertSecondaryCtaClicked();
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$7$lambda$6(PersonaSplashActivity personaSplashActivity) {
                personaSplashActivity.getDuxo().onPrimaryCtaClicked();
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$9$lambda$8(PersonaSplashActivity personaSplashActivity) {
                personaSplashActivity.getDuxo().onSecondaryCtaClicked();
                return Unit.INSTANCE;
            }
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-447112187, i, -1, "com.robinhood.android.doc.ui.persona.splash.PersonaSplashActivity.onCreate.<anonymous> (PersonaSplashActivity.kt:43)");
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(PersonaSplashActivity.this.getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 0, 7);
            if (invoke$lambda$0(snapshotState4CollectAsStateWithLifecycle).getShowThanksScreen()) {
                composer.startReplaceGroup(-1225452748);
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(PersonaSplashActivity.this);
                final PersonaSplashActivity personaSplashActivity = PersonaSplashActivity.this;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.doc.ui.persona.splash.PersonaSplashActivity$onCreate$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PersonaSplashActivity.C143811.invoke$lambda$2$lambda$1(personaSplashActivity);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                PostSignUpThanksComposable.PostSignUpThanksComposable(false, null, (Function0) objRememberedValue, composer, 6, 2);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1225257696);
                BentoTheme2.BentoTheme(ScarletComposeInterop.themeChangesForCompose(ScarletManager2.getScarletManager(PersonaSplashActivity.this)), null, ComposableLambda3.rememberComposableLambda(-1656575505, true, new AnonymousClass2(PersonaSplashActivity.this, snapshotState4CollectAsStateWithLifecycle), composer, 54), composer, 384, 2);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final VerifyIdentitySplashViewState invoke$lambda$0(SnapshotState4<VerifyIdentitySplashViewState> snapshotState4) {
            return snapshotState4.getValue();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ComponentActivity6.setContent$default(this, null, ComposableLambda3.composableLambdaInstance(-447112187, true, new C143811()), 1, null);
        BaseActivity.collectDuxoState$default(this, null, new C143822(null), 1, null);
    }

    /* compiled from: PersonaSplashActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.persona.splash.PersonaSplashActivity$onCreate$2", m3645f = "PersonaSplashActivity.kt", m3646l = {69}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.doc.ui.persona.splash.PersonaSplashActivity$onCreate$2 */
    static final class C143822 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C143822(Continuation<? super C143822> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PersonaSplashActivity.this.new C143822(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C143822) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: PersonaSplashActivity.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.doc.ui.persona.splash.PersonaSplashActivity$onCreate$2$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ PersonaSplashActivity $tmp0;

            AnonymousClass1(PersonaSplashActivity personaSplashActivity) {
                this.$tmp0 = personaSplashActivity;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, PersonaSplashActivity.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<PersonaSplashDuxo2> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleEvent = C143822.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<PersonaSplashDuxo2>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(PersonaSplashActivity.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PersonaSplashActivity.this);
                this.label = 1;
                if (flowFilterNotNull.collect(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$handleEvent(PersonaSplashActivity personaSplashActivity, Event event, Continuation continuation) {
            personaSplashActivity.handleEvent(event);
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (1 == requestCode) {
            getDuxo().showThanksScreenOrExit();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        getDuxo().showThanksScreenOrExit();
    }
}
