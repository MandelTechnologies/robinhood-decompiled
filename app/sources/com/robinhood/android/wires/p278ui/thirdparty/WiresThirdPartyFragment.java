package com.robinhood.android.wires.p278ui.thirdparty;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.formentry.FormEntryDuxo;
import com.robinhood.android.formentry.data.FormEntryType;
import com.robinhood.android.models.transfer.shared.ThirdPartyOutgoingWiresInfo;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.onboarding.contracts.DocumentUpload;
import com.robinhood.android.teller.TellerErrorHandler;
import com.robinhood.android.transfers.contracts.Transfer;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.android.wires.p278ui.thirdparty.WiresThirdPartyEvent;
import com.robinhood.android.wires.p278ui.thirdparty.WiresThirdPartyFragment;
import com.robinhood.android.wires.p278ui.thirdparty.composables.DocumentUpload2;
import com.robinhood.android.wires.p278ui.thirdparty.composables.InformationIntake;
import com.robinhood.android.wires.p278ui.thirdparty.composables.SubmitTitleDocumentsPrompt8;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.p355ui.DocumentRequest;
import com.robinhood.rosetta.eventlogging.WiresContext;
import com.robinhood.shared.common.contracts.MicrogramRouterFragmentKey;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import microgram.android.RemoteMicrogramApplication;

/* compiled from: WiresThirdPartyFragment.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0012\u0010!\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\r\u0010\"\u001a\u00020\u001cH\u0017¢\u0006\u0002\u0010#R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00170\u00170\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006%²\u0006\n\u0010&\u001a\u00020'X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyDuxo;", "getDuxo", "()Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "formEntryDuxo", "Lcom/robinhood/android/formentry/FormEntryDuxo;", "getFormEntryDuxo", "()Lcom/robinhood/android/formentry/FormEntryDuxo;", "formEntryDuxo$delegate", "tellerErrorHandler", "Lcom/robinhood/android/teller/TellerErrorHandler;", "", "getTellerErrorHandler", "()Lcom/robinhood/android/teller/TellerErrorHandler;", "tellerErrorHandler$delegate", "identiSdkLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "getIdentiSdkLauncher", "()Landroidx/activity/result/ActivityResultLauncher;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-wires_externalDebug", "state", "Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class WiresThirdPartyFragment extends GenericComposeFragment {
    private final ActivityResultLauncher<Intent> identiSdkLauncher;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, WiresThirdPartyDuxo.class);

    /* renamed from: formEntryDuxo$delegate, reason: from kotlin metadata */
    private final Lazy formEntryDuxo = DuxosKt.duxo(this, FormEntryDuxo.class);

    /* renamed from: tellerErrorHandler$delegate, reason: from kotlin metadata */
    private final Lazy tellerErrorHandler = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyFragment$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WiresThirdPartyFragment.tellerErrorHandler_delegate$lambda$0(this.f$0);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2(WiresThirdPartyFragment wiresThirdPartyFragment, int i, Composer composer, int i2) {
        wiresThirdPartyFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public WiresThirdPartyFragment() {
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyFragment$identiSdkLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.getResultCode() == -1) {
                    this.this$0.getDuxo().submitTitleDocumentsFinished();
                } else {
                    this.this$0.requireActivity().finish();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.identiSdkLauncher = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WiresThirdPartyDuxo getDuxo() {
        return (WiresThirdPartyDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FormEntryDuxo getFormEntryDuxo() {
        return (FormEntryDuxo) this.formEntryDuxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TellerErrorHandler<Object> getTellerErrorHandler() {
        return (TellerErrorHandler) this.tellerErrorHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TellerErrorHandler tellerErrorHandler_delegate$lambda$0(WiresThirdPartyFragment wiresThirdPartyFragment) {
        FragmentActivity fragmentActivityRequireActivity = wiresThirdPartyFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        return new TellerErrorHandler(fragmentActivityRequireActivity, true, 0, null, 12, null);
    }

    public final ActivityResultLauncher<Intent> getIdentiSdkLauncher() {
        return this.identiSdkLauncher;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
    }

    /* compiled from: WiresThirdPartyFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyFragment$onCreate$1", m3645f = "WiresThirdPartyFragment.kt", m3646l = {70}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyFragment$onCreate$1 */
    static final class C315571 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C315571(Continuation<? super C315571> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WiresThirdPartyFragment.this.new C315571(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C315571) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: WiresThirdPartyFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyEvent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyFragment$onCreate$1$1", m3645f = "WiresThirdPartyFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyFragment$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Event<WiresThirdPartyEvent>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ WiresThirdPartyFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(WiresThirdPartyFragment wiresThirdPartyFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = wiresThirdPartyFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Event<WiresThirdPartyEvent> event, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(event, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                EventConsumer eventConsumer;
                EventConsumer eventConsumer2;
                EventConsumer eventConsumer3;
                EventConsumer eventConsumer4;
                EventConsumer eventConsumer5;
                EventConsumer eventConsumer6;
                EventConsumer eventConsumer7;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final Event event = (Event) this.L$0;
                if (event != null) {
                    final WiresThirdPartyFragment wiresThirdPartyFragment = this.this$0;
                    if ((event.getData() instanceof WiresThirdPartyEvent.CloseFlow) && (eventConsumer7 = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer7.consume(event, new Function1() { // from class: com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyFragment$onCreate$1$1$invokeSuspend$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m20089invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m20089invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                wiresThirdPartyFragment.requireActivity().finish();
                            }
                        });
                    }
                }
                if (event != null) {
                    final WiresThirdPartyFragment wiresThirdPartyFragment2 = this.this$0;
                    if ((event.getData() instanceof WiresThirdPartyEvent.TellerError) && (eventConsumer6 = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer6.consume(event, new Function1() { // from class: com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyFragment$onCreate$1$1$invokeSuspend$$inlined$consumeIfType$2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m20090invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m20090invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                AbsErrorHandler.handleError$default(wiresThirdPartyFragment2.getTellerErrorHandler(), ((WiresThirdPartyEvent.TellerError) event.getData()).getThrowable(), false, 2, null);
                            }
                        });
                    }
                }
                if (event != null) {
                    final WiresThirdPartyFragment wiresThirdPartyFragment3 = this.this$0;
                    if ((event.getData() instanceof WiresThirdPartyEvent.ShowScamPrevention) && (eventConsumer5 = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer5.consume(event, new Function1() { // from class: com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyFragment$onCreate$1$1$invokeSuspend$$inlined$consumeIfType$3
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m20091invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m20091invoke(Object it) {
                                String str;
                                Intrinsics.checkNotNullParameter(it, "it");
                                Navigator navigator = wiresThirdPartyFragment3.getNavigator();
                                Context contextRequireContext = wiresThirdPartyFragment3.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                RemoteMicrogramApplication remoteMicrogramApplication = new RemoteMicrogramApplication("app-wire-transfers", null, 2, null);
                                Uri.Builder builderPath = new Uri.Builder().scheme("robinhood").path("wire_transfer");
                                if (((ThirdPartyWireKey) WiresThirdPartyFragment.INSTANCE.getArgs((Fragment) wiresThirdPartyFragment3)).getUseGenericMode()) {
                                    str = "SCAM_PREVENTION_DETAILS";
                                } else {
                                    str = "THIRD_PARTY_SCAM_PREVENTION_DETAILS";
                                }
                                Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new MicrogramRouterFragmentKey(remoteMicrogramApplication, builderPath.appendQueryParameter("screenStartType", str).build().toString(), null, null, null, 28, null), false, false, false, false, null, false, null, null, 1020, null);
                            }
                        });
                    }
                }
                if (event != null) {
                    final WiresThirdPartyFragment wiresThirdPartyFragment4 = this.this$0;
                    if ((event.getData() instanceof WiresThirdPartyEvent.ReportScam) && (eventConsumer4 = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer4.consume(event, new Function1() { // from class: com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyFragment$onCreate$1$1$invokeSuspend$$inlined$consumeIfType$4
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m20092invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m20092invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                WiresThirdPartyEvent.ReportScam reportScam = (WiresThirdPartyEvent.ReportScam) event.getData();
                                Navigator navigator = wiresThirdPartyFragment4.getNavigator();
                                Context contextRequireContext = wiresThirdPartyFragment4.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, reportScam.getUri(), null, null, false, null, 60, null);
                            }
                        });
                    }
                }
                if (event != null) {
                    final WiresThirdPartyFragment wiresThirdPartyFragment5 = this.this$0;
                    if ((event.getData() instanceof WiresThirdPartyEvent.StartDocumentRequest) && (eventConsumer3 = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer3.consume(event, new Function1() { // from class: com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyFragment$onCreate$1$1$invokeSuspend$$inlined$consumeIfType$5
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m20093invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m20093invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                WiresThirdPartyEvent.StartDocumentRequest startDocumentRequest = (WiresThirdPartyEvent.StartDocumentRequest) event.getData();
                                ActivityResultLauncher<Intent> identiSdkLauncher = wiresThirdPartyFragment5.getIdentiSdkLauncher();
                                Navigator navigator = wiresThirdPartyFragment5.getNavigator();
                                Context contextRequireContext = wiresThirdPartyFragment5.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                identiSdkLauncher.launch(Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, DocumentUpload.Companion.singleDocStandaloneActivityIntent$default(DocumentUpload.INSTANCE, DocumentRequest.INSTANCE.forDocumentRequestId(StringsKt.toUuid(startDocumentRequest.getDocumentRequestId())), false, null, false, null, 30, null), null, false, 12, null));
                            }
                        });
                    }
                }
                if (event != null) {
                    final WiresThirdPartyFragment wiresThirdPartyFragment6 = this.this$0;
                    if ((event.getData() instanceof WiresThirdPartyEvent.ShowError) && (eventConsumer2 = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer2.consume(event, new Function1() { // from class: com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyFragment$onCreate$1$1$invokeSuspend$$inlined$consumeIfType$6
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m20094invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m20094invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
                                Context contextRequireContext = wiresThirdPartyFragment6.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                RhDialogFragment.Builder cancelable = companion.create(contextRequireContext).setId(C11048R.id.dialog_id_generic_error).setTitle(C11048R.string.general_error_title, new Object[0]).setMessage(C11048R.string.error_description, new Object[0]).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome).setCancelable(false);
                                FragmentManager childFragmentManager = wiresThirdPartyFragment6.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                                RhDialogFragment.Builder.show$default(cancelable, childFragmentManager, "errorDocumentDialog", false, 4, null);
                            }
                        });
                    }
                }
                if (event != null) {
                    final WiresThirdPartyFragment wiresThirdPartyFragment7 = this.this$0;
                    if ((event.getData() instanceof WiresThirdPartyEvent.NavigateToTransfer) && (eventConsumer = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer.consume(event, new Function1() { // from class: com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyFragment$onCreate$1$1$invokeSuspend$$inlined$consumeIfType$7
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m20095invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m20095invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                WiresThirdPartyEvent.NavigateToTransfer navigateToTransfer = (WiresThirdPartyEvent.NavigateToTransfer) event.getData();
                                TransferConfiguration.OutgoingWire outgoingWire = new TransferConfiguration.OutgoingWire(new TransferConfiguration.TransferAccountSelection(null, false, navigateToTransfer.getFrom(), 3, null), new TransferConfiguration.TransferAccountSelection(navigateToTransfer.getId(), true, navigateToTransfer.getTo()), true, new WiresContext(WiresContext.WiresDirection.OUTGOING, WiresContext.EntryPoint.ENTRY_POINT_UNSPECIFIED, null, null, 12, null), null, null, null, new ThirdPartyOutgoingWiresInfo(navigateToTransfer.getId(), navigateToTransfer.getBankName(), navigateToTransfer.getFields()), 112, null);
                                Navigator navigator = wiresThirdPartyFragment7.getNavigator();
                                Context contextRequireContext = wiresThirdPartyFragment7.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new Transfer(outgoingWire), null, false, null, null, 60, null);
                                wiresThirdPartyFragment7.requireActivity().finish();
                            }
                        });
                    }
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<WiresThirdPartyEvent>> eventFlow = WiresThirdPartyFragment.this.getDuxo().getEventFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(WiresThirdPartyFragment.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(eventFlow, anonymousClass1, this) == coroutine_suspended) {
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
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C315571(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C315582(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WiresThirdPartyViewState ComposeContent$lambda$1(SnapshotState4<WiresThirdPartyViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: WiresThirdPartyFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyFragment$onCreate$2", m3645f = "WiresThirdPartyFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyFragment$onCreate$2 */
    static final class C315582 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C315582(Continuation<? super C315582> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WiresThirdPartyFragment.this.new C315582(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C315582) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: WiresThirdPartyFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyEvent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyFragment$onCreate$2$1", m3645f = "WiresThirdPartyFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyFragment$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Event<WiresThirdPartyEvent>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ WiresThirdPartyFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(WiresThirdPartyFragment wiresThirdPartyFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = wiresThirdPartyFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Event<WiresThirdPartyEvent> event, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(event, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                EventConsumer eventConsumer;
                EventConsumer eventConsumer2;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final Event event = (Event) this.L$0;
                if (event != null) {
                    final WiresThirdPartyFragment wiresThirdPartyFragment = this.this$0;
                    if ((event.getData() instanceof WiresThirdPartyEvent.MoveToReviewScreen) && (eventConsumer2 = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer2.consume(event, new Function1() { // from class: com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyFragment$onCreate$2$1$invokeSuspend$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m20096invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m20096invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                wiresThirdPartyFragment.getFormEntryDuxo().showReviewScreen();
                            }
                        });
                    }
                }
                if (event != null) {
                    final WiresThirdPartyFragment wiresThirdPartyFragment2 = this.this$0;
                    if ((event.getData() instanceof WiresThirdPartyEvent.StartFormEntry) && (eventConsumer = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer.consume(event, new Function1() { // from class: com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyFragment$onCreate$2$1$invokeSuspend$$inlined$consumeIfType$2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m20097invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m20097invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                wiresThirdPartyFragment2.getFormEntryDuxo().launch(FormEntryType.THIRD_PARTY_WIRE);
                            }
                        });
                    }
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<WiresThirdPartyEvent>> eventFlow = WiresThirdPartyFragment.this.getDuxo().getEventFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(WiresThirdPartyFragment.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(eventFlow, anonymousClass1, this) == coroutine_suspended) {
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
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1449722820);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1449722820, i2, -1, "com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyFragment.ComposeContent (WiresThirdPartyFragment.kt:164)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(163656972, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyFragment.ComposeContent.1

                /* compiled from: WiresThirdPartyFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyFragment$ComposeContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ SnapshotState4<WiresThirdPartyViewState> $state$delegate;
                    final /* synthetic */ WiresThirdPartyFragment this$0;

                    /* compiled from: WiresThirdPartyFragment.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    /* renamed from: com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyFragment$ComposeContent$1$1$WhenMappings */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[WiresThirdPartyPageMode.values().length];
                            try {
                                iArr[WiresThirdPartyPageMode.SCAM_PREVENTION.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[WiresThirdPartyPageMode.SUBMIT_TITLE_DOCUMENTS_PROMPT.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[WiresThirdPartyPageMode.DOCUMENT_UPLOAD.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            try {
                                iArr[WiresThirdPartyPageMode.INFORMATION_INTAKE.ordinal()] = 4;
                            } catch (NoSuchFieldError unused4) {
                            }
                            try {
                                iArr[WiresThirdPartyPageMode.REVIEW_SCREEN.ordinal()] = 5;
                            } catch (NoSuchFieldError unused5) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    AnonymousClass1(WiresThirdPartyFragment wiresThirdPartyFragment, SnapshotState4<WiresThirdPartyViewState> snapshotState4) {
                        this.this$0 = wiresThirdPartyFragment;
                        this.$state$delegate = snapshotState4;
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
                            ComposerKt.traceEventStart(-624483615, i, -1, "com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyFragment.ComposeContent.<anonymous>.<anonymous> (WiresThirdPartyFragment.kt:168)");
                        }
                        int i2 = WhenMappings.$EnumSwitchMapping$0[WiresThirdPartyFragment.ComposeContent$lambda$1(this.$state$delegate).getMode().ordinal()];
                        if (i2 == 1) {
                            composer.startReplaceGroup(1807052063);
                            composer.endReplaceGroup();
                        } else if (i2 == 2) {
                            composer.startReplaceGroup(1166673400);
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer.changedInstance(this.this$0);
                            final WiresThirdPartyFragment wiresThirdPartyFragment = this.this$0;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyFragment$ComposeContent$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return WiresThirdPartyFragment.C315561.AnonymousClass1.invoke$lambda$1$lambda$0(wiresThirdPartyFragment);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            SubmitTitleDocumentsPrompt8.SubmitTitleDocumentsPrompt((Function0) objRememberedValue, null, composer, 0, 2);
                            composer.endReplaceGroup();
                        } else if (i2 == 3) {
                            composer.startReplaceGroup(1166681169);
                            DocumentUpload2.DocumentUpload(composer, 0);
                            composer.endReplaceGroup();
                        } else {
                            if (i2 != 4 && i2 != 5) {
                                composer.startReplaceGroup(1166669215);
                                composer.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer.startReplaceGroup(1166687115);
                            WiresThirdPartyViewState wiresThirdPartyViewStateComposeContent$lambda$1 = WiresThirdPartyFragment.ComposeContent$lambda$1(this.$state$delegate);
                            FormEntryDuxo formEntryDuxo = this.this$0.getFormEntryDuxo();
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance2 = composer.changedInstance(this.this$0);
                            final WiresThirdPartyFragment wiresThirdPartyFragment2 = this.this$0;
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyFragment$ComposeContent$1$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return WiresThirdPartyFragment.C315561.AnonymousClass1.invoke$lambda$3$lambda$2(wiresThirdPartyFragment2);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            Function0 function0 = (Function0) objRememberedValue2;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance3 = composer.changedInstance(this.this$0);
                            final WiresThirdPartyFragment wiresThirdPartyFragment3 = this.this$0;
                            Object objRememberedValue3 = composer.rememberedValue();
                            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyFragment$ComposeContent$1$1$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return WiresThirdPartyFragment.C315561.AnonymousClass1.invoke$lambda$5$lambda$4(wiresThirdPartyFragment3);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue3);
                            }
                            Function0 function02 = (Function0) objRememberedValue3;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance4 = composer.changedInstance(this.this$0);
                            final WiresThirdPartyFragment wiresThirdPartyFragment4 = this.this$0;
                            Object objRememberedValue4 = composer.rememberedValue();
                            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyFragment$ComposeContent$1$1$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return WiresThirdPartyFragment.C315561.AnonymousClass1.invoke$lambda$7$lambda$6(wiresThirdPartyFragment4, ((Boolean) obj).booleanValue());
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue4);
                            }
                            composer.endReplaceGroup();
                            InformationIntake.InformationIntake(wiresThirdPartyViewStateComposeContent$lambda$1, formEntryDuxo, function0, function02, (Function1) objRememberedValue4, null, composer, FormEntryDuxo.$stable << 3, 32);
                            composer.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(WiresThirdPartyFragment wiresThirdPartyFragment) {
                        wiresThirdPartyFragment.getDuxo().continueClicked(wiresThirdPartyFragment.getFormEntryDuxo());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2(WiresThirdPartyFragment wiresThirdPartyFragment) {
                        BuildersKt__Builders_commonKt.launch$default(wiresThirdPartyFragment.getLifecycleScope(), null, null, new WiresThirdPartyFragment2(wiresThirdPartyFragment, null), 3, null);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$5$lambda$4(WiresThirdPartyFragment wiresThirdPartyFragment) {
                        wiresThirdPartyFragment.getDuxo().continueClicked(wiresThirdPartyFragment.getFormEntryDuxo());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$7$lambda$6(WiresThirdPartyFragment wiresThirdPartyFragment, boolean z) {
                        wiresThirdPartyFragment.getDuxo().checkboxClicked(z);
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(163656972, i3, -1, "com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyFragment.ComposeContent.<anonymous> (WiresThirdPartyFragment.kt:167)");
                    }
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-624483615, true, new AnonymousClass1(WiresThirdPartyFragment.this, snapshotState4CollectAsStateWithLifecycle), composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WiresThirdPartyFragment.ComposeContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: WiresThirdPartyFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyFragment;", "Lcom/robinhood/android/wires/ui/thirdparty/ThirdPartyWireKey;", "<init>", "()V", "feature-wires_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<WiresThirdPartyFragment, ThirdPartyWireKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(ThirdPartyWireKey thirdPartyWireKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, thirdPartyWireKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public ThirdPartyWireKey getArgs(WiresThirdPartyFragment wiresThirdPartyFragment) {
            return (ThirdPartyWireKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, wiresThirdPartyFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public WiresThirdPartyFragment newInstance(ThirdPartyWireKey thirdPartyWireKey) {
            return (WiresThirdPartyFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, thirdPartyWireKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(WiresThirdPartyFragment wiresThirdPartyFragment, ThirdPartyWireKey thirdPartyWireKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, wiresThirdPartyFragment, thirdPartyWireKey);
        }
    }
}
