package com.robinhood.android.doc.serverdriven.splash;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$OpenDocument;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.doc.C14254R;
import com.robinhood.android.doc.serverdriven.parent.SddrDestination;
import com.robinhood.android.doc.serverdriven.parent.SddrFlowEvent;
import com.robinhood.android.doc.serverdriven.parent.SddrFlowEventReceiver;
import com.robinhood.android.doc.serverdriven.splash.SddrSplashViewState;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.models.api.IdDocument;
import com.robinhood.models.api.PdfDocument;
import com.robinhood.models.api.identi.ApiDocumentRequest;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.utils.RhProcessLifecycleOwner;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: SddrSplashFragment.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u001c\u001a\u00020\u001dH\u0017¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001aH\u0002J\b\u0010!\u001a\u00020\u001dH\u0002J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$H\u0016J\u001a\u0010%\u001a\u00020&2\u0006\u0010#\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016R$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R(\u0010\u0017\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001a \u001b*\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00190\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*²\u0006\n\u0010+\u001a\u00020,X\u008a\u0084\u0002²\u0006\u0012\u0010-\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/splash/SddrSplashFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "rhProcessLifecycleOwner", "Ldagger/Lazy;", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "getRhProcessLifecycleOwner", "()Ldagger/Lazy;", "setRhProcessLifecycleOwner", "(Ldagger/Lazy;)V", "callbacks", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEventReceiver;", "getCallbacks", "()Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEventReceiver;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/doc/serverdriven/splash/SddrSplashDuxo;", "getDuxo", "()Lcom/robinhood/android/doc/serverdriven/splash/SddrSplashDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "uploadPdfLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "", "kotlin.jvm.PlatformType", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "showInternalErrorDialog", "message", "openFile", "onDialogDismissed", "id", "", "onPositiveButtonClicked", "", "passthroughArgs", "Landroid/os/Bundle;", "Companion", "feature-doc-upload_externalRelease", "viewState", "Lcom/robinhood/android/doc/serverdriven/splash/SddrSplashViewState;", "eventFlow", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/doc/serverdriven/splash/SddrSplashErrorEvent;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SddrSplashFragment extends GenericComposeFragment {
    private static final String CANNOT_PICK_PDF_DIALOG_TAG = "dialog-cannot-pick-pdf";
    private static final String INTERNAL_ERROR_DIALOG_TAG = "dialog-internal-error";

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(SddrFlowEventReceiver.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.doc.serverdriven.splash.SddrSplashFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, SddrSplashDuxo.class);
    public dagger.Lazy<RhProcessLifecycleOwner> rhProcessLifecycleOwner;
    private final ActivityResultLauncher<String[]> uploadPdfLauncher;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SddrSplashFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEventReceiver;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SddrSplashFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiDocumentRequest.AllowedCaptureMethods.values().length];
            try {
                iArr[ApiDocumentRequest.AllowedCaptureMethods.CAMERA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiDocumentRequest.AllowedCaptureMethods.FILE_UPLOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$5(SddrSplashFragment sddrSplashFragment, int i, Composer composer, int i2) {
        sddrSplashFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public SddrSplashFragment() {
        ActivityResultLauncher<String[]> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$OpenDocument(), new ActivityResultCallback() { // from class: com.robinhood.android.doc.serverdriven.splash.SddrSplashFragment$uploadPdfLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(Uri uri) {
                if (uri != null) {
                    this.this$0.getCallbacks().onFlowEvent(new SddrFlowEvent.PdfUploaded(((SddrDestination.Splash) SddrSplashFragment.INSTANCE.getArgs((Fragment) this.this$0)).getState(), new PdfDocument(IdDocument.Side.FRONT, uri)));
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.uploadPdfLauncher = activityResultLauncherRegisterForActivityResult;
    }

    public final dagger.Lazy<RhProcessLifecycleOwner> getRhProcessLifecycleOwner() {
        dagger.Lazy<RhProcessLifecycleOwner> lazy = this.rhProcessLifecycleOwner;
        if (lazy != null) {
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rhProcessLifecycleOwner");
        return null;
    }

    public final void setRhProcessLifecycleOwner(dagger.Lazy<RhProcessLifecycleOwner> lazy) {
        Intrinsics.checkNotNullParameter(lazy, "<set-?>");
        this.rhProcessLifecycleOwner = lazy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SddrFlowEventReceiver getCallbacks() {
        return (SddrFlowEventReceiver) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final SddrSplashDuxo getDuxo() {
        return (SddrSplashDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        EventConsumer<SddrSplashErrorEvent> eventConsumerInvoke;
        Composer composerStartRestartGroup = composer.startRestartGroup(-745797365);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-745797365, i2, -1, "com.robinhood.android.doc.serverdriven.splash.SddrSplashFragment.ComposeContent (SddrSplashFragment.kt:52)");
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            final Event<SddrSplashErrorEvent> eventComposeContent$lambda$1 = ComposeContent$lambda$1(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
            if (eventComposeContent$lambda$1 != null && (eventComposeContent$lambda$1.getData() instanceof SddrSplashErrorEvent) && (eventConsumerInvoke = eventComposeContent$lambda$1.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke.consume(eventComposeContent$lambda$1, new Function1() { // from class: com.robinhood.android.doc.serverdriven.splash.SddrSplashFragment$ComposeContent$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m13387invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m13387invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        this.showInternalErrorDialog(((SddrSplashErrorEvent) eventComposeContent$lambda$1.getData()).getMessage());
                    }
                });
            }
            SddrSplashViewState sddrSplashViewStateComposeContent$lambda$0 = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle);
            if (Intrinsics.areEqual(sddrSplashViewStateComposeContent$lambda$0, SddrSplashViewState.Loading.INSTANCE)) {
                composerStartRestartGroup.startReplaceGroup(-183080713);
                LoadingScreenComposablesKt.GenericLoadingScreenComposable(null, false, composerStartRestartGroup, 0, 3);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(sddrSplashViewStateComposeContent$lambda$0 instanceof SddrSplashViewState.Loaded)) {
                    composerStartRestartGroup.startReplaceGroup(548282001);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-182949676);
                SddrSplashViewState.Loaded loaded = (SddrSplashViewState.Loaded) sddrSplashViewStateComposeContent$lambda$0;
                UIComponent<GenericAction> content = loaded.getContent();
                ApiDocumentRequest.AllowedCaptureMethods primaryMethod = loaded.getPrimaryMethod();
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.doc.serverdriven.splash.SddrSplashFragment$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SddrSplashFragment.ComposeContent$lambda$4$lambda$3(this.f$0, (ApiDocumentRequest.AllowedCaptureMethods) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                SddrSplashComposable.SddrSplashComposable(content, primaryMethod, (Function1) objRememberedValue, null, loaded.getSecondaryMethod(), composerStartRestartGroup, 0, 8);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.doc.serverdriven.splash.SddrSplashFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SddrSplashFragment.ComposeContent$lambda$5(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$4$lambda$3(SddrSplashFragment sddrSplashFragment, ApiDocumentRequest.AllowedCaptureMethods method) {
        Intrinsics.checkNotNullParameter(method, "method");
        int i = WhenMappings.$EnumSwitchMapping$0[method.ordinal()];
        if (i == 1) {
            sddrSplashFragment.getCallbacks().onFlowEvent(new SddrFlowEvent.PhotoRequested(((SddrDestination.Splash) INSTANCE.getArgs((Fragment) sddrSplashFragment)).getState()));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            sddrSplashFragment.openFile();
        }
        return Unit.INSTANCE;
    }

    private static final SddrSplashViewState ComposeContent$lambda$0(SnapshotState4<? extends SddrSplashViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<SddrSplashErrorEvent> ComposeContent$lambda$1(SnapshotState4<Event<SddrSplashErrorEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showInternalErrorDialog(String message) {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder message2 = companion.create(contextRequireContext).setId(C11048R.id.dialog_id_generic_error).setTitle(C11048R.string.general_error_title, new Object[0]).setMessage(message);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(message2, childFragmentManager, INTERNAL_ERROR_DIALOG_TAG, false, 4, null);
    }

    private final void openFile() {
        getRhProcessLifecycleOwner().get().useExtendedTimeout();
        try {
            this.uploadPdfLauncher.launch(new String[]{"application/pdf"});
        } catch (ActivityNotFoundException unused) {
            RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            RhDialogFragment.Builder title = companion.create(contextRequireContext).setId(C14254R.id.dialog_id_pdf_pick_failed).setTitle(C14254R.string.doc_upload_pdf_cannot_pick_pdf_title, new Object[0]);
            if (((SddrDestination.Splash) INSTANCE.getArgs((Fragment) this)).getContent().getAllowedCaptureMethods().contains(ApiDocumentRequest.AllowedCaptureMethods.CAMERA)) {
                title.setPositiveButton(C14254R.string.doc_upload_pdf_cannot_pick_pdf_primary_cta, new Object[0]);
            }
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            RhDialogFragment.Builder.show$default(title, childFragmentManager, CANNOT_PICK_PDF_DIALOG_TAG, false, 4, null);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_generic_error) {
            getCallbacks().onFlowEvent(SddrFlowEvent.PopBack.INSTANCE);
        } else {
            super.onDialogDismissed(id);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C14254R.id.dialog_id_pdf_pick_failed) {
            getCallbacks().onFlowEvent(new SddrFlowEvent.PhotoRequested(((SddrDestination.Splash) INSTANCE.getArgs((Fragment) this)).getState()));
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    /* compiled from: SddrSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/splash/SddrSplashFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/doc/serverdriven/splash/SddrSplashFragment;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrDestination$Splash;", "<init>", "()V", "CANNOT_PICK_PDF_DIALOG_TAG", "", "INTERNAL_ERROR_DIALOG_TAG", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<SddrSplashFragment, SddrDestination.Splash> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public SddrDestination.Splash getArgs(SddrSplashFragment sddrSplashFragment) {
            return (SddrDestination.Splash) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, sddrSplashFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SddrSplashFragment newInstance(SddrDestination.Splash splash) {
            return (SddrSplashFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, splash);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SddrSplashFragment sddrSplashFragment, SddrDestination.Splash splash) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, sddrSplashFragment, splash);
        }
    }
}
